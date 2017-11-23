//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.23 at 05:17:31 PM MSK 
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
 *         &lt;element name="okato" type="{http://zakupki.gov.ru/223fz/types/1}codeOkatoType" minOccurs="0"/>
 *         &lt;element name="region" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="isGeneralAddress" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
 *         &lt;element name="purchaseMethodCode" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="purchaseMethodName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="3000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="isElectronic" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="purchasePlanDataItemRows" type="{http://zakupki.gov.ru/223fz/purchasePlan/1}purchasePlanDataItemsRowListType" minOccurs="0"/>
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
    "purchaseMethodCode",
    "purchaseMethodName",
    "isElectronic",
    "purchasePlanDataItemRows"
})
public class PurchasePlanDataItemType
    extends BasePlanDataItemType
{

    protected String parentId;
    protected String okato;
    protected String region;
    protected boolean isGeneralAddress;
    protected BigDecimal maximumContractPrice;
    protected CurrencyType currency;
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

}
