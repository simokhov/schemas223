//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.23 at 05:21:14 PM MSK 
//


package ru.gov.zakupki._223fz.types._1;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Информация о товаре, работе, услуге
 * 
 * <p>Java class for contractItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="contractItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="okdp" type="{http://zakupki.gov.ru/223fz/types/1}okdpProductType"/>
 *         &lt;element name="okved" type="{http://zakupki.gov.ru/223fz/types/1}okvedProductType"/>
 *         &lt;sequence minOccurs="0">
 *           &lt;element name="okei" type="{http://zakupki.gov.ru/223fz/types/1}okeiProductType"/>
 *           &lt;element name="qty" type="{http://zakupki.gov.ru/223fz/types/1}lotItemQtyType"/>
 *         &lt;/sequence>
 *         &lt;element name="deliveryPlace" type="{http://zakupki.gov.ru/223fz/types/1}deliveryPlaceType" minOccurs="0"/>
 *         &lt;element name="additionalInfo" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="1000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ordinalNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contractItemType", propOrder = {
    "okdp",
    "okved",
    "okei",
    "qty",
    "deliveryPlace",
    "additionalInfo",
    "ordinalNumber"
})
public class ContractItemType {

    @XmlElement(required = true)
    protected OkdpProductType okdp;
    @XmlElement(required = true)
    protected OkvedProductType okved;
    protected OkeiProductType okei;
    protected BigDecimal qty;
    protected DeliveryPlaceType deliveryPlace;
    protected String additionalInfo;
    protected int ordinalNumber;

    /**
     * Gets the value of the okdp property.
     * 
     * @return
     *     possible object is
     *     {@link OkdpProductType }
     *     
     */
    public OkdpProductType getOkdp() {
        return okdp;
    }

    /**
     * Sets the value of the okdp property.
     * 
     * @param value
     *     allowed object is
     *     {@link OkdpProductType }
     *     
     */
    public void setOkdp(OkdpProductType value) {
        this.okdp = value;
    }

    /**
     * Gets the value of the okved property.
     * 
     * @return
     *     possible object is
     *     {@link OkvedProductType }
     *     
     */
    public OkvedProductType getOkved() {
        return okved;
    }

    /**
     * Sets the value of the okved property.
     * 
     * @param value
     *     allowed object is
     *     {@link OkvedProductType }
     *     
     */
    public void setOkved(OkvedProductType value) {
        this.okved = value;
    }

    /**
     * Gets the value of the okei property.
     * 
     * @return
     *     possible object is
     *     {@link OkeiProductType }
     *     
     */
    public OkeiProductType getOkei() {
        return okei;
    }

    /**
     * Sets the value of the okei property.
     * 
     * @param value
     *     allowed object is
     *     {@link OkeiProductType }
     *     
     */
    public void setOkei(OkeiProductType value) {
        this.okei = value;
    }

    /**
     * Gets the value of the qty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQty(BigDecimal value) {
        this.qty = value;
    }

    /**
     * Gets the value of the deliveryPlace property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryPlaceType }
     *     
     */
    public DeliveryPlaceType getDeliveryPlace() {
        return deliveryPlace;
    }

    /**
     * Sets the value of the deliveryPlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryPlaceType }
     *     
     */
    public void setDeliveryPlace(DeliveryPlaceType value) {
        this.deliveryPlace = value;
    }

    /**
     * Gets the value of the additionalInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalInfo() {
        return additionalInfo;
    }

    /**
     * Sets the value of the additionalInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalInfo(String value) {
        this.additionalInfo = value;
    }

    /**
     * Gets the value of the ordinalNumber property.
     * 
     */
    public int getOrdinalNumber() {
        return ordinalNumber;
    }

    /**
     * Sets the value of the ordinalNumber property.
     * 
     */
    public void setOrdinalNumber(int value) {
        this.ordinalNumber = value;
    }

}
