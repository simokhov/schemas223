//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.06 at 10:27:43 AM MSK 
//


package ru.gov.zakupki._223fz.exclusion._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Положение о закупке товаров, работ, услуг
 * 
 * <p>Java class for exclusionDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="exclusionDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="version" type="{http://zakupki.gov.ru/223fz/types/1}versionType" minOccurs="0"/>
 *         &lt;element name="publishDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="firstPublishDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="excAgencyName">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="200"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="excAgencyInn">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="excAgencyKpp">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="9"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="exclusionEntityTypeName">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="2000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="regNum">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="relatedDataPublishedDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="placerAgencyName">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="placerAgencyInn">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="placerAgencyKpp">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="9"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="baseForExclusionType">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="2000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="baseForExclusionName">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="2000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="orderAgencyName">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="orderAgencyInn">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="orderAgencyKpp">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="docNameBaseForExclusion">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="baseForExclusionDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="docNumBaseForExclusion">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="startConfirmDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="additionalInfo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "exclusionDataType", propOrder = {
    "version",
    "publishDate",
    "firstPublishDate",
    "excAgencyName",
    "excAgencyInn",
    "excAgencyKpp",
    "exclusionEntityTypeName",
    "regNum",
    "relatedDataPublishedDate",
    "placerAgencyName",
    "placerAgencyInn",
    "placerAgencyKpp",
    "baseForExclusionType",
    "baseForExclusionName",
    "orderAgencyName",
    "orderAgencyInn",
    "orderAgencyKpp",
    "docNameBaseForExclusion",
    "baseForExclusionDate",
    "docNumBaseForExclusion",
    "startConfirmDate",
    "additionalInfo"
})
public class ExclusionDataType {

    protected Long version;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar publishDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar firstPublishDate;
    @XmlElement(required = true)
    protected String excAgencyName;
    @XmlElement(required = true)
    protected String excAgencyInn;
    @XmlElement(required = true)
    protected String excAgencyKpp;
    @XmlElement(required = true)
    protected String exclusionEntityTypeName;
    @XmlElement(required = true)
    protected String regNum;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar relatedDataPublishedDate;
    @XmlElement(required = true)
    protected String placerAgencyName;
    @XmlElement(required = true)
    protected String placerAgencyInn;
    @XmlElement(required = true)
    protected String placerAgencyKpp;
    @XmlElement(required = true)
    protected String baseForExclusionType;
    @XmlElement(required = true)
    protected String baseForExclusionName;
    @XmlElement(required = true)
    protected String orderAgencyName;
    @XmlElement(required = true)
    protected String orderAgencyInn;
    @XmlElement(required = true)
    protected String orderAgencyKpp;
    @XmlElement(required = true)
    protected String docNameBaseForExclusion;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar baseForExclusionDate;
    @XmlElement(required = true)
    protected String docNumBaseForExclusion;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startConfirmDate;
    @XmlElement(required = true)
    protected String additionalInfo;

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
     * Gets the value of the firstPublishDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFirstPublishDate() {
        return firstPublishDate;
    }

    /**
     * Sets the value of the firstPublishDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFirstPublishDate(XMLGregorianCalendar value) {
        this.firstPublishDate = value;
    }

    /**
     * Gets the value of the excAgencyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExcAgencyName() {
        return excAgencyName;
    }

    /**
     * Sets the value of the excAgencyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExcAgencyName(String value) {
        this.excAgencyName = value;
    }

    /**
     * Gets the value of the excAgencyInn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExcAgencyInn() {
        return excAgencyInn;
    }

    /**
     * Sets the value of the excAgencyInn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExcAgencyInn(String value) {
        this.excAgencyInn = value;
    }

    /**
     * Gets the value of the excAgencyKpp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExcAgencyKpp() {
        return excAgencyKpp;
    }

    /**
     * Sets the value of the excAgencyKpp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExcAgencyKpp(String value) {
        this.excAgencyKpp = value;
    }

    /**
     * Gets the value of the exclusionEntityTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExclusionEntityTypeName() {
        return exclusionEntityTypeName;
    }

    /**
     * Sets the value of the exclusionEntityTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExclusionEntityTypeName(String value) {
        this.exclusionEntityTypeName = value;
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
     * Gets the value of the relatedDataPublishedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRelatedDataPublishedDate() {
        return relatedDataPublishedDate;
    }

    /**
     * Sets the value of the relatedDataPublishedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRelatedDataPublishedDate(XMLGregorianCalendar value) {
        this.relatedDataPublishedDate = value;
    }

    /**
     * Gets the value of the placerAgencyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlacerAgencyName() {
        return placerAgencyName;
    }

    /**
     * Sets the value of the placerAgencyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlacerAgencyName(String value) {
        this.placerAgencyName = value;
    }

    /**
     * Gets the value of the placerAgencyInn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlacerAgencyInn() {
        return placerAgencyInn;
    }

    /**
     * Sets the value of the placerAgencyInn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlacerAgencyInn(String value) {
        this.placerAgencyInn = value;
    }

    /**
     * Gets the value of the placerAgencyKpp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlacerAgencyKpp() {
        return placerAgencyKpp;
    }

    /**
     * Sets the value of the placerAgencyKpp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlacerAgencyKpp(String value) {
        this.placerAgencyKpp = value;
    }

    /**
     * Gets the value of the baseForExclusionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseForExclusionType() {
        return baseForExclusionType;
    }

    /**
     * Sets the value of the baseForExclusionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseForExclusionType(String value) {
        this.baseForExclusionType = value;
    }

    /**
     * Gets the value of the baseForExclusionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseForExclusionName() {
        return baseForExclusionName;
    }

    /**
     * Sets the value of the baseForExclusionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseForExclusionName(String value) {
        this.baseForExclusionName = value;
    }

    /**
     * Gets the value of the orderAgencyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderAgencyName() {
        return orderAgencyName;
    }

    /**
     * Sets the value of the orderAgencyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderAgencyName(String value) {
        this.orderAgencyName = value;
    }

    /**
     * Gets the value of the orderAgencyInn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderAgencyInn() {
        return orderAgencyInn;
    }

    /**
     * Sets the value of the orderAgencyInn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderAgencyInn(String value) {
        this.orderAgencyInn = value;
    }

    /**
     * Gets the value of the orderAgencyKpp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderAgencyKpp() {
        return orderAgencyKpp;
    }

    /**
     * Sets the value of the orderAgencyKpp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderAgencyKpp(String value) {
        this.orderAgencyKpp = value;
    }

    /**
     * Gets the value of the docNameBaseForExclusion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocNameBaseForExclusion() {
        return docNameBaseForExclusion;
    }

    /**
     * Sets the value of the docNameBaseForExclusion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocNameBaseForExclusion(String value) {
        this.docNameBaseForExclusion = value;
    }

    /**
     * Gets the value of the baseForExclusionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBaseForExclusionDate() {
        return baseForExclusionDate;
    }

    /**
     * Sets the value of the baseForExclusionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBaseForExclusionDate(XMLGregorianCalendar value) {
        this.baseForExclusionDate = value;
    }

    /**
     * Gets the value of the docNumBaseForExclusion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocNumBaseForExclusion() {
        return docNumBaseForExclusion;
    }

    /**
     * Sets the value of the docNumBaseForExclusion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocNumBaseForExclusion(String value) {
        this.docNumBaseForExclusion = value;
    }

    /**
     * Gets the value of the startConfirmDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartConfirmDate() {
        return startConfirmDate;
    }

    /**
     * Sets the value of the startConfirmDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartConfirmDate(XMLGregorianCalendar value) {
        this.startConfirmDate = value;
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

}
