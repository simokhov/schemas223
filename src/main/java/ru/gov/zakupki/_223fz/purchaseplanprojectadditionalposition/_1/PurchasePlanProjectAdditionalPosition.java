//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.23 at 05:25:55 PM MSK 
//


package ru.gov.zakupki._223fz.purchaseplanprojectadditionalposition._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import ru.gov.zakupki._223fz.types._1.PacketType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/223fz/types/1}packetType">
 *       &lt;sequence>
 *         &lt;element name="body">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="item" type="{http://zakupki.gov.ru/223fz/purchasePlanProjectAdditionalPosition/1}purchasePlanProjectAdditionalPositionItemType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "body"
})
@XmlRootElement(name = "purchasePlanProjectAdditionalPosition")
public class PurchasePlanProjectAdditionalPosition
    extends PacketType
{

    @XmlElement(required = true)
    protected PurchasePlanProjectAdditionalPosition.Body body;

    /**
     * Gets the value of the body property.
     * 
     * @return
     *     possible object is
     *     {@link PurchasePlanProjectAdditionalPosition.Body }
     *     
     */
    public PurchasePlanProjectAdditionalPosition.Body getBody() {
        return body;
    }

    /**
     * Sets the value of the body property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchasePlanProjectAdditionalPosition.Body }
     *     
     */
    public void setBody(PurchasePlanProjectAdditionalPosition.Body value) {
        this.body = value;
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
     *         &lt;element name="item" type="{http://zakupki.gov.ru/223fz/purchasePlanProjectAdditionalPosition/1}purchasePlanProjectAdditionalPositionItemType"/>
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
        "item"
    })
    public static class Body {

        @XmlElement(required = true)
        protected PurchasePlanProjectAdditionalPositionItemType item;

        /**
         * Gets the value of the item property.
         * 
         * @return
         *     possible object is
         *     {@link PurchasePlanProjectAdditionalPositionItemType }
         *     
         */
        public PurchasePlanProjectAdditionalPositionItemType getItem() {
            return item;
        }

        /**
         * Sets the value of the item property.
         * 
         * @param value
         *     allowed object is
         *     {@link PurchasePlanProjectAdditionalPositionItemType }
         *     
         */
        public void setItem(PurchasePlanProjectAdditionalPositionItemType value) {
            this.item = value;
        }

    }

}
