//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.23 at 05:29:18 PM MSK 
//


package ru.gov.zakupki._223fz.purchase._1;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ru.gov.zakupki._223fz.types._1.AcceptedType2;
import ru.gov.zakupki._223fz.types._1.ApplicationLotCriteriaListType;
import ru.gov.zakupki._223fz.types._1.CurrencyType;
import ru.gov.zakupki._223fz.types._1.NonResidentInfoType;
import ru.gov.zakupki._223fz.types._1.ProtocolExtendFieldValueListType;
import ru.gov.zakupki._223fz.types._1.SupplierMainInfoType;
import ru.gov.zakupki._223fz.types._1.WinnerIndication;


/**
 * Заявка в протоколе закупки иным способом
 * 
 * <p>Java class for protocolApplicationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="protocolApplicationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="applicationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="applicationNumber">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="notDishonest" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="provider" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;choice>
 *           &lt;element name="supplierInfo" type="{http://zakupki.gov.ru/223fz/types/1}supplierMainInfoType"/>
 *           &lt;element name="nonResidentInfo" type="{http://zakupki.gov.ru/223fz/types/1}nonResidentInfoType"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;sequence>
 *             &lt;element name="price" type="{http://zakupki.gov.ru/223fz/types/1}money2"/>
 *             &lt;element name="currency" type="{http://zakupki.gov.ru/223fz/types/1}currencyType"/>
 *           &lt;/sequence>
 *           &lt;element name="priceInfo">
 *             &lt;simpleType>
 *               &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *                 &lt;maxLength value="2000"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *         &lt;/choice>
 *         &lt;element name="commodityAmount" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="2000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="contractExecutionTerm" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="2000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="accepted" type="{http://zakupki.gov.ru/223fz/types/1}acceptedType2" minOccurs="0"/>
 *         &lt;element name="winnerIndication" type="{http://zakupki.gov.ru/223fz/types/1}winnerIndication" minOccurs="0"/>
 *         &lt;element name="extendFields" type="{http://zakupki.gov.ru/223fz/types/1}protocolExtendFieldValueListType" minOccurs="0"/>
 *         &lt;element name="criteria" type="{http://zakupki.gov.ru/223fz/types/1}applicationLotCriteriaListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "protocolApplicationType", propOrder = {
    "applicationDate",
    "applicationNumber",
    "notDishonest",
    "provider",
    "supplierInfo",
    "nonResidentInfo",
    "price",
    "currency",
    "priceInfo",
    "commodityAmount",
    "contractExecutionTerm",
    "accepted",
    "winnerIndication",
    "extendFields",
    "criteria"
})
public class ProtocolApplicationType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar applicationDate;
    @XmlElement(required = true)
    protected String applicationNumber;
    protected Boolean notDishonest;
    protected boolean provider;
    protected SupplierMainInfoType supplierInfo;
    protected NonResidentInfoType nonResidentInfo;
    protected BigDecimal price;
    protected CurrencyType currency;
    protected String priceInfo;
    protected String commodityAmount;
    protected String contractExecutionTerm;
    @XmlSchemaType(name = "string")
    protected AcceptedType2 accepted;
    @XmlSchemaType(name = "string")
    protected WinnerIndication winnerIndication;
    protected ProtocolExtendFieldValueListType extendFields;
    protected ApplicationLotCriteriaListType criteria;

    /**
     * Gets the value of the applicationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getApplicationDate() {
        return applicationDate;
    }

    /**
     * Sets the value of the applicationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setApplicationDate(XMLGregorianCalendar value) {
        this.applicationDate = value;
    }

    /**
     * Gets the value of the applicationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationNumber() {
        return applicationNumber;
    }

    /**
     * Sets the value of the applicationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationNumber(String value) {
        this.applicationNumber = value;
    }

    /**
     * Gets the value of the notDishonest property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNotDishonest() {
        return notDishonest;
    }

    /**
     * Sets the value of the notDishonest property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNotDishonest(Boolean value) {
        this.notDishonest = value;
    }

    /**
     * Gets the value of the provider property.
     * 
     */
    public boolean isProvider() {
        return provider;
    }

    /**
     * Sets the value of the provider property.
     * 
     */
    public void setProvider(boolean value) {
        this.provider = value;
    }

    /**
     * Gets the value of the supplierInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SupplierMainInfoType }
     *     
     */
    public SupplierMainInfoType getSupplierInfo() {
        return supplierInfo;
    }

    /**
     * Sets the value of the supplierInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplierMainInfoType }
     *     
     */
    public void setSupplierInfo(SupplierMainInfoType value) {
        this.supplierInfo = value;
    }

    /**
     * Gets the value of the nonResidentInfo property.
     * 
     * @return
     *     possible object is
     *     {@link NonResidentInfoType }
     *     
     */
    public NonResidentInfoType getNonResidentInfo() {
        return nonResidentInfo;
    }

    /**
     * Sets the value of the nonResidentInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonResidentInfoType }
     *     
     */
    public void setNonResidentInfo(NonResidentInfoType value) {
        this.nonResidentInfo = value;
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
     * Gets the value of the priceInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceInfo() {
        return priceInfo;
    }

    /**
     * Sets the value of the priceInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceInfo(String value) {
        this.priceInfo = value;
    }

    /**
     * Gets the value of the commodityAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommodityAmount() {
        return commodityAmount;
    }

    /**
     * Sets the value of the commodityAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommodityAmount(String value) {
        this.commodityAmount = value;
    }

    /**
     * Gets the value of the contractExecutionTerm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractExecutionTerm() {
        return contractExecutionTerm;
    }

    /**
     * Sets the value of the contractExecutionTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractExecutionTerm(String value) {
        this.contractExecutionTerm = value;
    }

    /**
     * Gets the value of the accepted property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptedType2 }
     *     
     */
    public AcceptedType2 getAccepted() {
        return accepted;
    }

    /**
     * Sets the value of the accepted property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptedType2 }
     *     
     */
    public void setAccepted(AcceptedType2 value) {
        this.accepted = value;
    }

    /**
     * Gets the value of the winnerIndication property.
     * 
     * @return
     *     possible object is
     *     {@link WinnerIndication }
     *     
     */
    public WinnerIndication getWinnerIndication() {
        return winnerIndication;
    }

    /**
     * Sets the value of the winnerIndication property.
     * 
     * @param value
     *     allowed object is
     *     {@link WinnerIndication }
     *     
     */
    public void setWinnerIndication(WinnerIndication value) {
        this.winnerIndication = value;
    }

    /**
     * Gets the value of the extendFields property.
     * 
     * @return
     *     possible object is
     *     {@link ProtocolExtendFieldValueListType }
     *     
     */
    public ProtocolExtendFieldValueListType getExtendFields() {
        return extendFields;
    }

    /**
     * Sets the value of the extendFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolExtendFieldValueListType }
     *     
     */
    public void setExtendFields(ProtocolExtendFieldValueListType value) {
        this.extendFields = value;
    }

    /**
     * Gets the value of the criteria property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationLotCriteriaListType }
     *     
     */
    public ApplicationLotCriteriaListType getCriteria() {
        return criteria;
    }

    /**
     * Sets the value of the criteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationLotCriteriaListType }
     *     
     */
    public void setCriteria(ApplicationLotCriteriaListType value) {
        this.criteria = value;
    }

}
