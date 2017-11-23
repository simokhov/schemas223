//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.23 at 05:19:45 PM MSK 
//


package ru.gov.zakupki._223fz.types._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for noticeDeliveryPlaceIndicationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="noticeDeliveryPlaceIndicationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SINGLE_PLACE"/>
 *     &lt;enumeration value="DIFFERENT_PLACE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "noticeDeliveryPlaceIndicationType")
@XmlEnum
public enum NoticeDeliveryPlaceIndicationType {


    /**
     * Единое место поставки лотов
     * 
     */
    SINGLE_PLACE,

    /**
     * Различные места поставки лотов
     * 
     */
    DIFFERENT_PLACE;

    public String value() {
        return name();
    }

    public static NoticeDeliveryPlaceIndicationType fromValue(String v) {
        return valueOf(v);
    }

}
