//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.23 at 05:27:28 PM MSK 
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
 * <p>Java class for nsiOkved2ItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="nsiOkved2ItemType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/223fz/types/1}itemType">
 *       &lt;sequence>
 *         &lt;element name="nsiOkved2Data" type="{http://zakupki.gov.ru/223fz/reference/1}nsiOkved2DataType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "nsiOkved2ItemType", propOrder = {
    "nsiOkved2Data"
})
public class NsiOkved2ItemType
    extends ItemType
{

    @XmlElement(required = true)
    protected NsiOkved2DataType nsiOkved2Data;

    /**
     * Gets the value of the nsiOkved2Data property.
     * 
     * @return
     *     possible object is
     *     {@link NsiOkved2DataType }
     *     
     */
    public NsiOkved2DataType getNsiOkved2Data() {
        return nsiOkved2Data;
    }

    /**
     * Sets the value of the nsiOkved2Data property.
     * 
     * @param value
     *     allowed object is
     *     {@link NsiOkved2DataType }
     *     
     */
    public void setNsiOkved2Data(NsiOkved2DataType value) {
        this.nsiOkved2Data = value;
    }

}
