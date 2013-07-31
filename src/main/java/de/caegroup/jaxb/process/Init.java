//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.07.31 at 05:33:14 PM CEST 
//


package de.caegroup.jaxb.process;

import java.math.BigInteger;
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
 *         &lt;element ref="{}match" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="fromobjecttype" use="required" type="{}ResourceType" />
 *       &lt;attribute name="fromstep" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="minoccur" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="maxoccur" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="returnfield" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="insertrule" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "match",
    "value"
})
@XmlRootElement(name = "init")
public class Init {

    protected List<Match> match;
    protected List<String> value;
    @XmlAttribute(name = "fromobjecttype", required = true)
    protected String fromobjecttype;
    @XmlAttribute(name = "fromstep", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String fromstep;
    @XmlAttribute(name = "minoccur", required = true)
    protected BigInteger minoccur;
    @XmlAttribute(name = "maxoccur", required = true)
    protected BigInteger maxoccur;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "returnfield")
    protected String returnfield;
    @XmlAttribute(name = "insertrule")
    protected String insertrule;

    /**
     * Gets the value of the match property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the match property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMatch().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Match }
     * 
     * 
     */
    public List<Match> getMatch() {
        if (match == null) {
            match = new ArrayList<Match>();
        }
        return this.match;
    }

    /**
     * Gets the value of the value property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the value property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getValue() {
        if (value == null) {
            value = new ArrayList<String>();
        }
        return this.value;
    }

    /**
     * Gets the value of the fromobjecttype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromobjecttype() {
        return fromobjecttype;
    }

    /**
     * Sets the value of the fromobjecttype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromobjecttype(String value) {
        this.fromobjecttype = value;
    }

    /**
     * Gets the value of the fromstep property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromstep() {
        return fromstep;
    }

    /**
     * Sets the value of the fromstep property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromstep(String value) {
        this.fromstep = value;
    }

    /**
     * Gets the value of the minoccur property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinoccur() {
        return minoccur;
    }

    /**
     * Sets the value of the minoccur property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinoccur(BigInteger value) {
        this.minoccur = value;
    }

    /**
     * Gets the value of the maxoccur property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxoccur() {
        return maxoccur;
    }

    /**
     * Sets the value of the maxoccur property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxoccur(BigInteger value) {
        this.maxoccur = value;
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
     * Gets the value of the returnfield property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnfield() {
        return returnfield;
    }

    /**
     * Sets the value of the returnfield property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnfield(String value) {
        this.returnfield = value;
    }

    /**
     * Gets the value of the insertrule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsertrule() {
        return insertrule;
    }

    /**
     * Sets the value of the insertrule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsertrule(String value) {
        this.insertrule = value;
    }

}
