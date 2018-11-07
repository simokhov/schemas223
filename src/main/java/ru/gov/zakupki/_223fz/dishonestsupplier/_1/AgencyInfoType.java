//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.11.07 at 09:43:41 AM MSK 
//


package ru.gov.zakupki._223fz.dishonestsupplier._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import ru.gov.zakupki._223fz.types._1.CustomerMainInfoType;
import ru.gov.zakupki._223fz.types._1.ExtendedAddressType;


/**
 * Информация об организации
 * 
 * <p>Java class for agencyInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="agencyInfoType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/223fz/types/1}customerMainInfoType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="address" type="{http://zakupki.gov.ru/223fz/types/1}extendedAddressType"/>
 *           &lt;element name="shortAddress">
 *             &lt;simpleType>
 *               &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *                 &lt;maxLength value="2000"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *         &lt;/choice>
 *         &lt;element name="isCustomerDetached" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "agencyInfoType", propOrder = {
    "address",
    "shortAddress",
    "isCustomerDetached"
})
public class AgencyInfoType
    extends CustomerMainInfoType
{

    protected ExtendedAddressType address;
    protected String shortAddress;
    protected Boolean isCustomerDetached;

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedAddressType }
     *     
     */
    public ExtendedAddressType getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedAddressType }
     *     
     */
    public void setAddress(ExtendedAddressType value) {
        this.address = value;
    }

    /**
     * Gets the value of the shortAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortAddress() {
        return shortAddress;
    }

    /**
     * Sets the value of the shortAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortAddress(String value) {
        this.shortAddress = value;
    }

    /**
     * Gets the value of the isCustomerDetached property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCustomerDetached() {
        return isCustomerDetached;
    }

    /**
     * Sets the value of the isCustomerDetached property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCustomerDetached(Boolean value) {
        this.isCustomerDetached = value;
    }

}
