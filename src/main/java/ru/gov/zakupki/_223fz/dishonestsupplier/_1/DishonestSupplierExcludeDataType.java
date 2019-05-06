//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.06 at 10:22:30 AM MSK 
//


package ru.gov.zakupki._223fz.dishonestsupplier._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Исключение сведений из Реестре НП
 * 
 * <p>Java class for dishonestSupplierExcludeDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dishonestSupplierExcludeDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="guid" type="{http://zakupki.gov.ru/223fz/types/1}guidType" minOccurs="0"/>
 *         &lt;element name="registrationNumber" type="{http://zakupki.gov.ru/223fz/dishonestSupplier/1}dishonestNumberType" minOccurs="0"/>
 *         &lt;element name="includeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="includeReasonInfo">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="2000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="commonApplicationInfo" type="{http://zakupki.gov.ru/223fz/dishonestSupplier/1}commonApplicationInfoType"/>
 *         &lt;element name="createDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="publicationDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="decisionExcludeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="excludeReason" minOccurs="0">
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
@XmlType(name = "dishonestSupplierExcludeDataType", propOrder = {
    "guid",
    "registrationNumber",
    "includeDate",
    "includeReasonInfo",
    "commonApplicationInfo",
    "createDateTime",
    "publicationDateTime",
    "decisionExcludeDate",
    "excludeReason"
})
public class DishonestSupplierExcludeDataType {

    protected String guid;
    protected String registrationNumber;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar includeDate;
    @XmlElement(required = true)
    protected String includeReasonInfo;
    @XmlElement(required = true)
    protected CommonApplicationInfoType commonApplicationInfo;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createDateTime;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar publicationDateTime;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar decisionExcludeDate;
    protected String excludeReason;

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
     * Gets the value of the decisionExcludeDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDecisionExcludeDate() {
        return decisionExcludeDate;
    }

    /**
     * Sets the value of the decisionExcludeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDecisionExcludeDate(XMLGregorianCalendar value) {
        this.decisionExcludeDate = value;
    }

    /**
     * Gets the value of the excludeReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExcludeReason() {
        return excludeReason;
    }

    /**
     * Sets the value of the excludeReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExcludeReason(String value) {
        this.excludeReason = value;
    }

}
