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
import ru.gov.zakupki._223fz.types._1.OkdpProductType;
import ru.gov.zakupki._223fz.types._1.OkvedProductType;


/**
 * Информация о товарах, работах, услугах
 * 
 * <p>Java class for applicationPositionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="applicationPositionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="okdp" type="{http://zakupki.gov.ru/223fz/types/1}okdpProductType" minOccurs="0"/>
 *         &lt;element name="okved" type="{http://zakupki.gov.ru/223fz/types/1}okvedProductType" minOccurs="0"/>
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
@XmlType(name = "applicationPositionType", propOrder = {
    "okdp",
    "okved",
    "additionalInfo"
})
public class ApplicationPositionType {

    protected OkdpProductType okdp;
    protected OkvedProductType okved;
    protected String additionalInfo;

    /**
     * Gets the value of the okdp property.
     * 
     * @return
     *     possible object is
     *     {@link OkdpProductType }
     *     
     */
    public OkdpProductType getOkdp() {
        return okdp;
    }

    /**
     * Sets the value of the okdp property.
     * 
     * @param value
     *     allowed object is
     *     {@link OkdpProductType }
     *     
     */
    public void setOkdp(OkdpProductType value) {
        this.okdp = value;
    }

    /**
     * Gets the value of the okved property.
     * 
     * @return
     *     possible object is
     *     {@link OkvedProductType }
     *     
     */
    public OkvedProductType getOkved() {
        return okved;
    }

    /**
     * Sets the value of the okved property.
     * 
     * @param value
     *     allowed object is
     *     {@link OkvedProductType }
     *     
     */
    public void setOkved(OkvedProductType value) {
        this.okved = value;
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
