//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.11.07 at 09:42:20 AM MSK 
//


package ru.gov.zakupki._223fz.purchase._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ru.gov.zakupki._223fz.types._1.ProtocolRequisitesType;


/**
 * Протокол рассмотрения вторых частей заявок для открытого аукциона в электронной форме
 * 
 * <p>Java class for purchaseProtocolRZ2AEDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="purchaseProtocolRZ2AEDataType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/223fz/purchase/1}purchaseProtocolBaseDataType">
 *       &lt;sequence>
 *         &lt;element name="procedureDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="protocolSignDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="protocolRZ1Requisites" type="{http://zakupki.gov.ru/223fz/types/1}protocolRequisitesType"/>
 *         &lt;element name="protocolPARequisites" type="{http://zakupki.gov.ru/223fz/types/1}protocolRequisitesType" minOccurs="0"/>
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
 *         &lt;element name="lotApplicationsList" type="{http://zakupki.gov.ru/223fz/purchase/1}protocolRZ2AELotApplicationListType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "purchaseProtocolRZ2AEDataType", propOrder = {
    "procedureDate",
    "protocolSignDate",
    "protocolRZ1Requisites",
    "protocolPARequisites",
    "commissionNumber",
    "commissionName",
    "commissionResult",
    "lotApplicationsList"
})
public class PurchaseProtocolRZ2AEDataType
    extends PurchaseProtocolBaseDataType
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar procedureDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar protocolSignDate;
    @XmlElement(required = true)
    protected ProtocolRequisitesType protocolRZ1Requisites;
    protected ProtocolRequisitesType protocolPARequisites;
    protected String commissionNumber;
    protected String commissionName;
    protected String commissionResult;
    @XmlElement(required = true)
    protected ProtocolRZ2AELotApplicationListType lotApplicationsList;

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
     * Gets the value of the protocolRZ1Requisites property.
     * 
     * @return
     *     possible object is
     *     {@link ProtocolRequisitesType }
     *     
     */
    public ProtocolRequisitesType getProtocolRZ1Requisites() {
        return protocolRZ1Requisites;
    }

    /**
     * Sets the value of the protocolRZ1Requisites property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolRequisitesType }
     *     
     */
    public void setProtocolRZ1Requisites(ProtocolRequisitesType value) {
        this.protocolRZ1Requisites = value;
    }

    /**
     * Gets the value of the protocolPARequisites property.
     * 
     * @return
     *     possible object is
     *     {@link ProtocolRequisitesType }
     *     
     */
    public ProtocolRequisitesType getProtocolPARequisites() {
        return protocolPARequisites;
    }

    /**
     * Sets the value of the protocolPARequisites property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolRequisitesType }
     *     
     */
    public void setProtocolPARequisites(ProtocolRequisitesType value) {
        this.protocolPARequisites = value;
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
     * Gets the value of the lotApplicationsList property.
     * 
     * @return
     *     possible object is
     *     {@link ProtocolRZ2AELotApplicationListType }
     *     
     */
    public ProtocolRZ2AELotApplicationListType getLotApplicationsList() {
        return lotApplicationsList;
    }

    /**
     * Sets the value of the lotApplicationsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolRZ2AELotApplicationListType }
     *     
     */
    public void setLotApplicationsList(ProtocolRZ2AELotApplicationListType value) {
        this.lotApplicationsList = value;
    }

}
