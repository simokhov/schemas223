//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.23 at 05:17:31 PM MSK 
//


package ru.gov.zakupki._223fz.dishonestsupplier._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Информация о закупке
 * 
 * <p>Java class for purchaseInfoDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="purchaseInfoDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="purchaseInfo" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="purchaseDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="purchaseResultDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="purchaseRejectionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="documentRequisites" type="{http://zakupki.gov.ru/223fz/dishonestSupplier/1}documentRequisitesType" minOccurs="0"/>
 *         &lt;element name="lotInfo" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="regNum" type="{http://zakupki.gov.ru/223fz/types/1}registrationNumber11Type" minOccurs="0"/>
 *         &lt;element name="purchaseMethodType" type="{http://zakupki.gov.ru/223fz/dishonestSupplier/1}purchaseMethodType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "purchaseInfoDataType", propOrder = {
    "purchaseInfo",
    "purchaseDate",
    "purchaseResultDate",
    "purchaseRejectionDate",
    "documentRequisites",
    "lotInfo",
    "regNum",
    "purchaseMethodType"
})
public class PurchaseInfoDataType {

    protected String purchaseInfo;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar purchaseDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar purchaseResultDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar purchaseRejectionDate;
    protected DocumentRequisitesType documentRequisites;
    protected String lotInfo;
    protected String regNum;
    @XmlSchemaType(name = "string")
    protected PurchaseMethodType purchaseMethodType;

    /**
     * Gets the value of the purchaseInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchaseInfo() {
        return purchaseInfo;
    }

    /**
     * Sets the value of the purchaseInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchaseInfo(String value) {
        this.purchaseInfo = value;
    }

    /**
     * Gets the value of the purchaseDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPurchaseDate() {
        return purchaseDate;
    }

    /**
     * Sets the value of the purchaseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPurchaseDate(XMLGregorianCalendar value) {
        this.purchaseDate = value;
    }

    /**
     * Gets the value of the purchaseResultDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPurchaseResultDate() {
        return purchaseResultDate;
    }

    /**
     * Sets the value of the purchaseResultDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPurchaseResultDate(XMLGregorianCalendar value) {
        this.purchaseResultDate = value;
    }

    /**
     * Gets the value of the purchaseRejectionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPurchaseRejectionDate() {
        return purchaseRejectionDate;
    }

    /**
     * Sets the value of the purchaseRejectionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPurchaseRejectionDate(XMLGregorianCalendar value) {
        this.purchaseRejectionDate = value;
    }

    /**
     * Gets the value of the documentRequisites property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentRequisitesType }
     *     
     */
    public DocumentRequisitesType getDocumentRequisites() {
        return documentRequisites;
    }

    /**
     * Sets the value of the documentRequisites property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentRequisitesType }
     *     
     */
    public void setDocumentRequisites(DocumentRequisitesType value) {
        this.documentRequisites = value;
    }

    /**
     * Gets the value of the lotInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLotInfo() {
        return lotInfo;
    }

    /**
     * Sets the value of the lotInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLotInfo(String value) {
        this.lotInfo = value;
    }

    /**
     * Gets the value of the regNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegNum() {
        return regNum;
    }

    /**
     * Sets the value of the regNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegNum(String value) {
        this.regNum = value;
    }

    /**
     * Gets the value of the purchaseMethodType property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseMethodType }
     *     
     */
    public PurchaseMethodType getPurchaseMethodType() {
        return purchaseMethodType;
    }

    /**
     * Sets the value of the purchaseMethodType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseMethodType }
     *     
     */
    public void setPurchaseMethodType(PurchaseMethodType value) {
        this.purchaseMethodType = value;
    }

}
