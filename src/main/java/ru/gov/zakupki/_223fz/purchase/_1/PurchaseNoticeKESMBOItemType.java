//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.05 at 04:40:02 PM MSK 
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
 * <p>Java class for purchaseNoticeKESMBOItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="purchaseNoticeKESMBOItemType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/223fz/types/1}itemType">
 *       &lt;sequence>
 *         &lt;element name="purchaseNoticeKESMBOData" type="{http://zakupki.gov.ru/223fz/purchase/1}purchaseNoticeKESMBODataType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "purchaseNoticeKESMBOItemType", propOrder = {
    "purchaseNoticeKESMBOData"
})
public class PurchaseNoticeKESMBOItemType
    extends ItemType
{

    @XmlElement(required = true)
    protected PurchaseNoticeKESMBODataType purchaseNoticeKESMBOData;

    /**
     * Gets the value of the purchaseNoticeKESMBOData property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseNoticeKESMBODataType }
     *     
     */
    public PurchaseNoticeKESMBODataType getPurchaseNoticeKESMBOData() {
        return purchaseNoticeKESMBOData;
    }

    /**
     * Sets the value of the purchaseNoticeKESMBOData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseNoticeKESMBODataType }
     *     
     */
    public void setPurchaseNoticeKESMBOData(PurchaseNoticeKESMBODataType value) {
        this.purchaseNoticeKESMBOData = value;
    }

}
