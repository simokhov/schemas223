//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.23 at 05:25:21 PM MSK 
//


package ru.gov.zakupki._223fz.reference._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.gov.zakupki._223fz.types._1.ItemType;


/**
 * Данные позиции в пакете
 * 
 * <p>Java class for nsiOktmoItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="nsiOktmoItemType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/223fz/types/1}itemType">
 *       &lt;sequence>
 *         &lt;element name="nsiOktmoData" type="{http://zakupki.gov.ru/223fz/reference/1}nsiOktmoDataType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "nsiOktmoItemType", propOrder = {
    "nsiOktmoData"
})
public class NsiOktmoItemType
    extends ItemType
{

    @XmlElement(required = true)
    protected NsiOktmoDataType nsiOktmoData;

    /**
     * Gets the value of the nsiOktmoData property.
     * 
     * @return
     *     possible object is
     *     {@link NsiOktmoDataType }
     *     
     */
    public NsiOktmoDataType getNsiOktmoData() {
        return nsiOktmoData;
    }

    /**
     * Sets the value of the nsiOktmoData property.
     * 
     * @param value
     *     allowed object is
     *     {@link NsiOktmoDataType }
     *     
     */
    public void setNsiOktmoData(NsiOktmoDataType value) {
        this.nsiOktmoData = value;
    }

}
