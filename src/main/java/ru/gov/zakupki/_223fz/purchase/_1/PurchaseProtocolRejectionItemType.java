//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.08.30 at 04:59:41 PM MSK 
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
 * <p>Java class for purchaseProtocolRejectionItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="purchaseProtocolRejectionItemType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/223fz/types/1}itemType">
 *       &lt;sequence>
 *         &lt;element name="purchaseProtocolRejectionData" type="{http://zakupki.gov.ru/223fz/purchase/1}purchaseProtocolRejectionDataType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "purchaseProtocolRejectionItemType", propOrder = {
    "purchaseProtocolRejectionData"
})
public class PurchaseProtocolRejectionItemType
    extends ItemType
{

    @XmlElement(required = true)
    protected PurchaseProtocolRejectionDataType purchaseProtocolRejectionData;

    /**
     * Gets the value of the purchaseProtocolRejectionData property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseProtocolRejectionDataType }
     *     
     */
    public PurchaseProtocolRejectionDataType getPurchaseProtocolRejectionData() {
        return purchaseProtocolRejectionData;
    }

    /**
     * Sets the value of the purchaseProtocolRejectionData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseProtocolRejectionDataType }
     *     
     */
    public void setPurchaseProtocolRejectionData(PurchaseProtocolRejectionDataType value) {
        this.purchaseProtocolRejectionData = value;
    }

}