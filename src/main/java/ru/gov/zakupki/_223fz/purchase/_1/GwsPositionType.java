//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.11.07 at 09:42:20 AM MSK 
//


package ru.gov.zakupki._223fz.purchase._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import ru.gov.zakupki._223fz.types._1.OkdpProductType;
import ru.gov.zakupki._223fz.types._1.Okpd2ProductType;


/**
 * Позиция товаров, работ, услуг
 * 
 * <p>Java class for gwsPositionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gwsPositionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ordinalNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;choice>
 *           &lt;element name="okdp" type="{http://zakupki.gov.ru/223fz/types/1}okdpProductType"/>
 *           &lt;element name="okpd2" type="{http://zakupki.gov.ru/223fz/types/1}okpd2ProductType"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gwsPositionType", propOrder = {
    "ordinalNumber",
    "okdp",
    "okpd2"
})
public class GwsPositionType {

    protected int ordinalNumber;
    protected OkdpProductType okdp;
    protected Okpd2ProductType okpd2;

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

}
