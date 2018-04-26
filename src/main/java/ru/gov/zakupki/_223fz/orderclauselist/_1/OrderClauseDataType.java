//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.04.26 at 09:55:47 AM MSK 
//


package ru.gov.zakupki._223fz.orderclauselist._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ru.gov.zakupki._223fz.types._1.CustomerInfoType;
import ru.gov.zakupki._223fz.types._1.DocumentListType;
import ru.gov.zakupki._223fz.types._1.OrderClauseExtendFieldValueListType;
import ru.gov.zakupki._223fz.types._1.OrderClauseStatusType;
import ru.gov.zakupki._223fz.types._1.TemplateStructureTabType;


/**
 * Положение о закупке товаров, работ, услуг
 * 
 * <p>Java class for orderClauseDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="orderClauseDataType">
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
 *         &lt;element name="customer" type="{http://zakupki.gov.ru/223fz/types/1}customerInfoType"/>
 *         &lt;element name="placer" type="{http://zakupki.gov.ru/223fz/types/1}customerInfoType"/>
 *         &lt;element name="status" type="{http://zakupki.gov.ru/223fz/types/1}orderClauseStatusType" minOccurs="0"/>
 *         &lt;element name="version" type="{http://zakupki.gov.ru/223fz/types/1}versionType" minOccurs="0"/>
 *         &lt;element name="name">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="registrationNumber" type="{http://zakupki.gov.ru/223fz/types/1}registrationNumberType" minOccurs="0"/>
 *         &lt;element name="modificationDescription" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="2000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;choice>
 *           &lt;sequence>
 *             &lt;element name="approveDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *             &lt;element name="effectiveDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *             &lt;element name="approverName">
 *               &lt;simpleType>
 *                 &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *                   &lt;maxLength value="255"/>
 *                 &lt;/restriction>
 *               &lt;/simpleType>
 *             &lt;/element>
 *             &lt;element name="contractSignProcedure" minOccurs="0">
 *               &lt;simpleType>
 *                 &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *                   &lt;maxLength value="2000"/>
 *                 &lt;/restriction>
 *               &lt;/simpleType>
 *             &lt;/element>
 *             &lt;element name="purchaseMethod" type="{http://zakupki.gov.ru/223fz/orderClauseList/1}purchaseMethodType" maxOccurs="unbounded" minOccurs="0"/>
 *             &lt;element name="additionalInfo" minOccurs="0">
 *               &lt;simpleType>
 *                 &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *                   &lt;maxLength value="2000"/>
 *                 &lt;/restriction>
 *               &lt;/simpleType>
 *             &lt;/element>
 *             &lt;element name="templateVersion" type="{http://zakupki.gov.ru/223fz/types/1}templateVersionType" minOccurs="0"/>
 *             &lt;element name="templateStructure" minOccurs="0">
 *               &lt;complexType>
 *                 &lt;complexContent>
 *                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                     &lt;sequence>
 *                       &lt;element name="tab" type="{http://zakupki.gov.ru/223fz/types/1}templateStructureTabType" maxOccurs="unbounded"/>
 *                     &lt;/sequence>
 *                   &lt;/restriction>
 *                 &lt;/complexContent>
 *               &lt;/complexType>
 *             &lt;/element>
 *             &lt;element name="extendFields" type="{http://zakupki.gov.ru/223fz/types/1}orderClauseExtendFieldValueListType" minOccurs="0"/>
 *           &lt;/sequence>
 *           &lt;sequence>
 *             &lt;element name="headAgency" type="{http://zakupki.gov.ru/223fz/types/1}customerInfoType"/>
 *             &lt;element name="headRegistrationNumber" type="{http://zakupki.gov.ru/223fz/types/1}registrationNumberType"/>
 *             &lt;element name="headAgencyLinkReason">
 *               &lt;simpleType>
 *                 &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *                   &lt;maxLength value="2000"/>
 *                 &lt;/restriction>
 *               &lt;/simpleType>
 *             &lt;/element>
 *           &lt;/sequence>
 *         &lt;/choice>
 *         &lt;element name="publicationDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
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
@XmlType(name = "orderClauseDataType", propOrder = {
    "guid",
    "createDateTime",
    "urlOOS",
    "urlVSRZ",
    "customer",
    "placer",
    "status",
    "version",
    "name",
    "registrationNumber",
    "modificationDescription",
    "approveDate",
    "effectiveDate",
    "approverName",
    "contractSignProcedure",
    "purchaseMethod",
    "additionalInfo",
    "templateVersion",
    "templateStructure",
    "extendFields",
    "headAgency",
    "headRegistrationNumber",
    "headAgencyLinkReason",
    "publicationDateTime",
    "attachments"
})
public class OrderClauseDataType {

    @XmlElement(required = true)
    protected String guid;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createDateTime;
    protected String urlOOS;
    protected String urlVSRZ;
    @XmlElement(required = true)
    protected CustomerInfoType customer;
    @XmlElement(required = true)
    protected CustomerInfoType placer;
    @XmlSchemaType(name = "string")
    protected OrderClauseStatusType status;
    protected Long version;
    @XmlElement(required = true)
    protected String name;
    protected String registrationNumber;
    protected String modificationDescription;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar approveDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveDate;
    protected String approverName;
    protected String contractSignProcedure;
    protected List<PurchaseMethodType> purchaseMethod;
    protected String additionalInfo;
    protected Long templateVersion;
    protected OrderClauseDataType.TemplateStructure templateStructure;
    protected OrderClauseExtendFieldValueListType extendFields;
    protected CustomerInfoType headAgency;
    protected String headRegistrationNumber;
    protected String headAgencyLinkReason;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar publicationDateTime;
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
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link OrderClauseStatusType }
     *     
     */
    public OrderClauseStatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderClauseStatusType }
     *     
     */
    public void setStatus(OrderClauseStatusType value) {
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
     * Gets the value of the effectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the value of the effectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveDate(XMLGregorianCalendar value) {
        this.effectiveDate = value;
    }

    /**
     * Gets the value of the approverName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApproverName() {
        return approverName;
    }

    /**
     * Sets the value of the approverName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApproverName(String value) {
        this.approverName = value;
    }

    /**
     * Gets the value of the contractSignProcedure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractSignProcedure() {
        return contractSignProcedure;
    }

    /**
     * Sets the value of the contractSignProcedure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractSignProcedure(String value) {
        this.contractSignProcedure = value;
    }

    /**
     * Gets the value of the purchaseMethod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the purchaseMethod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPurchaseMethod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PurchaseMethodType }
     * 
     * 
     */
    public List<PurchaseMethodType> getPurchaseMethod() {
        if (purchaseMethod == null) {
            purchaseMethod = new ArrayList<PurchaseMethodType>();
        }
        return this.purchaseMethod;
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
     * Gets the value of the templateVersion property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTemplateVersion() {
        return templateVersion;
    }

    /**
     * Sets the value of the templateVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTemplateVersion(Long value) {
        this.templateVersion = value;
    }

    /**
     * Gets the value of the templateStructure property.
     * 
     * @return
     *     possible object is
     *     {@link OrderClauseDataType.TemplateStructure }
     *     
     */
    public OrderClauseDataType.TemplateStructure getTemplateStructure() {
        return templateStructure;
    }

    /**
     * Sets the value of the templateStructure property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderClauseDataType.TemplateStructure }
     *     
     */
    public void setTemplateStructure(OrderClauseDataType.TemplateStructure value) {
        this.templateStructure = value;
    }

    /**
     * Gets the value of the extendFields property.
     * 
     * @return
     *     possible object is
     *     {@link OrderClauseExtendFieldValueListType }
     *     
     */
    public OrderClauseExtendFieldValueListType getExtendFields() {
        return extendFields;
    }

    /**
     * Sets the value of the extendFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderClauseExtendFieldValueListType }
     *     
     */
    public void setExtendFields(OrderClauseExtendFieldValueListType value) {
        this.extendFields = value;
    }

    /**
     * Gets the value of the headAgency property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerInfoType }
     *     
     */
    public CustomerInfoType getHeadAgency() {
        return headAgency;
    }

    /**
     * Sets the value of the headAgency property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerInfoType }
     *     
     */
    public void setHeadAgency(CustomerInfoType value) {
        this.headAgency = value;
    }

    /**
     * Gets the value of the headRegistrationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeadRegistrationNumber() {
        return headRegistrationNumber;
    }

    /**
     * Sets the value of the headRegistrationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeadRegistrationNumber(String value) {
        this.headRegistrationNumber = value;
    }

    /**
     * Gets the value of the headAgencyLinkReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeadAgencyLinkReason() {
        return headAgencyLinkReason;
    }

    /**
     * Sets the value of the headAgencyLinkReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeadAgencyLinkReason(String value) {
        this.headAgencyLinkReason = value;
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
     *         &lt;element name="tab" type="{http://zakupki.gov.ru/223fz/types/1}templateStructureTabType" maxOccurs="unbounded"/>
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
        "tab"
    })
    public static class TemplateStructure {

        @XmlElement(required = true)
        protected List<TemplateStructureTabType> tab;

        /**
         * Gets the value of the tab property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the tab property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTab().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TemplateStructureTabType }
         * 
         * 
         */
        public List<TemplateStructureTabType> getTab() {
            if (tab == null) {
                tab = new ArrayList<TemplateStructureTabType>();
            }
            return this.tab;
        }

    }

}
