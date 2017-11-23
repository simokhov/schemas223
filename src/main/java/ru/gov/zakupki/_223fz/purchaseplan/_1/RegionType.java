//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.23 at 05:21:14 PM MSK 
//


package ru.gov.zakupki._223fz.purchaseplan._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for regionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="regionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="POS_REGION"/>
 *     &lt;enumeration value="COM_REGION"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "regionType")
@XmlEnum
public enum RegionType {


    /**
     * Регион для позиции плана в целом
     * 
     */
    POS_REGION,

    /**
     * Регион для отдельного товара, услуги, работы в позиции плана
     * 
     */
    COM_REGION;

    public String value() {
        return name();
    }

    public static RegionType fromValue(String v) {
        return valueOf(v);
    }

}
