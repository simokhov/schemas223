//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.23 at 05:28:36 PM MSK 
//


package ru.gov.zakupki._223fz.dishonestsupplier._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dishonestSupplierStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dishonestSupplierStatusType">
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
@XmlType(name = "dishonestSupplierStatusType")
@XmlEnum
public enum DishonestSupplierStatusType {


    /**
     * Редактирование
     * 
     */
    F,

    /**
     * Размещено
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

    public static DishonestSupplierStatusType fromValue(String v) {
        return valueOf(v);
    }

}
