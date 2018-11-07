//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.11.07 at 09:43:41 AM MSK 
//


package ru.gov.zakupki._223fz.purchaseplan._1;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ru.gov.zakupki._223fz.types._1.CurrencyType;


/**
 * Объём оплаты долгосрочного договора
 * 
 * <p>Java class for longTermVolumeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="longTermVolumeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="details" type="{http://zakupki.gov.ru/223fz/purchasePlan/1}longTermVolumeDetailListType" minOccurs="0"/>
 *         &lt;element name="volume" type="{http://zakupki.gov.ru/223fz/types/1}money2" minOccurs="0"/>
 *         &lt;element name="volumeRub" type="{http://zakupki.gov.ru/223fz/types/1}money2" minOccurs="0"/>
 *         &lt;element name="currency" type="{http://zakupki.gov.ru/223fz/types/1}currencyType" minOccurs="0"/>
 *         &lt;element name="exchangeRate" type="{http://zakupki.gov.ru/223fz/types/1}money6" minOccurs="0"/>
 *         &lt;element name="exchangeRateDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "longTermVolumeType", propOrder = {
    "details",
    "volume",
    "volumeRub",
    "currency",
    "exchangeRate",
    "exchangeRateDate"
})
public class LongTermVolumeType {

    protected LongTermVolumeDetailListType details;
    protected BigDecimal volume;
    protected BigDecimal volumeRub;
    protected CurrencyType currency;
    protected BigDecimal exchangeRate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar exchangeRateDate;

    /**
     * Gets the value of the details property.
     * 
     * @return
     *     possible object is
     *     {@link LongTermVolumeDetailListType }
     *     
     */
    public LongTermVolumeDetailListType getDetails() {
        return details;
    }

    /**
     * Sets the value of the details property.
     * 
     * @param value
     *     allowed object is
     *     {@link LongTermVolumeDetailListType }
     *     
     */
    public void setDetails(LongTermVolumeDetailListType value) {
        this.details = value;
    }

    /**
     * Gets the value of the volume property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVolume() {
        return volume;
    }

    /**
     * Sets the value of the volume property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVolume(BigDecimal value) {
        this.volume = value;
    }

    /**
     * Gets the value of the volumeRub property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVolumeRub() {
        return volumeRub;
    }

    /**
     * Sets the value of the volumeRub property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVolumeRub(BigDecimal value) {
        this.volumeRub = value;
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
     * Gets the value of the exchangeRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExchangeRate() {
        return exchangeRate;
    }

    /**
     * Sets the value of the exchangeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExchangeRate(BigDecimal value) {
        this.exchangeRate = value;
    }

    /**
     * Gets the value of the exchangeRateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExchangeRateDate() {
        return exchangeRateDate;
    }

    /**
     * Sets the value of the exchangeRateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExchangeRateDate(XMLGregorianCalendar value) {
        this.exchangeRateDate = value;
    }

}
