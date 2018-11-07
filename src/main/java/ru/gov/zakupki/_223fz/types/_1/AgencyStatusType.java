//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.11.07 at 09:43:41 AM MSK 
//


package ru.gov.zakupki._223fz.types._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for agencyStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="agencyStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BLOCKED"/>
 *     &lt;enumeration value="REGISTERED"/>
 *     &lt;enumeration value="REJECTED"/>
 *     &lt;enumeration value="PENDING"/>
 *     &lt;enumeration value="ON_HOLD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "agencyStatusType")
@XmlEnum
public enum AgencyStatusType {


    /**
     * Заблокирована
     * 
     */
    BLOCKED,

    /**
     * Зарегистрирована
     * 
     */
    REGISTERED,

    /**
     * Отказано в регистрации
     * 
     */
    REJECTED,

    /**
     * На регистрации
     * 
     */
    PENDING,

    /**
     * Приостановлено действие
     * 
     */
    ON_HOLD;

    public String value() {
        return name();
    }

    public static AgencyStatusType fromValue(String v) {
        return valueOf(v);
    }

}
