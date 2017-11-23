//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.23 at 05:22:49 PM MSK 
//


package ru.gov.zakupki._223fz.complaint._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for complaintDecisionSolutionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="complaintDecisionSolutionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CONFIRMED"/>
 *     &lt;enumeration value="PARTLY"/>
 *     &lt;enumeration value="UNREASONABLY"/>
 *     &lt;enumeration value="NOT_APPLICABLE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "complaintDecisionSolutionType")
@XmlEnum
public enum ComplaintDecisionSolutionType {


    /**
     * Признана обоснованной
     * 
     */
    CONFIRMED,

    /**
     * Признана обоснованной  (частично)
     * 
     */
    PARTLY,

    /**
     * Признана необоснованной
     * 
     */
    UNREASONABLY,

    /**
     * Не относится к компетенции контролирующего органа
     * 
     */
    NOT_APPLICABLE;

    public String value() {
        return name();
    }

    public static ComplaintDecisionSolutionType fromValue(String v) {
        return valueOf(v);
    }

}
