//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.06 at 10:22:30 AM MSK 
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
 * <p>Java class for purchaseProtocolRZAEItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="purchaseProtocolRZAEItemType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/223fz/types/1}itemType">
 *       &lt;sequence>
 *         &lt;element name="purchaseProtocolRZAEData" type="{http://zakupki.gov.ru/223fz/purchase/1}purchaseProtocolRZAEDataType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "purchaseProtocolRZAEItemType", propOrder = {
    "purchaseProtocolRZAEData"
})
public class PurchaseProtocolRZAEItemType
    extends ItemType
{

    @XmlElement(required = true)
    protected PurchaseProtocolRZAEDataType purchaseProtocolRZAEData;

    /**
     * Gets the value of the purchaseProtocolRZAEData property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseProtocolRZAEDataType }
     *     
     */
    public PurchaseProtocolRZAEDataType getPurchaseProtocolRZAEData() {
        return purchaseProtocolRZAEData;
    }

    /**
     * Sets the value of the purchaseProtocolRZAEData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseProtocolRZAEDataType }
     *     
     */
    public void setPurchaseProtocolRZAEData(PurchaseProtocolRZAEDataType value) {
        this.purchaseProtocolRZAEData = value;
    }

}
