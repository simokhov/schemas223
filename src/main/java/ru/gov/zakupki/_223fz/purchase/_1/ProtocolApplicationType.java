//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.23 at 05:11:07 PM MSK 
//


package ru.gov.zakupki._223fz.purchase._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ru.gov.zakupki._223fz.types._1.AcceptedType2;
import ru.gov.zakupki._223fz.types._1.CurrencyType;
import ru.gov.zakupki._223fz.types._1.ProtocolTemplateFieldValueListType;
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
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="11"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="supplierInfo" type="{http://zakupki.gov.ru/223fz/types/1}supplierMainInfoType"/>
 *         &lt;element name="price" type="{http://zakupki.gov.ru/223fz/types/1}money3"/>
 *         &lt;element name="currency" type="{http://zakupki.gov.ru/223fz/types/1}currencyType" minOccurs="0"/>
 *         &lt;element name="commodityAmount" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="contractExecutionTerm" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="500"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="conditionProposals" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="accepted" type="{http://zakupki.gov.ru/223fz/types/1}acceptedType2" minOccurs="0"/>
 *         &lt;element name="winnerIndication" type="{http://zakupki.gov.ru/223fz/types/1}winnerIndication" minOccurs="0"/>
 *         &lt;element name="extendFields" type="{http://zakupki.gov.ru/223fz/types/1}protocolTemplateFieldValueListType" minOccurs="0"/>
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
    "supplierInfo",
    "price",
    "currency",
    "commodityAmount",
    "contractExecutionTerm",
    "conditionProposals",
    "accepted",
    "winnerIndication",
    "extendFields"
})
public class ProtocolApplicationType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar applicationDate;
    @XmlElement(required = true)
    protected String applicationNumber;
    @XmlElement(required = true)
    protected SupplierMainInfoType supplierInfo;
    @XmlElement(required = true)
    protected String price;
    protected CurrencyType currency;
    protected String commodityAmount;
    protected String contractExecutionTerm;
    protected String conditionProposals;
    @XmlSchemaType(name = "string")
    protected AcceptedType2 accepted;
    @XmlSchemaType(name = "string")
    protected WinnerIndication winnerIndication;
    protected ProtocolTemplateFieldValueListType extendFields;

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
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrice(String value) {
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
     * Gets the value of the conditionProposals property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConditionProposals() {
        return conditionProposals;
    }

    /**
     * Sets the value of the conditionProposals property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConditionProposals(String value) {
        this.conditionProposals = value;
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
     *     {@link ProtocolTemplateFieldValueListType }
     *     
     */
    public ProtocolTemplateFieldValueListType getExtendFields() {
        return extendFields;
    }

    /**
     * Sets the value of the extendFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolTemplateFieldValueListType }
     *     
     */
    public void setExtendFields(ProtocolTemplateFieldValueListType value) {
        this.extendFields = value;
    }

}
