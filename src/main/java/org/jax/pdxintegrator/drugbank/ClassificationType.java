//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.02.24 at 06:07:06 PM EST 
//


package org.jax.pdxintegrator.drugbank;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Drug classification is obtained from ClassyFire (http://classyfire.wishartlab.com).
 * 
 * <p>Java class for classification-type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="classification-type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="direct-parent" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="kingdom" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="superclass" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="class" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="subclass" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="alternative-parent" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="substituent" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "classification-type", propOrder = {
    "description",
    "directParent",
    "kingdom",
    "superclass",
    "clazz",
    "subclass",
    "alternativeParent",
    "substituent"
})
public class ClassificationType {

    @XmlElement(required = true)
    protected String description;
    @XmlElement(name = "direct-parent", required = true)
    protected String directParent;
    @XmlElement(required = true)
    protected String kingdom;
    @XmlElement(required = true)
    protected String superclass;
    @XmlElement(name = "class", required = true)
    protected String clazz;
    @XmlElement(required = true)
    protected String subclass;
    @XmlElement(name = "alternative-parent")
    protected List<String> alternativeParent;
    protected List<String> substituent;

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
     * Gets the value of the directParent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectParent() {
        return directParent;
    }

    /**
     * Sets the value of the directParent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectParent(String value) {
        this.directParent = value;
    }

    /**
     * Gets the value of the kingdom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKingdom() {
        return kingdom;
    }

    /**
     * Sets the value of the kingdom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKingdom(String value) {
        this.kingdom = value;
    }

    /**
     * Gets the value of the superclass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuperclass() {
        return superclass;
    }

    /**
     * Sets the value of the superclass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuperclass(String value) {
        this.superclass = value;
    }

    /**
     * Gets the value of the clazz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClazz() {
        return clazz;
    }

    /**
     * Sets the value of the clazz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClazz(String value) {
        this.clazz = value;
    }

    /**
     * Gets the value of the subclass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubclass() {
        return subclass;
    }

    /**
     * Sets the value of the subclass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubclass(String value) {
        this.subclass = value;
    }

    /**
     * Gets the value of the alternativeParent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alternativeParent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlternativeParent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAlternativeParent() {
        if (alternativeParent == null) {
            alternativeParent = new ArrayList<String>();
        }
        return this.alternativeParent;
    }

    /**
     * Gets the value of the substituent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the substituent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubstituent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSubstituent() {
        if (substituent == null) {
            substituent = new ArrayList<String>();
        }
        return this.substituent;
    }

}
