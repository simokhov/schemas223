//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.12.18 at 10:06:38 AM MSK 
//


package ru.gov.zakupki._223fz.purchaseplan._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.gov.zakupki._223fz.types._1.ItemType;


/**
 * Данные позиции в пакете
 * 
 * <p>Java class for purchasePlanItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="purchasePlanItemType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/223fz/types/1}itemType">
 *       &lt;sequence>
 *         &lt;element name="purchasePlanData" type="{http://zakupki.gov.ru/223fz/purchasePlan/1}purchasePlanDataType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "purchasePlanItemType", propOrder = {
    "purchasePlanData"
})
public class PurchasePlanItemType
    extends ItemType
{

    @XmlElement(required = true)
    protected PurchasePlanDataType purchasePlanData;

    /**
     * Gets the value of the purchasePlanData property.
     * 
     * @return
     *     possible object is
     *     {@link PurchasePlanDataType }
     *     
     */
    public PurchasePlanDataType getPurchasePlanData() {
        return purchasePlanData;
    }

    /**
     * Sets the value of the purchasePlanData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchasePlanDataType }
     *     
     */
    public void setPurchasePlanData(PurchasePlanDataType value) {
        this.purchasePlanData = value;
    }

}
