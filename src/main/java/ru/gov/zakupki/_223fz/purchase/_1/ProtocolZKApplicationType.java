//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.06 at 10:22:30 AM MSK 
//


package ru.gov.zakupki._223fz.purchase._1;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ru.gov.zakupki._223fz.types._1.AcceptedType;
import ru.gov.zakupki._223fz.types._1.ApplicationLotCriteriaListType;
import ru.gov.zakupki._223fz.types._1.CurrencyType;
import ru.gov.zakupki._223fz.types._1.NonResidentInfoType;
import ru.gov.zakupki._223fz.types._1.SupplierMainInfoType;
import ru.gov.zakupki._223fz.types._1.WinnerIndication3;


/**
 * Список заявок
 * 
 * <p>Java class for protocolZKApplicationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="protocolZKApplicationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="applicationNumber">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="applicationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="notDishonest" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="provider" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;choice minOccurs="0">
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
 *         &lt;element name="accepted" type="{http://zakupki.gov.ru/223fz/types/1}acceptedType" minOccurs="0"/>
 *         &lt;element name="rejectionReasonCode" type="{http://zakupki.gov.ru/223fz/purchase/1}rejectionReasonCodeType" minOccurs="0"/>
 *         &lt;element name="rejectionReason" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="1000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="winnerIndication" type="{http://zakupki.gov.ru/223fz/types/1}winnerIndication3" minOccurs="0"/>
 *         &lt;element name="appliedDocumentsList" type="{http://zakupki.gov.ru/223fz/purchase/1}appliedDocumentsListType" minOccurs="0"/>
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
@XmlType(name = "protocolZKApplicationType", propOrder = {
    "applicationNumber",
    "applicationDate",
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
    "rejectionReasonCode",
    "rejectionReason",
    "winnerIndication",
    "appliedDocumentsList",
    "criteria"
})
public class ProtocolZKApplicationType {

    @XmlElement(required = true)
    protected String applicationNumber;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar applicationDate;
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
    protected AcceptedType accepted;
    @XmlSchemaType(name = "string")
    protected RejectionReasonCodeType rejectionReasonCode;
    protected String rejectionReason;
    @XmlSchemaType(name = "string")
    protected WinnerIndication3 winnerIndication;
    protected AppliedDocumentsListType appliedDocumentsList;
    protected ApplicationLotCriteriaListType criteria;

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
     *     {@link AcceptedType }
     *     
     */
    public AcceptedType getAccepted() {
        return accepted;
    }

    /**
     * Sets the value of the accepted property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptedType }
     *     
     */
    public void setAccepted(AcceptedType value) {
        this.accepted = value;
    }

    /**
     * Gets the value of the rejectionReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link RejectionReasonCodeType }
     *     
     */
    public RejectionReasonCodeType getRejectionReasonCode() {
        return rejectionReasonCode;
    }

    /**
     * Sets the value of the rejectionReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectionReasonCodeType }
     *     
     */
    public void setRejectionReasonCode(RejectionReasonCodeType value) {
        this.rejectionReasonCode = value;
    }

    /**
     * Gets the value of the rejectionReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRejectionReason() {
        return rejectionReason;
    }

    /**
     * Sets the value of the rejectionReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRejectionReason(String value) {
        this.rejectionReason = value;
    }

    /**
     * Gets the value of the winnerIndication property.
     * 
     * @return
     *     possible object is
     *     {@link WinnerIndication3 }
     *     
     */
    public WinnerIndication3 getWinnerIndication() {
        return winnerIndication;
    }

    /**
     * Sets the value of the winnerIndication property.
     * 
     * @param value
     *     allowed object is
     *     {@link WinnerIndication3 }
     *     
     */
    public void setWinnerIndication(WinnerIndication3 value) {
        this.winnerIndication = value;
    }

    /**
     * Gets the value of the appliedDocumentsList property.
     * 
     * @return
     *     possible object is
     *     {@link AppliedDocumentsListType }
     *     
     */
    public AppliedDocumentsListType getAppliedDocumentsList() {
        return appliedDocumentsList;
    }

    /**
     * Sets the value of the appliedDocumentsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppliedDocumentsListType }
     *     
     */
    public void setAppliedDocumentsList(AppliedDocumentsListType value) {
        this.appliedDocumentsList = value;
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
