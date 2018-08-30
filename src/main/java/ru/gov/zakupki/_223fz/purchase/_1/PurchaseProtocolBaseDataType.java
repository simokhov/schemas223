//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.08.30 at 04:59:41 PM MSK 
//


package ru.gov.zakupki._223fz.purchase._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ru.gov.zakupki._223fz.types._1.CustomerInfoType;
import ru.gov.zakupki._223fz.types._1.DocumentListType;
import ru.gov.zakupki._223fz.types._1.LotAllocationReferenceType;
import ru.gov.zakupki._223fz.types._1.PurchaseInfoType;
import ru.gov.zakupki._223fz.types._1.PurchaseProtocolStatusType;


/**
 * Протокол. Базовый тип
 * 
 * <p>Java class for purchaseProtocolBaseDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="purchaseProtocolBaseDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="guid" type="{http://zakupki.gov.ru/223fz/types/1}guidType"/>
 *         &lt;element name="createDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="urlEIS" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="3000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="urlVSRZ" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="3000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="purchaseInfo" type="{http://zakupki.gov.ru/223fz/types/1}purchaseInfoType"/>
 *         &lt;element name="registrationNumber" type="{http://zakupki.gov.ru/223fz/types/1}registrationNumber11-2Type" minOccurs="0"/>
 *         &lt;element name="placer" type="{http://zakupki.gov.ru/223fz/types/1}customerInfoType"/>
 *         &lt;element name="customer" type="{http://zakupki.gov.ru/223fz/types/1}customerInfoType" minOccurs="0"/>
 *         &lt;element name="additionalInfo" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="10000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="missedContest" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="missedReason" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="2000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="purchaseCancellationReason" type="{http://zakupki.gov.ru/223fz/purchase/1}purchaseCancellationReasonType" minOccurs="0"/>
 *         &lt;element name="publicationDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="status" type="{http://zakupki.gov.ru/223fz/types/1}purchaseProtocolStatusType" minOccurs="0"/>
 *         &lt;element name="version" type="{http://zakupki.gov.ru/223fz/types/1}versionType" minOccurs="0"/>
 *         &lt;element name="modificationDescription" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="2000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="attachments" type="{http://zakupki.gov.ru/223fz/types/1}documentListType" minOccurs="0"/>
 *         &lt;element name="allocationReference" type="{http://zakupki.gov.ru/223fz/types/1}lotAllocationReferenceType" minOccurs="0"/>
 *         &lt;element name="emPlacementDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="emProtocolUrl" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="2000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="commissionDecisionExtra" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="2000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="commissionDecisionReason" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="2000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="confirmingDocsRequisites" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="2000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="commodityDeliveryPlace" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="2000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "purchaseProtocolBaseDataType", propOrder = {
    "guid",
    "createDateTime",
    "urlEIS",
    "urlVSRZ",
    "purchaseInfo",
    "registrationNumber",
    "placer",
    "customer",
    "additionalInfo",
    "missedContest",
    "missedReason",
    "purchaseCancellationReason",
    "publicationDateTime",
    "status",
    "version",
    "modificationDescription",
    "attachments",
    "allocationReference",
    "emPlacementDate",
    "emProtocolUrl",
    "commissionDecisionExtra",
    "commissionDecisionReason",
    "confirmingDocsRequisites",
    "commodityDeliveryPlace"
})
@XmlSeeAlso({
    PurchaseProtocolRZ1ZPESMBODataType.class,
    PurchaseProtocolSummingupZKESMBODataType.class,
    PurchaseProtocolPAAESMBODataType.class,
    PurchaseProtocolFCODKESMBODataType.class,
    PurchaseProtocolQSZPESMBODataType.class,
    PurchaseProtocolZPESMBODataType.class,
    PurchaseProtocolRejectionDataType.class,
    PurchaseProtocolRZOADataType.class,
    PurchaseProtocolDataType.class,
    PurchaseProtocolRZ1AESMBODataType.class,
    PurchaseProtocolVKDataType.class,
    PurchaseProtocolFCDKESMBODataType.class,
    PurchaseProtocolPAEPDataType.class,
    PurchaseProtocolRZOKDataType.class,
    PurchaseProtocolSummingupKESMBODataType.class,
    PurchaseProtocolOSZDataType.class,
    PurchaseProtocolZKDataType.class,
    PurchaseProtocolPAAEDataType.class,
    PurchaseProtocolSummingupZPESMBODataType.class,
    PurchaseProtocolRZAEDataType.class,
    PurchaseProtocolCollationAESMBODataType.class,
    PurchaseProtocolPAAE94FZDataType.class,
    PurchaseProtocolRZZKESMBODataType.class,
    PurchaseProtocolFKVOKESMBODataType.class,
    PurchaseProtocolSummingupAESMBODataType.class,
    PurchaseProtocolQSAESMBODataType.class,
    PurchaseProtocolRZ1AEDataType.class,
    PurchaseProtocolRZAESMBODataType.class,
    PurchaseProtocolRZ2AEDataType.class,
    PurchaseProtocolPAOADataType.class,
    PurchaseProtocolEvasionDataType.class,
    PurchaseProtocolRZ1KESMBODataType.class,
    PurchaseProtocolCCDataType.class
})
public class PurchaseProtocolBaseDataType {

    @XmlElement(required = true)
    protected String guid;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createDateTime;
    protected String urlEIS;
    protected String urlVSRZ;
    @XmlElement(required = true)
    protected PurchaseInfoType purchaseInfo;
    protected String registrationNumber;
    @XmlElement(required = true)
    protected CustomerInfoType placer;
    protected CustomerInfoType customer;
    protected String additionalInfo;
    @XmlElement(defaultValue = "false")
    protected Boolean missedContest;
    protected String missedReason;
    @XmlSchemaType(name = "string")
    protected PurchaseCancellationReasonType purchaseCancellationReason;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar publicationDateTime;
    @XmlSchemaType(name = "string")
    protected PurchaseProtocolStatusType status;
    protected Long version;
    protected String modificationDescription;
    protected DocumentListType attachments;
    protected LotAllocationReferenceType allocationReference;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar emPlacementDate;
    protected String emProtocolUrl;
    protected String commissionDecisionExtra;
    protected String commissionDecisionReason;
    protected String confirmingDocsRequisites;
    protected String commodityDeliveryPlace;

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
     * Gets the value of the createDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateDateTime() {
        return createDateTime;
    }

    /**
     * Sets the value of the createDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateDateTime(XMLGregorianCalendar value) {
        this.createDateTime = value;
    }

    /**
     * Gets the value of the urlEIS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlEIS() {
        return urlEIS;
    }

    /**
     * Sets the value of the urlEIS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlEIS(String value) {
        this.urlEIS = value;
    }

    /**
     * Gets the value of the urlVSRZ property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlVSRZ() {
        return urlVSRZ;
    }

    /**
     * Sets the value of the urlVSRZ property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlVSRZ(String value) {
        this.urlVSRZ = value;
    }

    /**
     * Gets the value of the purchaseInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseInfoType }
     *     
     */
    public PurchaseInfoType getPurchaseInfo() {
        return purchaseInfo;
    }

    /**
     * Sets the value of the purchaseInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseInfoType }
     *     
     */
    public void setPurchaseInfo(PurchaseInfoType value) {
        this.purchaseInfo = value;
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
     * Gets the value of the missedContest property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMissedContest() {
        return missedContest;
    }

    /**
     * Sets the value of the missedContest property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMissedContest(Boolean value) {
        this.missedContest = value;
    }

    /**
     * Gets the value of the missedReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMissedReason() {
        return missedReason;
    }

    /**
     * Sets the value of the missedReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMissedReason(String value) {
        this.missedReason = value;
    }

    /**
     * Gets the value of the purchaseCancellationReason property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseCancellationReasonType }
     *     
     */
    public PurchaseCancellationReasonType getPurchaseCancellationReason() {
        return purchaseCancellationReason;
    }

    /**
     * Sets the value of the purchaseCancellationReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseCancellationReasonType }
     *     
     */
    public void setPurchaseCancellationReason(PurchaseCancellationReasonType value) {
        this.purchaseCancellationReason = value;
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

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseProtocolStatusType }
     *     
     */
    public PurchaseProtocolStatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseProtocolStatusType }
     *     
     */
    public void setStatus(PurchaseProtocolStatusType value) {
        this.status = value;
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
     * Gets the value of the allocationReference property.
     * 
     * @return
     *     possible object is
     *     {@link LotAllocationReferenceType }
     *     
     */
    public LotAllocationReferenceType getAllocationReference() {
        return allocationReference;
    }

    /**
     * Sets the value of the allocationReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link LotAllocationReferenceType }
     *     
     */
    public void setAllocationReference(LotAllocationReferenceType value) {
        this.allocationReference = value;
    }

    /**
     * Gets the value of the emPlacementDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEmPlacementDate() {
        return emPlacementDate;
    }

    /**
     * Sets the value of the emPlacementDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEmPlacementDate(XMLGregorianCalendar value) {
        this.emPlacementDate = value;
    }

    /**
     * Gets the value of the emProtocolUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmProtocolUrl() {
        return emProtocolUrl;
    }

    /**
     * Sets the value of the emProtocolUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmProtocolUrl(String value) {
        this.emProtocolUrl = value;
    }

    /**
     * Gets the value of the commissionDecisionExtra property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommissionDecisionExtra() {
        return commissionDecisionExtra;
    }

    /**
     * Sets the value of the commissionDecisionExtra property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommissionDecisionExtra(String value) {
        this.commissionDecisionExtra = value;
    }

    /**
     * Gets the value of the commissionDecisionReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommissionDecisionReason() {
        return commissionDecisionReason;
    }

    /**
     * Sets the value of the commissionDecisionReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommissionDecisionReason(String value) {
        this.commissionDecisionReason = value;
    }

    /**
     * Gets the value of the confirmingDocsRequisites property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfirmingDocsRequisites() {
        return confirmingDocsRequisites;
    }

    /**
     * Sets the value of the confirmingDocsRequisites property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfirmingDocsRequisites(String value) {
        this.confirmingDocsRequisites = value;
    }

    /**
     * Gets the value of the commodityDeliveryPlace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommodityDeliveryPlace() {
        return commodityDeliveryPlace;
    }

    /**
     * Sets the value of the commodityDeliveryPlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommodityDeliveryPlace(String value) {
        this.commodityDeliveryPlace = value;
    }

}
