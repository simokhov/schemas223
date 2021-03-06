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
import ru.gov.zakupki._223fz.types._1.AgencyStatusType;


/**
 * Информация о товарах, работах, услугах
 * 
 * <p>Java class for agencyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="agencyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="okfs" type="{http://zakupki.gov.ru/223fz/types/1}codeOkfsType" minOccurs="0"/>
 *         &lt;element name="okopf" type="{http://zakupki.gov.ru/223fz/types/1}codeOkopfType" minOccurs="0"/>
 *         &lt;element name="okogu" type="{http://zakupki.gov.ru/223fz/types/1}codeOkoguType" minOccurs="0"/>
 *         &lt;element name="okato" type="{http://zakupki.gov.ru/223fz/types/1}codeOkatoType" minOccurs="0"/>
 *         &lt;element name="oktmo" type="{http://zakupki.gov.ru/223fz/types/1}codeOktmoType" minOccurs="0"/>
 *         &lt;element name="okpo" type="{http://zakupki.gov.ru/223fz/types/1}codeOkpoType" minOccurs="0"/>
 *         &lt;element name="agencyAddress" type="{http://zakupki.gov.ru/223fz/dishonestSupplier/1}agencyAddressType" minOccurs="0"/>
 *         &lt;element name="spzCode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="inn" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kpp" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ogrn" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="pgmuCode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="createdAt" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="updatedAt" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="esiaUpdatedAt" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="registeredAt" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="fullAgencyName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="shortAgencyName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="500"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="email" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="phoneString" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="faxString" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="website" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="contactSecondName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="contactFirstName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="contactMiddleName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="additionalInfo" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="500"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="postalAddress" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="500"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="contactEmail" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="customer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="customerRepresentative" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="customerDetachedDepartment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="supervisor" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="rnpManager" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="undefined" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="operator" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="status" type="{http://zakupki.gov.ru/223fz/types/1}agencyStatusType" minOccurs="0"/>
 *         &lt;element name="hasAttachments" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="egrulId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="rfSubjectCode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="requisites" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="hasPpo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="test" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="integrationAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "agencyType", propOrder = {
    "okfs",
    "okopf",
    "okogu",
    "okato",
    "oktmo",
    "okpo",
    "agencyAddress",
    "spzCode",
    "inn",
    "kpp",
    "ogrn",
    "pgmuCode",
    "createdAt",
    "updatedAt",
    "esiaUpdatedAt",
    "registeredAt",
    "fullAgencyName",
    "shortAgencyName",
    "email",
    "phoneString",
    "faxString",
    "website",
    "contactSecondName",
    "contactFirstName",
    "contactMiddleName",
    "additionalInfo",
    "postalAddress",
    "contactEmail",
    "customer",
    "customerRepresentative",
    "customerDetachedDepartment",
    "supervisor",
    "rnpManager",
    "undefined",
    "operator",
    "status",
    "hasAttachments",
    "egrulId",
    "rfSubjectCode",
    "requisites",
    "hasPpo",
    "test",
    "integrationAllowed"
})
public class AgencyType {

    protected String okfs;
    protected String okopf;
    protected String okogu;
    protected String okato;
    protected String oktmo;
    protected String okpo;
    protected AgencyAddressType agencyAddress;
    protected String spzCode;
    protected String inn;
    protected String kpp;
    protected String ogrn;
    protected String pgmuCode;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdAt;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updatedAt;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar esiaUpdatedAt;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar registeredAt;
    protected String fullAgencyName;
    protected String shortAgencyName;
    protected String email;
    protected String phoneString;
    protected String faxString;
    protected String website;
    protected String contactSecondName;
    protected String contactFirstName;
    protected String contactMiddleName;
    protected String additionalInfo;
    protected String postalAddress;
    protected String contactEmail;
    protected Boolean customer;
    protected Boolean customerRepresentative;
    protected Boolean customerDetachedDepartment;
    protected Boolean supervisor;
    protected Boolean rnpManager;
    protected boolean undefined;
    protected boolean operator;
    @XmlSchemaType(name = "string")
    protected AgencyStatusType status;
    protected Boolean hasAttachments;
    protected long egrulId;
    protected String rfSubjectCode;
    protected String requisites;
    protected Boolean hasPpo;
    protected Boolean test;
    protected Boolean integrationAllowed;

    /**
     * Gets the value of the okfs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOkfs() {
        return okfs;
    }

    /**
     * Sets the value of the okfs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOkfs(String value) {
        this.okfs = value;
    }

    /**
     * Gets the value of the okopf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOkopf() {
        return okopf;
    }

    /**
     * Sets the value of the okopf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOkopf(String value) {
        this.okopf = value;
    }

    /**
     * Gets the value of the okogu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOkogu() {
        return okogu;
    }

    /**
     * Sets the value of the okogu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOkogu(String value) {
        this.okogu = value;
    }

    /**
     * Gets the value of the okato property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOkato() {
        return okato;
    }

    /**
     * Sets the value of the okato property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOkato(String value) {
        this.okato = value;
    }

    /**
     * Gets the value of the oktmo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOktmo() {
        return oktmo;
    }

    /**
     * Sets the value of the oktmo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOktmo(String value) {
        this.oktmo = value;
    }

    /**
     * Gets the value of the okpo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOkpo() {
        return okpo;
    }

    /**
     * Sets the value of the okpo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOkpo(String value) {
        this.okpo = value;
    }

    /**
     * Gets the value of the agencyAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AgencyAddressType }
     *     
     */
    public AgencyAddressType getAgencyAddress() {
        return agencyAddress;
    }

    /**
     * Sets the value of the agencyAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgencyAddressType }
     *     
     */
    public void setAgencyAddress(AgencyAddressType value) {
        this.agencyAddress = value;
    }

    /**
     * Gets the value of the spzCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpzCode() {
        return spzCode;
    }

    /**
     * Sets the value of the spzCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpzCode(String value) {
        this.spzCode = value;
    }

    /**
     * Gets the value of the inn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInn() {
        return inn;
    }

    /**
     * Sets the value of the inn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInn(String value) {
        this.inn = value;
    }

    /**
     * Gets the value of the kpp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKpp() {
        return kpp;
    }

    /**
     * Sets the value of the kpp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKpp(String value) {
        this.kpp = value;
    }

    /**
     * Gets the value of the ogrn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOgrn() {
        return ogrn;
    }

    /**
     * Sets the value of the ogrn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOgrn(String value) {
        this.ogrn = value;
    }

    /**
     * Gets the value of the pgmuCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPgmuCode() {
        return pgmuCode;
    }

    /**
     * Sets the value of the pgmuCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPgmuCode(String value) {
        this.pgmuCode = value;
    }

    /**
     * Gets the value of the createdAt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedAt() {
        return createdAt;
    }

    /**
     * Sets the value of the createdAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedAt(XMLGregorianCalendar value) {
        this.createdAt = value;
    }

    /**
     * Gets the value of the updatedAt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdatedAt() {
        return updatedAt;
    }

    /**
     * Sets the value of the updatedAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdatedAt(XMLGregorianCalendar value) {
        this.updatedAt = value;
    }

    /**
     * Gets the value of the esiaUpdatedAt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEsiaUpdatedAt() {
        return esiaUpdatedAt;
    }

    /**
     * Sets the value of the esiaUpdatedAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEsiaUpdatedAt(XMLGregorianCalendar value) {
        this.esiaUpdatedAt = value;
    }

    /**
     * Gets the value of the registeredAt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRegisteredAt() {
        return registeredAt;
    }

    /**
     * Sets the value of the registeredAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRegisteredAt(XMLGregorianCalendar value) {
        this.registeredAt = value;
    }

    /**
     * Gets the value of the fullAgencyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullAgencyName() {
        return fullAgencyName;
    }

    /**
     * Sets the value of the fullAgencyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullAgencyName(String value) {
        this.fullAgencyName = value;
    }

    /**
     * Gets the value of the shortAgencyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortAgencyName() {
        return shortAgencyName;
    }

    /**
     * Sets the value of the shortAgencyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortAgencyName(String value) {
        this.shortAgencyName = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the phoneString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneString() {
        return phoneString;
    }

    /**
     * Sets the value of the phoneString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneString(String value) {
        this.phoneString = value;
    }

    /**
     * Gets the value of the faxString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaxString() {
        return faxString;
    }

    /**
     * Sets the value of the faxString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaxString(String value) {
        this.faxString = value;
    }

    /**
     * Gets the value of the website property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebsite() {
        return website;
    }

    /**
     * Sets the value of the website property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebsite(String value) {
        this.website = value;
    }

    /**
     * Gets the value of the contactSecondName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactSecondName() {
        return contactSecondName;
    }

    /**
     * Sets the value of the contactSecondName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactSecondName(String value) {
        this.contactSecondName = value;
    }

    /**
     * Gets the value of the contactFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactFirstName() {
        return contactFirstName;
    }

    /**
     * Sets the value of the contactFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactFirstName(String value) {
        this.contactFirstName = value;
    }

    /**
     * Gets the value of the contactMiddleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactMiddleName() {
        return contactMiddleName;
    }

    /**
     * Sets the value of the contactMiddleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactMiddleName(String value) {
        this.contactMiddleName = value;
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

    /**
     * Gets the value of the postalAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalAddress() {
        return postalAddress;
    }

    /**
     * Sets the value of the postalAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalAddress(String value) {
        this.postalAddress = value;
    }

    /**
     * Gets the value of the contactEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactEmail() {
        return contactEmail;
    }

    /**
     * Sets the value of the contactEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactEmail(String value) {
        this.contactEmail = value;
    }

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCustomer(Boolean value) {
        this.customer = value;
    }

    /**
     * Gets the value of the customerRepresentative property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCustomerRepresentative() {
        return customerRepresentative;
    }

    /**
     * Sets the value of the customerRepresentative property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCustomerRepresentative(Boolean value) {
        this.customerRepresentative = value;
    }

    /**
     * Gets the value of the customerDetachedDepartment property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCustomerDetachedDepartment() {
        return customerDetachedDepartment;
    }

    /**
     * Sets the value of the customerDetachedDepartment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCustomerDetachedDepartment(Boolean value) {
        this.customerDetachedDepartment = value;
    }

    /**
     * Gets the value of the supervisor property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSupervisor() {
        return supervisor;
    }

    /**
     * Sets the value of the supervisor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSupervisor(Boolean value) {
        this.supervisor = value;
    }

    /**
     * Gets the value of the rnpManager property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRnpManager() {
        return rnpManager;
    }

    /**
     * Sets the value of the rnpManager property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRnpManager(Boolean value) {
        this.rnpManager = value;
    }

    /**
     * Gets the value of the undefined property.
     * 
     */
    public boolean isUndefined() {
        return undefined;
    }

    /**
     * Sets the value of the undefined property.
     * 
     */
    public void setUndefined(boolean value) {
        this.undefined = value;
    }

    /**
     * Gets the value of the operator property.
     * 
     */
    public boolean isOperator() {
        return operator;
    }

    /**
     * Sets the value of the operator property.
     * 
     */
    public void setOperator(boolean value) {
        this.operator = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link AgencyStatusType }
     *     
     */
    public AgencyStatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgencyStatusType }
     *     
     */
    public void setStatus(AgencyStatusType value) {
        this.status = value;
    }

    /**
     * Gets the value of the hasAttachments property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasAttachments() {
        return hasAttachments;
    }

    /**
     * Sets the value of the hasAttachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasAttachments(Boolean value) {
        this.hasAttachments = value;
    }

    /**
     * Gets the value of the egrulId property.
     * 
     */
    public long getEgrulId() {
        return egrulId;
    }

    /**
     * Sets the value of the egrulId property.
     * 
     */
    public void setEgrulId(long value) {
        this.egrulId = value;
    }

    /**
     * Gets the value of the rfSubjectCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRfSubjectCode() {
        return rfSubjectCode;
    }

    /**
     * Sets the value of the rfSubjectCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRfSubjectCode(String value) {
        this.rfSubjectCode = value;
    }

    /**
     * Gets the value of the requisites property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequisites() {
        return requisites;
    }

    /**
     * Sets the value of the requisites property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequisites(String value) {
        this.requisites = value;
    }

    /**
     * Gets the value of the hasPpo property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasPpo() {
        return hasPpo;
    }

    /**
     * Sets the value of the hasPpo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasPpo(Boolean value) {
        this.hasPpo = value;
    }

    /**
     * Gets the value of the test property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTest() {
        return test;
    }

    /**
     * Sets the value of the test property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTest(Boolean value) {
        this.test = value;
    }

    /**
     * Gets the value of the integrationAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIntegrationAllowed() {
        return integrationAllowed;
    }

    /**
     * Sets the value of the integrationAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIntegrationAllowed(Boolean value) {
        this.integrationAllowed = value;
    }

}
