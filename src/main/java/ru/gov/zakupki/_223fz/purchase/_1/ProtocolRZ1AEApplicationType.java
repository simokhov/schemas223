//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.10 at 05:03:32 PM MSK 
//


package ru.gov.zakupki._223fz.purchase._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ru.gov.zakupki._223fz.types._1.AcceptedType;


/**
 * Заявка открытого аукциона в электронной форме
 * 
 * <p>Java class for protocolRZ1AEApplicationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="protocolRZ1AEApplicationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="applicationNumber">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="applicationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="accepted" type="{http://zakupki.gov.ru/223fz/types/1}acceptedType" minOccurs="0"/>
 *         &lt;element name="rejectionReasonCode" type="{http://zakupki.gov.ru/223fz/purchase/1}rejectionReasonCodeType" minOccurs="0"/>
 *         &lt;element name="rejectionReason" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="1000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="appliedDocumentsList" type="{http://zakupki.gov.ru/223fz/purchase/1}appliedDocumentsListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "protocolRZ1AEApplicationType", propOrder = {
    "applicationNumber",
    "applicationDate",
    "accepted",
    "rejectionReasonCode",
    "rejectionReason",
    "appliedDocumentsList"
})
public class ProtocolRZ1AEApplicationType {

    @XmlElement(required = true)
    protected String applicationNumber;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar applicationDate;
    @XmlSchemaType(name = "string")
    protected AcceptedType accepted;
    @XmlSchemaType(name = "string")
    protected RejectionReasonCodeType rejectionReasonCode;
    protected String rejectionReason;
    protected AppliedDocumentsListType appliedDocumentsList;

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
     * Gets the value of the applicationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getApplicationDate() {
        return applicationDate;
    }

    /**
     * Sets the value of the applicationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setApplicationDate(XMLGregorianCalendar value) {
        this.applicationDate = value;
    }

    /**
     * Gets the value of the accepted property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptedType }
     *     
     */
    public AcceptedType getAccepted() {
        return accepted;
    }

    /**
     * Sets the value of the accepted property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptedType }
     *     
     */
    public void setAccepted(AcceptedType value) {
        this.accepted = value;
    }

    /**
     * Gets the value of the rejectionReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link RejectionReasonCodeType }
     *     
     */
    public RejectionReasonCodeType getRejectionReasonCode() {
        return rejectionReasonCode;
    }

    /**
     * Sets the value of the rejectionReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectionReasonCodeType }
     *     
     */
    public void setRejectionReasonCode(RejectionReasonCodeType value) {
        this.rejectionReasonCode = value;
    }

    /**
     * Gets the value of the rejectionReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRejectionReason() {
        return rejectionReason;
    }

    /**
     * Sets the value of the rejectionReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRejectionReason(String value) {
        this.rejectionReason = value;
    }

    /**
     * Gets the value of the appliedDocumentsList property.
     * 
     * @return
     *     possible object is
     *     {@link AppliedDocumentsListType }
     *     
     */
    public AppliedDocumentsListType getAppliedDocumentsList() {
        return appliedDocumentsList;
    }

    /**
     * Sets the value of the appliedDocumentsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppliedDocumentsListType }
     *     
     */
    public void setAppliedDocumentsList(AppliedDocumentsListType value) {
        this.appliedDocumentsList = value;
    }

}
