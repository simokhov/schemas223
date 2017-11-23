//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.23 at 05:17:00 PM MSK 
//


package ru.gov.zakupki._223fz.purchase._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Протокол проведения закупки у единственного поставщика
 * 
 * <p>Java class for purchaseProtocolPAEPDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="purchaseProtocolPAEPDataType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/223fz/purchase/1}purchaseProtocolBaseDataType">
 *       &lt;sequence>
 *         &lt;element name="protocolSignDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="lotApplicationsList" type="{http://zakupki.gov.ru/223fz/purchase/1}protocolPAEPLotApplicationListType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "purchaseProtocolPAEPDataType", propOrder = {
    "protocolSignDate",
    "lotApplicationsList"
})
public class PurchaseProtocolPAEPDataType
    extends PurchaseProtocolBaseDataType
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar protocolSignDate;
    @XmlElement(required = true)
    protected ProtocolPAEPLotApplicationListType lotApplicationsList;

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
     * Gets the value of the lotApplicationsList property.
     * 
     * @return
     *     possible object is
     *     {@link ProtocolPAEPLotApplicationListType }
     *     
     */
    public ProtocolPAEPLotApplicationListType getLotApplicationsList() {
        return lotApplicationsList;
    }

    /**
     * Sets the value of the lotApplicationsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolPAEPLotApplicationListType }
     *     
     */
    public void setLotApplicationsList(ProtocolPAEPLotApplicationListType value) {
        this.lotApplicationsList = value;
    }

}