//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.05 at 04:39:36 PM MSK 
//


package ru.gov.zakupki._223fz.purchaseplanproject._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.gov.zakupki._223fz.purchaseplan._1.PurchasePlanDataType;
import ru.gov.zakupki._223fz.types._1.ItemType;


/**
 * Данные позиции в пакете
 * 
 * <p>Java class for purchasePlanProjectItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="purchasePlanProjectItemType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/223fz/types/1}itemType">
 *       &lt;sequence>
 *         &lt;element name="purchasePlanProjectData" type="{http://zakupki.gov.ru/223fz/purchasePlan/1}purchasePlanDataType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "purchasePlanProjectItemType", propOrder = {
    "purchasePlanProjectData"
})
public class PurchasePlanProjectItemType
    extends ItemType
{

    @XmlElement(required = true)
    protected PurchasePlanDataType purchasePlanProjectData;

    /**
     * Gets the value of the purchasePlanProjectData property.
     * 
     * @return
     *     possible object is
     *     {@link PurchasePlanDataType }
     *     
     */
    public PurchasePlanDataType getPurchasePlanProjectData() {
        return purchasePlanProjectData;
    }

    /**
     * Sets the value of the purchasePlanProjectData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchasePlanDataType }
     *     
     */
    public void setPurchasePlanProjectData(PurchasePlanDataType value) {
        this.purchasePlanProjectData = value;
    }

}
