//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.23 at 05:20:27 PM MSK 
//


package ru.gov.zakupki._223fz.complaint._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for complaintVerificationPlanStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="complaintVerificationPlanStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="F"/>
 *     &lt;enumeration value="P"/>
 *     &lt;enumeration value="I"/>
 *     &lt;enumeration value="M"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "complaintVerificationPlanStatusType")
@XmlEnum
public enum ComplaintVerificationPlanStatusType {


    /**
     * Редактирование
     * 
     */
    F,

    /**
     * Опубликовано
     * 
     */
    P,

    /**
     * Недействительно
     * 
     */
    I,

    /**
     * Проект изменений
     * 
     */
    M;

    public String value() {
        return name();
    }

    public static ComplaintVerificationPlanStatusType fromValue(String v) {
        return valueOf(v);
    }

}
