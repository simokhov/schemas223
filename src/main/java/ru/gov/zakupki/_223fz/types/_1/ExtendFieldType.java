//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.23 at 05:18:00 PM MSK 
//


package ru.gov.zakupki._223fz.types._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for extendFieldType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="extendFieldType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="STRING"/>
 *     &lt;enumeration value="TEXT"/>
 *     &lt;enumeration value="INTEGER"/>
 *     &lt;enumeration value="NUMBER"/>
 *     &lt;enumeration value="BOOLEAN"/>
 *     &lt;enumeration value="DATETIME"/>
 *     &lt;enumeration value="DATE"/>
 *     &lt;enumeration value="LINK"/>
 *     &lt;enumeration value="FILE"/>
 *     &lt;enumeration value="REGEXP"/>
 *     &lt;enumeration value="CURRENCY"/>
 *     &lt;enumeration value="UNITS"/>
 *     &lt;enumeration value="OKDP"/>
 *     &lt;enumeration value="OKVED"/>
 *     &lt;enumeration value="TABLE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "extendFieldType")
@XmlEnum
public enum ExtendFieldType {


    /**
     * Строка
     * 
     */
    STRING,

    /**
     * Текст
     * 
     */
    TEXT,

    /**
     * Целое число
     * 
     */
    INTEGER,

    /**
     * Число
     * 
     */
    NUMBER,

    /**
     * Логический
     * 
     */
    BOOLEAN,

    /**
     * Дата / время
     * 
     */
    DATETIME,

    /**
     * Дата
     * 
     */
    DATE,

    /**
     * Гиперссылка
     * 
     */
    LINK,

    /**
     * Файл
     * 
     */
    FILE,

    /**
     * Значение по шаблону
     * 
     */
    REGEXP,

    /**
     * Справочник «Валюта»
     * 
     */
    CURRENCY,

    /**
     * Справочник «Единицы измерения»
     * 
     */
    UNITS,

    /**
     * Справочник «ОКДП»
     * 
     */
    OKDP,

    /**
     * Справочник «ОКВЭД»
     * 
     */
    OKVED,

    /**
     * Табличное представление из справочника
     * 
     */
    TABLE;

    public String value() {
        return name();
    }

    public static ExtendFieldType fromValue(String v) {
        return valueOf(v);
    }

}
