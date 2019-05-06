//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.06 at 10:22:30 AM MSK 
//


package ru.gov.zakupki._223fz.webrequest._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import ru.gov.zakupki._223fz.types._1.PacketType;
import ru.gov.zakupki._223fz.types._1.ResultType;
import ru.gov.zakupki._223fz.types._1.ViolationListType;


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
 *                   &lt;element name="refguid" type="{http://zakupki.gov.ru/223fz/types/1}guidType" minOccurs="0"/>
 *                   &lt;element name="result" type="{http://zakupki.gov.ru/223fz/types/1}resultType"/>
 *                   &lt;element name="items" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="item" type="{http://zakupki.gov.ru/223fz/webRequest/1}itemType" maxOccurs="1000"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="violations" type="{http://zakupki.gov.ru/223fz/types/1}violationListType" minOccurs="0"/>
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
@XmlRootElement(name = "confirmationDataResponse")
public class ConfirmationDataResponse
    extends PacketType
{

    @XmlElement(required = true)
    protected ConfirmationDataResponse.Body body;

    /**
     * Gets the value of the body property.
     * 
     * @return
     *     possible object is
     *     {@link ConfirmationDataResponse.Body }
     *     
     */
    public ConfirmationDataResponse.Body getBody() {
        return body;
    }

    /**
     * Sets the value of the body property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfirmationDataResponse.Body }
     *     
     */
    public void setBody(ConfirmationDataResponse.Body value) {
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
     *         &lt;element name="refguid" type="{http://zakupki.gov.ru/223fz/types/1}guidType" minOccurs="0"/>
     *         &lt;element name="result" type="{http://zakupki.gov.ru/223fz/types/1}resultType"/>
     *         &lt;element name="items" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="item" type="{http://zakupki.gov.ru/223fz/webRequest/1}itemType" maxOccurs="1000"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="violations" type="{http://zakupki.gov.ru/223fz/types/1}violationListType" minOccurs="0"/>
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
        "refguid",
        "result",
        "items",
        "violations"
    })
    public static class Body {

        protected String refguid;
        @XmlElement(required = true)
        @XmlSchemaType(name = "string")
        protected ResultType result;
        protected ConfirmationDataResponse.Body.Items items;
        protected ViolationListType violations;

        /**
         * Gets the value of the refguid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRefguid() {
            return refguid;
        }

        /**
         * Sets the value of the refguid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRefguid(String value) {
            this.refguid = value;
        }

        /**
         * Gets the value of the result property.
         * 
         * @return
         *     possible object is
         *     {@link ResultType }
         *     
         */
        public ResultType getResult() {
            return result;
        }

        /**
         * Sets the value of the result property.
         * 
         * @param value
         *     allowed object is
         *     {@link ResultType }
         *     
         */
        public void setResult(ResultType value) {
            this.result = value;
        }

        /**
         * Gets the value of the items property.
         * 
         * @return
         *     possible object is
         *     {@link ConfirmationDataResponse.Body.Items }
         *     
         */
        public ConfirmationDataResponse.Body.Items getItems() {
            return items;
        }

        /**
         * Sets the value of the items property.
         * 
         * @param value
         *     allowed object is
         *     {@link ConfirmationDataResponse.Body.Items }
         *     
         */
        public void setItems(ConfirmationDataResponse.Body.Items value) {
            this.items = value;
        }

        /**
         * Gets the value of the violations property.
         * 
         * @return
         *     possible object is
         *     {@link ViolationListType }
         *     
         */
        public ViolationListType getViolations() {
            return violations;
        }

        /**
         * Sets the value of the violations property.
         * 
         * @param value
         *     allowed object is
         *     {@link ViolationListType }
         *     
         */
        public void setViolations(ViolationListType value) {
            this.violations = value;
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
         *         &lt;element name="item" type="{http://zakupki.gov.ru/223fz/webRequest/1}itemType" maxOccurs="1000"/>
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
        public static class Items {

            @XmlElement(required = true)
            protected List<ItemType> item;

            /**
             * Gets the value of the item property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the item property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getItem().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ItemType }
             * 
             * 
             */
            public List<ItemType> getItem() {
                if (item == null) {
                    item = new ArrayList<ItemType>();
                }
                return this.item;
            }

        }

    }

}
