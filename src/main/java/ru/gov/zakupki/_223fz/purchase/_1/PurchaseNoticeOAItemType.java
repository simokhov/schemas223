//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.23 at 05:17:31 PM MSK 
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
 * <p>Java class for purchaseNoticeOAItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="purchaseNoticeOAItemType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/223fz/types/1}itemType">
 *       &lt;sequence>
 *         &lt;element name="purchaseNoticeOAData" type="{http://zakupki.gov.ru/223fz/purchase/1}purchaseNoticeOADataType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "purchaseNoticeOAItemType", propOrder = {
    "purchaseNoticeOAData"
})
public class PurchaseNoticeOAItemType
    extends ItemType
{

    @XmlElement(required = true)
    protected PurchaseNoticeOADataType purchaseNoticeOAData;

    /**
     * Gets the value of the purchaseNoticeOAData property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseNoticeOADataType }
     *     
     */
    public PurchaseNoticeOADataType getPurchaseNoticeOAData() {
        return purchaseNoticeOAData;
    }

    /**
     * Sets the value of the purchaseNoticeOAData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseNoticeOADataType }
     *     
     */
    public void setPurchaseNoticeOAData(PurchaseNoticeOADataType value) {
        this.purchaseNoticeOAData = value;
    }

}
