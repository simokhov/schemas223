//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.23 at 05:22:02 PM MSK 
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
 * <p>Java class for purchaseProtocolRZ1AEItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="purchaseProtocolRZ1AEItemType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/223fz/types/1}itemType">
 *       &lt;sequence>
 *         &lt;element name="purchaseProtocolRZ1AEData" type="{http://zakupki.gov.ru/223fz/purchase/1}purchaseProtocolRZ1AEDataType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "purchaseProtocolRZ1AEItemType", propOrder = {
    "purchaseProtocolRZ1AEData"
})
public class PurchaseProtocolRZ1AEItemType
    extends ItemType
{

    @XmlElement(required = true)
    protected PurchaseProtocolRZ1AEDataType purchaseProtocolRZ1AEData;

    /**
     * Gets the value of the purchaseProtocolRZ1AEData property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseProtocolRZ1AEDataType }
     *     
     */
    public PurchaseProtocolRZ1AEDataType getPurchaseProtocolRZ1AEData() {
        return purchaseProtocolRZ1AEData;
    }

    /**
     * Sets the value of the purchaseProtocolRZ1AEData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseProtocolRZ1AEDataType }
     *     
     */
    public void setPurchaseProtocolRZ1AEData(PurchaseProtocolRZ1AEDataType value) {
        this.purchaseProtocolRZ1AEData = value;
    }

}
