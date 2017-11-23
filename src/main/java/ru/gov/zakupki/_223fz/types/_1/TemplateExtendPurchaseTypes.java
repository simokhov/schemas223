//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.23 at 05:29:18 PM MSK 
//


package ru.gov.zakupki._223fz.types._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for templateExtendPurchaseTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="templateExtendPurchaseTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OK"/>
 *     &lt;enumeration value="OA"/>
 *     &lt;enumeration value="OE"/>
 *     &lt;enumeration value="ZK"/>
 *     &lt;enumeration value="ZE"/>
 *     &lt;enumeration value="IS"/>
 *     &lt;enumeration value="ES"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "templateExtendPurchaseTypes")
@XmlEnum
public enum TemplateExtendPurchaseTypes {


    /**
     * Открытый конкурс
     * 
     */
    OK,

    /**
     * Открытый аукцион
     * 
     */
    OA,

    /**
     * Открытый аукцион в электронной форме
     * 
     */
    OE,

    /**
     * Запрос котировок
     * 
     */
    ZK,

    /**
     * Закупка у единственного поставщика
     * 
     */
    ZE,

    /**
     * Иной способ (состав данных согласно Федеральному закону 223-ФЗ)
     * 
     */
    IS,

    /**
     * Иной способ в электронной форме (выбор ВСРЗ для проведения закупки)
     * 
     */
    ES;

    public String value() {
        return name();
    }

    public static TemplateExtendPurchaseTypes fromValue(String v) {
        return valueOf(v);
    }

}
