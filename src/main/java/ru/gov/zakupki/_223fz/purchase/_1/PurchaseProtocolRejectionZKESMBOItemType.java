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
 * <p>Java class for purchaseProtocolRejectionZKESMBOItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="purchaseProtocolRejectionZKESMBOItemType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/223fz/types/1}itemType">
 *       &lt;sequence>
 *         &lt;element name="purchaseProtocolRejectionZKESMBOData">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://zakupki.gov.ru/223fz/purchase/1}purchaseProtocolRejectionDataType">
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "purchaseProtocolRejectionZKESMBOItemType", propOrder = {
    "purchaseProtocolRejectionZKESMBOData"
})
public class PurchaseProtocolRejectionZKESMBOItemType
    extends ItemType
{

    @XmlElement(required = true)
    protected PurchaseProtocolRejectionZKESMBOItemType.PurchaseProtocolRejectionZKESMBOData purchaseProtocolRejectionZKESMBOData;

    /**
     * Gets the value of the purchaseProtocolRejectionZKESMBOData property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseProtocolRejectionZKESMBOItemType.PurchaseProtocolRejectionZKESMBOData }
     *     
     */
    public PurchaseProtocolRejectionZKESMBOItemType.PurchaseProtocolRejectionZKESMBOData getPurchaseProtocolRejectionZKESMBOData() {
        return purchaseProtocolRejectionZKESMBOData;
    }

    /**
     * Sets the value of the purchaseProtocolRejectionZKESMBOData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseProtocolRejectionZKESMBOItemType.PurchaseProtocolRejectionZKESMBOData }
     *     
     */
    public void setPurchaseProtocolRejectionZKESMBOData(PurchaseProtocolRejectionZKESMBOItemType.PurchaseProtocolRejectionZKESMBOData value) {
        this.purchaseProtocolRejectionZKESMBOData = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://zakupki.gov.ru/223fz/purchase/1}purchaseProtocolRejectionDataType">
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class PurchaseProtocolRejectionZKESMBOData
        extends PurchaseProtocolRejectionDataType
    {


    }

}
