//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.12.18 at 10:05:56 AM MSK 
//


package ru.gov.zakupki._223fz.types._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deliveryPlaceIndicationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="deliveryPlaceIndicationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="GL"/>
 *     &lt;enumeration value="ELP"/>
 *     &lt;enumeration value="LC"/>
 *     &lt;enumeration value="GA"/>
 *     &lt;enumeration value="EP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "deliveryPlaceIndicationType")
@XmlEnum
public enum DeliveryPlaceIndicationType {


    /**
     * Указывается общее для лота
     * 
     */
    GL,

    /**
     * Указывается для каждой позиции лота
     * 
     */
    ELP,

    /**
     * Указывается в сведениях по участнику совместной закупки
     * 
     */
    LC,

    /**
     * Указывается общее для организации
     * 
     */
    GA,

    /**
     * Указывается для каждой позиции
     * 
     */
    EP;

    public String value() {
        return name();
    }

    public static DeliveryPlaceIndicationType fromValue(String v) {
        return valueOf(v);
    }

}
