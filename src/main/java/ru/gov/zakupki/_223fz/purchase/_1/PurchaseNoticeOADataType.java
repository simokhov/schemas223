//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.23 at 05:11:07 PM MSK 
//


package ru.gov.zakupki._223fz.purchase._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Извещение о закупке "Открытый Аукцион"
 * 
 * <p>Java class for purchaseNoticeOADataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="purchaseNoticeOADataType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/223fz/purchase/1}purchaseNoticeNonISBaseType">
 *       &lt;sequence>
 *         &lt;element name="examinationPlace">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="examinationDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="auctionPlace">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="auctionTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="submissionCloseDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="publicationPlannedDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "purchaseNoticeOADataType", propOrder = {
    "examinationPlace",
    "examinationDateTime",
    "auctionPlace",
    "auctionTime",
    "submissionCloseDateTime",
    "publicationPlannedDate"
})
public class PurchaseNoticeOADataType
    extends PurchaseNoticeNonISBaseType
{

    @XmlElement(required = true)
    protected String examinationPlace;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar examinationDateTime;
    @XmlElement(required = true)
    protected String auctionPlace;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar auctionTime;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar submissionCloseDateTime;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar publicationPlannedDate;

    /**
     * Gets the value of the examinationPlace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExaminationPlace() {
        return examinationPlace;
    }

    /**
     * Sets the value of the examinationPlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExaminationPlace(String value) {
        this.examinationPlace = value;
    }

    /**
     * Gets the value of the examinationDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExaminationDateTime() {
        return examinationDateTime;
    }

    /**
     * Sets the value of the examinationDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExaminationDateTime(XMLGregorianCalendar value) {
        this.examinationDateTime = value;
    }

    /**
     * Gets the value of the auctionPlace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuctionPlace() {
        return auctionPlace;
    }

    /**
     * Sets the value of the auctionPlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuctionPlace(String value) {
        this.auctionPlace = value;
    }

    /**
     * Gets the value of the auctionTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAuctionTime() {
        return auctionTime;
    }

    /**
     * Sets the value of the auctionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAuctionTime(XMLGregorianCalendar value) {
        this.auctionTime = value;
    }

    /**
     * Gets the value of the submissionCloseDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSubmissionCloseDateTime() {
        return submissionCloseDateTime;
    }

    /**
     * Sets the value of the submissionCloseDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSubmissionCloseDateTime(XMLGregorianCalendar value) {
        this.submissionCloseDateTime = value;
    }

    /**
     * Gets the value of the publicationPlannedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPublicationPlannedDate() {
        return publicationPlannedDate;
    }

    /**
     * Sets the value of the publicationPlannedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPublicationPlannedDate(XMLGregorianCalendar value) {
        this.publicationPlannedDate = value;
    }

}
