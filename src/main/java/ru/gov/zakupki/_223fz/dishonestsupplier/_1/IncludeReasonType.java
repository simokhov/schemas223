//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.06 at 10:22:30 AM MSK 
//


package ru.gov.zakupki._223fz.dishonestsupplier._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for includeReasonType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="includeReasonType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="WD"/>
 *     &lt;enumeration value="AWD"/>
 *     &lt;enumeration value="OPD"/>
 *     &lt;enumeration value="CD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "includeReasonType")
@XmlEnum
public enum IncludeReasonType {


    /**
     * Уклонение победителя от заключения договора
     * 
     */
    WD,

    /**
     * Уклонение участника после победителя от заключения договора
     * 
     */
    AWD,

    /**
     * Уклонение единственного участника от заключения договора
     * 
     */
    OPD,

    /**
     * Расторжение договора
     * 
     */
    CD;

    public String value() {
        return name();
    }

    public static IncludeReasonType fromValue(String v) {
        return valueOf(v);
    }

}
