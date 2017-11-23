//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.23 at 05:24:12 PM MSK 
//


package ru.gov.zakupki._223fz.reference._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Перечень протоколов
 * 
 * <p>Java class for protocolListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="protocolListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="controlledOrder" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="protocol" type="{http://zakupki.gov.ru/223fz/reference/1}purchaseProtocol" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "protocolListType", propOrder = {
    "controlledOrder",
    "protocol"
})
public class ProtocolListType {

    protected boolean controlledOrder;
    protected List<PurchaseProtocol> protocol;

    /**
     * Gets the value of the controlledOrder property.
     * 
     */
    public boolean isControlledOrder() {
        return controlledOrder;
    }

    /**
     * Sets the value of the controlledOrder property.
     * 
     */
    public void setControlledOrder(boolean value) {
        this.controlledOrder = value;
    }

    /**
     * Gets the value of the protocol property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the protocol property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProtocol().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PurchaseProtocol }
     * 
     * 
     */
    public List<PurchaseProtocol> getProtocol() {
        if (protocol == null) {
            protocol = new ArrayList<PurchaseProtocol>();
        }
        return this.protocol;
    }

}
