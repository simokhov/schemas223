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
 * <p>Java class for purchaseProtocolPAAE94FZItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="purchaseProtocolPAAE94FZItemType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/223fz/types/1}itemType">
 *       &lt;sequence>
 *         &lt;element name="purchaseProtocolPAAE94FZData" type="{http://zakupki.gov.ru/223fz/purchase/1}purchaseProtocolPAAE94FZDataType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "purchaseProtocolPAAE94FZItemType", propOrder = {
    "purchaseProtocolPAAE94FZData"
})
public class PurchaseProtocolPAAE94FZItemType
    extends ItemType
{

    @XmlElement(required = true)
    protected PurchaseProtocolPAAE94FZDataType purchaseProtocolPAAE94FZData;

    /**
     * Gets the value of the purchaseProtocolPAAE94FZData property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseProtocolPAAE94FZDataType }
     *     
     */
    public PurchaseProtocolPAAE94FZDataType getPurchaseProtocolPAAE94FZData() {
        return purchaseProtocolPAAE94FZData;
    }

    /**
     * Sets the value of the purchaseProtocolPAAE94FZData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseProtocolPAAE94FZDataType }
     *     
     */
    public void setPurchaseProtocolPAAE94FZData(PurchaseProtocolPAAE94FZDataType value) {
        this.purchaseProtocolPAAE94FZData = value;
    }

}
