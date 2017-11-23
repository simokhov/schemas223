//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.23 at 05:28:03 PM MSK 
//


package ru.gov.zakupki._223fz.detachedrights._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import ru.gov.zakupki._223fz.types._1.CustomerInfo2Type;


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
 *         &lt;element name="agency" type="{http://zakupki.gov.ru/223fz/types/1}customerInfo2Type"/>
 *         &lt;element name="purchasePlacing" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="ALLOWED"/>
 *               &lt;enumeration value="PROHIBITED"/>
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
    "agency",
    "purchasePlacing"
})
@XmlRootElement(name = "detachedRights")
public class DetachedRights {

    @XmlElement(required = true)
    protected CustomerInfo2Type agency;
    protected String purchasePlacing;

    /**
     * Gets the value of the agency property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerInfo2Type }
     *     
     */
    public CustomerInfo2Type getAgency() {
        return agency;
    }

    /**
     * Sets the value of the agency property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerInfo2Type }
     *     
     */
    public void setAgency(CustomerInfo2Type value) {
        this.agency = value;
    }

    /**
     * Gets the value of the purchasePlacing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchasePlacing() {
        return purchasePlacing;
    }

    /**
     * Sets the value of the purchasePlacing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchasePlacing(String value) {
        this.purchasePlacing = value;
    }

}
