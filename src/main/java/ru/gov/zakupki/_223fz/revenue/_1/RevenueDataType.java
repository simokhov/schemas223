//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.23 at 05:29:48 PM MSK 
//


package ru.gov.zakupki._223fz.revenue._1;

import java.math.BigDecimal;
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


/**
 * Сведения о выручке
 * 
 * <p>Java class for revenueDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="revenueDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="guid" type="{http://zakupki.gov.ru/223fz/types/1}guidType"/>
 *         &lt;element name="registrationNumber" type="{http://zakupki.gov.ru/223fz/types/1}registrationNumberType" minOccurs="0"/>
 *         &lt;element name="customer" type="{http://zakupki.gov.ru/223fz/types/1}customerInfoType"/>
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
 *         &lt;element name="status" type="{http://zakupki.gov.ru/223fz/revenue/1}revenueStatusType" minOccurs="0"/>
 *         &lt;element name="version" type="{http://zakupki.gov.ru/223fz/types/1}versionType" minOccurs="0"/>
 *         &lt;element name="createDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="modificationDescription" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="2000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="modificationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="publicationDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="type" type="{http://zakupki.gov.ru/223fz/revenue/1}revenueType"/>
 *         &lt;element name="periodYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;choice>
 *           &lt;sequence>
 *             &lt;element name="participating">
 *               &lt;simpleType>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                   &lt;totalDigits value="18"/>
 *                   &lt;fractionDigits value="15"/>
 *                 &lt;/restriction>
 *               &lt;/simpleType>
 *             &lt;/element>
 *             &lt;element name="activitiesInfo">
 *               &lt;complexType>
 *                 &lt;complexContent>
 *                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                     &lt;sequence>
 *                       &lt;element name="revenueAmount" type="{http://zakupki.gov.ru/223fz/types/1}money2" minOccurs="0"/>
 *                       &lt;element name="totalByActivity" type="{http://zakupki.gov.ru/223fz/types/1}money2"/>
 *                       &lt;element name="activityTypeAmounts">
 *                         &lt;complexType>
 *                           &lt;complexContent>
 *                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                               &lt;sequence>
 *                                 &lt;element name="activityTypeAmount" type="{http://zakupki.gov.ru/223fz/revenue/1}activityTypeAmountType" maxOccurs="unbounded"/>
 *                               &lt;/sequence>
 *                             &lt;/restriction>
 *                           &lt;/complexContent>
 *                         &lt;/complexType>
 *                       &lt;/element>
 *                     &lt;/sequence>
 *                   &lt;/restriction>
 *                 &lt;/complexContent>
 *               &lt;/complexType>
 *             &lt;/element>
 *           &lt;/sequence>
 *           &lt;sequence>
 *             &lt;element name="periodQuarter">
 *               &lt;simpleType>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *                   &lt;minInclusive value="1"/>
 *                   &lt;maxInclusive value="4"/>
 *                 &lt;/restriction>
 *               &lt;/simpleType>
 *             &lt;/element>
 *             &lt;element name="mainOrganization" type="{http://zakupki.gov.ru/223fz/types/1}customerInfoType" minOccurs="0"/>
 *             &lt;element name="organizations">
 *               &lt;complexType>
 *                 &lt;complexContent>
 *                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                     &lt;sequence>
 *                       &lt;element name="organization" type="{http://zakupki.gov.ru/223fz/revenue/1}organizationType" maxOccurs="unbounded"/>
 *                     &lt;/sequence>
 *                   &lt;/restriction>
 *                 &lt;/complexContent>
 *               &lt;/complexType>
 *             &lt;/element>
 *             &lt;element name="childRevenue" type="{http://zakupki.gov.ru/223fz/types/1}money2"/>
 *             &lt;element name="commonRevenue" type="{http://zakupki.gov.ru/223fz/types/1}money2"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *         &lt;element name="documentsInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="documentsInfo" type="{http://zakupki.gov.ru/223fz/revenue/1}documentsInfoType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="contribution" type="{http://zakupki.gov.ru/223fz/types/1}money2"/>
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
@XmlType(name = "revenueDataType", propOrder = {
    "guid",
    "registrationNumber",
    "customer",
    "urlOOS",
    "urlVSRZ",
    "status",
    "version",
    "createDateTime",
    "modificationDescription",
    "modificationDate",
    "publicationDateTime",
    "type",
    "periodYear",
    "participating",
    "activitiesInfo",
    "periodQuarter",
    "mainOrganization",
    "organizations",
    "childRevenue",
    "commonRevenue",
    "documentsInfo",
    "contribution",
    "attachments"
})
public class RevenueDataType {

    @XmlElement(required = true)
    protected String guid;
    protected String registrationNumber;
    @XmlElement(required = true)
    protected CustomerInfoType customer;
    protected String urlOOS;
    protected String urlVSRZ;
    @XmlSchemaType(name = "string")
    protected RevenueStatusType status;
    protected Long version;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createDateTime;
    protected String modificationDescription;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modificationDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar publicationDateTime;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected RevenueType type;
    protected int periodYear;
    protected BigDecimal participating;
    protected RevenueDataType.ActivitiesInfo activitiesInfo;
    protected Integer periodQuarter;
    protected CustomerInfoType mainOrganization;
    protected RevenueDataType.Organizations organizations;
    protected BigDecimal childRevenue;
    protected BigDecimal commonRevenue;
    @XmlElement(required = true)
    protected RevenueDataType.DocumentsInfo documentsInfo;
    @XmlElement(required = true)
    protected BigDecimal contribution;
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
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link RevenueStatusType }
     *     
     */
    public RevenueStatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link RevenueStatusType }
     *     
     */
    public void setStatus(RevenueStatusType value) {
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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link RevenueType }
     *     
     */
    public RevenueType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link RevenueType }
     *     
     */
    public void setType(RevenueType value) {
        this.type = value;
    }

    /**
     * Gets the value of the periodYear property.
     * 
     */
    public int getPeriodYear() {
        return periodYear;
    }

    /**
     * Sets the value of the periodYear property.
     * 
     */
    public void setPeriodYear(int value) {
        this.periodYear = value;
    }

    /**
     * Gets the value of the participating property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getParticipating() {
        return participating;
    }

    /**
     * Sets the value of the participating property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setParticipating(BigDecimal value) {
        this.participating = value;
    }

    /**
     * Gets the value of the activitiesInfo property.
     * 
     * @return
     *     possible object is
     *     {@link RevenueDataType.ActivitiesInfo }
     *     
     */
    public RevenueDataType.ActivitiesInfo getActivitiesInfo() {
        return activitiesInfo;
    }

    /**
     * Sets the value of the activitiesInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link RevenueDataType.ActivitiesInfo }
     *     
     */
    public void setActivitiesInfo(RevenueDataType.ActivitiesInfo value) {
        this.activitiesInfo = value;
    }

    /**
     * Gets the value of the periodQuarter property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPeriodQuarter() {
        return periodQuarter;
    }

    /**
     * Sets the value of the periodQuarter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPeriodQuarter(Integer value) {
        this.periodQuarter = value;
    }

    /**
     * Gets the value of the mainOrganization property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerInfoType }
     *     
     */
    public CustomerInfoType getMainOrganization() {
        return mainOrganization;
    }

    /**
     * Sets the value of the mainOrganization property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerInfoType }
     *     
     */
    public void setMainOrganization(CustomerInfoType value) {
        this.mainOrganization = value;
    }

    /**
     * Gets the value of the organizations property.
     * 
     * @return
     *     possible object is
     *     {@link RevenueDataType.Organizations }
     *     
     */
    public RevenueDataType.Organizations getOrganizations() {
        return organizations;
    }

    /**
     * Sets the value of the organizations property.
     * 
     * @param value
     *     allowed object is
     *     {@link RevenueDataType.Organizations }
     *     
     */
    public void setOrganizations(RevenueDataType.Organizations value) {
        this.organizations = value;
    }

    /**
     * Gets the value of the childRevenue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getChildRevenue() {
        return childRevenue;
    }

    /**
     * Sets the value of the childRevenue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setChildRevenue(BigDecimal value) {
        this.childRevenue = value;
    }

    /**
     * Gets the value of the commonRevenue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCommonRevenue() {
        return commonRevenue;
    }

    /**
     * Sets the value of the commonRevenue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCommonRevenue(BigDecimal value) {
        this.commonRevenue = value;
    }

    /**
     * Gets the value of the documentsInfo property.
     * 
     * @return
     *     possible object is
     *     {@link RevenueDataType.DocumentsInfo }
     *     
     */
    public RevenueDataType.DocumentsInfo getDocumentsInfo() {
        return documentsInfo;
    }

    /**
     * Sets the value of the documentsInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link RevenueDataType.DocumentsInfo }
     *     
     */
    public void setDocumentsInfo(RevenueDataType.DocumentsInfo value) {
        this.documentsInfo = value;
    }

    /**
     * Gets the value of the contribution property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getContribution() {
        return contribution;
    }

    /**
     * Sets the value of the contribution property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setContribution(BigDecimal value) {
        this.contribution = value;
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
     *         &lt;element name="revenueAmount" type="{http://zakupki.gov.ru/223fz/types/1}money2" minOccurs="0"/>
     *         &lt;element name="totalByActivity" type="{http://zakupki.gov.ru/223fz/types/1}money2"/>
     *         &lt;element name="activityTypeAmounts">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="activityTypeAmount" type="{http://zakupki.gov.ru/223fz/revenue/1}activityTypeAmountType" maxOccurs="unbounded"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
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
    @XmlType(name = "", propOrder = {
        "revenueAmount",
        "totalByActivity",
        "activityTypeAmounts"
    })
    public static class ActivitiesInfo {

        protected BigDecimal revenueAmount;
        @XmlElement(required = true)
        protected BigDecimal totalByActivity;
        @XmlElement(required = true)
        protected RevenueDataType.ActivitiesInfo.ActivityTypeAmounts activityTypeAmounts;

        /**
         * Gets the value of the revenueAmount property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getRevenueAmount() {
            return revenueAmount;
        }

        /**
         * Sets the value of the revenueAmount property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setRevenueAmount(BigDecimal value) {
            this.revenueAmount = value;
        }

        /**
         * Gets the value of the totalByActivity property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTotalByActivity() {
            return totalByActivity;
        }

        /**
         * Sets the value of the totalByActivity property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTotalByActivity(BigDecimal value) {
            this.totalByActivity = value;
        }

        /**
         * Gets the value of the activityTypeAmounts property.
         * 
         * @return
         *     possible object is
         *     {@link RevenueDataType.ActivitiesInfo.ActivityTypeAmounts }
         *     
         */
        public RevenueDataType.ActivitiesInfo.ActivityTypeAmounts getActivityTypeAmounts() {
            return activityTypeAmounts;
        }

        /**
         * Sets the value of the activityTypeAmounts property.
         * 
         * @param value
         *     allowed object is
         *     {@link RevenueDataType.ActivitiesInfo.ActivityTypeAmounts }
         *     
         */
        public void setActivityTypeAmounts(RevenueDataType.ActivitiesInfo.ActivityTypeAmounts value) {
            this.activityTypeAmounts = value;
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
         *         &lt;element name="activityTypeAmount" type="{http://zakupki.gov.ru/223fz/revenue/1}activityTypeAmountType" maxOccurs="unbounded"/>
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
            "activityTypeAmount"
        })
        public static class ActivityTypeAmounts {

            @XmlElement(required = true)
            protected List<ActivityTypeAmountType> activityTypeAmount;

            /**
             * Gets the value of the activityTypeAmount property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the activityTypeAmount property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getActivityTypeAmount().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ActivityTypeAmountType }
             * 
             * 
             */
            public List<ActivityTypeAmountType> getActivityTypeAmount() {
                if (activityTypeAmount == null) {
                    activityTypeAmount = new ArrayList<ActivityTypeAmountType>();
                }
                return this.activityTypeAmount;
            }

        }

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
     *         &lt;element name="documentsInfo" type="{http://zakupki.gov.ru/223fz/revenue/1}documentsInfoType" maxOccurs="unbounded"/>
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
        "documentsInfo"
    })
    public static class DocumentsInfo {

        @XmlElement(required = true)
        protected List<DocumentsInfoType> documentsInfo;

        /**
         * Gets the value of the documentsInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the documentsInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDocumentsInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DocumentsInfoType }
         * 
         * 
         */
        public List<DocumentsInfoType> getDocumentsInfo() {
            if (documentsInfo == null) {
                documentsInfo = new ArrayList<DocumentsInfoType>();
            }
            return this.documentsInfo;
        }

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
     *         &lt;element name="organization" type="{http://zakupki.gov.ru/223fz/revenue/1}organizationType" maxOccurs="unbounded"/>
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
        "organization"
    })
    public static class Organizations {

        @XmlElement(required = true)
        protected List<OrganizationType> organization;

        /**
         * Gets the value of the organization property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the organization property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOrganization().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OrganizationType }
         * 
         * 
         */
        public List<OrganizationType> getOrganization() {
            if (organization == null) {
                organization = new ArrayList<OrganizationType>();
            }
            return this.organization;
        }

    }

}
