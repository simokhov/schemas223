//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.23 at 05:25:55 PM MSK 
//


package ru.gov.zakupki._223fz.purchaseplan._1;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ru.gov.zakupki._223fz.types._1.CustomerInfoType;
import ru.gov.zakupki._223fz.types._1.DocumentListType;
import ru.gov.zakupki._223fz.types._1.PurchasePlanStatusType;


/**
 * План закупки
 * 
 * <p>Java class for purchasePlanDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="purchasePlanDataType">
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
 *         &lt;element name="registrationNumber" type="{http://zakupki.gov.ru/223fz/types/1}registrationNumberType" minOccurs="0"/>
 *         &lt;element name="customer" type="{http://zakupki.gov.ru/223fz/types/1}customerInfoType"/>
 *         &lt;element name="placer" type="{http://zakupki.gov.ru/223fz/types/1}customerInfoType"/>
 *         &lt;element name="name">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="2000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="additionalInfo" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="2000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="approveDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="publicationDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="isDigitForm" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="summSizeCh15" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isImportedFromVSRZ" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="planType" type="{http://zakupki.gov.ru/223fz/purchasePlan/1}planType"/>
 *         &lt;element name="status" type="{http://zakupki.gov.ru/223fz/types/1}purchasePlanStatusType" minOccurs="0"/>
 *         &lt;element name="version" type="{http://zakupki.gov.ru/223fz/types/1}versionType" minOccurs="0"/>
 *         &lt;element name="modificationDescription" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="2000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="useNewClassifiers" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="attachments" type="{http://zakupki.gov.ru/223fz/types/1}documentListType" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="purchasePlanItems" type="{http://zakupki.gov.ru/223fz/purchasePlan/1}purchasePlanItemsListType" minOccurs="0"/>
 *           &lt;element name="innovationPlanItems" type="{http://zakupki.gov.ru/223fz/purchasePlan/1}innovationPlanItemsListType" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="excludeVolume" type="{http://zakupki.gov.ru/223fz/types/1}money2" minOccurs="0"/>
 *         &lt;element name="volumeSMB" type="{http://zakupki.gov.ru/223fz/types/1}money2" minOccurs="0"/>
 *         &lt;element name="annualVolume" type="{http://zakupki.gov.ru/223fz/types/1}money2" minOccurs="0"/>
 *         &lt;element name="percentSMB" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="purchasePlanItemsSMB" type="{http://zakupki.gov.ru/223fz/purchasePlan/1}purchasePlanItemsListType" minOccurs="0"/>
 *           &lt;element name="innovationPlanItemsSMB" type="{http://zakupki.gov.ru/223fz/purchasePlan/1}innovationPlanItemsListType" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="smbPartitionChanged" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="annualVolumeSMBLessTenPercent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "purchasePlanDataType", propOrder = {
    "guid",
    "createDateTime",
    "urlOOS",
    "urlVSRZ",
    "registrationNumber",
    "customer",
    "placer",
    "name",
    "additionalInfo",
    "startDate",
    "endDate",
    "approveDate",
    "publicationDateTime",
    "isDigitForm",
    "summSizeCh15",
    "isImportedFromVSRZ",
    "planType",
    "status",
    "version",
    "modificationDescription",
    "useNewClassifiers",
    "attachments",
    "purchasePlanItems",
    "innovationPlanItems",
    "excludeVolume",
    "volumeSMB",
    "annualVolume",
    "percentSMB",
    "purchasePlanItemsSMB",
    "innovationPlanItemsSMB",
    "smbPartitionChanged",
    "annualVolumeSMBLessTenPercent"
})
public class PurchasePlanDataType {

    @XmlElement(required = true)
    protected String guid;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createDateTime;
    protected String urlOOS;
    protected String urlVSRZ;
    protected String registrationNumber;
    @XmlElement(required = true)
    protected CustomerInfoType customer;
    @XmlElement(required = true)
    protected CustomerInfoType placer;
    @XmlElement(required = true)
    protected String name;
    protected String additionalInfo;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar approveDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar publicationDateTime;
    @XmlElement(defaultValue = "false")
    protected Boolean isDigitForm;
    @XmlElement(defaultValue = "false")
    protected Boolean summSizeCh15;
    @XmlElement(defaultValue = "false")
    protected Boolean isImportedFromVSRZ;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected PlanType planType;
    @XmlSchemaType(name = "string")
    protected PurchasePlanStatusType status;
    protected Long version;
    protected String modificationDescription;
    protected Boolean useNewClassifiers;
    protected DocumentListType attachments;
    protected PurchasePlanItemsListType purchasePlanItems;
    protected InnovationPlanItemsListType innovationPlanItems;
    protected BigDecimal excludeVolume;
    protected BigDecimal volumeSMB;
    protected BigDecimal annualVolume;
    protected BigDecimal percentSMB;
    protected PurchasePlanItemsListType purchasePlanItemsSMB;
    protected InnovationPlanItemsListType innovationPlanItemsSMB;
    @XmlElement(defaultValue = "false")
    protected Boolean smbPartitionChanged;
    @XmlElement(defaultValue = "false")
    protected Boolean annualVolumeSMBLessTenPercent;

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
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the approveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getApproveDate() {
        return approveDate;
    }

    /**
     * Sets the value of the approveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setApproveDate(XMLGregorianCalendar value) {
        this.approveDate = value;
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
     * Gets the value of the isDigitForm property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDigitForm() {
        return isDigitForm;
    }

    /**
     * Sets the value of the isDigitForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDigitForm(Boolean value) {
        this.isDigitForm = value;
    }

    /**
     * Gets the value of the summSizeCh15 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSummSizeCh15() {
        return summSizeCh15;
    }

    /**
     * Sets the value of the summSizeCh15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSummSizeCh15(Boolean value) {
        this.summSizeCh15 = value;
    }

    /**
     * Gets the value of the isImportedFromVSRZ property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsImportedFromVSRZ() {
        return isImportedFromVSRZ;
    }

    /**
     * Sets the value of the isImportedFromVSRZ property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsImportedFromVSRZ(Boolean value) {
        this.isImportedFromVSRZ = value;
    }

    /**
     * Gets the value of the planType property.
     * 
     * @return
     *     possible object is
     *     {@link PlanType }
     *     
     */
    public PlanType getPlanType() {
        return planType;
    }

    /**
     * Sets the value of the planType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlanType }
     *     
     */
    public void setPlanType(PlanType value) {
        this.planType = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link PurchasePlanStatusType }
     *     
     */
    public PurchasePlanStatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchasePlanStatusType }
     *     
     */
    public void setStatus(PurchasePlanStatusType value) {
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
     * Gets the value of the useNewClassifiers property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseNewClassifiers() {
        return useNewClassifiers;
    }

    /**
     * Sets the value of the useNewClassifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseNewClassifiers(Boolean value) {
        this.useNewClassifiers = value;
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
     * Gets the value of the purchasePlanItems property.
     * 
     * @return
     *     possible object is
     *     {@link PurchasePlanItemsListType }
     *     
     */
    public PurchasePlanItemsListType getPurchasePlanItems() {
        return purchasePlanItems;
    }

    /**
     * Sets the value of the purchasePlanItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchasePlanItemsListType }
     *     
     */
    public void setPurchasePlanItems(PurchasePlanItemsListType value) {
        this.purchasePlanItems = value;
    }

    /**
     * Gets the value of the innovationPlanItems property.
     * 
     * @return
     *     possible object is
     *     {@link InnovationPlanItemsListType }
     *     
     */
    public InnovationPlanItemsListType getInnovationPlanItems() {
        return innovationPlanItems;
    }

    /**
     * Sets the value of the innovationPlanItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link InnovationPlanItemsListType }
     *     
     */
    public void setInnovationPlanItems(InnovationPlanItemsListType value) {
        this.innovationPlanItems = value;
    }

    /**
     * Gets the value of the excludeVolume property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExcludeVolume() {
        return excludeVolume;
    }

    /**
     * Sets the value of the excludeVolume property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExcludeVolume(BigDecimal value) {
        this.excludeVolume = value;
    }

    /**
     * Gets the value of the volumeSMB property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVolumeSMB() {
        return volumeSMB;
    }

    /**
     * Sets the value of the volumeSMB property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVolumeSMB(BigDecimal value) {
        this.volumeSMB = value;
    }

    /**
     * Gets the value of the annualVolume property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAnnualVolume() {
        return annualVolume;
    }

    /**
     * Sets the value of the annualVolume property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAnnualVolume(BigDecimal value) {
        this.annualVolume = value;
    }

    /**
     * Gets the value of the percentSMB property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercentSMB() {
        return percentSMB;
    }

    /**
     * Sets the value of the percentSMB property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercentSMB(BigDecimal value) {
        this.percentSMB = value;
    }

    /**
     * Gets the value of the purchasePlanItemsSMB property.
     * 
     * @return
     *     possible object is
     *     {@link PurchasePlanItemsListType }
     *     
     */
    public PurchasePlanItemsListType getPurchasePlanItemsSMB() {
        return purchasePlanItemsSMB;
    }

    /**
     * Sets the value of the purchasePlanItemsSMB property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchasePlanItemsListType }
     *     
     */
    public void setPurchasePlanItemsSMB(PurchasePlanItemsListType value) {
        this.purchasePlanItemsSMB = value;
    }

    /**
     * Gets the value of the innovationPlanItemsSMB property.
     * 
     * @return
     *     possible object is
     *     {@link InnovationPlanItemsListType }
     *     
     */
    public InnovationPlanItemsListType getInnovationPlanItemsSMB() {
        return innovationPlanItemsSMB;
    }

    /**
     * Sets the value of the innovationPlanItemsSMB property.
     * 
     * @param value
     *     allowed object is
     *     {@link InnovationPlanItemsListType }
     *     
     */
    public void setInnovationPlanItemsSMB(InnovationPlanItemsListType value) {
        this.innovationPlanItemsSMB = value;
    }

    /**
     * Gets the value of the smbPartitionChanged property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSmbPartitionChanged() {
        return smbPartitionChanged;
    }

    /**
     * Sets the value of the smbPartitionChanged property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSmbPartitionChanged(Boolean value) {
        this.smbPartitionChanged = value;
    }

    /**
     * Gets the value of the annualVolumeSMBLessTenPercent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAnnualVolumeSMBLessTenPercent() {
        return annualVolumeSMBLessTenPercent;
    }

    /**
     * Sets the value of the annualVolumeSMBLessTenPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAnnualVolumeSMBLessTenPercent(Boolean value) {
        this.annualVolumeSMBLessTenPercent = value;
    }

}
