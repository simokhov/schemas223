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
 * <p>Java class for complaintStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="complaintStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OE"/>
 *     &lt;enumeration value="OR"/>
 *     &lt;enumeration value="RC"/>
 *     &lt;enumeration value="RF"/>
 *     &lt;enumeration value="PC"/>
 *     &lt;enumeration value="IV"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "complaintStatusType")
@XmlEnum
public enum ComplaintStatusType {


    /**
     * На редактировании
     * 
     */
    OE,

    /**
     * На рассмотрении
     * 
     */
    OR,

    /**
     * Отозвана
     * 
     */
    RC,

    /**
     * Рассмотрение завершено
     * 
     */
    RF,

    /**
     * Проект изменений
     * 
     */
    PC,

    /**
     * Недействительна
     * 
     */
    IV;

    public String value() {
        return name();
    }

    public static ComplaintStatusType fromValue(String v) {
        return valueOf(v);
    }

}
