//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.04.26 at 09:55:47 AM MSK 
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
 * <p>Java class for purchaseProtocolRZ2AEItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="purchaseProtocolRZ2AEItemType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/223fz/types/1}itemType">
 *       &lt;sequence>
 *         &lt;element name="purchaseProtocolRZ2AEData" type="{http://zakupki.gov.ru/223fz/purchase/1}purchaseProtocolRZ2AEDataType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "purchaseProtocolRZ2AEItemType", propOrder = {
    "purchaseProtocolRZ2AEData"
})
public class PurchaseProtocolRZ2AEItemType
    extends ItemType
{

    @XmlElement(required = true)
    protected PurchaseProtocolRZ2AEDataType purchaseProtocolRZ2AEData;

    /**
     * Gets the value of the purchaseProtocolRZ2AEData property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseProtocolRZ2AEDataType }
     *     
     */
    public PurchaseProtocolRZ2AEDataType getPurchaseProtocolRZ2AEData() {
        return purchaseProtocolRZ2AEData;
    }

    /**
     * Sets the value of the purchaseProtocolRZ2AEData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseProtocolRZ2AEDataType }
     *     
     */
    public void setPurchaseProtocolRZ2AEData(PurchaseProtocolRZ2AEDataType value) {
        this.purchaseProtocolRZ2AEData = value;
    }

}
