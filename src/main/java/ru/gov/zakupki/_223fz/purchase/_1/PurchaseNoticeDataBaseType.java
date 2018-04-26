//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.04.26 at 09:55:47 AM MSK 
//


package ru.gov.zakupki._223fz.purchase._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ru.gov.zakupki._223fz.types._1.ContactInfoType;
import ru.gov.zakupki._223fz.types._1.CustomerInfo3Type;
import ru.gov.zakupki._223fz.types._1.CustomerInfoType;
import ru.gov.zakupki._223fz.types._1.DocDeliveryInfoType;
import ru.gov.zakupki._223fz.types._1.DocumentListType;
import ru.gov.zakupki._223fz.types._1.NoticeDeliveryPlaceIndicationType;
import ru.gov.zakupki._223fz.types._1.PurchaseNoticeStatusType;


/**
 * Базовый набор свойств для извещения о закупке
 * 
 * <p>Java class for purchaseNoticeDataBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="purchaseNoticeDataBaseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="guid" type="{http://zakupki.gov.ru/223fz/types/1}guidType"/>
 *         &lt;element name="createDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="urlOOS" minOccurs="0">
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
 *         &lt;element name="registrationNumber" type="{http://zakupki.gov.ru/223fz/types/1}registrationNumber11Type" minOccurs="0"/>
 *         &lt;element name="name">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="2000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="customer" type="{http://zakupki.gov.ru/223fz/types/1}customerInfoType"/>
 *         &lt;element name="detachedOrg" type="{http://zakupki.gov.ru/223fz/types/1}customerInfo3Type" minOccurs="0"/>
 *         &lt;element name="blockedCustomer" type="{http://zakupki.gov.ru/223fz/types/1}customerInfoType" minOccurs="0"/>
 *         &lt;element name="purchaseMethodCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="purchaseCodeName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="2000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="placer" type="{http://zakupki.gov.ru/223fz/types/1}customerInfoType"/>
 *         &lt;element name="contact" type="{http://zakupki.gov.ru/223fz/types/1}contactInfoType" minOccurs="0"/>
 *         &lt;element name="publicationDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="documentationDelivery" type="{http://zakupki.gov.ru/223fz/types/1}docDeliveryInfoType" minOccurs="0"/>
 *         &lt;element name="status" type="{http://zakupki.gov.ru/223fz/types/1}purchaseNoticeStatusType" minOccurs="0"/>
 *         &lt;element name="version" type="{http://zakupki.gov.ru/223fz/types/1}versionType" minOccurs="0"/>
 *         &lt;element name="modificationDescription" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="2000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="notDishonest" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="attachments" type="{http://zakupki.gov.ru/223fz/types/1}documentListType" minOccurs="0"/>
 *         &lt;element name="modificationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="saveUserId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="deliveryPlaceIndication" type="{http://zakupki.gov.ru/223fz/types/1}noticeDeliveryPlaceIndicationType"/>
 *         &lt;element name="emergency" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="jointPurchase" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "purchaseNoticeDataBaseType", propOrder = {
    "guid",
    "createDateTime",
    "urlOOS",
    "urlVSRZ",
    "registrationNumber",
    "name",
    "customer",
    "detachedOrg",
    "blockedCustomer",
    "purchaseMethodCode",
    "purchaseCodeName",
    "placer",
    "contact",
    "publicationDateTime",
    "documentationDelivery",
    "status",
    "version",
    "modificationDescription",
    "notDishonest",
    "attachments",
    "modificationDate",
    "saveUserId",
    "deliveryPlaceIndication",
    "emergency",
    "jointPurchase"
})
@XmlSeeAlso({
    PurchaseNoticeDataType.class,
    PurchaseNoticeNonISBaseType.class
})
public class PurchaseNoticeDataBaseType {

    @XmlElement(required = true)
    protected String guid;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createDateTime;
    protected String urlOOS;
    protected String urlVSRZ;
    protected String registrationNumber;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected CustomerInfoType customer;
    protected CustomerInfo3Type detachedOrg;
    protected CustomerInfoType blockedCustomer;
    protected Long purchaseMethodCode;
    protected String purchaseCodeName;
    @XmlElement(required = true)
    protected CustomerInfoType placer;
    protected ContactInfoType contact;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar publicationDateTime;
    protected DocDeliveryInfoType documentationDelivery;
    @XmlSchemaType(name = "string")
    protected PurchaseNoticeStatusType status;
    protected Long version;
    protected String modificationDescription;
    protected Boolean notDishonest;
    protected DocumentListType attachments;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modificationDate;
    protected Long saveUserId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected NoticeDeliveryPlaceIndicationType deliveryPlaceIndication;
    protected Boolean emergency;
    protected Boolean jointPurchase;

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
     * Gets the value of the urlOOS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlOOS() {
        return urlOOS;
    }

    /**
     * Sets the value of the urlOOS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlOOS(String value) {
        this.urlOOS = value;
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
     * Gets the value of the detachedOrg property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerInfo3Type }
     *     
     */
    public CustomerInfo3Type getDetachedOrg() {
        return detachedOrg;
    }

    /**
     * Sets the value of the detachedOrg property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerInfo3Type }
     *     
     */
    public void setDetachedOrg(CustomerInfo3Type value) {
        this.detachedOrg = value;
    }

    /**
     * Gets the value of the blockedCustomer property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerInfoType }
     *     
     */
    public CustomerInfoType getBlockedCustomer() {
        return blockedCustomer;
    }

    /**
     * Sets the value of the blockedCustomer property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerInfoType }
     *     
     */
    public void setBlockedCustomer(CustomerInfoType value) {
        this.blockedCustomer = value;
    }

    /**
     * Gets the value of the purchaseMethodCode property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPurchaseMethodCode() {
        return purchaseMethodCode;
    }

    /**
     * Sets the value of the purchaseMethodCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPurchaseMethodCode(Long value) {
        this.purchaseMethodCode = value;
    }

    /**
     * Gets the value of the purchaseCodeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchaseCodeName() {
        return purchaseCodeName;
    }

    /**
     * Sets the value of the purchaseCodeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchaseCodeName(String value) {
        this.purchaseCodeName = value;
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
     * Gets the value of the contact property.
     * 
     * @return
     *     possible object is
     *     {@link ContactInfoType }
     *     
     */
    public ContactInfoType getContact() {
        return contact;
    }

    /**
     * Sets the value of the contact property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactInfoType }
     *     
     */
    public void setContact(ContactInfoType value) {
        this.contact = value;
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
     * Gets the value of the documentationDelivery property.
     * 
     * @return
     *     possible object is
     *     {@link DocDeliveryInfoType }
     *     
     */
    public DocDeliveryInfoType getDocumentationDelivery() {
        return documentationDelivery;
    }

    /**
     * Sets the value of the documentationDelivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocDeliveryInfoType }
     *     
     */
    public void setDocumentationDelivery(DocDeliveryInfoType value) {
        this.documentationDelivery = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseNoticeStatusType }
     *     
     */
    public PurchaseNoticeStatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseNoticeStatusType }
     *     
     */
    public void setStatus(PurchaseNoticeStatusType value) {
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
     * Gets the value of the modificationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getModificationDate() {
        return modificationDate;
    }

    /**
     * Sets the value of the modificationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setModificationDate(XMLGregorianCalendar value) {
        this.modificationDate = value;
    }

    /**
     * Gets the value of the saveUserId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSaveUserId() {
        return saveUserId;
    }

    /**
     * Sets the value of the saveUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSaveUserId(Long value) {
        this.saveUserId = value;
    }

    /**
     * Gets the value of the deliveryPlaceIndication property.
     * 
     * @return
     *     possible object is
     *     {@link NoticeDeliveryPlaceIndicationType }
     *     
     */
    public NoticeDeliveryPlaceIndicationType getDeliveryPlaceIndication() {
        return deliveryPlaceIndication;
    }

    /**
     * Sets the value of the deliveryPlaceIndication property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoticeDeliveryPlaceIndicationType }
     *     
     */
    public void setDeliveryPlaceIndication(NoticeDeliveryPlaceIndicationType value) {
        this.deliveryPlaceIndication = value;
    }

    /**
     * Gets the value of the emergency property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEmergency() {
        return emergency;
    }

    /**
     * Sets the value of the emergency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEmergency(Boolean value) {
        this.emergency = value;
    }

    /**
     * Gets the value of the jointPurchase property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isJointPurchase() {
        return jointPurchase;
    }

    /**
     * Sets the value of the jointPurchase property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setJointPurchase(Boolean value) {
        this.jointPurchase = value;
    }

}
