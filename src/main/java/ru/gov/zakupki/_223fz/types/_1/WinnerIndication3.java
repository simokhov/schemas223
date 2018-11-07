//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.11.07 at 09:42:20 AM MSK 
//


package ru.gov.zakupki._223fz.types._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for winnerIndication3.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="winnerIndication3">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="W"/>
 *     &lt;enumeration value="F"/>
 *     &lt;enumeration value="S"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "winnerIndication3")
@XmlEnum
public enum WinnerIndication3 {


    /**
     * Победитель
     * 
     */
    W,

    /**
     * Участник, предложивший цену победителя
     * 
     */
    F,

    /**
     * Участник, предложивший цену, следующую после победителя
     * 
     */
    S;

    public String value() {
        return name();
    }

    public static WinnerIndication3 fromValue(String v) {
        return valueOf(v);
    }

}
