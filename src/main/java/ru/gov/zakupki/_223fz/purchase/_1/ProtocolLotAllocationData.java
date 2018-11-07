//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.11.07 at 09:42:20 AM MSK 
//


package ru.gov.zakupki._223fz.purchase._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ru.gov.zakupki._223fz.types._1.DocumentListType;
import ru.gov.zakupki._223fz.types._1.LotAllocationInfoType;
import ru.gov.zakupki._223fz.types._1.ProtocolRequisitesType2;
import ru.gov.zakupki._223fz.types._1.PurchaseInfoType;


/**
 * Сведения о выделении лотов в отдельный протокол
 * 
 * <p>Java class for protocolLotAllocationData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="protocolLotAllocationData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="guid" type="{http://zakupki.gov.ru/223fz/types/1}guidType"/>
 *         &lt;element name="urlEIS" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="3000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="urlVSRZ" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="3000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="createDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="publicationDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="purchaseInfo" type="{http://zakupki.gov.ru/223fz/types/1}purchaseInfoType"/>
 *         &lt;element name="protocolRequisites" type="{http://zakupki.gov.ru/223fz/types/1}protocolRequisitesType2"/>
 *         &lt;element name="allocatedLots">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="allocatedLot" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ordinalNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="subject">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *                                   &lt;maxLength value="2000"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="allocation" type="{http://zakupki.gov.ru/223fz/types/1}lotAllocationInfoType"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="attachments" type="{http://zakupki.gov.ru/223fz/types/1}documentListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "protocolLotAllocationData", propOrder = {
    "guid",
    "urlEIS",
    "urlVSRZ",
    "createDateTime",
    "publicationDateTime",
    "purchaseInfo",
    "protocolRequisites",
    "allocatedLots",
    "attachments"
})
public class ProtocolLotAllocationData {

    @XmlElement(required = true)
    protected String guid;
    protected String urlEIS;
    protected String urlVSRZ;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createDateTime;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar publicationDateTime;
    @XmlElement(required = true)
    protected PurchaseInfoType purchaseInfo;
    @XmlElement(required = true)
    protected ProtocolRequisitesType2 protocolRequisites;
    @XmlElement(required = true)
    protected ProtocolLotAllocationData.AllocatedLots allocatedLots;
    protected DocumentListType attachments;

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
     * Gets the value of the urlEIS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlEIS() {
        return urlEIS;
    }

    /**
     * Sets the value of the urlEIS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlEIS(String value) {
        this.urlEIS = value;
    }

    /**
     * Gets the value of the urlVSRZ property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlVSRZ() {
        return urlVSRZ;
    }

    /**
     * Sets the value of the urlVSRZ property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlVSRZ(String value) {
        this.urlVSRZ = value;
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
     * Gets the value of the purchaseInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseInfoType }
     *     
     */
    public PurchaseInfoType getPurchaseInfo() {
        return purchaseInfo;
    }

    /**
     * Sets the value of the purchaseInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseInfoType }
     *     
     */
    public void setPurchaseInfo(PurchaseInfoType value) {
        this.purchaseInfo = value;
    }

    /**
     * Gets the value of the protocolRequisites property.
     * 
     * @return
     *     possible object is
     *     {@link ProtocolRequisitesType2 }
     *     
     */
    public ProtocolRequisitesType2 getProtocolRequisites() {
        return protocolRequisites;
    }

    /**
     * Sets the value of the protocolRequisites property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolRequisitesType2 }
     *     
     */
    public void setProtocolRequisites(ProtocolRequisitesType2 value) {
        this.protocolRequisites = value;
    }

    /**
     * Gets the value of the allocatedLots property.
     * 
     * @return
     *     possible object is
     *     {@link ProtocolLotAllocationData.AllocatedLots }
     *     
     */
    public ProtocolLotAllocationData.AllocatedLots getAllocatedLots() {
        return allocatedLots;
    }

    /**
     * Sets the value of the allocatedLots property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolLotAllocationData.AllocatedLots }
     *     
     */
    public void setAllocatedLots(ProtocolLotAllocationData.AllocatedLots value) {
        this.allocatedLots = value;
    }

    /**
     * Gets the value of the attachments property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentListType }
     *     
     */
    public DocumentListType getAttachments() {
        return attachments;
    }

    /**
     * Sets the value of the attachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentListType }
     *     
     */
    public void setAttachments(DocumentListType value) {
        this.attachments = value;
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
     *         &lt;element name="allocatedLot" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ordinalNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="subject">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
     *                         &lt;maxLength value="2000"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="allocation" type="{http://zakupki.gov.ru/223fz/types/1}lotAllocationInfoType"/>
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
    @XmlType(name = "", propOrder = {
        "allocatedLot"
    })
    public static class AllocatedLots {

        @XmlElement(required = true)
        protected List<ProtocolLotAllocationData.AllocatedLots.AllocatedLot> allocatedLot;

        /**
         * Gets the value of the allocatedLot property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the allocatedLot property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAllocatedLot().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ProtocolLotAllocationData.AllocatedLots.AllocatedLot }
         * 
         * 
         */
        public List<ProtocolLotAllocationData.AllocatedLots.AllocatedLot> getAllocatedLot() {
            if (allocatedLot == null) {
                allocatedLot = new ArrayList<ProtocolLotAllocationData.AllocatedLots.AllocatedLot>();
            }
            return this.allocatedLot;
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
         *         &lt;element name="ordinalNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="subject">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
         *               &lt;maxLength value="2000"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="allocation" type="{http://zakupki.gov.ru/223fz/types/1}lotAllocationInfoType"/>
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
            "ordinalNumber",
            "subject",
            "allocation"
        })
        public static class AllocatedLot {

            protected int ordinalNumber;
            @XmlElement(required = true)
            protected String subject;
            @XmlElement(required = true)
            protected LotAllocationInfoType allocation;

            /**
             * Gets the value of the ordinalNumber property.
             * 
             */
            public int getOrdinalNumber() {
                return ordinalNumber;
            }

            /**
             * Sets the value of the ordinalNumber property.
             * 
             */
            public void setOrdinalNumber(int value) {
                this.ordinalNumber = value;
            }

            /**
             * Gets the value of the subject property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSubject() {
                return subject;
            }

            /**
             * Sets the value of the subject property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSubject(String value) {
                this.subject = value;
            }

            /**
             * Gets the value of the allocation property.
             * 
             * @return
             *     possible object is
             *     {@link LotAllocationInfoType }
             *     
             */
            public LotAllocationInfoType getAllocation() {
                return allocation;
            }

            /**
             * Sets the value of the allocation property.
             * 
             * @param value
             *     allowed object is
             *     {@link LotAllocationInfoType }
             *     
             */
            public void setAllocation(LotAllocationInfoType value) {
                this.allocation = value;
            }

        }

    }

}
