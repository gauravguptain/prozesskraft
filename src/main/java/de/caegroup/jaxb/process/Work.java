//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.06.13 at 05:04:31 PM CEST 
//


package de.caegroup.jaxb.process;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}callitem" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}exit" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="interpreter" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="command" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="logfile" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "callitem",
    "exit"
})
@XmlRootElement(name = "work")
public class Work {

    protected List<Callitem> callitem;
    protected List<Exit> exit;
    @XmlAttribute(name = "interpreter")
    protected String interpreter;
    @XmlAttribute(name = "command", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String command;
    @XmlAttribute(name = "description", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String description;
    @XmlAttribute(name = "name", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String name;
    @XmlAttribute(name = "logfile")
    protected String logfile;

    /**
     * Gets the value of the callitem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the callitem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCallitem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Callitem }
     * 
     * 
     */
    public List<Callitem> getCallitem() {
        if (callitem == null) {
            callitem = new ArrayList<Callitem>();
        }
        return this.callitem;
    }

    /**
     * Gets the value of the exit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Exit }
     * 
     * 
     */
    public List<Exit> getExit() {
        if (exit == null) {
            exit = new ArrayList<Exit>();
        }
        return this.exit;
    }

    /**
     * Gets the value of the interpreter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterpreter() {
        return interpreter;
    }

    /**
     * Sets the value of the interpreter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterpreter(String value) {
        this.interpreter = value;
    }

    /**
     * Gets the value of the command property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommand() {
        return command;
    }

    /**
     * Sets the value of the command property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommand(String value) {
        this.command = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the logfile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogfile() {
        return logfile;
    }

    /**
     * Sets the value of the logfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogfile(String value) {
        this.logfile = value;
    }

    public void setCallitem(List<Callitem> value) {
        this.callitem = value;
    }

    public void setExit(List<Exit> value) {
        this.exit = value;
    }

}
