//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.23 at 05:24:12 PM MSK 
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
 * Протокол проведения аукциона для открытого аукциона в электронной форме (по 94ФЗ)
 * 
 * <p>Java class for purchaseProtocolPAAE94FZDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="purchaseProtocolPAAE94FZDataType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/223fz/purchase/1}purchaseProtocolBaseDataType">
 *       &lt;sequence>
 *         &lt;element name="auctionStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="auctionEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="protocolRZ1Requisites" type="{http://zakupki.gov.ru/223fz/types/1}protocolRequisitesType"/>
 *         &lt;element name="lotApplicationsList" type="{http://zakupki.gov.ru/223fz/purchase/1}protocolPAAE94FZLotApplicationListType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "purchaseProtocolPAAE94FZDataType", propOrder = {
    "auctionStartDate",
    "auctionEndDate",
    "protocolRZ1Requisites",
    "lotApplicationsList"
})
public class PurchaseProtocolPAAE94FZDataType
    extends PurchaseProtocolBaseDataType
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar auctionStartDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar auctionEndDate;
    @XmlElement(required = true)
    protected ProtocolRequisitesType protocolRZ1Requisites;
    @XmlElement(required = true)
    protected ProtocolPAAE94FZLotApplicationListType lotApplicationsList;

    /**
     * Gets the value of the auctionStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAuctionStartDate() {
        return auctionStartDate;
    }

    /**
     * Sets the value of the auctionStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAuctionStartDate(XMLGregorianCalendar value) {
        this.auctionStartDate = value;
    }

    /**
     * Gets the value of the auctionEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAuctionEndDate() {
        return auctionEndDate;
    }

    /**
     * Sets the value of the auctionEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAuctionEndDate(XMLGregorianCalendar value) {
        this.auctionEndDate = value;
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
     * Gets the value of the lotApplicationsList property.
     * 
     * @return
     *     possible object is
     *     {@link ProtocolPAAE94FZLotApplicationListType }
     *     
     */
    public ProtocolPAAE94FZLotApplicationListType getLotApplicationsList() {
        return lotApplicationsList;
    }

    /**
     * Sets the value of the lotApplicationsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolPAAE94FZLotApplicationListType }
     *     
     */
    public void setLotApplicationsList(ProtocolPAAE94FZLotApplicationListType value) {
        this.lotApplicationsList = value;
    }

}
