//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.12.18 at 10:06:38 AM MSK 
//


package ru.gov.zakupki._223fz.purchase._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.gov.zakupki._223fz.types._1.ItemType;


/**
 * Данные позиции в пакете
 * 
 * <p>Java class for listInnovItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listInnovItemType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/223fz/types/1}itemType">
 *       &lt;sequence>
 *         &lt;element name="listInnovData" type="{http://zakupki.gov.ru/223fz/purchase/1}listInnovData"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listInnovItemType", propOrder = {
    "listInnovData"
})
public class ListInnovItemType
    extends ItemType
{

    @XmlElement(required = true)
    protected ListInnovData listInnovData;

    /**
     * Gets the value of the listInnovData property.
     * 
     * @return
     *     possible object is
     *     {@link ListInnovData }
     *     
     */
    public ListInnovData getListInnovData() {
        return listInnovData;
    }

    /**
     * Sets the value of the listInnovData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListInnovData }
     *     
     */
    public void setListInnovData(ListInnovData value) {
        this.listInnovData = value;
    }

}
