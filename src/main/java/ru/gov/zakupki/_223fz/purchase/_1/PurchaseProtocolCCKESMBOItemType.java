//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.10 at 05:03:32 PM MSK 
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
 * <p>Java class for purchaseProtocolCCKESMBOItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="purchaseProtocolCCKESMBOItemType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/223fz/types/1}itemType">
 *       &lt;sequence>
 *         &lt;element name="purchaseProtocolCCKESMBOOData">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://zakupki.gov.ru/223fz/purchase/1}purchaseProtocolCCDataType">
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
@XmlType(name = "purchaseProtocolCCKESMBOItemType", propOrder = {
    "purchaseProtocolCCKESMBOOData"
})
public class PurchaseProtocolCCKESMBOItemType
    extends ItemType
{

    @XmlElement(required = true)
    protected PurchaseProtocolCCKESMBOItemType.PurchaseProtocolCCKESMBOOData purchaseProtocolCCKESMBOOData;

    /**
     * Gets the value of the purchaseProtocolCCKESMBOOData property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseProtocolCCKESMBOItemType.PurchaseProtocolCCKESMBOOData }
     *     
     */
    public PurchaseProtocolCCKESMBOItemType.PurchaseProtocolCCKESMBOOData getPurchaseProtocolCCKESMBOOData() {
        return purchaseProtocolCCKESMBOOData;
    }

    /**
     * Sets the value of the purchaseProtocolCCKESMBOOData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseProtocolCCKESMBOItemType.PurchaseProtocolCCKESMBOOData }
     *     
     */
    public void setPurchaseProtocolCCKESMBOOData(PurchaseProtocolCCKESMBOItemType.PurchaseProtocolCCKESMBOOData value) {
        this.purchaseProtocolCCKESMBOOData = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://zakupki.gov.ru/223fz/purchase/1}purchaseProtocolCCDataType">
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class PurchaseProtocolCCKESMBOOData
        extends PurchaseProtocolCCDataType
    {


    }

}
