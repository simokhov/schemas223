//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.23 at 05:21:14 PM MSK 
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
 * <p>Java class for purchaseProtocolPAOAItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="purchaseProtocolPAOAItemType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/223fz/types/1}itemType">
 *       &lt;sequence>
 *         &lt;element name="purchaseProtocolPAOAData" type="{http://zakupki.gov.ru/223fz/purchase/1}purchaseProtocolPAOADataType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "purchaseProtocolPAOAItemType", propOrder = {
    "purchaseProtocolPAOAData"
})
public class PurchaseProtocolPAOAItemType
    extends ItemType
{

    @XmlElement(required = true)
    protected PurchaseProtocolPAOADataType purchaseProtocolPAOAData;

    /**
     * Gets the value of the purchaseProtocolPAOAData property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseProtocolPAOADataType }
     *     
     */
    public PurchaseProtocolPAOADataType getPurchaseProtocolPAOAData() {
        return purchaseProtocolPAOAData;
    }

    /**
     * Sets the value of the purchaseProtocolPAOAData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseProtocolPAOADataType }
     *     
     */
    public void setPurchaseProtocolPAOAData(PurchaseProtocolPAOADataType value) {
        this.purchaseProtocolPAOAData = value;
    }

}
