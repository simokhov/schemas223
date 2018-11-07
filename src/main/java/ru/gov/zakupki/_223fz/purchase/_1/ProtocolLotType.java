//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.11.07 at 09:43:41 AM MSK 
//


package ru.gov.zakupki._223fz.purchase._1;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.gov.zakupki._223fz.types._1.CurrencyType;


/**
 * Сведения о лоте в протоколе
 * 
 * <p>Java class for protocolLotType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="protocolLotType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="guid" type="{http://zakupki.gov.ru/223fz/types/1}guidType"/>
 *         &lt;element name="ordinalNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="subject">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="2000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;choice>
 *           &lt;sequence>
 *             &lt;element name="currency" type="{http://zakupki.gov.ru/223fz/types/1}currencyType"/>
 *             &lt;choice>
 *               &lt;sequence>
 *                 &lt;element name="initialSum" type="{http://zakupki.gov.ru/223fz/types/1}money2"/>
 *               &lt;/sequence>
 *               &lt;sequence>
 *                 &lt;choice minOccurs="0">
 *                   &lt;element name="priceFormula">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *                         &lt;maxLength value="2000"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;sequence>
 *                     &lt;element name="commodityPrice" type="{http://zakupki.gov.ru/223fz/types/1}money2"/>
 *                   &lt;/sequence>
 *                 &lt;/choice>
 *                 &lt;element name="maxContractPrice" type="{http://zakupki.gov.ru/223fz/types/1}money2"/>
 *               &lt;/sequence>
 *             &lt;/choice>
 *           &lt;/sequence>
 *           &lt;element name="initialSumInfo">
 *             &lt;simpleType>
 *               &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *                 &lt;maxLength value="2000"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "protocolLotType", propOrder = {
    "guid",
    "ordinalNumber",
    "subject",
    "currency",
    "initialSum",
    "priceFormula",
    "commodityPrice",
    "maxContractPrice",
    "initialSumInfo"
})
public class ProtocolLotType {

    @XmlElement(required = true)
    protected String guid;
    protected int ordinalNumber;
    @XmlElement(required = true)
    protected String subject;
    protected CurrencyType currency;
    protected BigDecimal initialSum;
    protected String priceFormula;
    protected BigDecimal commodityPrice;
    protected BigDecimal maxContractPrice;
    protected String initialSumInfo;

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
     * Gets the value of the subject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubject(String value) {
        this.subject = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyType }
     *     
     */
    public CurrencyType getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyType }
     *     
     */
    public void setCurrency(CurrencyType value) {
        this.currency = value;
    }

    /**
     * Gets the value of the initialSum property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInitialSum() {
        return initialSum;
    }

    /**
     * Sets the value of the initialSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInitialSum(BigDecimal value) {
        this.initialSum = value;
    }

    /**
     * Gets the value of the priceFormula property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceFormula() {
        return priceFormula;
    }

    /**
     * Sets the value of the priceFormula property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceFormula(String value) {
        this.priceFormula = value;
    }

    /**
     * Gets the value of the commodityPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCommodityPrice() {
        return commodityPrice;
    }

    /**
     * Sets the value of the commodityPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCommodityPrice(BigDecimal value) {
        this.commodityPrice = value;
    }

    /**
     * Gets the value of the maxContractPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxContractPrice() {
        return maxContractPrice;
    }

    /**
     * Sets the value of the maxContractPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxContractPrice(BigDecimal value) {
        this.maxContractPrice = value;
    }

    /**
     * Gets the value of the initialSumInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitialSumInfo() {
        return initialSumInfo;
    }

    /**
     * Sets the value of the initialSumInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitialSumInfo(String value) {
        this.initialSumInfo = value;
    }

}
