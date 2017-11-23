//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.23 at 05:28:36 PM MSK 
//


package ru.gov.zakupki._223fz.purchase._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ru.gov.zakupki._223fz.types._1.ElectronicPlaceInfoType;


/**
 * Извещение о закупке "Аукцион в электронной форме"
 * 
 * <p>Java class for purchaseNoticeAEDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="purchaseNoticeAEDataType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/223fz/purchase/1}purchaseNoticeNonISBaseType">
 *       &lt;sequence>
 *         &lt;element name="electronicPlaceInfo" type="{http://zakupki.gov.ru/223fz/types/1}electronicPlaceInfoType"/>
 *         &lt;element name="auctionTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="applExamPeriodTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="submissionCloseDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
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
@XmlType(name = "purchaseNoticeAEDataType", propOrder = {
    "electronicPlaceInfo",
    "auctionTime",
    "applExamPeriodTime",
    "submissionCloseDateTime",
    "publicationPlannedDate"
})
public class PurchaseNoticeAEDataType
    extends PurchaseNoticeNonISBaseType
{

    @XmlElement(required = true)
    protected ElectronicPlaceInfoType electronicPlaceInfo;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar auctionTime;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar applExamPeriodTime;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar submissionCloseDateTime;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar publicationPlannedDate;

    /**
     * Gets the value of the electronicPlaceInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ElectronicPlaceInfoType }
     *     
     */
    public ElectronicPlaceInfoType getElectronicPlaceInfo() {
        return electronicPlaceInfo;
    }

    /**
     * Sets the value of the electronicPlaceInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElectronicPlaceInfoType }
     *     
     */
    public void setElectronicPlaceInfo(ElectronicPlaceInfoType value) {
        this.electronicPlaceInfo = value;
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
     * Gets the value of the applExamPeriodTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getApplExamPeriodTime() {
        return applExamPeriodTime;
    }

    /**
     * Sets the value of the applExamPeriodTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setApplExamPeriodTime(XMLGregorianCalendar value) {
        this.applExamPeriodTime = value;
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
