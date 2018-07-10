//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.10 at 05:03:32 PM MSK 
//


package ru.gov.zakupki._223fz.purchase._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for rejectionReasonCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="rejectionReasonCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="STRUCTURE_CONTENT_DESIGN"/>
 *     &lt;enumeration value="PARTICIPATOR"/>
 *     &lt;enumeration value="SUBCONTRACTOR"/>
 *     &lt;enumeration value="PRODUCT"/>
 *     &lt;enumeration value="CONDITIONS"/>
 *     &lt;enumeration value="SUPPLY"/>
 *     &lt;enumeration value="OTHER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "rejectionReasonCodeType")
@XmlEnum
public enum RejectionReasonCodeType {


    /**
     * Несоответствие заявки по составу, содержанию и оформлению
     * 
     */
    STRUCTURE_CONTENT_DESIGN,

    /**
     * Несоответствие участника закупки требованиям документации
     * 
     */
    PARTICIPATOR,

    /**
     * Несоответствие субподрядчиков (соисполнителей), изготовителей требованиям документации
     * 
     */
    SUBCONTRACTOR,

    /**
     * Несоответствие продукции, указанной в заявке на участие в закупке, требованиям документации
     * 
     */
    PRODUCT,

    /**
     * Несоответствие договорных условий, указанных в заявке на участие в закупке, требованиям документации
     * 
     */
    CONDITIONS,

    /**
     * Несоответствие размера, формы, условий или порядка предоставления обеспечения заявки
     * 
     */
    SUPPLY,

    /**
     * Иное основание в соответствии с положением о закупке
     * 
     */
    OTHER;

    public String value() {
        return name();
    }

    public static RejectionReasonCodeType fromValue(String v) {
        return valueOf(v);
    }

}
