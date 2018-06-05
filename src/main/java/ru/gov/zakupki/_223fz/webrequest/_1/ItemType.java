//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.05 at 04:39:36 PM MSK 
//


package ru.gov.zakupki._223fz.webrequest._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Описание элемента ответа
 * 
 * <p>Java class for itemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="itemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="guid" type="{http://zakupki.gov.ru/223fz/types/1}guidType"/>
 *         &lt;element name="regNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="10"/>
 *               &lt;maxLength value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="version" type="{http://zakupki.gov.ru/223fz/types/1}versionType" minOccurs="0"/>
 *         &lt;element name="publicationDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="status" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="F"/>
 *               &lt;enumeration value="P"/>
 *               &lt;enumeration value="M"/>
 *               &lt;enumeration value="I"/>
 *               &lt;enumeration value="C"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="planStatus" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="P"/>
 *               &lt;enumeration value="MP"/>
 *               &lt;enumeration value="M"/>
 *               &lt;enumeration value="CM"/>
 *               &lt;enumeration value="A"/>
 *               &lt;enumeration value="AM"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="placementPlanStatus" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="NP"/>
 *               &lt;enumeration value="PP"/>
 *               &lt;enumeration value="RP"/>
 *               &lt;enumeration value="P"/>
 *               &lt;enumeration value="I"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="complianceStatus" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="OA"/>
 *               &lt;enumeration value="OM"/>
 *               &lt;enumeration value="NNC"/>
 *               &lt;enumeration value="NC"/>
 *               &lt;enumeration value="PC"/>
 *               &lt;enumeration value="MNC"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="itemResult">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="OK"/>
 *               &lt;enumeration value="ERR_TOO_OLD"/>
 *               &lt;enumeration value="ERR_NOT_FOUND"/>
 *               &lt;enumeration value="ERR_NOT_PUB"/>
 *               &lt;enumeration value="ERR_OUTDATED"/>
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
@XmlType(name = "itemType", propOrder = {
    "guid",
    "regNumber",
    "version",
    "publicationDateTime",
    "status",
    "planStatus",
    "placementPlanStatus",
    "complianceStatus",
    "itemResult"
})
public class ItemType {

    @XmlElement(required = true)
    protected String guid;
    protected String regNumber;
    protected Long version;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar publicationDateTime;
    protected String status;
    protected String planStatus;
    protected String placementPlanStatus;
    protected String complianceStatus;
    @XmlElement(required = true)
    protected String itemResult;

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
     * Gets the value of the regNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegNumber() {
        return regNumber;
    }

    /**
     * Sets the value of the regNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegNumber(String value) {
        this.regNumber = value;
    }

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
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the planStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanStatus() {
        return planStatus;
    }

    /**
     * Sets the value of the planStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanStatus(String value) {
        this.planStatus = value;
    }

    /**
     * Gets the value of the placementPlanStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlacementPlanStatus() {
        return placementPlanStatus;
    }

    /**
     * Sets the value of the placementPlanStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlacementPlanStatus(String value) {
        this.placementPlanStatus = value;
    }

    /**
     * Gets the value of the complianceStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComplianceStatus() {
        return complianceStatus;
    }

    /**
     * Sets the value of the complianceStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComplianceStatus(String value) {
        this.complianceStatus = value;
    }

    /**
     * Gets the value of the itemResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemResult() {
        return itemResult;
    }

    /**
     * Sets the value of the itemResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemResult(String value) {
        this.itemResult = value;
    }

}
