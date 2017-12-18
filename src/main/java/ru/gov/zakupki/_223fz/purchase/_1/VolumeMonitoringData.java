//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.12.18 at 10:05:56 AM MSK 
//


package ru.gov.zakupki._223fz.purchase._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ru.gov.zakupki._223fz.types._1.CustomerInfoType;
import ru.gov.zakupki._223fz.types._1.DocumentListType;
import ru.gov.zakupki._223fz.types._1.VolumePurchaseStatusType;


/**
 * Сведения о отчете о результатах проведения мониторинга
 * 
 * <p>Java class for volumeMonitoringData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="volumeMonitoringData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="guid" type="{http://zakupki.gov.ru/223fz/types/1}guidType"/>
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
 *         &lt;element name="createDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="placer" type="{http://zakupki.gov.ru/223fz/types/1}customerInfoType"/>
 *         &lt;element name="publicationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="status" type="{http://zakupki.gov.ru/223fz/types/1}volumePurchaseStatusType" minOccurs="0"/>
 *         &lt;element name="version" type="{http://zakupki.gov.ru/223fz/types/1}versionType"/>
 *         &lt;element name="modificationDescription" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="2000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="year" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="numberOfAgencies" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="monitoringIndicatorListType" type="{http://zakupki.gov.ru/223fz/purchase/1}monitoringIndicatorListType"/>
 *         &lt;element name="monitoringInconsistencyListType" type="{http://zakupki.gov.ru/223fz/purchase/1}monitoringInconsistencyListType"/>
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
@XmlType(name = "volumeMonitoringData", propOrder = {
    "guid",
    "urlOOS",
    "urlVSRZ",
    "createDateTime",
    "placer",
    "publicationDate",
    "status",
    "version",
    "modificationDescription",
    "year",
    "numberOfAgencies",
    "monitoringIndicatorListType",
    "monitoringInconsistencyListType",
    "attachments"
})
public class VolumeMonitoringData {

    @XmlElement(required = true)
    protected String guid;
    protected String urlOOS;
    protected String urlVSRZ;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createDateTime;
    @XmlElement(required = true)
    protected CustomerInfoType placer;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar publicationDate;
    @XmlSchemaType(name = "string")
    protected VolumePurchaseStatusType status;
    protected long version;
    protected String modificationDescription;
    protected int year;
    protected int numberOfAgencies;
    @XmlElement(required = true)
    protected MonitoringIndicatorListType monitoringIndicatorListType;
    @XmlElement(required = true)
    protected MonitoringInconsistencyListType monitoringInconsistencyListType;
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
     * Gets the value of the publicationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPublicationDate() {
        return publicationDate;
    }

    /**
     * Sets the value of the publicationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPublicationDate(XMLGregorianCalendar value) {
        this.publicationDate = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link VolumePurchaseStatusType }
     *     
     */
    public VolumePurchaseStatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumePurchaseStatusType }
     *     
     */
    public void setStatus(VolumePurchaseStatusType value) {
        this.status = value;
    }

    /**
     * Gets the value of the version property.
     * 
     */
    public long getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     */
    public void setVersion(long value) {
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
     * Gets the value of the year property.
     * 
     */
    public int getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     * 
     */
    public void setYear(int value) {
        this.year = value;
    }

    /**
     * Gets the value of the numberOfAgencies property.
     * 
     */
    public int getNumberOfAgencies() {
        return numberOfAgencies;
    }

    /**
     * Sets the value of the numberOfAgencies property.
     * 
     */
    public void setNumberOfAgencies(int value) {
        this.numberOfAgencies = value;
    }

    /**
     * Gets the value of the monitoringIndicatorListType property.
     * 
     * @return
     *     possible object is
     *     {@link MonitoringIndicatorListType }
     *     
     */
    public MonitoringIndicatorListType getMonitoringIndicatorListType() {
        return monitoringIndicatorListType;
    }

    /**
     * Sets the value of the monitoringIndicatorListType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonitoringIndicatorListType }
     *     
     */
    public void setMonitoringIndicatorListType(MonitoringIndicatorListType value) {
        this.monitoringIndicatorListType = value;
    }

    /**
     * Gets the value of the monitoringInconsistencyListType property.
     * 
     * @return
     *     possible object is
     *     {@link MonitoringInconsistencyListType }
     *     
     */
    public MonitoringInconsistencyListType getMonitoringInconsistencyListType() {
        return monitoringInconsistencyListType;
    }

    /**
     * Sets the value of the monitoringInconsistencyListType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonitoringInconsistencyListType }
     *     
     */
    public void setMonitoringInconsistencyListType(MonitoringInconsistencyListType value) {
        this.monitoringInconsistencyListType = value;
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
