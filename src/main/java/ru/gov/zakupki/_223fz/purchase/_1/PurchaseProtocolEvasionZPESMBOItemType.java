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
 * <p>Java class for purchaseProtocolEvasionZPESMBOItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="purchaseProtocolEvasionZPESMBOItemType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/223fz/types/1}itemType">
 *       &lt;sequence>
 *         &lt;element name="purchaseProtocolEvasionZPESMBOData">
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
@XmlType(name = "purchaseProtocolEvasionZPESMBOItemType", propOrder = {
    "purchaseProtocolEvasionZPESMBOData"
})
public class PurchaseProtocolEvasionZPESMBOItemType
    extends ItemType
{

    @XmlElement(required = true)
    protected PurchaseProtocolEvasionZPESMBOItemType.PurchaseProtocolEvasionZPESMBOData purchaseProtocolEvasionZPESMBOData;

    /**
     * Gets the value of the purchaseProtocolEvasionZPESMBOData property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseProtocolEvasionZPESMBOItemType.PurchaseProtocolEvasionZPESMBOData }
     *     
     */
    public PurchaseProtocolEvasionZPESMBOItemType.PurchaseProtocolEvasionZPESMBOData getPurchaseProtocolEvasionZPESMBOData() {
        return purchaseProtocolEvasionZPESMBOData;
    }

    /**
     * Sets the value of the purchaseProtocolEvasionZPESMBOData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseProtocolEvasionZPESMBOItemType.PurchaseProtocolEvasionZPESMBOData }
     *     
     */
    public void setPurchaseProtocolEvasionZPESMBOData(PurchaseProtocolEvasionZPESMBOItemType.PurchaseProtocolEvasionZPESMBOData value) {
        this.purchaseProtocolEvasionZPESMBOData = value;
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
    public static class PurchaseProtocolEvasionZPESMBOData
        extends PurchaseProtocolEvasionDataType
    {


    }

}
