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
 * <p>Java class for purchaseProtocolRZ1KESMBOItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="purchaseProtocolRZ1KESMBOItemType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/223fz/types/1}itemType">
 *       &lt;sequence>
 *         &lt;element name="purchaseProtocolRZ1KESMBOData" type="{http://zakupki.gov.ru/223fz/purchase/1}purchaseProtocolRZ1KESMBODataType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "purchaseProtocolRZ1KESMBOItemType", propOrder = {
    "purchaseProtocolRZ1KESMBOData"
})
public class PurchaseProtocolRZ1KESMBOItemType
    extends ItemType
{

    @XmlElement(required = true)
    protected PurchaseProtocolRZ1KESMBODataType purchaseProtocolRZ1KESMBOData;

    /**
     * Gets the value of the purchaseProtocolRZ1KESMBOData property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseProtocolRZ1KESMBODataType }
     *     
     */
    public PurchaseProtocolRZ1KESMBODataType getPurchaseProtocolRZ1KESMBOData() {
        return purchaseProtocolRZ1KESMBOData;
    }

    /**
     * Sets the value of the purchaseProtocolRZ1KESMBOData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseProtocolRZ1KESMBODataType }
     *     
     */
    public void setPurchaseProtocolRZ1KESMBOData(PurchaseProtocolRZ1KESMBODataType value) {
        this.purchaseProtocolRZ1KESMBOData = value;
    }

}
