//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.06 at 10:22:30 AM MSK 
//


package ru.gov.zakupki._223fz.dishonestsupplier._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.gov.zakupki._223fz.types._1.Okpd2ProductType;
import ru.gov.zakupki._223fz.types._1.Okved2ProductType;


/**
 * Информация о товаре, работе, услуге
 * 
 * <p>Java class for contractItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="contractItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="okpd2" type="{http://zakupki.gov.ru/223fz/types/1}okpd2ProductType"/>
 *         &lt;element name="okved2" type="{http://zakupki.gov.ru/223fz/types/1}okved2ProductType" minOccurs="0"/>
 *         &lt;element name="name" minOccurs="0">
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
@XmlType(name = "contractItemType", propOrder = {
    "okpd2",
    "okved2",
    "name"
})
public class ContractItemType {

    @XmlElement(required = true)
    protected Okpd2ProductType okpd2;
    protected Okved2ProductType okved2;
    protected String name;

    /**
     * Gets the value of the okpd2 property.
     * 
     * @return
     *     possible object is
     *     {@link Okpd2ProductType }
     *     
     */
    public Okpd2ProductType getOkpd2() {
        return okpd2;
    }

    /**
     * Sets the value of the okpd2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Okpd2ProductType }
     *     
     */
    public void setOkpd2(Okpd2ProductType value) {
        this.okpd2 = value;
    }

    /**
     * Gets the value of the okved2 property.
     * 
     * @return
     *     possible object is
     *     {@link Okved2ProductType }
     *     
     */
    public Okved2ProductType getOkved2() {
        return okved2;
    }

    /**
     * Sets the value of the okved2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Okved2ProductType }
     *     
     */
    public void setOkved2(Okved2ProductType value) {
        this.okved2 = value;
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
