//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.10 at 05:03:32 PM MSK 
//


package ru.gov.zakupki._223fz.purchaseplanadditionalposition._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.gov.zakupki._223fz.types._1.ItemType;


/**
 * Данные позиции в пакете
 * 
 * <p>Java class for purchasePlanAdditionalPositionItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="purchasePlanAdditionalPositionItemType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/223fz/types/1}itemType">
 *       &lt;sequence>
 *         &lt;element name="purchasePlanAdditionalPositionData" type="{http://zakupki.gov.ru/223fz/purchasePlanAdditionalPosition/1}purchasePlanAdditionalPositionDataType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "purchasePlanAdditionalPositionItemType", propOrder = {
    "purchasePlanAdditionalPositionData"
})
public class PurchasePlanAdditionalPositionItemType
    extends ItemType
{

    @XmlElement(required = true)
    protected PurchasePlanAdditionalPositionDataType purchasePlanAdditionalPositionData;

    /**
     * Gets the value of the purchasePlanAdditionalPositionData property.
     * 
     * @return
     *     possible object is
     *     {@link PurchasePlanAdditionalPositionDataType }
     *     
     */
    public PurchasePlanAdditionalPositionDataType getPurchasePlanAdditionalPositionData() {
        return purchasePlanAdditionalPositionData;
    }

    /**
     * Sets the value of the purchasePlanAdditionalPositionData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchasePlanAdditionalPositionDataType }
     *     
     */
    public void setPurchasePlanAdditionalPositionData(PurchasePlanAdditionalPositionDataType value) {
        this.purchasePlanAdditionalPositionData = value;
    }

}
