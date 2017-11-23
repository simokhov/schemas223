//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.23 at 05:17:31 PM MSK 
//


package ru.gov.zakupki._223fz.complaint._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Сведения о закупке
 * 
 * <p>Java class for complaintPurchaseInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="complaintPurchaseInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="guid" type="{http://zakupki.gov.ru/223fz/types/1}guidType" minOccurs="0"/>
 *         &lt;element name="noticeRegistrationNumber" type="{http://zakupki.gov.ru/223fz/types/1}registrationNumber11Type"/>
 *         &lt;element name="name" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="3000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="lotGuid" type="{http://zakupki.gov.ru/223fz/types/1}guidType" minOccurs="0"/>
 *         &lt;element name="publishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ordinalNumber">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="lotName">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
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
@XmlType(name = "complaintPurchaseInfoType", propOrder = {
    "guid",
    "noticeRegistrationNumber",
    "name",
    "lotGuid",
    "publishDate",
    "ordinalNumber",
    "lotName"
})
public class ComplaintPurchaseInfoType {

    protected String guid;
    @XmlElement(required = true)
    protected String noticeRegistrationNumber;
    protected String name;
    protected String lotGuid;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar publishDate;
    @XmlElement(required = true)
    protected String ordinalNumber;
    @XmlElement(required = true)
    protected String lotName;

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
     * Gets the value of the noticeRegistrationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoticeRegistrationNumber() {
        return noticeRegistrationNumber;
    }

    /**
     * Sets the value of the noticeRegistrationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoticeRegistrationNumber(String value) {
        this.noticeRegistrationNumber = value;
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
     * Gets the value of the lotGuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLotGuid() {
        return lotGuid;
    }

    /**
     * Sets the value of the lotGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLotGuid(String value) {
        this.lotGuid = value;
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
     * Gets the value of the ordinalNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdinalNumber() {
        return ordinalNumber;
    }

    /**
     * Sets the value of the ordinalNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrdinalNumber(String value) {
        this.ordinalNumber = value;
    }

    /**
     * Gets the value of the lotName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLotName() {
        return lotName;
    }

    /**
     * Sets the value of the lotName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLotName(String value) {
        this.lotName = value;
    }

}
