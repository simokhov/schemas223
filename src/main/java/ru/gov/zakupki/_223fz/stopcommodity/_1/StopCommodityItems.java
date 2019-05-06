//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.06 at 10:22:30 AM MSK 
//


package ru.gov.zakupki._223fz.stopcommodity._1;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.gov.zakupki._223fz.types._1.CurrencyType;


/**
 * Строка перечня
 * 
 * <p>Java class for stopCommodityItems complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="stopCommodityItems">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ordinalNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="contractSubject" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="maximumContractPrice" type="{http://zakupki.gov.ru/223fz/types/1}money2"/>
 *         &lt;element name="currency" type="{http://zakupki.gov.ru/223fz/types/1}currencyType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "stopCommodityItems", propOrder = {
    "ordinalNumber",
    "contractSubject",
    "maximumContractPrice",
    "currency"
})
public class StopCommodityItems {

    protected int ordinalNumber;
    @XmlElement(required = true)
    protected String contractSubject;
    @XmlElement(required = true)
    protected BigDecimal maximumContractPrice;
    @XmlElement(required = true)
    protected CurrencyType currency;

    /**
     * Gets the value of the ordinalNumber property.
     * 
     */
    public int getOrdinalNumber() {
        return ordinalNumber;
    }

    /**
     * Sets the value of the ordinalNumber property.
     * 
     */
    public void setOrdinalNumber(int value) {
        this.ordinalNumber = value;
    }

    /**
     * Gets the value of the contractSubject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractSubject() {
        return contractSubject;
    }

    /**
     * Sets the value of the contractSubject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractSubject(String value) {
        this.contractSubject = value;
    }

    /**
     * Gets the value of the maximumContractPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximumContractPrice() {
        return maximumContractPrice;
    }

    /**
     * Sets the value of the maximumContractPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaximumContractPrice(BigDecimal value) {
        this.maximumContractPrice = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyType }
     *     
     */
    public CurrencyType getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyType }
     *     
     */
    public void setCurrency(CurrencyType value) {
        this.currency = value;
    }

}
