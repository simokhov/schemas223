//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.23 at 05:20:27 PM MSK 
//


package ru.gov.zakupki._223fz.purchaseplan._1;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.gov.zakupki._223fz.types._1.OkdpProductType;
import ru.gov.zakupki._223fz.types._1.OkeiProductType;
import ru.gov.zakupki._223fz.types._1.OkvedProductType;


/**
 * Cтрока позиции плана
 * 
 * <p>Java class for purchasePlanDataItemRowType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="purchasePlanDataItemRowType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/223fz/purchasePlan/1}basePlanDataItemRowType">
 *       &lt;sequence>
 *         &lt;element name="okdp" type="{http://zakupki.gov.ru/223fz/types/1}okdpProductType"/>
 *         &lt;element name="okved" type="{http://zakupki.gov.ru/223fz/types/1}okvedProductType"/>
 *         &lt;element name="okato" type="{http://zakupki.gov.ru/223fz/types/1}codeOkatoType" minOccurs="0"/>
 *         &lt;element name="region" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="1000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;sequence minOccurs="0">
 *           &lt;element name="okei" type="{http://zakupki.gov.ru/223fz/types/1}okeiProductType"/>
 *           &lt;element name="qty" type="{http://zakupki.gov.ru/223fz/types/1}lotItemQtyType"/>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "purchasePlanDataItemRowType", propOrder = {
    "okdp",
    "okved",
    "okato",
    "region",
    "okei",
    "qty"
})
public class PurchasePlanDataItemRowType
    extends BasePlanDataItemRowType
{

    @XmlElement(required = true)
    protected OkdpProductType okdp;
    @XmlElement(required = true)
    protected OkvedProductType okved;
    protected String okato;
    protected String region;
    protected OkeiProductType okei;
    protected BigDecimal qty;

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
     * Gets the value of the okato property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOkato() {
        return okato;
    }

    /**
     * Sets the value of the okato property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOkato(String value) {
        this.okato = value;
    }

    /**
     * Gets the value of the region property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegion(String value) {
        this.region = value;
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

}
