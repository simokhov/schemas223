//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.12.18 at 10:05:56 AM MSK 
//


package ru.gov.zakupki._223fz.types._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for purchaseMethodClassType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="purchaseMethodClassType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OK"/>
 *     &lt;enumeration value="OA"/>
 *     &lt;enumeration value="AE"/>
 *     &lt;enumeration value="AE94"/>
 *     &lt;enumeration value="ZK"/>
 *     &lt;enumeration value="EP"/>
 *     &lt;enumeration value="IS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "purchaseMethodClassType")
@XmlEnum
public enum PurchaseMethodClassType {


    /**
     * Открытый конкурс
     * 
     */
    OK("OK"),

    /**
     * Открытый аукцион
     * 
     */
    OA("OA"),

    /**
     * Открытый аукцион в электронной форме
     * 
     */
    AE("AE"),

    /**
     * Открытый аукцион в электронной форме (по 94ФЗ)
     * 
     */
    @XmlEnumValue("AE94")
    AE_94("AE94"),

    /**
     * Запрос котировок
     * 
     */
    ZK("ZK"),

    /**
     * Закупка у единственного поставщика (исполнителя, подрядчика)
     * 
     */
    EP("EP"),

    /**
     * Иной способ
     * 
     */
    IS("IS");
    private final String value;

    PurchaseMethodClassType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PurchaseMethodClassType fromValue(String v) {
        for (PurchaseMethodClassType c: PurchaseMethodClassType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
