//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.23 at 05:26:25 PM MSK 
//


package ru.gov.zakupki._223fz.reference._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Переход
 * 
 * <p>Java class for phaseTransition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="phaseTransition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="protocolCode" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="phaseCode" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "phaseTransition", propOrder = {
    "protocolCode",
    "phaseCode"
})
public class PhaseTransition {

    protected long protocolCode;
    protected long phaseCode;

    /**
     * Gets the value of the protocolCode property.
     * 
     */
    public long getProtocolCode() {
        return protocolCode;
    }

    /**
     * Sets the value of the protocolCode property.
     * 
     */
    public void setProtocolCode(long value) {
        this.protocolCode = value;
    }

    /**
     * Gets the value of the phaseCode property.
     * 
     */
    public long getPhaseCode() {
        return phaseCode;
    }

    /**
     * Sets the value of the phaseCode property.
     * 
     */
    public void setPhaseCode(long value) {
        this.phaseCode = value;
    }

}
