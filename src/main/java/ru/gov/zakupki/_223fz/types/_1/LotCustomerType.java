//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.23 at 05:15:39 PM MSK 
//


package ru.gov.zakupki._223fz.types._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Участник совместной закупки
 * 
 * <p>Java class for lotCustomerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="lotCustomerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="agencyName">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="agencyInn" type="{http://zakupki.gov.ru/223fz/types/1}innType"/>
 *         &lt;element name="agencyKpp" type="{http://zakupki.gov.ru/223fz/types/1}kppType"/>
 *         &lt;element name="agencyOgrn" type="{http://zakupki.gov.ru/223fz/types/1}ogrnType"/>
 *         &lt;element name="additionalInfo" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
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
@XmlType(name = "lotCustomerType", propOrder = {
    "agencyName",
    "agencyInn",
    "agencyKpp",
    "agencyOgrn",
    "additionalInfo"
})
public class LotCustomerType {

    @XmlElement(required = true)
    protected String agencyName;
    @XmlElement(required = true)
    protected String agencyInn;
    @XmlElement(required = true)
    protected String agencyKpp;
    @XmlElement(required = true)
    protected String agencyOgrn;
    protected String additionalInfo;

    /**
     * Gets the value of the agencyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyName() {
        return agencyName;
    }

    /**
     * Sets the value of the agencyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyName(String value) {
        this.agencyName = value;
    }

    /**
     * Gets the value of the agencyInn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyInn() {
        return agencyInn;
    }

    /**
     * Sets the value of the agencyInn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyInn(String value) {
        this.agencyInn = value;
    }

    /**
     * Gets the value of the agencyKpp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyKpp() {
        return agencyKpp;
    }

    /**
     * Sets the value of the agencyKpp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyKpp(String value) {
        this.agencyKpp = value;
    }

    /**
     * Gets the value of the agencyOgrn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyOgrn() {
        return agencyOgrn;
    }

    /**
     * Sets the value of the agencyOgrn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyOgrn(String value) {
        this.agencyOgrn = value;
    }

    /**
     * Gets the value of the additionalInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalInfo() {
        return additionalInfo;
    }

    /**
     * Sets the value of the additionalInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalInfo(String value) {
        this.additionalInfo = value;
    }

}
