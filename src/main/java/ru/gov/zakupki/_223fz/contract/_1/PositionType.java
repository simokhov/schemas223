//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.23 at 05:28:03 PM MSK 
//


package ru.gov.zakupki._223fz.contract._1;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import ru.gov.zakupki._223fz.types._1.CountryType;
import ru.gov.zakupki._223fz.types._1.OkdpProductType;
import ru.gov.zakupki._223fz.types._1.OkeiProductType;
import ru.gov.zakupki._223fz.types._1.Okpd2ProductType;
import ru.gov.zakupki._223fz.types._1.OkpdProductType;


/**
 * Позиция договора
 * 
 * <p>Java class for positionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="positionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="guid" type="{http://zakupki.gov.ru/223fz/types/1}guidType" minOccurs="0"/>
 *         &lt;element name="name" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="2000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ordinalNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;choice>
 *           &lt;sequence minOccurs="0">
 *             &lt;element name="okdp" type="{http://zakupki.gov.ru/223fz/types/1}okdpProductType" minOccurs="0"/>
 *             &lt;element name="okpd" type="{http://zakupki.gov.ru/223fz/types/1}okpdProductType" minOccurs="0"/>
 *           &lt;/sequence>
 *           &lt;element name="okpd2" type="{http://zakupki.gov.ru/223fz/types/1}okpd2ProductType" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="country" type="{http://zakupki.gov.ru/223fz/types/1}countryType" minOccurs="0"/>
 *         &lt;element name="producerCountry" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="impossibleToDetermineAttr" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;sequence minOccurs="0">
 *           &lt;element name="okei" type="{http://zakupki.gov.ru/223fz/types/1}okeiProductType"/>
 *           &lt;element name="qty" type="{http://zakupki.gov.ru/223fz/contract/1}contractPositionQtyType"/>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "positionType", propOrder = {
    "guid",
    "name",
    "ordinalNumber",
    "okdp",
    "okpd",
    "okpd2",
    "country",
    "producerCountry",
    "impossibleToDetermineAttr",
    "okei",
    "qty"
})
public class PositionType {

    protected String guid;
    protected String name;
    protected int ordinalNumber;
    protected OkdpProductType okdp;
    protected OkpdProductType okpd;
    protected Okpd2ProductType okpd2;
    protected CountryType country;
    protected Boolean producerCountry;
    protected Boolean impossibleToDetermineAttr;
    protected OkeiProductType okei;
    protected BigDecimal qty;

    /**
     * Gets the value of the guid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuid() {
        return guid;
    }

    /**
     * Sets the value of the guid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuid(String value) {
        this.guid = value;
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
     * Gets the value of the okpd property.
     * 
     * @return
     *     possible object is
     *     {@link OkpdProductType }
     *     
     */
    public OkpdProductType getOkpd() {
        return okpd;
    }

    /**
     * Sets the value of the okpd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OkpdProductType }
     *     
     */
    public void setOkpd(OkpdProductType value) {
        this.okpd = value;
    }

    /**
     * Gets the value of the okpd2 property.
     * 
     * @return
     *     possible object is
     *     {@link Okpd2ProductType }
     *     
     */
    public Okpd2ProductType getOkpd2() {
        return okpd2;
    }

    /**
     * Sets the value of the okpd2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Okpd2ProductType }
     *     
     */
    public void setOkpd2(Okpd2ProductType value) {
        this.okpd2 = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link CountryType }
     *     
     */
    public CountryType getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryType }
     *     
     */
    public void setCountry(CountryType value) {
        this.country = value;
    }

    /**
     * Gets the value of the producerCountry property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProducerCountry() {
        return producerCountry;
    }

    /**
     * Sets the value of the producerCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProducerCountry(Boolean value) {
        this.producerCountry = value;
    }

    /**
     * Gets the value of the impossibleToDetermineAttr property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isImpossibleToDetermineAttr() {
        return impossibleToDetermineAttr;
    }

    /**
     * Sets the value of the impossibleToDetermineAttr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setImpossibleToDetermineAttr(Boolean value) {
        this.impossibleToDetermineAttr = value;
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
