//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.23 at 05:09:56 PM MSK 
//


package ru.gov.zakupki._223fz.orderclauselist._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.gov.zakupki._223fz.types._1.ItemType;


/**
 * Данные позиции в пакете
 * 
 * <p>Java class for orderClauseItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="orderClauseItemType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/223fz/types/1}itemType">
 *       &lt;sequence>
 *         &lt;element name="orderClauseData" type="{http://zakupki.gov.ru/223fz/orderClauseList/1}orderClauseDataType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "orderClauseItemType", propOrder = {
    "orderClauseData"
})
public class OrderClauseItemType
    extends ItemType
{

    @XmlElement(required = true)
    protected OrderClauseDataType orderClauseData;

    /**
     * Gets the value of the orderClauseData property.
     * 
     * @return
     *     possible object is
     *     {@link OrderClauseDataType }
     *     
     */
    public OrderClauseDataType getOrderClauseData() {
        return orderClauseData;
    }

    /**
     * Sets the value of the orderClauseData property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderClauseDataType }
     *     
     */
    public void setOrderClauseData(OrderClauseDataType value) {
        this.orderClauseData = value;
    }

}
