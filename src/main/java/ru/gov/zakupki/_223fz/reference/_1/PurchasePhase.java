//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.23 at 05:23:33 PM MSK 
//


package ru.gov.zakupki._223fz.reference._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Подэтап
 * 
 * <p>Java class for purchasePhase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="purchasePhase">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="orderNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="name">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="200"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="editEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="protocols" type="{http://zakupki.gov.ru/223fz/reference/1}protocolListType"/>
 *         &lt;element name="phaseTransitions" type="{http://zakupki.gov.ru/223fz/reference/1}phaseTransitionsListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "purchasePhase", propOrder = {
    "orderNumber",
    "code",
    "name",
    "editEnabled",
    "protocols",
    "phaseTransitions"
})
public class PurchasePhase {

    protected int orderNumber;
    protected long code;
    @XmlElement(required = true)
    protected String name;
    protected boolean editEnabled;
    @XmlElement(required = true)
    protected ProtocolListType protocols;
    protected PhaseTransitionsListType phaseTransitions;

    /**
     * Gets the value of the orderNumber property.
     * 
     */
    public int getOrderNumber() {
        return orderNumber;
    }

    /**
     * Sets the value of the orderNumber property.
     * 
     */
    public void setOrderNumber(int value) {
        this.orderNumber = value;
    }

    /**
     * Gets the value of the code property.
     * 
     */
    public long getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     */
    public void setCode(long value) {
        this.code = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the editEnabled property.
     * 
     */
    public boolean isEditEnabled() {
        return editEnabled;
    }

    /**
     * Sets the value of the editEnabled property.
     * 
     */
    public void setEditEnabled(boolean value) {
        this.editEnabled = value;
    }

    /**
     * Gets the value of the protocols property.
     * 
     * @return
     *     possible object is
     *     {@link ProtocolListType }
     *     
     */
    public ProtocolListType getProtocols() {
        return protocols;
    }

    /**
     * Sets the value of the protocols property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolListType }
     *     
     */
    public void setProtocols(ProtocolListType value) {
        this.protocols = value;
    }

    /**
     * Gets the value of the phaseTransitions property.
     * 
     * @return
     *     possible object is
     *     {@link PhaseTransitionsListType }
     *     
     */
    public PhaseTransitionsListType getPhaseTransitions() {
        return phaseTransitions;
    }

    /**
     * Sets the value of the phaseTransitions property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhaseTransitionsListType }
     *     
     */
    public void setPhaseTransitions(PhaseTransitionsListType value) {
        this.phaseTransitions = value;
    }

}
