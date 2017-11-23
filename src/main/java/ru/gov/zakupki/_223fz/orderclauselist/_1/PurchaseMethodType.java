//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.23 at 05:17:31 PM MSK 
//


package ru.gov.zakupki._223fz.orderclauselist._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Сведения о способах закупки
 * 
 * <p>Java class for purchaseMethodType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="purchaseMethodType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="purchaseMethodCode" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="purchaseMethodName">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="digitalPurchase" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="phasesNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="conditionsOfUse" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "purchaseMethodType", propOrder = {
    "purchaseMethodCode",
    "purchaseMethodName",
    "digitalPurchase",
    "phasesNumber",
    "conditionsOfUse"
})
public class PurchaseMethodType {

    protected long purchaseMethodCode;
    @XmlElement(required = true)
    protected String purchaseMethodName;
    protected boolean digitalPurchase;
    protected Integer phasesNumber;
    protected String conditionsOfUse;

    /**
     * Gets the value of the purchaseMethodCode property.
     * 
     */
    public long getPurchaseMethodCode() {
        return purchaseMethodCode;
    }

    /**
     * Sets the value of the purchaseMethodCode property.
     * 
     */
    public void setPurchaseMethodCode(long value) {
        this.purchaseMethodCode = value;
    }

    /**
     * Gets the value of the purchaseMethodName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchaseMethodName() {
        return purchaseMethodName;
    }

    /**
     * Sets the value of the purchaseMethodName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchaseMethodName(String value) {
        this.purchaseMethodName = value;
    }

    /**
     * Gets the value of the digitalPurchase property.
     * 
     */
    public boolean isDigitalPurchase() {
        return digitalPurchase;
    }

    /**
     * Sets the value of the digitalPurchase property.
     * 
     */
    public void setDigitalPurchase(boolean value) {
        this.digitalPurchase = value;
    }

    /**
     * Gets the value of the phasesNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPhasesNumber() {
        return phasesNumber;
    }

    /**
     * Sets the value of the phasesNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPhasesNumber(Integer value) {
        this.phasesNumber = value;
    }

    /**
     * Gets the value of the conditionsOfUse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConditionsOfUse() {
        return conditionsOfUse;
    }

    /**
     * Sets the value of the conditionsOfUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConditionsOfUse(String value) {
        this.conditionsOfUse = value;
    }

}
