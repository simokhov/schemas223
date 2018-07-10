//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.10 at 05:03:32 PM MSK 
//


package ru.gov.zakupki._223fz.disagreementprotocol._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for purchasePlanStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="purchasePlanStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="P"/>
 *     &lt;enumeration value="MP"/>
 *     &lt;enumeration value="M"/>
 *     &lt;enumeration value="CM"/>
 *     &lt;enumeration value="A"/>
 *     &lt;enumeration value="AM"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "purchasePlanStatusType")
@XmlEnum
public enum PurchasePlanStatusType {


    /**
     * Проект плана закупки
     * 
     */
    P,

    /**
     * Изменение проекта плана закупки
     * 
     */
    MP,

    /**
     * Проект изменений плана закупки
     * 
     */
    M,

    /**
     * Изменение проекта изменений плана закупки
     * 
     */
    CM,

    /**
     * Утвержден
     * 
     */
    A,

    /**
     * Утвержденные изменения плана закупки
     * 
     */
    AM;

    public String value() {
        return name();
    }

    public static PurchasePlanStatusType fromValue(String v) {
        return valueOf(v);
    }

}
