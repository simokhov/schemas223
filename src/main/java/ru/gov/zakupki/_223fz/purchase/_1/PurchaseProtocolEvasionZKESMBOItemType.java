//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.11.07 at 09:42:20 AM MSK 
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
 * <p>Java class for purchaseProtocolEvasionZKESMBOItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="purchaseProtocolEvasionZKESMBOItemType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/223fz/types/1}itemType">
 *       &lt;sequence>
 *         &lt;element name="purchaseProtocolEvasionZKESMBOData">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://zakupki.gov.ru/223fz/purchase/1}purchaseProtocolEvasionDataType">
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
@XmlType(name = "purchaseProtocolEvasionZKESMBOItemType", propOrder = {
    "purchaseProtocolEvasionZKESMBOData"
})
public class PurchaseProtocolEvasionZKESMBOItemType
    extends ItemType
{

    @XmlElement(required = true)
    protected PurchaseProtocolEvasionZKESMBOItemType.PurchaseProtocolEvasionZKESMBOData purchaseProtocolEvasionZKESMBOData;

    /**
     * Gets the value of the purchaseProtocolEvasionZKESMBOData property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseProtocolEvasionZKESMBOItemType.PurchaseProtocolEvasionZKESMBOData }
     *     
     */
    public PurchaseProtocolEvasionZKESMBOItemType.PurchaseProtocolEvasionZKESMBOData getPurchaseProtocolEvasionZKESMBOData() {
        return purchaseProtocolEvasionZKESMBOData;
    }

    /**
     * Sets the value of the purchaseProtocolEvasionZKESMBOData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseProtocolEvasionZKESMBOItemType.PurchaseProtocolEvasionZKESMBOData }
     *     
     */
    public void setPurchaseProtocolEvasionZKESMBOData(PurchaseProtocolEvasionZKESMBOItemType.PurchaseProtocolEvasionZKESMBOData value) {
        this.purchaseProtocolEvasionZKESMBOData = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://zakupki.gov.ru/223fz/purchase/1}purchaseProtocolEvasionDataType">
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class PurchaseProtocolEvasionZKESMBOData
        extends PurchaseProtocolEvasionDataType
    {


    }

}
