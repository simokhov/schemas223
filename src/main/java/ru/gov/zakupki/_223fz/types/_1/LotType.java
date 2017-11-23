//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.23 at 05:19:45 PM MSK 
//


package ru.gov.zakupki._223fz.types._1;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Лот
 * 
 * <p>Java class for lotType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="lotType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="guid" type="{http://zakupki.gov.ru/223fz/types/1}guidType"/>
 *         &lt;element name="ordinalNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="lotEditEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="lotData" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="subject">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *                         &lt;maxLength value="3000"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;choice>
 *                     &lt;sequence>
 *                       &lt;element name="currency" type="{http://zakupki.gov.ru/223fz/types/1}currencyType"/>
 *                       &lt;element name="initialSum" type="{http://zakupki.gov.ru/223fz/types/1}money2"/>
 *                     &lt;/sequence>
 *                     &lt;element name="initialSumInfo">
 *                       &lt;simpleType>
 *                         &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *                           &lt;maxLength value="3000"/>
 *                         &lt;/restriction>
 *                       &lt;/simpleType>
 *                     &lt;/element>
 *                   &lt;/choice>
 *                   &lt;element name="orderPricing" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *                         &lt;maxLength value="2000"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="deliveryPlace" type="{http://zakupki.gov.ru/223fz/types/1}deliveryPlaceType" minOccurs="0"/>
 *                   &lt;element name="lotItems" type="{http://zakupki.gov.ru/223fz/types/1}lotItemListType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="deliveryPlaceIndication" type="{http://zakupki.gov.ru/223fz/types/1}deliveryPlaceIndicationType"/>
 *         &lt;element name="jointLotData" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="jointLot" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="lotCustomers" type="{http://zakupki.gov.ru/223fz/types/1}lotCustomerListType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="lotPlanInfo" type="{http://zakupki.gov.ru/223fz/types/1}lotPlanInfoType" minOccurs="0"/>
 *         &lt;element name="cancelled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="cancellation" type="{http://zakupki.gov.ru/223fz/types/1}lotCancellationInfoType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lotType", propOrder = {
    "guid",
    "ordinalNumber",
    "lotEditEnabled",
    "lotData",
    "deliveryPlaceIndication",
    "jointLotData",
    "lotPlanInfo",
    "cancelled",
    "cancellation"
})
@XmlSeeAlso({
    LotTypeIS.class
})
public class LotType {

    @XmlElement(required = true)
    protected String guid;
    protected int ordinalNumber;
    protected boolean lotEditEnabled;
    protected LotType.LotData lotData;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected DeliveryPlaceIndicationType deliveryPlaceIndication;
    protected LotType.JointLotData jointLotData;
    protected LotPlanInfoType lotPlanInfo;
    protected boolean cancelled;
    protected LotCancellationInfoType cancellation;

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
     * Gets the value of the lotEditEnabled property.
     * 
     */
    public boolean isLotEditEnabled() {
        return lotEditEnabled;
    }

    /**
     * Sets the value of the lotEditEnabled property.
     * 
     */
    public void setLotEditEnabled(boolean value) {
        this.lotEditEnabled = value;
    }

    /**
     * Gets the value of the lotData property.
     * 
     * @return
     *     possible object is
     *     {@link LotType.LotData }
     *     
     */
    public LotType.LotData getLotData() {
        return lotData;
    }

    /**
     * Sets the value of the lotData property.
     * 
     * @param value
     *     allowed object is
     *     {@link LotType.LotData }
     *     
     */
    public void setLotData(LotType.LotData value) {
        this.lotData = value;
    }

    /**
     * Gets the value of the deliveryPlaceIndication property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryPlaceIndicationType }
     *     
     */
    public DeliveryPlaceIndicationType getDeliveryPlaceIndication() {
        return deliveryPlaceIndication;
    }

    /**
     * Sets the value of the deliveryPlaceIndication property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryPlaceIndicationType }
     *     
     */
    public void setDeliveryPlaceIndication(DeliveryPlaceIndicationType value) {
        this.deliveryPlaceIndication = value;
    }

    /**
     * Gets the value of the jointLotData property.
     * 
     * @return
     *     possible object is
     *     {@link LotType.JointLotData }
     *     
     */
    public LotType.JointLotData getJointLotData() {
        return jointLotData;
    }

    /**
     * Sets the value of the jointLotData property.
     * 
     * @param value
     *     allowed object is
     *     {@link LotType.JointLotData }
     *     
     */
    public void setJointLotData(LotType.JointLotData value) {
        this.jointLotData = value;
    }

    /**
     * Gets the value of the lotPlanInfo property.
     * 
     * @return
     *     possible object is
     *     {@link LotPlanInfoType }
     *     
     */
    public LotPlanInfoType getLotPlanInfo() {
        return lotPlanInfo;
    }

    /**
     * Sets the value of the lotPlanInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link LotPlanInfoType }
     *     
     */
    public void setLotPlanInfo(LotPlanInfoType value) {
        this.lotPlanInfo = value;
    }

    /**
     * Gets the value of the cancelled property.
     * 
     */
    public boolean isCancelled() {
        return cancelled;
    }

    /**
     * Sets the value of the cancelled property.
     * 
     */
    public void setCancelled(boolean value) {
        this.cancelled = value;
    }

    /**
     * Gets the value of the cancellation property.
     * 
     * @return
     *     possible object is
     *     {@link LotCancellationInfoType }
     *     
     */
    public LotCancellationInfoType getCancellation() {
        return cancellation;
    }

    /**
     * Sets the value of the cancellation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LotCancellationInfoType }
     *     
     */
    public void setCancellation(LotCancellationInfoType value) {
        this.cancellation = value;
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
     *         &lt;element name="jointLot" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element name="lotCustomers" type="{http://zakupki.gov.ru/223fz/types/1}lotCustomerListType" minOccurs="0"/>
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
        "jointLot",
        "lotCustomers"
    })
    public static class JointLotData {

        protected boolean jointLot;
        protected LotCustomerListType lotCustomers;

        /**
         * Gets the value of the jointLot property.
         * 
         */
        public boolean isJointLot() {
            return jointLot;
        }

        /**
         * Sets the value of the jointLot property.
         * 
         */
        public void setJointLot(boolean value) {
            this.jointLot = value;
        }

        /**
         * Gets the value of the lotCustomers property.
         * 
         * @return
         *     possible object is
         *     {@link LotCustomerListType }
         *     
         */
        public LotCustomerListType getLotCustomers() {
            return lotCustomers;
        }

        /**
         * Sets the value of the lotCustomers property.
         * 
         * @param value
         *     allowed object is
         *     {@link LotCustomerListType }
         *     
         */
        public void setLotCustomers(LotCustomerListType value) {
            this.lotCustomers = value;
        }

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
     *         &lt;element name="subject">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
     *               &lt;maxLength value="3000"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;choice>
     *           &lt;sequence>
     *             &lt;element name="currency" type="{http://zakupki.gov.ru/223fz/types/1}currencyType"/>
     *             &lt;element name="initialSum" type="{http://zakupki.gov.ru/223fz/types/1}money2"/>
     *           &lt;/sequence>
     *           &lt;element name="initialSumInfo">
     *             &lt;simpleType>
     *               &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
     *                 &lt;maxLength value="3000"/>
     *               &lt;/restriction>
     *             &lt;/simpleType>
     *           &lt;/element>
     *         &lt;/choice>
     *         &lt;element name="orderPricing" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
     *               &lt;maxLength value="2000"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="deliveryPlace" type="{http://zakupki.gov.ru/223fz/types/1}deliveryPlaceType" minOccurs="0"/>
     *         &lt;element name="lotItems" type="{http://zakupki.gov.ru/223fz/types/1}lotItemListType" minOccurs="0"/>
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
        "subject",
        "currency",
        "initialSum",
        "initialSumInfo",
        "orderPricing",
        "deliveryPlace",
        "lotItems"
    })
    public static class LotData {

        @XmlElement(required = true)
        protected String subject;
        protected CurrencyType currency;
        protected BigDecimal initialSum;
        protected String initialSumInfo;
        protected String orderPricing;
        protected DeliveryPlaceType deliveryPlace;
        protected LotItemListType lotItems;

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
         * Gets the value of the currency property.
         * 
         * @return
         *     possible object is
         *     {@link CurrencyType }
         *     
         */
        public CurrencyType getCurrency() {
            return currency;
        }

        /**
         * Sets the value of the currency property.
         * 
         * @param value
         *     allowed object is
         *     {@link CurrencyType }
         *     
         */
        public void setCurrency(CurrencyType value) {
            this.currency = value;
        }

        /**
         * Gets the value of the initialSum property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getInitialSum() {
            return initialSum;
        }

        /**
         * Sets the value of the initialSum property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setInitialSum(BigDecimal value) {
            this.initialSum = value;
        }

        /**
         * Gets the value of the initialSumInfo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInitialSumInfo() {
            return initialSumInfo;
        }

        /**
         * Sets the value of the initialSumInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInitialSumInfo(String value) {
            this.initialSumInfo = value;
        }

        /**
         * Gets the value of the orderPricing property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrderPricing() {
            return orderPricing;
        }

        /**
         * Sets the value of the orderPricing property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrderPricing(String value) {
            this.orderPricing = value;
        }

        /**
         * Gets the value of the deliveryPlace property.
         * 
         * @return
         *     possible object is
         *     {@link DeliveryPlaceType }
         *     
         */
        public DeliveryPlaceType getDeliveryPlace() {
            return deliveryPlace;
        }

        /**
         * Sets the value of the deliveryPlace property.
         * 
         * @param value
         *     allowed object is
         *     {@link DeliveryPlaceType }
         *     
         */
        public void setDeliveryPlace(DeliveryPlaceType value) {
            this.deliveryPlace = value;
        }

        /**
         * Gets the value of the lotItems property.
         * 
         * @return
         *     possible object is
         *     {@link LotItemListType }
         *     
         */
        public LotItemListType getLotItems() {
            return lotItems;
        }

        /**
         * Sets the value of the lotItems property.
         * 
         * @param value
         *     allowed object is
         *     {@link LotItemListType }
         *     
         */
        public void setLotItems(LotItemListType value) {
            this.lotItems = value;
        }

    }

}
