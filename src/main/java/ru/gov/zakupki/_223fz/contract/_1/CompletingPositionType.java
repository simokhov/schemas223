//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.04.26 at 09:55:47 AM MSK 
//


package ru.gov.zakupki._223fz.contract._1;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ru.gov.zakupki._223fz.types._1.CurrencyType;


/**
 * Позиция сведений об исполнении
 * 
 * <p>Java class for completingPositionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="completingPositionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ordinal" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="paymentDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="price" type="{http://zakupki.gov.ru/223fz/types/1}money2"/>
 *         &lt;element name="currency" type="{http://zakupki.gov.ru/223fz/types/1}currencyType"/>
 *         &lt;element name="currencyRate" type="{http://zakupki.gov.ru/223fz/types/1}money6" minOccurs="0"/>
 *         &lt;element name="rubPrice" type="{http://zakupki.gov.ru/223fz/types/1}money2" minOccurs="0"/>
 *         &lt;element name="prepaid" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="docs" type="{http://zakupki.gov.ru/223fz/contract/1}completingDocsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "completingPositionType", propOrder = {
    "ordinal",
    "paymentDate",
    "price",
    "currency",
    "currencyRate",
    "rubPrice",
    "prepaid",
    "docs"
})
public class CompletingPositionType {

    protected long ordinal;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar paymentDate;
    @XmlElement(required = true)
    protected BigDecimal price;
    @XmlElement(required = true)
    protected CurrencyType currency;
    protected BigDecimal currencyRate;
    protected BigDecimal rubPrice;
    protected boolean prepaid;
    protected CompletingDocsType docs;

    /**
     * Gets the value of the ordinal property.
     * 
     */
    public long getOrdinal() {
        return ordinal;
    }

    /**
     * Sets the value of the ordinal property.
     * 
     */
    public void setOrdinal(long value) {
        this.ordinal = value;
    }

    /**
     * Gets the value of the paymentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPaymentDate() {
        return paymentDate;
    }

    /**
     * Sets the value of the paymentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPaymentDate(XMLGregorianCalendar value) {
        this.paymentDate = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrice(BigDecimal value) {
        this.price = value;
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
     * Gets the value of the currencyRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCurrencyRate() {
        return currencyRate;
    }

    /**
     * Sets the value of the currencyRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCurrencyRate(BigDecimal value) {
        this.currencyRate = value;
    }

    /**
     * Gets the value of the rubPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRubPrice() {
        return rubPrice;
    }

    /**
     * Sets the value of the rubPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRubPrice(BigDecimal value) {
        this.rubPrice = value;
    }

    /**
     * Gets the value of the prepaid property.
     * 
     */
    public boolean isPrepaid() {
        return prepaid;
    }

    /**
     * Sets the value of the prepaid property.
     * 
     */
    public void setPrepaid(boolean value) {
        this.prepaid = value;
    }

    /**
     * Gets the value of the docs property.
     * 
     * @return
     *     possible object is
     *     {@link CompletingDocsType }
     *     
     */
    public CompletingDocsType getDocs() {
        return docs;
    }

    /**
     * Sets the value of the docs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompletingDocsType }
     *     
     */
    public void setDocs(CompletingDocsType value) {
        this.docs = value;
    }

}
