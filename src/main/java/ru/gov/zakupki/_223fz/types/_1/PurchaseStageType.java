//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.23 at 05:15:39 PM MSK 
//


package ru.gov.zakupki._223fz.types._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for purchaseStageType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="purchaseStageType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NOTICE_FORMATION"/>
 *     &lt;enumeration value="APPLICATION_FILING"/>
 *     &lt;enumeration value="COMMISSION_ACTIVITIES"/>
 *     &lt;enumeration value="PLACEMENT_COMPLETE"/>
 *     &lt;enumeration value="PLACEMENT_CANCELED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "purchaseStageType")
@XmlEnum
public enum PurchaseStageType {


    /**
     * Формирование извещения
     * 
     */
    NOTICE_FORMATION,

    /**
     * Подача заявок
     * 
     */
    APPLICATION_FILING,

    /**
     * Работа комиссии
     * 
     */
    COMMISSION_ACTIVITIES,

    /**
     * Размещение завершено
     * 
     */
    PLACEMENT_COMPLETE,

    /**
     * Размещение отменено
     * 
     */
    PLACEMENT_CANCELED;

    public String value() {
        return name();
    }

    public static PurchaseStageType fromValue(String v) {
        return valueOf(v);
    }

}
