//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.23 at 05:25:21 PM MSK 
//


package ru.gov.zakupki._223fz.purchase._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Протокол проведения аукциона для открытого аукциона
 * 
 * <p>Java class for purchaseProtocolPAOADataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="purchaseProtocolPAOADataType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/223fz/purchase/1}purchaseProtocolBaseDataType">
 *       &lt;sequence>
 *         &lt;element name="procedureDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="procedurePlace">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="2000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="commissionNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="commissionName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="1000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="commissionResult" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="2000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="protocolRZRegistrationNumber" type="{http://zakupki.gov.ru/223fz/types/1}registrationNumber11-2Type"/>
 *         &lt;element name="protocolRZVersion" type="{http://zakupki.gov.ru/223fz/types/1}versionType"/>
 *         &lt;element name="lotApplicationsList" type="{http://zakupki.gov.ru/223fz/purchase/1}protocolPAOALotApplicationListType"/>
 *         &lt;element name="protocolSignDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "purchaseProtocolPAOADataType", propOrder = {
    "procedureDate",
    "procedurePlace",
    "commissionNumber",
    "commissionName",
    "commissionResult",
    "protocolRZRegistrationNumber",
    "protocolRZVersion",
    "lotApplicationsList",
    "protocolSignDate"
})
public class PurchaseProtocolPAOADataType
    extends PurchaseProtocolBaseDataType
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar procedureDate;
    @XmlElement(required = true)
    protected String procedurePlace;
    protected String commissionNumber;
    protected String commissionName;
    protected String commissionResult;
    @XmlElement(required = true)
    protected String protocolRZRegistrationNumber;
    protected long protocolRZVersion;
    @XmlElement(required = true)
    protected ProtocolPAOALotApplicationListType lotApplicationsList;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar protocolSignDate;

    /**
     * Gets the value of the procedureDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProcedureDate() {
        return procedureDate;
    }

    /**
     * Sets the value of the procedureDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProcedureDate(XMLGregorianCalendar value) {
        this.procedureDate = value;
    }

    /**
     * Gets the value of the procedurePlace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcedurePlace() {
        return procedurePlace;
    }

    /**
     * Sets the value of the procedurePlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcedurePlace(String value) {
        this.procedurePlace = value;
    }

    /**
     * Gets the value of the commissionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommissionNumber() {
        return commissionNumber;
    }

    /**
     * Sets the value of the commissionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommissionNumber(String value) {
        this.commissionNumber = value;
    }

    /**
     * Gets the value of the commissionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommissionName() {
        return commissionName;
    }

    /**
     * Sets the value of the commissionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommissionName(String value) {
        this.commissionName = value;
    }

    /**
     * Gets the value of the commissionResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommissionResult() {
        return commissionResult;
    }

    /**
     * Sets the value of the commissionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommissionResult(String value) {
        this.commissionResult = value;
    }

    /**
     * Gets the value of the protocolRZRegistrationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtocolRZRegistrationNumber() {
        return protocolRZRegistrationNumber;
    }

    /**
     * Sets the value of the protocolRZRegistrationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtocolRZRegistrationNumber(String value) {
        this.protocolRZRegistrationNumber = value;
    }

    /**
     * Gets the value of the protocolRZVersion property.
     * 
     */
    public long getProtocolRZVersion() {
        return protocolRZVersion;
    }

    /**
     * Sets the value of the protocolRZVersion property.
     * 
     */
    public void setProtocolRZVersion(long value) {
        this.protocolRZVersion = value;
    }

    /**
     * Gets the value of the lotApplicationsList property.
     * 
     * @return
     *     possible object is
     *     {@link ProtocolPAOALotApplicationListType }
     *     
     */
    public ProtocolPAOALotApplicationListType getLotApplicationsList() {
        return lotApplicationsList;
    }

    /**
     * Sets the value of the lotApplicationsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolPAOALotApplicationListType }
     *     
     */
    public void setLotApplicationsList(ProtocolPAOALotApplicationListType value) {
        this.lotApplicationsList = value;
    }

    /**
     * Gets the value of the protocolSignDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProtocolSignDate() {
        return protocolSignDate;
    }

    /**
     * Sets the value of the protocolSignDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProtocolSignDate(XMLGregorianCalendar value) {
        this.protocolSignDate = value;
    }

}
