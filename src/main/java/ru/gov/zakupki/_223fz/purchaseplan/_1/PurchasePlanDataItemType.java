//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.23 at 05:11:07 PM MSK 
//


package ru.gov.zakupki._223fz.purchaseplan._1;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ru.gov.zakupki._223fz.types._1.CurrencyType;


/**
 * Позиция плана
 * 
 * <p>Java class for purchasePlanDataItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="purchasePlanDataItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="guid" type="{http://zakupki.gov.ru/223fz/types/1}guidType" minOccurs="0"/>
 *         &lt;element name="ordinalNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="contractSubject">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="minimumRequirements" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="okato" type="{http://zakupki.gov.ru/223fz/types/1}codeOkatoType"/>
 *         &lt;element name="region">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="isGeneralAddress" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;sequence>
 *             &lt;element name="maximumContractPrice" type="{http://zakupki.gov.ru/223fz/types/1}money2"/>
 *             &lt;element name="currency" type="{http://zakupki.gov.ru/223fz/types/1}currencyType"/>
 *           &lt;/sequence>
 *           &lt;element name="contractPriceInfo">
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 &lt;maxLength value="3000"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element name="purchasePlannedDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *           &lt;sequence>
 *             &lt;element name="purchasePeriodYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *             &lt;element name="purchasePeriodQuarter" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *             &lt;element name="purchasePeriodMonth" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *         &lt;element name="contractEndDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="purchaseMethodCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="purchaseMethodName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="3000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="isElectronic" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="additionalInfo" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="version" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *               &lt;maxInclusive value="9999999999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="modificationDescription" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="purchasePlanDataItemRows" type="{http://zakupki.gov.ru/223fz/purchasePlan/1}purchasePlanDataItemsRowListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "purchasePlanDataItemType", propOrder = {
    "guid",
    "ordinalNumber",
    "contractSubject",
    "minimumRequirements",
    "okato",
    "region",
    "isGeneralAddress",
    "maximumContractPrice",
    "currency",
    "contractPriceInfo",
    "purchasePlannedDate",
    "purchasePeriodYear",
    "purchasePeriodQuarter",
    "purchasePeriodMonth",
    "contractEndDate",
    "purchaseMethodCode",
    "purchaseMethodName",
    "isElectronic",
    "additionalInfo",
    "version",
    "modificationDescription",
    "purchasePlanDataItemRows"
})
public class PurchasePlanDataItemType {

    protected String guid;
    protected int ordinalNumber;
    @XmlElement(required = true)
    protected String contractSubject;
    protected String minimumRequirements;
    @XmlElement(required = true)
    protected String okato;
    @XmlElement(required = true)
    protected String region;
    @XmlElement(defaultValue = "true")
    protected Boolean isGeneralAddress;
    protected BigDecimal maximumContractPrice;
    protected CurrencyType currency;
    protected String contractPriceInfo;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar purchasePlannedDate;
    protected Integer purchasePeriodYear;
    protected Integer purchasePeriodQuarter;
    protected Integer purchasePeriodMonth;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar contractEndDate;
    protected int purchaseMethodCode;
    protected String purchaseMethodName;
    @XmlElement(defaultValue = "false")
    protected boolean isElectronic;
    protected String additionalInfo;
    protected Long version;
    protected String modificationDescription;
    protected PurchasePlanDataItemsRowListType purchasePlanDataItemRows;

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
     * Gets the value of the contractSubject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractSubject() {
        return contractSubject;
    }

    /**
     * Sets the value of the contractSubject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractSubject(String value) {
        this.contractSubject = value;
    }

    /**
     * Gets the value of the minimumRequirements property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinimumRequirements() {
        return minimumRequirements;
    }

    /**
     * Sets the value of the minimumRequirements property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinimumRequirements(String value) {
        this.minimumRequirements = value;
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
     * Gets the value of the isGeneralAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsGeneralAddress() {
        return isGeneralAddress;
    }

    /**
     * Sets the value of the isGeneralAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsGeneralAddress(Boolean value) {
        this.isGeneralAddress = value;
    }

    /**
     * Gets the value of the maximumContractPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximumContractPrice() {
        return maximumContractPrice;
    }

    /**
     * Sets the value of the maximumContractPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaximumContractPrice(BigDecimal value) {
        this.maximumContractPrice = value;
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
     * Gets the value of the contractPriceInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractPriceInfo() {
        return contractPriceInfo;
    }

    /**
     * Sets the value of the contractPriceInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractPriceInfo(String value) {
        this.contractPriceInfo = value;
    }

    /**
     * Gets the value of the purchasePlannedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPurchasePlannedDate() {
        return purchasePlannedDate;
    }

    /**
     * Sets the value of the purchasePlannedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPurchasePlannedDate(XMLGregorianCalendar value) {
        this.purchasePlannedDate = value;
    }

    /**
     * Gets the value of the purchasePeriodYear property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPurchasePeriodYear() {
        return purchasePeriodYear;
    }

    /**
     * Sets the value of the purchasePeriodYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPurchasePeriodYear(Integer value) {
        this.purchasePeriodYear = value;
    }

    /**
     * Gets the value of the purchasePeriodQuarter property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPurchasePeriodQuarter() {
        return purchasePeriodQuarter;
    }

    /**
     * Sets the value of the purchasePeriodQuarter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPurchasePeriodQuarter(Integer value) {
        this.purchasePeriodQuarter = value;
    }

    /**
     * Gets the value of the purchasePeriodMonth property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPurchasePeriodMonth() {
        return purchasePeriodMonth;
    }

    /**
     * Sets the value of the purchasePeriodMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPurchasePeriodMonth(Integer value) {
        this.purchasePeriodMonth = value;
    }

    /**
     * Gets the value of the contractEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getContractEndDate() {
        return contractEndDate;
    }

    /**
     * Sets the value of the contractEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setContractEndDate(XMLGregorianCalendar value) {
        this.contractEndDate = value;
    }

    /**
     * Gets the value of the purchaseMethodCode property.
     * 
     */
    public int getPurchaseMethodCode() {
        return purchaseMethodCode;
    }

    /**
     * Sets the value of the purchaseMethodCode property.
     * 
     */
    public void setPurchaseMethodCode(int value) {
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
     * Gets the value of the isElectronic property.
     * 
     */
    public boolean isIsElectronic() {
        return isElectronic;
    }

    /**
     * Sets the value of the isElectronic property.
     * 
     */
    public void setIsElectronic(boolean value) {
        this.isElectronic = value;
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
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVersion(Long value) {
        this.version = value;
    }

    /**
     * Gets the value of the modificationDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModificationDescription() {
        return modificationDescription;
    }

    /**
     * Sets the value of the modificationDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModificationDescription(String value) {
        this.modificationDescription = value;
    }

    /**
     * Gets the value of the purchasePlanDataItemRows property.
     * 
     * @return
     *     possible object is
     *     {@link PurchasePlanDataItemsRowListType }
     *     
     */
    public PurchasePlanDataItemsRowListType getPurchasePlanDataItemRows() {
        return purchasePlanDataItemRows;
    }

    /**
     * Sets the value of the purchasePlanDataItemRows property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchasePlanDataItemsRowListType }
     *     
     */
    public void setPurchasePlanDataItemRows(PurchasePlanDataItemsRowListType value) {
        this.purchasePlanDataItemRows = value;
    }

}
