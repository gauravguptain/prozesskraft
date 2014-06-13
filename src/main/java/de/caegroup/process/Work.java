package de.caegroup.process;

import java.io.*;
import java.util.*;
import org.apache.solr.common.util.NamedList;

import de.caegroup.process.Callitem;

public class Work
implements Serializable
{
	/*----------------------------
	  structure
	----------------------------*/

	static final long serialVersionUID = 1;
	private String name = "unnamed";
	private String description = "no description";
	private String interpreter = "";
	private String command = "";
	private String logfile = "";
	private ArrayList<Callitem> callitem = new ArrayList<Callitem>();
	private ArrayList<Exit> exit = new ArrayList<Exit>();
	private String loop = null;

	private String status = new String();	// waiting/initializing/working/committing/ finished/broken/cancelled
	private int exitvalue;
	public Step parent;
	/*----------------------------
	  constructors
	----------------------------*/
	public Work()
	{
		this.parent = new Step();
	}

	public Work(Step step)
	{
		this.parent = step;
	}

	/*----------------------------
	  methods
	----------------------------*/
	public void addCallitem(Callitem callitem)
	{
		callitem.setParent(this);
		this.callitem.add(callitem);
		
	}
	

	/*----------------------------
	  methods virtual get
	----------------------------*/
	public String getCall()
	{
		StringBuffer callbuffer = new StringBuffer(this.command);

		for(Callitem actCallitem : this.getCallitemssorted())
		{
			// callitems enthalten moeglicherweise eine loop definition
			// diese soll on-the-fly aufgeloest werden
			for(Callitem actCallitemLooped : actCallitem.loopMe())
			{
				callbuffer.append(" ");
				callbuffer.append(actCallitemLooped.getRespar());
				callbuffer.append(actCallitemLooped.getResdel());
				callbuffer.append(actCallitemLooped.getResval());
			}
		}

		return callbuffer.toString();
	}
	
	/*----------------------------
	  methods get
	----------------------------*/
	public String getName()
	{
		return this.name;
	}

	public String getDescription()
	{
		return this.description;
	}

	public String getInterpreter()
	{
		return this.interpreter;
	}

	public String getCommand()
	{
		return this.command;
	}

	public String getLogfile()
	{
		return this.logfile;
	}

	public ArrayList<Callitem> getCallitems()
	{
		return this.callitem;
	}
	
	public ArrayList<Callitem> getCallitem()
	{
		return this.callitem;
	}
	
	public Callitem getCallitem(int index)
	{
		return this.callitem.get(index);
	}
	
	public ArrayList<Callitem> getCallitemssorted()
	{
		ArrayList<Integer> sequences = new ArrayList<Integer>();
		
		// aus den vorhandenen callitems die sequences in ein eigenes array extrahieren
		for(Callitem actCallitem : this.callitem)
		{
			sequences.add(actCallitem.getSequence());
		}

		// das sequences-array sortieren
		Collections.sort(sequences);
		
		// ueber das sortierte sequences-array iterieren
		ArrayList<Callitem> callitems_sorted = new ArrayList<Callitem>();
		for(Integer actSequence : sequences)
		{
			// und das zugehoerige callitem rausfischen
			for(Callitem actCallitem : this.callitem)
			{
				if (actCallitem.getSequence() == actSequence)
				{
					callitems_sorted.add(actCallitem);
				}
			}
		}
		
		return callitems_sorted;
	}
	
	public Callitem[] getCallitems2()
	{
		Callitem[] callitems = new Callitem[this.callitem.size()];
		for (int i=0; i<this.callitem.size(); i++)
		{
			callitems[i] = this.callitem.get(i);
		}
		return callitems;
	}

	public ArrayList<Exit> getExit()
	{
		return this.exit;
	}
	
	public String getLoop()
	{
		return this.loop;
	}
	
	public String getStatus()
	{
		return this.status;
	}

	public int getExitvalue()
	{
		return this.exitvalue;
	}
	
	public ArrayList<String> getListItems(String listname)
	{
		return this.parent.getListItems(listname);
	}
	
	public Step getParent()
	{
		return this.parent;
	}
	
	/*----------------------------
	methods set
	----------------------------*/
	public void setName(String name)
	{
		this.name = name;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

	public void setInterpreter(String interpreter)
	{
		this.interpreter = interpreter;
	}

	public void setCommand(String command)
	{
		this.command = command;
	}

	public void setLogfile(String logfile)
	{
		this.logfile = logfile;
	}

	public void setLoop(String loop)
	{
		this.loop = loop;
	}
	
	public void setStatus(String status)
	{
		this.status = status;
	}

	public void setExitvalue(int exitvalue)
	{
		this.exitvalue = exitvalue;
	}

	/**
	 * @param step the parent to set
	 */
	public void setParent(Step step)
	{
		this.parent = step;
	}

	/**
	 * @param ArrayList<Callitem> the callitem to set
	 */
	public void setCallitem(ArrayList<Callitem> callitem)
	{
		this.callitem = callitem;
	}

	/**
	 * @param ArrayList<Callitem> the callitem to set
	 */
	public void setExit(ArrayList<Exit> exit)
	{
		this.exit = exit;
	}

}
