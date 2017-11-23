//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.23 at 05:26:52 PM MSK 
//


package ru.gov.zakupki._223fz.purchase._1;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import ru.gov.zakupki._223fz.types._1.NonResidentInfoType;
import ru.gov.zakupki._223fz.types._1.SupplierMainInfoType;
import ru.gov.zakupki._223fz.types._1.WinnerIndication;


/**
 * Заявка в протоколе аукциона
 * 
 * <p>Java class for protocolPAOAApplicationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="protocolPAOAApplicationType">
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
 *         &lt;element name="notDishonest" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="provider" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;choice>
 *           &lt;element name="supplierInfo" type="{http://zakupki.gov.ru/223fz/types/1}supplierMainInfoType"/>
 *           &lt;element name="nonResidentInfo" type="{http://zakupki.gov.ru/223fz/types/1}nonResidentInfoType"/>
 *         &lt;/choice>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="lastPrice" type="{http://zakupki.gov.ru/223fz/types/1}money2"/>
 *           &lt;element name="lastPriceInfo">
 *             &lt;simpleType>
 *               &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *                 &lt;maxLength value="2000"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *         &lt;/choice>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="lastButOnePrice" type="{http://zakupki.gov.ru/223fz/types/1}money2"/>
 *           &lt;element name="lastButOnePriceInfo">
 *             &lt;simpleType>
 *               &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *                 &lt;maxLength value="2000"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *         &lt;/choice>
 *         &lt;element name="applicationRate" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="applicationPlace" type="{http://zakupki.gov.ru/223fz/types/1}winnerIndication" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "protocolPAOAApplicationType", propOrder = {
    "applicationNumber",
    "notDishonest",
    "provider",
    "supplierInfo",
    "nonResidentInfo",
    "lastPrice",
    "lastPriceInfo",
    "lastButOnePrice",
    "lastButOnePriceInfo",
    "applicationRate",
    "applicationPlace"
})
public class ProtocolPAOAApplicationType {

    @XmlElement(required = true)
    protected String applicationNumber;
    protected Boolean notDishonest;
    protected boolean provider;
    protected SupplierMainInfoType supplierInfo;
    protected NonResidentInfoType nonResidentInfo;
    protected BigDecimal lastPrice;
    protected String lastPriceInfo;
    protected BigDecimal lastButOnePrice;
    protected String lastButOnePriceInfo;
    protected Integer applicationRate;
    @XmlSchemaType(name = "string")
    protected WinnerIndication applicationPlace;

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
     * Gets the value of the notDishonest property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNotDishonest() {
        return notDishonest;
    }

    /**
     * Sets the value of the notDishonest property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNotDishonest(Boolean value) {
        this.notDishonest = value;
    }

    /**
     * Gets the value of the provider property.
     * 
     */
    public boolean isProvider() {
        return provider;
    }

    /**
     * Sets the value of the provider property.
     * 
     */
    public void setProvider(boolean value) {
        this.provider = value;
    }

    /**
     * Gets the value of the supplierInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SupplierMainInfoType }
     *     
     */
    public SupplierMainInfoType getSupplierInfo() {
        return supplierInfo;
    }

    /**
     * Sets the value of the supplierInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplierMainInfoType }
     *     
     */
    public void setSupplierInfo(SupplierMainInfoType value) {
        this.supplierInfo = value;
    }

    /**
     * Gets the value of the nonResidentInfo property.
     * 
     * @return
     *     possible object is
     *     {@link NonResidentInfoType }
     *     
     */
    public NonResidentInfoType getNonResidentInfo() {
        return nonResidentInfo;
    }

    /**
     * Sets the value of the nonResidentInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonResidentInfoType }
     *     
     */
    public void setNonResidentInfo(NonResidentInfoType value) {
        this.nonResidentInfo = value;
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
     * Gets the value of the lastButOnePrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLastButOnePrice() {
        return lastButOnePrice;
    }

    /**
     * Sets the value of the lastButOnePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLastButOnePrice(BigDecimal value) {
        this.lastButOnePrice = value;
    }

    /**
     * Gets the value of the lastButOnePriceInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastButOnePriceInfo() {
        return lastButOnePriceInfo;
    }

    /**
     * Sets the value of the lastButOnePriceInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastButOnePriceInfo(String value) {
        this.lastButOnePriceInfo = value;
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

    /**
     * Gets the value of the applicationPlace property.
     * 
     * @return
     *     possible object is
     *     {@link WinnerIndication }
     *     
     */
    public WinnerIndication getApplicationPlace() {
        return applicationPlace;
    }

    /**
     * Sets the value of the applicationPlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link WinnerIndication }
     *     
     */
    public void setApplicationPlace(WinnerIndication value) {
        this.applicationPlace = value;
    }

}
