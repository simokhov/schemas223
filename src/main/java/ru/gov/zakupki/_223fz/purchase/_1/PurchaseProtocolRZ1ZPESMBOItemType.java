//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.06 at 10:27:43 AM MSK 
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
 * <p>Java class for purchaseProtocolRZ1ZPESMBOItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="purchaseProtocolRZ1ZPESMBOItemType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/223fz/types/1}itemType">
 *       &lt;sequence>
 *         &lt;element name="purchaseProtocolRZ1ZPESMBOData" type="{http://zakupki.gov.ru/223fz/purchase/1}purchaseProtocolRZ1ZPESMBODataType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "purchaseProtocolRZ1ZPESMBOItemType", propOrder = {
    "purchaseProtocolRZ1ZPESMBOData"
})
public class PurchaseProtocolRZ1ZPESMBOItemType
    extends ItemType
{

    @XmlElement(required = true)
    protected PurchaseProtocolRZ1ZPESMBODataType purchaseProtocolRZ1ZPESMBOData;

    /**
     * Gets the value of the purchaseProtocolRZ1ZPESMBOData property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseProtocolRZ1ZPESMBODataType }
     *     
     */
    public PurchaseProtocolRZ1ZPESMBODataType getPurchaseProtocolRZ1ZPESMBOData() {
        return purchaseProtocolRZ1ZPESMBOData;
    }

    /**
     * Sets the value of the purchaseProtocolRZ1ZPESMBOData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseProtocolRZ1ZPESMBODataType }
     *     
     */
    public void setPurchaseProtocolRZ1ZPESMBOData(PurchaseProtocolRZ1ZPESMBODataType value) {
        this.purchaseProtocolRZ1ZPESMBOData = value;
    }

}
