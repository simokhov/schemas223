//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.11.07 at 09:43:41 AM MSK 
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
 * <p>Java class for purchaseProtocolRZ2ZPESMBOItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="purchaseProtocolRZ2ZPESMBOItemType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/223fz/types/1}itemType">
 *       &lt;sequence>
 *         &lt;element name="purchaseProtocolRZ2ZPESMBOData" type="{http://zakupki.gov.ru/223fz/purchase/1}purchaseProtocolRZ2ZPESMBODataType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "purchaseProtocolRZ2ZPESMBOItemType", propOrder = {
    "purchaseProtocolRZ2ZPESMBOData"
})
public class PurchaseProtocolRZ2ZPESMBOItemType
    extends ItemType
{

    @XmlElement(required = true)
    protected PurchaseProtocolRZ2ZPESMBODataType purchaseProtocolRZ2ZPESMBOData;

    /**
     * Gets the value of the purchaseProtocolRZ2ZPESMBOData property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseProtocolRZ2ZPESMBODataType }
     *     
     */
    public PurchaseProtocolRZ2ZPESMBODataType getPurchaseProtocolRZ2ZPESMBOData() {
        return purchaseProtocolRZ2ZPESMBOData;
    }

    /**
     * Sets the value of the purchaseProtocolRZ2ZPESMBOData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseProtocolRZ2ZPESMBODataType }
     *     
     */
    public void setPurchaseProtocolRZ2ZPESMBOData(PurchaseProtocolRZ2ZPESMBODataType value) {
        this.purchaseProtocolRZ2ZPESMBOData = value;
    }

}
