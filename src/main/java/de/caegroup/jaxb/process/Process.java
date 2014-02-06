//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.02.06 at 12:43:33 PM CET 
//


package de.caegroup.jaxb.process;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 *         &lt;element ref="{}step" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="initCommitDir" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="initCommitVarfile" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="architectMail" use="required" type="{}EmailType" />
 *       &lt;attribute name="architectName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="architectCompany" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="customerMail" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="customerName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="customerCompany" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="path" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="modelVersion" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pradar" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "step"
})
@XmlRootElement(name = "process")
public class Process {

    @XmlElement(required = true)
    protected List<Step> step;
    @XmlAttribute(name = "initCommitDir")
    protected String initCommitDir;
    @XmlAttribute(name = "initCommitVarfile")
    protected String initCommitVarfile;
    @XmlAttribute(name = "architectMail", required = true)
    protected String architectMail;
    @XmlAttribute(name = "architectName")
    protected String architectName;
    @XmlAttribute(name = "architectCompany")
    protected String architectCompany;
    @XmlAttribute(name = "customerMail")
    protected String customerMail;
    @XmlAttribute(name = "customerName")
    protected String customerName;
    @XmlAttribute(name = "customerCompany")
    protected String customerCompany;
    @XmlAttribute(name = "description", required = true)
    protected String description;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "path", required = true)
    protected String path;
    @XmlAttribute(name = "modelVersion", required = true)
    protected String modelVersion;
    @XmlAttribute(name = "version", required = true)
    protected String version;
    @XmlAttribute(name = "pradar")
    protected Boolean pradar;

    /**
     * Gets the value of the step property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the step property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStep().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Step }
     * 
     * 
     */
    public List<Step> getStep() {
        if (step == null) {
            step = new ArrayList<Step>();
        }
        return this.step;
    }

    /**
     * Gets the value of the initCommitDir property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitCommitDir() {
        return initCommitDir;
    }

    /**
     * Sets the value of the initCommitDir property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitCommitDir(String value) {
        this.initCommitDir = value;
    }

    /**
     * Gets the value of the initCommitVarfile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitCommitVarfile() {
        return initCommitVarfile;
    }

    /**
     * Sets the value of the initCommitVarfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitCommitVarfile(String value) {
        this.initCommitVarfile = value;
    }

    /**
     * Gets the value of the architectMail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArchitectMail() {
        return architectMail;
    }

    /**
     * Sets the value of the architectMail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArchitectMail(String value) {
        this.architectMail = value;
    }

    /**
     * Gets the value of the architectName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArchitectName() {
        return architectName;
    }

    /**
     * Sets the value of the architectName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArchitectName(String value) {
        this.architectName = value;
    }

    /**
     * Gets the value of the architectCompany property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArchitectCompany() {
        return architectCompany;
    }

    /**
     * Sets the value of the architectCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArchitectCompany(String value) {
        this.architectCompany = value;
    }

    /**
     * Gets the value of the customerMail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerMail() {
        return customerMail;
    }

    /**
     * Sets the value of the customerMail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerMail(String value) {
        this.customerMail = value;
    }

    /**
     * Gets the value of the customerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * Sets the value of the customerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerName(String value) {
        this.customerName = value;
    }

    /**
     * Gets the value of the customerCompany property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerCompany() {
        return customerCompany;
    }

    /**
     * Sets the value of the customerCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerCompany(String value) {
        this.customerCompany = value;
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
     * Gets the value of the path property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPath() {
        return path;
    }

    /**
     * Sets the value of the path property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPath(String value) {
        this.path = value;
    }

    /**
     * Gets the value of the modelVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelVersion() {
        return modelVersion;
    }

    /**
     * Sets the value of the modelVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelVersion(String value) {
        this.modelVersion = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the pradar property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isPradar() {
        if (pradar == null) {
            return false;
        } else {
            return pradar;
        }
    }

    /**
     * Sets the value of the pradar property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPradar(Boolean value) {
        this.pradar = value;
    }

}
