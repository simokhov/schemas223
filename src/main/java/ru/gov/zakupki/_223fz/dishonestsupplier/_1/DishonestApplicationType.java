//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.23 at 05:17:31 PM MSK 
//


package ru.gov.zakupki._223fz.dishonestsupplier._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Заявка
 * 
 * <p>Java class for dishonestApplicationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dishonestApplicationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="applicationNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="dishonestApplicationInfo" type="{http://zakupki.gov.ru/223fz/dishonestSupplier/1}dishonestApplicationInfoDataType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dishonestApplicationType", propOrder = {
    "applicationNumber",
    "dishonestApplicationInfo"
})
public class DishonestApplicationType {

    protected String applicationNumber;
    protected DishonestApplicationInfoDataType dishonestApplicationInfo;

    /**
     * Gets the value of the applicationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationNumber() {
        return applicationNumber;
    }

    /**
     * Sets the value of the applicationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationNumber(String value) {
        this.applicationNumber = value;
    }

    /**
     * Gets the value of the dishonestApplicationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DishonestApplicationInfoDataType }
     *     
     */
    public DishonestApplicationInfoDataType getDishonestApplicationInfo() {
        return dishonestApplicationInfo;
    }

    /**
     * Sets the value of the dishonestApplicationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DishonestApplicationInfoDataType }
     *     
     */
    public void setDishonestApplicationInfo(DishonestApplicationInfoDataType value) {
        this.dishonestApplicationInfo = value;
    }

}