//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.06 at 10:22:30 AM MSK 
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
 * <p>Java class for nsiOkdpItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="nsiOkdpItemType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/223fz/types/1}itemType">
 *       &lt;sequence>
 *         &lt;element name="nsiOkdpData" type="{http://zakupki.gov.ru/223fz/reference/1}nsiOkdpDataType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "nsiOkdpItemType", propOrder = {
    "nsiOkdpData"
})
public class NsiOkdpItemType
    extends ItemType
{

    @XmlElement(required = true)
    protected NsiOkdpDataType nsiOkdpData;

    /**
     * Gets the value of the nsiOkdpData property.
     * 
     * @return
     *     possible object is
     *     {@link NsiOkdpDataType }
     *     
     */
    public NsiOkdpDataType getNsiOkdpData() {
        return nsiOkdpData;
    }

    /**
     * Sets the value of the nsiOkdpData property.
     * 
     * @param value
     *     allowed object is
     *     {@link NsiOkdpDataType }
     *     
     */
    public void setNsiOkdpData(NsiOkdpDataType value) {
        this.nsiOkdpData = value;
    }

}
