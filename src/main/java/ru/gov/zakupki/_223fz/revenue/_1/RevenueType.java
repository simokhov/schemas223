//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.06 at 10:27:43 AM MSK 
//


package ru.gov.zakupki._223fz.revenue._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for revenueType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="revenueType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TYPE_1"/>
 *     &lt;enumeration value="TYPE_2"/>
 *     &lt;enumeration value="TYPE_3"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "revenueType")
@XmlEnum
public enum RevenueType {


    /**
     * Сведения о выручке субъектов естественных монополий, организаций, осуществляющих
     *                         регулируемые виды деятельности (п.1 ч. 2.1 статьи 1 Закона 223-ФЗ)
     *                     
     * 
     */
    TYPE_1,

    /**
     * Сведения о выручке дочерних хозяйственных обществ (п.2 ч. 2.1 статьи 1 Закона
     *                         223-ФЗ)
     *                     
     * 
     */
    TYPE_2,

    /**
     * Cведения о выручке дочерних хозяйственных обществ (п.3 ч. 2.1 статьи 1 Закона
     *                         223-ФЗ)
     *                     
     * 
     */
    TYPE_3;

    public String value() {
        return name();
    }

    public static RevenueType fromValue(String v) {
        return valueOf(v);
    }

}
