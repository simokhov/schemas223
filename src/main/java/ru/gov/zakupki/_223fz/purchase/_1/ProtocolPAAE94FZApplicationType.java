//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.05 at 04:40:02 PM MSK 
//


package ru.gov.zakupki._223fz.purchase._1;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Заявка в протоколе открытого аукциона в электронной форме (по 94ФЗ)
 * 
 * <p>Java class for protocolPAAE94FZApplicationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="protocolPAAE94FZApplicationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="applicationNumber">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;choice>
 *           &lt;element name="lastPrice" type="{http://zakupki.gov.ru/223fz/types/1}money2" minOccurs="0"/>
 *           &lt;element name="lastPriceInfo" minOccurs="0">
 *             &lt;simpleType>
 *               &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *                 &lt;maxLength value="2000"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *         &lt;/choice>
 *         &lt;element name="applicationRate" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "protocolPAAE94FZApplicationType", propOrder = {
    "applicationNumber",
    "lastPrice",
    "lastPriceInfo",
    "applicationRate"
})
public class ProtocolPAAE94FZApplicationType {

    @XmlElement(required = true)
    protected String applicationNumber;
    protected BigDecimal lastPrice;
    protected String lastPriceInfo;
    protected Integer applicationRate;

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
     * Gets the value of the lastPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLastPrice() {
        return lastPrice;
    }

    /**
     * Sets the value of the lastPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLastPrice(BigDecimal value) {
        this.lastPrice = value;
    }

    /**
     * Gets the value of the lastPriceInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastPriceInfo() {
        return lastPriceInfo;
    }

    /**
     * Sets the value of the lastPriceInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastPriceInfo(String value) {
        this.lastPriceInfo = value;
    }

    /**
     * Gets the value of the applicationRate property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getApplicationRate() {
        return applicationRate;
    }

    /**
     * Sets the value of the applicationRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setApplicationRate(Integer value) {
        this.applicationRate = value;
    }

}
