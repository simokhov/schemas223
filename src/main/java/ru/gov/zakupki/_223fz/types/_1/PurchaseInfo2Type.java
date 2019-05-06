//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.06 at 10:22:30 AM MSK 
//


package ru.gov.zakupki._223fz.types._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Информация о закупке и лоте
 * 
 * <p>Java class for purchaseInfo2Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="purchaseInfo2Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/223fz/types/1}purchaseInfoType">
 *       &lt;sequence>
 *         &lt;element name="lotData" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="guid" type="{http://zakupki.gov.ru/223fz/types/1}guidType" minOccurs="0"/>
 *                   &lt;choice minOccurs="0">
 *                     &lt;element name="ordinalNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                     &lt;element name="ordinalNumberText">
 *                       &lt;simpleType>
 *                         &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *                           &lt;maxLength value="100"/>
 *                         &lt;/restriction>
 *                       &lt;/simpleType>
 *                     &lt;/element>
 *                   &lt;/choice>
 *                   &lt;element name="lotName">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *                         &lt;maxLength value="2000"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
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
@XmlType(name = "purchaseInfo2Type", propOrder = {
    "lotData"
})
public class PurchaseInfo2Type
    extends PurchaseInfoType
{

    protected PurchaseInfo2Type.LotData lotData;

    /**
     * Gets the value of the lotData property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseInfo2Type.LotData }
     *     
     */
    public PurchaseInfo2Type.LotData getLotData() {
        return lotData;
    }

    /**
     * Sets the value of the lotData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseInfo2Type.LotData }
     *     
     */
    public void setLotData(PurchaseInfo2Type.LotData value) {
        this.lotData = value;
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
     *         &lt;element name="guid" type="{http://zakupki.gov.ru/223fz/types/1}guidType" minOccurs="0"/>
     *         &lt;choice minOccurs="0">
     *           &lt;element name="ordinalNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *           &lt;element name="ordinalNumberText">
     *             &lt;simpleType>
     *               &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
     *                 &lt;maxLength value="100"/>
     *               &lt;/restriction>
     *             &lt;/simpleType>
     *           &lt;/element>
     *         &lt;/choice>
     *         &lt;element name="lotName">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
     *               &lt;maxLength value="2000"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
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
        "guid",
        "ordinalNumber",
        "ordinalNumberText",
        "lotName"
    })
    public static class LotData {

        protected String guid;
        protected Integer ordinalNumber;
        protected String ordinalNumberText;
        @XmlElement(required = true)
        protected String lotName;

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
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getOrdinalNumber() {
            return ordinalNumber;
        }

        /**
         * Sets the value of the ordinalNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setOrdinalNumber(Integer value) {
            this.ordinalNumber = value;
        }

        /**
         * Gets the value of the ordinalNumberText property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrdinalNumberText() {
            return ordinalNumberText;
        }

        /**
         * Sets the value of the ordinalNumberText property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrdinalNumberText(String value) {
            this.ordinalNumberText = value;
        }

        /**
         * Gets the value of the lotName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLotName() {
            return lotName;
        }

        /**
         * Sets the value of the lotName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLotName(String value) {
            this.lotName = value;
        }

    }

}
