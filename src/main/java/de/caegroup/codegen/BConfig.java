package de.caegroup.codegen;

import java.io.*;
import java.math.BigInteger;
import java.util.*;
import java.security.*;

public class BConfig
implements Serializable, Cloneable
{
	/*----------------------------
	  structure
	----------------------------*/

	static final long serialVersionUID = 1;
	Script parent = null;
	Block block = new Block();

	/*----------------------------
	  constructors
	----------------------------*/
	public BConfig(Script parent)
	{
		this.parent = parent;
	}

	/*----------------------------
	  methods 
	----------------------------*/
	public ArrayList<String> getBlock()
	{
		return this.block.getCode();
	}

	public void genCode(String type)
	{
		ArrayList<String> content = new ArrayList<String>();
		
		if(type.matches("bla"))
		{
			
		}
		// default
		else
		{
			content.add("my %CONF;");
			content.add("my %CONF_ORG;");
			content.add("");
			content.add("# einlesen des config-files");
			content.add("if (stat $conf_path)");
			content.add("{");
			content.add("	%CONF_ORG = &getvars($conf_path);");
			content.add("}");
			content.add("else");
			content.add("{");
			content.add("	logit(\"warn\", \"cannot read $conf_path. builtin config-read capabilities cannot be used\");");
			content.add("}");
			content.add("");
			content.add("# setzen der vom user uebergebenen configparameter und damit ueberschreiben der bestehenden mit dem gleichen namen");
			content.add("foreach my $config (@config)");
			content.add("{");
			content.add("	my @param = split(\"=\", $config);");
			content.add("	logit(\"info\", \"user-driven reconfiguration of \" . $config);");
			content.add("	if (exists $CONF_ORG{$param[0]})");
			content.add("	{");
			content.add("		logit(\"warn\", \"reconfiguring parameter (\" . $param[0] . \"=\" . $CONF_ORG{$param[0]} . \") with user value (\" . $param[0] . \"=\" . $param[1] . \")\");");
			content.add("		$CONF_ORG{$param[0]} = $param[1];");
			content.add("	}");
			content.add("	else");
			content.add("	{");
			content.add("		logit(\"fatal\", \"user config parameter does not exist in configfile (\" . $param[0] . \") - ignoring.\");");
			content.add("		logit(\"info\", \"you only may use these keys as a configuration parameter: \" . join (\", \", keys %CONF_ORG));");
			content.add("		exit(1);");
			content.add("	}");
			content.add("}");
			content.add("");
			content.add("# viele parameter im parameterfile enthalten pfade relativ zum installationsverzeichnis");
			content.add("# diese pfade sollen auf absolute pfade expandiert werden");
			content.add("logit(\"info\", \"expanding config parameter to absolute path\");");
			content.add("foreach my $param (sort keys %CONF_ORG)");
			content.add("{");
			content.add("# gibts da ein file? Ja? Dann soll auf den absoluten Pfad expandiert werden");
			content.add("	if ((($CONF_ORG{$param} ne \"\") && (stat $bindir.\"/\".$CONF_ORG{$param})))");
			content.add("	{");
			content.add("		$CONF{$param} = File::Spec->rel2abs($bindir.\"/\".$CONF_ORG{$param});");
			content.add("		logit(\"info\", \"parameter $param (value=\" . $CONF_ORG{$param} .\") expanding to (new_value=\".$CONF{$param}.\")\");");
			content.add("	}");
			content.add("	else");
			content.add("	{");
			content.add("		$CONF{$param} = $CONF_ORG{$param};");
			content.add("	}");
			content.add("}");
		}
		
		this.block.setOrigin("auto");
		this.block.setBlockname("config");
		this.block.setCode(content);
	}

}