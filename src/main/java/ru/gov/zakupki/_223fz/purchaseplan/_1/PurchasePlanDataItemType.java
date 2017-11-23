//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.23 at 05:26:25 PM MSK 
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
 *     &lt;extension base="{http://zakupki.gov.ru/223fz/purchasePlan/1}basePlanDataItemType">
 *       &lt;sequence>
 *         &lt;element name="parentId" type="{http://zakupki.gov.ru/223fz/types/1}guidType" minOccurs="0"/>
 *         &lt;element name="purchaseNoticeInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="noticeInfoGuid" type="{http://zakupki.gov.ru/223fz/types/1}guidType"/>
 *                   &lt;element name="lotGuid" type="{http://zakupki.gov.ru/223fz/types/1}guidType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="okato" type="{http://zakupki.gov.ru/223fz/types/1}codeOkatoType" minOccurs="0"/>
 *         &lt;element name="region" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="1000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="isGeneralAddress" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;choice>
 *           &lt;sequence>
 *             &lt;element name="maximumContractPrice" type="{http://zakupki.gov.ru/223fz/types/1}money2"/>
 *             &lt;element name="currency" type="{http://zakupki.gov.ru/223fz/types/1}currencyType"/>
 *             &lt;element name="exchangeRate" type="{http://zakupki.gov.ru/223fz/types/1}money2" minOccurs="0"/>
 *             &lt;element name="exchangeRateDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *             &lt;element name="maximumContractPriceRub" type="{http://zakupki.gov.ru/223fz/types/1}money2" minOccurs="0"/>
 *           &lt;/sequence>
 *           &lt;element name="contractPriceInfo">
 *             &lt;simpleType>
 *               &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *                 &lt;maxLength value="2000"/>
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
 *         &lt;element name="purchaseMethodCode" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="purchaseMethodName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="2000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="isElectronic" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="purchasePlanDataItemRows" type="{http://zakupki.gov.ru/223fz/purchasePlan/1}purchasePlanDataItemsRowListType" minOccurs="0"/>
 *         &lt;element name="isPurchaseIgnored" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="purchaseCategory" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="innovationEquivalent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "purchasePlanDataItemType", propOrder = {
    "parentId",
    "purchaseNoticeInfo",
    "okato",
    "region",
    "isGeneralAddress",
    "maximumContractPrice",
    "currency",
    "exchangeRate",
    "exchangeRateDate",
    "maximumContractPriceRub",
    "contractPriceInfo",
    "purchasePlannedDate",
    "purchasePeriodYear",
    "purchasePeriodQuarter",
    "purchasePeriodMonth",
    "purchaseMethodCode",
    "purchaseMethodName",
    "isElectronic",
    "purchasePlanDataItemRows",
    "isPurchaseIgnored",
    "purchaseCategory",
    "innovationEquivalent"
})
public class PurchasePlanDataItemType
    extends BasePlanDataItemType
{

    protected String parentId;
    protected PurchasePlanDataItemType.PurchaseNoticeInfo purchaseNoticeInfo;
    protected String okato;
    protected String region;
    protected boolean isGeneralAddress;
    protected BigDecimal maximumContractPrice;
    protected CurrencyType currency;
    protected BigDecimal exchangeRate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar exchangeRateDate;
    protected BigDecimal maximumContractPriceRub;
    protected String contractPriceInfo;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar purchasePlannedDate;
    protected Integer purchasePeriodYear;
    protected Integer purchasePeriodQuarter;
    protected Integer purchasePeriodMonth;
    protected long purchaseMethodCode;
    protected String purchaseMethodName;
    @XmlElement(defaultValue = "false")
    protected boolean isElectronic;
    protected PurchasePlanDataItemsRowListType purchasePlanDataItemRows;
    @XmlElement(defaultValue = "false")
    protected Boolean isPurchaseIgnored;
    protected Long purchaseCategory;
    protected Boolean innovationEquivalent;

    /**
     * Gets the value of the parentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentId() {
        return parentId;
    }

    /**
     * Sets the value of the parentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentId(String value) {
        this.parentId = value;
    }

    /**
     * Gets the value of the purchaseNoticeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PurchasePlanDataItemType.PurchaseNoticeInfo }
     *     
     */
    public PurchasePlanDataItemType.PurchaseNoticeInfo getPurchaseNoticeInfo() {
        return purchaseNoticeInfo;
    }

    /**
     * Sets the value of the purchaseNoticeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchasePlanDataItemType.PurchaseNoticeInfo }
     *     
     */
    public void setPurchaseNoticeInfo(PurchasePlanDataItemType.PurchaseNoticeInfo value) {
        this.purchaseNoticeInfo = value;
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
     */
    public boolean isIsGeneralAddress() {
        return isGeneralAddress;
    }

    /**
     * Sets the value of the isGeneralAddress property.
     * 
     */
    public void setIsGeneralAddress(boolean value) {
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

    /**
     * Gets the value of the maximumContractPriceRub property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximumContractPriceRub() {
        return maximumContractPriceRub;
    }

    /**
     * Sets the value of the maximumContractPriceRub property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaximumContractPriceRub(BigDecimal value) {
        this.maximumContractPriceRub = value;
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
     * Gets the value of the purchaseMethodCode property.
     * 
     */
    public long getPurchaseMethodCode() {
        return purchaseMethodCode;
    }

    /**
     * Sets the value of the purchaseMethodCode property.
     * 
     */
    public void setPurchaseMethodCode(long value) {
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

    /**
     * Gets the value of the isPurchaseIgnored property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPurchaseIgnored() {
        return isPurchaseIgnored;
    }

    /**
     * Sets the value of the isPurchaseIgnored property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPurchaseIgnored(Boolean value) {
        this.isPurchaseIgnored = value;
    }

    /**
     * Gets the value of the purchaseCategory property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPurchaseCategory() {
        return purchaseCategory;
    }

    /**
     * Sets the value of the purchaseCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPurchaseCategory(Long value) {
        this.purchaseCategory = value;
    }

    /**
     * Gets the value of the innovationEquivalent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInnovationEquivalent() {
        return innovationEquivalent;
    }

    /**
     * Sets the value of the innovationEquivalent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInnovationEquivalent(Boolean value) {
        this.innovationEquivalent = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="noticeInfoGuid" type="{http://zakupki.gov.ru/223fz/types/1}guidType"/>
     *         &lt;element name="lotGuid" type="{http://zakupki.gov.ru/223fz/types/1}guidType"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "noticeInfoGuid",
        "lotGuid"
    })
    public static class PurchaseNoticeInfo {

        @XmlElement(required = true)
        protected String noticeInfoGuid;
        @XmlElement(required = true)
        protected String lotGuid;

        /**
         * Gets the value of the noticeInfoGuid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNoticeInfoGuid() {
            return noticeInfoGuid;
        }

        /**
         * Sets the value of the noticeInfoGuid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNoticeInfoGuid(String value) {
            this.noticeInfoGuid = value;
        }

        /**
         * Gets the value of the lotGuid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLotGuid() {
            return lotGuid;
        }

        /**
         * Sets the value of the lotGuid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLotGuid(String value) {
            this.lotGuid = value;
        }

    }

}
