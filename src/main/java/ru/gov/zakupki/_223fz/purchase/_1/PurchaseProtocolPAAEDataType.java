//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.23 at 05:28:03 PM MSK 
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
 *         &lt;element name="procedureDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
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
    "protocolRZRegistrationNumber",
    "protocolRZVersion",
    "lotApplicationsList"
})
public class PurchaseProtocolPAAEDataType
    extends PurchaseProtocolBaseDataType
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar procedureDate;
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
