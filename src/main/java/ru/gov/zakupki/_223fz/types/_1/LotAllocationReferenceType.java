//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.23 at 05:26:52 PM MSK 
//


package ru.gov.zakupki._223fz.types._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Сведения о формировании протокола в результате выделения лотов
 * 
 * <p>Java class for lotAllocationReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="lotAllocationReferenceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="protocolRequisites" type="{http://zakupki.gov.ru/223fz/types/1}protocolRequisitesType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lotAllocationReferenceType", propOrder = {
    "protocolRequisites"
})
public class LotAllocationReferenceType {

    @XmlElement(required = true)
    protected ProtocolRequisitesType protocolRequisites;

    /**
     * Gets the value of the protocolRequisites property.
     * 
     * @return
     *     possible object is
     *     {@link ProtocolRequisitesType }
     *     
     */
    public ProtocolRequisitesType getProtocolRequisites() {
        return protocolRequisites;
    }

    /**
     * Sets the value of the protocolRequisites property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolRequisitesType }
     *     
     */
    public void setProtocolRequisites(ProtocolRequisitesType value) {
        this.protocolRequisites = value;
    }

}
