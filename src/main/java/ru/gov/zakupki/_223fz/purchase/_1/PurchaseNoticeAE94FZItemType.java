//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.23 at 05:22:49 PM MSK 
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
 * <p>Java class for purchaseNoticeAE94FZItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="purchaseNoticeAE94FZItemType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/223fz/types/1}itemType">
 *       &lt;sequence>
 *         &lt;element name="purchaseNoticeAE94FZData" type="{http://zakupki.gov.ru/223fz/purchase/1}purchaseNoticeAE94FZDataType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "purchaseNoticeAE94FZItemType", propOrder = {
    "purchaseNoticeAE94FZData"
})
public class PurchaseNoticeAE94FZItemType
    extends ItemType
{

    @XmlElement(required = true)
    protected PurchaseNoticeAE94FZDataType purchaseNoticeAE94FZData;

    /**
     * Gets the value of the purchaseNoticeAE94FZData property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseNoticeAE94FZDataType }
     *     
     */
    public PurchaseNoticeAE94FZDataType getPurchaseNoticeAE94FZData() {
        return purchaseNoticeAE94FZData;
    }

    /**
     * Sets the value of the purchaseNoticeAE94FZData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseNoticeAE94FZDataType }
     *     
     */
    public void setPurchaseNoticeAE94FZData(PurchaseNoticeAE94FZDataType value) {
        this.purchaseNoticeAE94FZData = value;
    }

}
