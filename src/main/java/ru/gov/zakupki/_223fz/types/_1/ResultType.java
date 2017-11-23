//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.23 at 05:22:49 PM MSK 
//


package ru.gov.zakupki._223fz.types._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for resultType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="resultType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="success"/>
 *     &lt;enumeration value="failure"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "resultType")
@XmlEnum
public enum ResultType {

    @XmlEnumValue("success")
    SUCCESS("success"),
    @XmlEnumValue("failure")
    FAILURE("failure");
    private final String value;

    ResultType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ResultType fromValue(String v) {
        for (ResultType c: ResultType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
