//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.11.07 at 09:42:20 AM MSK 
//


package ru.gov.zakupki._223fz.contract._1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ru.gov.zakupki._223fz.types._1.CurrencyType;
import ru.gov.zakupki._223fz.types._1.CustomerInfoType;
import ru.gov.zakupki._223fz.types._1.DocumentListType;
import ru.gov.zakupki._223fz.types._1.ElectronicPlaceInfoType;


/**
 * Сведения о договоре в электронной форме
 * 
 * <p>Java class for electronicContractDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="electronicContractDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="guid" type="{http://zakupki.gov.ru/223fz/types/1}guidType"/>
 *         &lt;element name="electronicPlaceInfo" type="{http://zakupki.gov.ru/223fz/types/1}electronicPlaceInfoType"/>
 *         &lt;element name="urlEP">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="500"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="registrationNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="500"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="contractDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="publishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="forSmallOrMiddle" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="forSmallOrMiddleCode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="contractGuid" type="{http://zakupki.gov.ru/223fz/types/1}guidType" minOccurs="0"/>
 *         &lt;element name="purchaseNoticeInfo" type="{http://zakupki.gov.ru/223fz/contract/1}purchaseNoticeInfoType"/>
 *         &lt;element name="protocolInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="guid" type="{http://zakupki.gov.ru/223fz/types/1}guidType"/>
 *                   &lt;element name="registrationNumber" type="{http://zakupki.gov.ru/223fz/types/1}registrationNumber11-2Type"/>
 *                   &lt;element name="name" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *                         &lt;maxLength value="2000"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="publicationDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="customer" type="{http://zakupki.gov.ru/223fz/types/1}customerInfoType"/>
 *         &lt;element name="placer" type="{http://zakupki.gov.ru/223fz/types/1}customerInfoType"/>
 *         &lt;element name="detachedOrg" type="{http://zakupki.gov.ru/223fz/types/1}customerInfoType" minOccurs="0"/>
 *         &lt;element name="price" type="{http://zakupki.gov.ru/223fz/types/1}money2"/>
 *         &lt;element name="currency" type="{http://zakupki.gov.ru/223fz/types/1}currencyType"/>
 *         &lt;element name="supplierInfo" type="{http://zakupki.gov.ru/223fz/contract/1}supplierMainType" maxOccurs="unbounded"/>
 *         &lt;element name="lot" type="{http://zakupki.gov.ru/223fz/contract/1}contractBaseLotType"/>
 *         &lt;element name="attachments" type="{http://zakupki.gov.ru/223fz/types/1}documentListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "electronicContractDataType", propOrder = {
    "guid",
    "electronicPlaceInfo",
    "urlEP",
    "registrationNumber",
    "contractDate",
    "publishDate",
    "forSmallOrMiddle",
    "forSmallOrMiddleCode",
    "contractGuid",
    "purchaseNoticeInfo",
    "protocolInfo",
    "customer",
    "placer",
    "detachedOrg",
    "price",
    "currency",
    "supplierInfo",
    "lot",
    "attachments"
})
public class ElectronicContractDataType {

    @XmlElement(required = true)
    protected String guid;
    @XmlElement(required = true)
    protected ElectronicPlaceInfoType electronicPlaceInfo;
    @XmlElement(required = true)
    protected String urlEP;
    protected String registrationNumber;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar contractDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar publishDate;
    protected Boolean forSmallOrMiddle;
    protected String forSmallOrMiddleCode;
    protected String contractGuid;
    @XmlElement(required = true)
    protected PurchaseNoticeInfoType purchaseNoticeInfo;
    protected ElectronicContractDataType.ProtocolInfo protocolInfo;
    @XmlElement(required = true)
    protected CustomerInfoType customer;
    @XmlElement(required = true)
    protected CustomerInfoType placer;
    protected CustomerInfoType detachedOrg;
    @XmlElement(required = true)
    protected BigDecimal price;
    @XmlElement(required = true)
    protected CurrencyType currency;
    @XmlElement(required = true)
    protected List<SupplierMainType> supplierInfo;
    @XmlElement(required = true)
    protected ContractBaseLotType lot;
    protected DocumentListType attachments;

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
     * Gets the value of the electronicPlaceInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ElectronicPlaceInfoType }
     *     
     */
    public ElectronicPlaceInfoType getElectronicPlaceInfo() {
        return electronicPlaceInfo;
    }

    /**
     * Sets the value of the electronicPlaceInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElectronicPlaceInfoType }
     *     
     */
    public void setElectronicPlaceInfo(ElectronicPlaceInfoType value) {
        this.electronicPlaceInfo = value;
    }

    /**
     * Gets the value of the urlEP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlEP() {
        return urlEP;
    }

    /**
     * Sets the value of the urlEP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlEP(String value) {
        this.urlEP = value;
    }

    /**
     * Gets the value of the registrationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    /**
     * Sets the value of the registrationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationNumber(String value) {
        this.registrationNumber = value;
    }

    /**
     * Gets the value of the contractDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getContractDate() {
        return contractDate;
    }

    /**
     * Sets the value of the contractDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setContractDate(XMLGregorianCalendar value) {
        this.contractDate = value;
    }

    /**
     * Gets the value of the publishDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPublishDate() {
        return publishDate;
    }

    /**
     * Sets the value of the publishDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPublishDate(XMLGregorianCalendar value) {
        this.publishDate = value;
    }

    /**
     * Gets the value of the forSmallOrMiddle property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isForSmallOrMiddle() {
        return forSmallOrMiddle;
    }

    /**
     * Sets the value of the forSmallOrMiddle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setForSmallOrMiddle(Boolean value) {
        this.forSmallOrMiddle = value;
    }

    /**
     * Gets the value of the forSmallOrMiddleCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForSmallOrMiddleCode() {
        return forSmallOrMiddleCode;
    }

    /**
     * Sets the value of the forSmallOrMiddleCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForSmallOrMiddleCode(String value) {
        this.forSmallOrMiddleCode = value;
    }

    /**
     * Gets the value of the contractGuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractGuid() {
        return contractGuid;
    }

    /**
     * Sets the value of the contractGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractGuid(String value) {
        this.contractGuid = value;
    }

    /**
     * Gets the value of the purchaseNoticeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseNoticeInfoType }
     *     
     */
    public PurchaseNoticeInfoType getPurchaseNoticeInfo() {
        return purchaseNoticeInfo;
    }

    /**
     * Sets the value of the purchaseNoticeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseNoticeInfoType }
     *     
     */
    public void setPurchaseNoticeInfo(PurchaseNoticeInfoType value) {
        this.purchaseNoticeInfo = value;
    }

    /**
     * Gets the value of the protocolInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ElectronicContractDataType.ProtocolInfo }
     *     
     */
    public ElectronicContractDataType.ProtocolInfo getProtocolInfo() {
        return protocolInfo;
    }

    /**
     * Sets the value of the protocolInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElectronicContractDataType.ProtocolInfo }
     *     
     */
    public void setProtocolInfo(ElectronicContractDataType.ProtocolInfo value) {
        this.protocolInfo = value;
    }

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerInfoType }
     *     
     */
    public CustomerInfoType getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerInfoType }
     *     
     */
    public void setCustomer(CustomerInfoType value) {
        this.customer = value;
    }

    /**
     * Gets the value of the placer property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerInfoType }
     *     
     */
    public CustomerInfoType getPlacer() {
        return placer;
    }

    /**
     * Sets the value of the placer property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerInfoType }
     *     
     */
    public void setPlacer(CustomerInfoType value) {
        this.placer = value;
    }

    /**
     * Gets the value of the detachedOrg property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerInfoType }
     *     
     */
    public CustomerInfoType getDetachedOrg() {
        return detachedOrg;
    }

    /**
     * Sets the value of the detachedOrg property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerInfoType }
     *     
     */
    public void setDetachedOrg(CustomerInfoType value) {
        this.detachedOrg = value;
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
     * Gets the value of the supplierInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supplierInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupplierInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplierMainType }
     * 
     * 
     */
    public List<SupplierMainType> getSupplierInfo() {
        if (supplierInfo == null) {
            supplierInfo = new ArrayList<SupplierMainType>();
        }
        return this.supplierInfo;
    }

    /**
     * Gets the value of the lot property.
     * 
     * @return
     *     possible object is
     *     {@link ContractBaseLotType }
     *     
     */
    public ContractBaseLotType getLot() {
        return lot;
    }

    /**
     * Sets the value of the lot property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractBaseLotType }
     *     
     */
    public void setLot(ContractBaseLotType value) {
        this.lot = value;
    }

    /**
     * Gets the value of the attachments property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentListType }
     *     
     */
    public DocumentListType getAttachments() {
        return attachments;
    }

    /**
     * Sets the value of the attachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentListType }
     *     
     */
    public void setAttachments(DocumentListType value) {
        this.attachments = value;
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
     *         &lt;element name="guid" type="{http://zakupki.gov.ru/223fz/types/1}guidType"/>
     *         &lt;element name="registrationNumber" type="{http://zakupki.gov.ru/223fz/types/1}registrationNumber11-2Type"/>
     *         &lt;element name="name" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
     *               &lt;maxLength value="2000"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="publicationDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
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
        "guid",
        "registrationNumber",
        "name",
        "publicationDateTime"
    })
    public static class ProtocolInfo {

        @XmlElement(required = true)
        protected String guid;
        @XmlElement(required = true)
        protected String registrationNumber;
        protected String name;
        @XmlElement(required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar publicationDateTime;

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
         * Gets the value of the registrationNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRegistrationNumber() {
            return registrationNumber;
        }

        /**
         * Sets the value of the registrationNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRegistrationNumber(String value) {
            this.registrationNumber = value;
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
         * Gets the value of the publicationDateTime property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getPublicationDateTime() {
            return publicationDateTime;
        }

        /**
         * Sets the value of the publicationDateTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setPublicationDateTime(XMLGregorianCalendar value) {
            this.publicationDateTime = value;
        }

    }

}
