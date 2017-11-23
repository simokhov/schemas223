//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.23 at 05:29:18 PM MSK 
//


package ru.gov.zakupki._223fz.purchase._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Извещение о закупке "Запрос котировок"
 * 
 * <p>Java class for purchaseNoticeZKDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="purchaseNoticeZKDataType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/223fz/purchase/1}purchaseNoticeNonISBaseType">
 *       &lt;sequence>
 *         &lt;element name="quotationExaminationTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="quotationExaminationPlace">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="2000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="quotationForm" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="2000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
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
@XmlType(name = "purchaseNoticeZKDataType", propOrder = {
    "quotationExaminationTime",
    "quotationExaminationPlace",
    "quotationForm",
    "submissionCloseDateTime",
    "publicationPlannedDate"
})
public class PurchaseNoticeZKDataType
    extends PurchaseNoticeNonISBaseType
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar quotationExaminationTime;
    @XmlElement(required = true)
    protected String quotationExaminationPlace;
    protected String quotationForm;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar submissionCloseDateTime;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar publicationPlannedDate;

    /**
     * Gets the value of the quotationExaminationTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getQuotationExaminationTime() {
        return quotationExaminationTime;
    }

    /**
     * Sets the value of the quotationExaminationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setQuotationExaminationTime(XMLGregorianCalendar value) {
        this.quotationExaminationTime = value;
    }

    /**
     * Gets the value of the quotationExaminationPlace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuotationExaminationPlace() {
        return quotationExaminationPlace;
    }

    /**
     * Sets the value of the quotationExaminationPlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuotationExaminationPlace(String value) {
        this.quotationExaminationPlace = value;
    }

    /**
     * Gets the value of the quotationForm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuotationForm() {
        return quotationForm;
    }

    /**
     * Sets the value of the quotationForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuotationForm(String value) {
        this.quotationForm = value;
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
