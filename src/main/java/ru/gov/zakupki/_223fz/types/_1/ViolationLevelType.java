//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.06 at 10:22:30 AM MSK 
//


package ru.gov.zakupki._223fz.types._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for violation.levelType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="violation.levelType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="error"/>
 *     &lt;enumeration value="warning"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "violation.levelType")
@XmlEnum
public enum ViolationLevelType {

    @XmlEnumValue("error")
    ERROR("error"),
    @XmlEnumValue("warning")
    WARNING("warning");
    private final String value;

    ViolationLevelType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ViolationLevelType fromValue(String v) {
        for (ViolationLevelType c: ViolationLevelType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
