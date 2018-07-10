//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.10 at 05:03:32 PM MSK 
//


package ru.gov.zakupki._223fz.dishonestsupplier._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ru.gov.zakupki._223fz.types._1.CustomerInfoType;
import ru.gov.zakupki._223fz.types._1.DocumentListType;


/**
 * Сведения о недобросовестном поставщике
 * 
 * <p>Java class for dishonestSupplierDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dishonestSupplierDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="guid" type="{http://zakupki.gov.ru/223fz/types/1}guidType"/>
 *         &lt;element name="placer" type="{http://zakupki.gov.ru/223fz/types/1}customerInfoType"/>
 *         &lt;element name="registrationNumber" type="{http://zakupki.gov.ru/223fz/dishonestSupplier/1}dishonestNumberType" minOccurs="0"/>
 *         &lt;element name="version" type="{http://zakupki.gov.ru/223fz/types/1}versionType" minOccurs="0"/>
 *         &lt;element name="status" type="{http://zakupki.gov.ru/223fz/dishonestSupplier/1}dishonestSupplierStatusType" minOccurs="0"/>
 *         &lt;element name="modificationDescription" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="2000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
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
 *         &lt;element name="publicationDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="createDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="applicationNumber" type="{http://zakupki.gov.ru/223fz/dishonestSupplier/1}applicationNumberType"/>
 *         &lt;element name="applicationGuid" type="{http://zakupki.gov.ru/223fz/types/1}guidType" minOccurs="0"/>
 *         &lt;element name="includeReasonInfo">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="2000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="commonApplicationInfo" type="{http://zakupki.gov.ru/223fz/dishonestSupplier/1}commonApplicationInfoType"/>
 *         &lt;element name="approveStatus" type="{http://zakupki.gov.ru/223fz/dishonestSupplier/1}dishonestSupplierApproveStatusType" minOccurs="0"/>
 *         &lt;element name="includeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="excludeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
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
@XmlType(name = "dishonestSupplierDataType", propOrder = {
    "guid",
    "placer",
    "registrationNumber",
    "version",
    "status",
    "modificationDescription",
    "urlEIS",
    "urlVSRZ",
    "publicationDateTime",
    "createDateTime",
    "applicationNumber",
    "applicationGuid",
    "includeReasonInfo",
    "commonApplicationInfo",
    "approveStatus",
    "includeDate",
    "excludeDate",
    "attachments"
})
public class DishonestSupplierDataType {

    @XmlElement(required = true)
    protected String guid;
    @XmlElement(required = true)
    protected CustomerInfoType placer;
    protected String registrationNumber;
    protected Long version;
    @XmlSchemaType(name = "string")
    protected DishonestSupplierStatusType status;
    protected String modificationDescription;
    protected String urlEIS;
    protected String urlVSRZ;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar publicationDateTime;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createDateTime;
    @XmlElement(required = true)
    protected String applicationNumber;
    protected String applicationGuid;
    @XmlElement(required = true)
    protected String includeReasonInfo;
    @XmlElement(required = true)
    protected CommonApplicationInfoType commonApplicationInfo;
    @XmlSchemaType(name = "string")
    protected DishonestSupplierApproveStatusType approveStatus;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar includeDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar excludeDate;
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
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link DishonestSupplierStatusType }
     *     
     */
    public DishonestSupplierStatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link DishonestSupplierStatusType }
     *     
     */
    public void setStatus(DishonestSupplierStatusType value) {
        this.status = value;
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
     * Gets the value of the applicationGuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationGuid() {
        return applicationGuid;
    }

    /**
     * Sets the value of the applicationGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationGuid(String value) {
        this.applicationGuid = value;
    }

    /**
     * Gets the value of the includeReasonInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncludeReasonInfo() {
        return includeReasonInfo;
    }

    /**
     * Sets the value of the includeReasonInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncludeReasonInfo(String value) {
        this.includeReasonInfo = value;
    }

    /**
     * Gets the value of the commonApplicationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CommonApplicationInfoType }
     *     
     */
    public CommonApplicationInfoType getCommonApplicationInfo() {
        return commonApplicationInfo;
    }

    /**
     * Sets the value of the commonApplicationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonApplicationInfoType }
     *     
     */
    public void setCommonApplicationInfo(CommonApplicationInfoType value) {
        this.commonApplicationInfo = value;
    }

    /**
     * Gets the value of the approveStatus property.
     * 
     * @return
     *     possible object is
     *     {@link DishonestSupplierApproveStatusType }
     *     
     */
    public DishonestSupplierApproveStatusType getApproveStatus() {
        return approveStatus;
    }

    /**
     * Sets the value of the approveStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link DishonestSupplierApproveStatusType }
     *     
     */
    public void setApproveStatus(DishonestSupplierApproveStatusType value) {
        this.approveStatus = value;
    }

    /**
     * Gets the value of the includeDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIncludeDate() {
        return includeDate;
    }

    /**
     * Sets the value of the includeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIncludeDate(XMLGregorianCalendar value) {
        this.includeDate = value;
    }

    /**
     * Gets the value of the excludeDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExcludeDate() {
        return excludeDate;
    }

    /**
     * Sets the value of the excludeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExcludeDate(XMLGregorianCalendar value) {
        this.excludeDate = value;
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

}
