//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.04 at 07:04:23 PM CEST 
//


package de.caegroup.jaxb.process;

import java.util.ArrayList;
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
 *         &lt;element ref="{}list" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}init" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}work" minOccurs="0"/>
 *         &lt;element ref="{}commit" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *             &lt;maxLength value="50"/>
 *             &lt;whiteSpace value="collapse"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="clip" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="loop" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="loopvar" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="description">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="0"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="type" use="required" type="{}SteptypeType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "list",
    "init",
    "work",
    "commit"
})
@XmlRootElement(name = "step")
public class Step {

    protected java.util.List<de.caegroup.jaxb.process.List> list;
    protected java.util.List<Init> init;
    protected Work work;
    @XmlElement(required = true)
    protected java.util.List<Commit> commit;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "clip")
    protected String clip;
    @XmlAttribute(name = "loop")
    protected String loop;
    @XmlAttribute(name = "loopvar")
    protected String loopvar;
    @XmlAttribute(name = "description")
    protected String description;
    @XmlAttribute(name = "type", required = true)
    protected String type;

    /**
     * Gets the value of the list property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the list property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link de.caegroup.jaxb.process.List }
     * 
     * 
     */
    public java.util.List<de.caegroup.jaxb.process.List> getList() {
        if (list == null) {
            list = new ArrayList<de.caegroup.jaxb.process.List>();
        }
        return this.list;
    }

    /**
     * Gets the value of the init property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the init property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Init }
     * 
     * 
     */
    public java.util.List<Init> getInit() {
        if (init == null) {
            init = new ArrayList<Init>();
        }
        return this.init;
    }

    /**
     * Gets the value of the work property.
     * 
     * @return
     *     possible object is
     *     {@link Work }
     *     
     */
    public Work getWork() {
        return work;
    }

    /**
     * Sets the value of the work property.
     * 
     * @param value
     *     allowed object is
     *     {@link Work }
     *     
     */
    public void setWork(Work value) {
        this.work = value;
    }

    /**
     * Gets the value of the commit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Commit }
     * 
     * 
     */
    public java.util.List<Commit> getCommit() {
        if (commit == null) {
            commit = new ArrayList<Commit>();
        }
        return this.commit;
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
     * Gets the value of the clip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClip() {
        return clip;
    }

    /**
     * Sets the value of the clip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClip(String value) {
        this.clip = value;
    }

    /**
     * Gets the value of the loop property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoop() {
        return loop;
    }

    /**
     * Sets the value of the loop property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoop(String value) {
        this.loop = value;
    }

    /**
     * Gets the value of the loopvar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoopvar() {
        return loopvar;
    }

    /**
     * Sets the value of the loopvar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoopvar(String value) {
        this.loopvar = value;
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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

}
