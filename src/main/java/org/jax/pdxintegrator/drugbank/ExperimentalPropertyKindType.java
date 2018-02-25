//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.02.24 at 06:07:06 PM EST 
//


package org.jax.pdxintegrator.drugbank;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for experimental-property-kind-type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="experimental-property-kind-type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Water Solubility"/>
 *     &lt;enumeration value="Melting Point"/>
 *     &lt;enumeration value="Boiling Point"/>
 *     &lt;enumeration value="logP"/>
 *     &lt;enumeration value="logS"/>
 *     &lt;enumeration value="Hydrophobicity"/>
 *     &lt;enumeration value="Isoelectric Point"/>
 *     &lt;enumeration value="caco2 Permeability"/>
 *     &lt;enumeration value="pKa"/>
 *     &lt;enumeration value="Molecular Weight"/>
 *     &lt;enumeration value="Molecular Formula"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "experimental-property-kind-type")
@XmlEnum
public enum ExperimentalPropertyKindType {

    @XmlEnumValue("Water Solubility")
    WATER_SOLUBILITY("Water Solubility"),
    @XmlEnumValue("Melting Point")
    MELTING_POINT("Melting Point"),
    @XmlEnumValue("Boiling Point")
    BOILING_POINT("Boiling Point"),
    @XmlEnumValue("logP")
    LOG_P("logP"),
    @XmlEnumValue("logS")
    LOG_S("logS"),
    @XmlEnumValue("Hydrophobicity")
    HYDROPHOBICITY("Hydrophobicity"),
    @XmlEnumValue("Isoelectric Point")
    ISOELECTRIC_POINT("Isoelectric Point"),
    @XmlEnumValue("caco2 Permeability")
    CACO_2_PERMEABILITY("caco2 Permeability"),
    @XmlEnumValue("pKa")
    P_KA("pKa"),
    @XmlEnumValue("Molecular Weight")
    MOLECULAR_WEIGHT("Molecular Weight"),
    @XmlEnumValue("Molecular Formula")
    MOLECULAR_FORMULA("Molecular Formula");
    private final String value;

    ExperimentalPropertyKindType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExperimentalPropertyKindType fromValue(String v) {
        for (ExperimentalPropertyKindType c: ExperimentalPropertyKindType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
