//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.12.18 at 10:05:56 AM MSK 
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
 * <p>Java class for purchaseProtocolPAEPItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="purchaseProtocolPAEPItemType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/223fz/types/1}itemType">
 *       &lt;sequence>
 *         &lt;element name="purchaseProtocolPAEPData" type="{http://zakupki.gov.ru/223fz/purchase/1}purchaseProtocolPAEPDataType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "purchaseProtocolPAEPItemType", propOrder = {
    "purchaseProtocolPAEPData"
})
public class PurchaseProtocolPAEPItemType
    extends ItemType
{

    @XmlElement(required = true)
    protected PurchaseProtocolPAEPDataType purchaseProtocolPAEPData;

    /**
     * Gets the value of the purchaseProtocolPAEPData property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseProtocolPAEPDataType }
     *     
     */
    public PurchaseProtocolPAEPDataType getPurchaseProtocolPAEPData() {
        return purchaseProtocolPAEPData;
    }

    /**
     * Sets the value of the purchaseProtocolPAEPData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseProtocolPAEPDataType }
     *     
     */
    public void setPurchaseProtocolPAEPData(PurchaseProtocolPAEPDataType value) {
        this.purchaseProtocolPAEPData = value;
    }

}
