//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.23 at 05:17:00 PM MSK 
//


package ru.gov.zakupki._223fz.reference._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ru.gov.zakupki._223fz.types._1.CustomerMainInfoType;
import ru.gov.zakupki._223fz.types._1.NoticeTemplateType;


/**
 * Справочник способов закупки
 * 
 * <p>Java class for nsiPurchaseMethodDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="nsiPurchaseMethodDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="guid" type="{http://zakupki.gov.ru/223fz/types/1}guidType" minOccurs="0"/>
 *         &lt;element name="createDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="changeDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="startDateActive" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="endDateActive" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="businessStatus">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="801"/>
 *               &lt;enumeration value="866"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="name">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="orderNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="isElectronic" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="creator" type="{http://zakupki.gov.ru/223fz/types/1}customerMainInfoType"/>
 *         &lt;element name="extended" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="templates" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="template" type="{http://zakupki.gov.ru/223fz/types/1}noticeTemplateType" maxOccurs="unbounded"/>
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
@XmlType(name = "nsiPurchaseMethodDataType", propOrder = {
    "guid",
    "createDateTime",
    "changeDateTime",
    "startDateActive",
    "endDateActive",
    "businessStatus",
    "code",
    "name",
    "orderNumber",
    "isElectronic",
    "creator",
    "extended",
    "templates"
})
public class NsiPurchaseMethodDataType {

    protected String guid;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createDateTime;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar changeDateTime;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDateActive;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDateActive;
    @XmlElement(required = true)
    protected String businessStatus;
    protected long code;
    @XmlElement(required = true)
    protected String name;
    protected int orderNumber;
    @XmlElement(defaultValue = "false")
    protected boolean isElectronic;
    @XmlElement(required = true)
    protected CustomerMainInfoType creator;
    protected boolean extended;
    protected NsiPurchaseMethodDataType.Templates templates;

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
     * Gets the value of the changeDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getChangeDateTime() {
        return changeDateTime;
    }

    /**
     * Sets the value of the changeDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setChangeDateTime(XMLGregorianCalendar value) {
        this.changeDateTime = value;
    }

    /**
     * Gets the value of the startDateActive property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDateActive() {
        return startDateActive;
    }

    /**
     * Sets the value of the startDateActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDateActive(XMLGregorianCalendar value) {
        this.startDateActive = value;
    }

    /**
     * Gets the value of the endDateActive property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDateActive() {
        return endDateActive;
    }

    /**
     * Sets the value of the endDateActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDateActive(XMLGregorianCalendar value) {
        this.endDateActive = value;
    }

    /**
     * Gets the value of the businessStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessStatus() {
        return businessStatus;
    }

    /**
     * Sets the value of the businessStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessStatus(String value) {
        this.businessStatus = value;
    }

    /**
     * Gets the value of the code property.
     * 
     */
    public long getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     */
    public void setCode(long value) {
        this.code = value;
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
     * Gets the value of the orderNumber property.
     * 
     */
    public int getOrderNumber() {
        return orderNumber;
    }

    /**
     * Sets the value of the orderNumber property.
     * 
     */
    public void setOrderNumber(int value) {
        this.orderNumber = value;
    }

    /**
     * Gets the value of the isElectronic property.
     * 
     */
    public boolean isIsElectronic() {
        return isElectronic;
    }

    /**
     * Sets the value of the isElectronic property.
     * 
     */
    public void setIsElectronic(boolean value) {
        this.isElectronic = value;
    }

    /**
     * Gets the value of the creator property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerMainInfoType }
     *     
     */
    public CustomerMainInfoType getCreator() {
        return creator;
    }

    /**
     * Sets the value of the creator property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerMainInfoType }
     *     
     */
    public void setCreator(CustomerMainInfoType value) {
        this.creator = value;
    }

    /**
     * Gets the value of the extended property.
     * 
     */
    public boolean isExtended() {
        return extended;
    }

    /**
     * Sets the value of the extended property.
     * 
     */
    public void setExtended(boolean value) {
        this.extended = value;
    }

    /**
     * Gets the value of the templates property.
     * 
     * @return
     *     possible object is
     *     {@link NsiPurchaseMethodDataType.Templates }
     *     
     */
    public NsiPurchaseMethodDataType.Templates getTemplates() {
        return templates;
    }

    /**
     * Sets the value of the templates property.
     * 
     * @param value
     *     allowed object is
     *     {@link NsiPurchaseMethodDataType.Templates }
     *     
     */
    public void setTemplates(NsiPurchaseMethodDataType.Templates value) {
        this.templates = value;
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
     *         &lt;element name="template" type="{http://zakupki.gov.ru/223fz/types/1}noticeTemplateType" maxOccurs="unbounded"/>
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
        "template"
    })
    public static class Templates {

        @XmlElement(required = true)
        protected List<NoticeTemplateType> template;

        /**
         * Gets the value of the template property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the template property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTemplate().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link NoticeTemplateType }
         * 
         * 
         */
        public List<NoticeTemplateType> getTemplate() {
            if (template == null) {
                template = new ArrayList<NoticeTemplateType>();
            }
            return this.template;
        }

    }

}
