//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.23 at 05:22:02 PM MSK 
//


package ru.gov.zakupki._223fz.purchase._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import ru.gov.zakupki._223fz.types._1.LotListType;


/**
 * <p>Java class for purchaseNoticeNonISBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="purchaseNoticeNonISBaseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/223fz/purchase/1}purchaseNoticeDataBaseType">
 *       &lt;sequence>
 *         &lt;element name="lots" type="{http://zakupki.gov.ru/223fz/types/1}lotListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "purchaseNoticeNonISBaseType", propOrder = {
    "lots"
})
@XmlSeeAlso({
    PurchaseNoticeOKDataType.class,
    PurchaseNoticeZKDataType.class,
    PurchaseNoticeAEDataType.class,
    PurchaseNoticeEPDataType.class,
    PurchaseNoticeOADataType.class,
    PurchaseNoticeAE94FZDataType.class
})
public class PurchaseNoticeNonISBaseType
    extends PurchaseNoticeDataBaseType
{

    protected LotListType lots;

    /**
     * Gets the value of the lots property.
     * 
     * @return
     *     possible object is
     *     {@link LotListType }
     *     
     */
    public LotListType getLots() {
        return lots;
    }

    /**
     * Sets the value of the lots property.
     * 
     * @param value
     *     allowed object is
     *     {@link LotListType }
     *     
     */
    public void setLots(LotListType value) {
        this.lots = value;
    }

}
