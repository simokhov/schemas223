//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.05 at 04:39:36 PM MSK 
//


package ru.gov.zakupki._223fz.types._1;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Значения критериев заявок
 * 
 * <p>Java class for applicationLotCriteriaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="applicationLotCriteriaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lotApplcationsCriteria">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="lotApplcationsCriteriaGuid" type="{http://zakupki.gov.ru/223fz/types/1}guidType"/>
 *                   &lt;element name="name">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *                         &lt;maxLength value="500"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="value" type="{http://zakupki.gov.ru/223fz/types/1}decimal20_2"/>
 *         &lt;element name="description" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="1000"/>
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
@XmlType(name = "applicationLotCriteriaType", propOrder = {
    "lotApplcationsCriteria",
    "value",
    "description"
})
public class ApplicationLotCriteriaType {

    @XmlElement(required = true)
    protected ApplicationLotCriteriaType.LotApplcationsCriteria lotApplcationsCriteria;
    @XmlElement(required = true)
    protected BigDecimal value;
    protected String description;

    /**
     * Gets the value of the lotApplcationsCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationLotCriteriaType.LotApplcationsCriteria }
     *     
     */
    public ApplicationLotCriteriaType.LotApplcationsCriteria getLotApplcationsCriteria() {
        return lotApplcationsCriteria;
    }

    /**
     * Sets the value of the lotApplcationsCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationLotCriteriaType.LotApplcationsCriteria }
     *     
     */
    public void setLotApplcationsCriteria(ApplicationLotCriteriaType.LotApplcationsCriteria value) {
        this.lotApplcationsCriteria = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValue(BigDecimal value) {
        this.value = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
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
     *         &lt;element name="lotApplcationsCriteriaGuid" type="{http://zakupki.gov.ru/223fz/types/1}guidType"/>
     *         &lt;element name="name">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
     *               &lt;maxLength value="500"/>
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
        "lotApplcationsCriteriaGuid",
        "name"
    })
    public static class LotApplcationsCriteria {

        @XmlElement(required = true)
        protected String lotApplcationsCriteriaGuid;
        @XmlElement(required = true)
        protected String name;

        /**
         * Gets the value of the lotApplcationsCriteriaGuid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLotApplcationsCriteriaGuid() {
            return lotApplcationsCriteriaGuid;
        }

        /**
         * Sets the value of the lotApplcationsCriteriaGuid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLotApplcationsCriteriaGuid(String value) {
            this.lotApplcationsCriteriaGuid = value;
        }

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

    }

}
