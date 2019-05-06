//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.06 at 10:22:30 AM MSK 
//


package ru.gov.zakupki._223fz.purchase._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Протокол проведения аукциона для открытого аукциона в электронной форме
 * 
 * <p>Java class for purchaseProtocolPAAEDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="purchaseProtocolPAAEDataType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/223fz/purchase/1}purchaseProtocolBaseDataType">
 *       &lt;sequence>
 *         &lt;element name="procedureDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="procedurePlace" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="2000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="protocolSignDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="commissionInfo" type="{http://zakupki.gov.ru/223fz/purchase/1}commissionInfoType" minOccurs="0"/>
 *         &lt;element name="protocolRZRegistrationNumber" type="{http://zakupki.gov.ru/223fz/types/1}registrationNumber11-2Type"/>
 *         &lt;element name="protocolRZVersion" type="{http://zakupki.gov.ru/223fz/types/1}versionType"/>
 *         &lt;element name="lotApplicationsList" type="{http://zakupki.gov.ru/223fz/purchase/1}protocolPAOALotApplicationListType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "purchaseProtocolPAAEDataType", propOrder = {
    "procedureDate",
    "procedurePlace",
    "protocolSignDate",
    "commissionInfo",
    "protocolRZRegistrationNumber",
    "protocolRZVersion",
    "lotApplicationsList"
})
public class PurchaseProtocolPAAEDataType
    extends PurchaseProtocolBaseDataType
{

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar procedureDate;
    protected String procedurePlace;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar protocolSignDate;
    protected CommissionInfoType commissionInfo;
    @XmlElement(required = true)
    protected String protocolRZRegistrationNumber;
    protected long protocolRZVersion;
    @XmlElement(required = true)
    protected ProtocolPAOALotApplicationListType lotApplicationsList;

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

    /**
     * Gets the value of the commissionInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CommissionInfoType }
     *     
     */
    public CommissionInfoType getCommissionInfo() {
        return commissionInfo;
    }

    /**
     * Sets the value of the commissionInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommissionInfoType }
     *     
     */
    public void setCommissionInfo(CommissionInfoType value) {
        this.commissionInfo = value;
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

}
