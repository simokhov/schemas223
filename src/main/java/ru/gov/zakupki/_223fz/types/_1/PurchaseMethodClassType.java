//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.05 at 04:40:02 PM MSK 
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
 *     &lt;enumeration value="KESMBO"/>
 *     &lt;enumeration value="AESMBO"/>
 *     &lt;enumeration value="ZKESMBO"/>
 *     &lt;enumeration value="ZPESMBO"/>
 *     &lt;enumeration value="IS"/>
 *     &lt;enumeration value="TSK"/>
 *     &lt;enumeration value="TSA"/>
 *     &lt;enumeration value="TSZK"/>
 *     &lt;enumeration value="TSZP"/>
 *     &lt;enumeration value="TSEP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "purchaseMethodClassType")
@XmlEnum
public enum PurchaseMethodClassType {


    /**
     * Открытый конкурс (до 01.07.18)
     * 
     */
    OK("OK"),

    /**
     * Открытый аукцион (до 01.07.18)
     * 
     */
    OA("OA"),

    /**
     * Открытый аукцион в электронной форме (до 01.07.18)
     * 
     */
    AE("AE"),

    /**
     * Открытый аукцион в электронной форме (по 94ФЗ) (до 01.07.18)
     * 
     */
    @XmlEnumValue("AE94")
    AE_94("AE94"),

    /**
     * Запрос котировок (до 01.07.18)
     * 
     */
    ZK("ZK"),

    /**
     * Закупка у единственного поставщика (исполнителя, подрядчика) (до 01.07.18)
     * 
     */
    EP("EP"),

    /**
     * Конкурс в электронной форме, участниками которого могут являться только субъекты малого и среднего предпринимательства
     * 
     */
    KESMBO("KESMBO"),

    /**
     * Аукцион в электронной форме, участниками которого могут являться только субъекты малого и среднего предпринимательства
     * 
     */
    AESMBO("AESMBO"),

    /**
     * Запрос котировок в электронной форме, участниками которого могут являться только субъекты малого и среднего предпринимательства
     * 
     */
    ZKESMBO("ZKESMBO"),

    /**
     * Запрос предложений в электронной форме, участниками которого могут являться только субъекты малого и среднего предпринимательства
     * 
     */
    ZPESMBO("ZPESMBO"),

    /**
     * Иной способ
     * 
     */
    IS("IS"),

    /**
     * Типовой способ с видом «Конкурс»
     * 
     */
    TSK("TSK"),

    /**
     * Типовой способ с видом «Аукцион»
     * 
     */
    TSA("TSA"),

    /**
     * Типовой способ с видом «Запрос котировок»
     * 
     */
    TSZK("TSZK"),

    /**
     * Типовой способ с видом «Запрос предложений»
     * 
     */
    TSZP("TSZP"),

    /**
     * Типовой способ с видом «Закупка у единственного поставщика (подрядчика, исполнителя)»
     * 
     */
    TSEP("TSEP");
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
