//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.23 at 05:17:31 PM MSK 
//


package ru.gov.zakupki._223fz.dishonestsupplier._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.gov.zakupki._223fz.types._1.ItemType;


/**
 * Данные позиции в пакете
 * 
 * <p>Java class for dishonestSupplierInfoItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dishonestSupplierInfoItemType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/223fz/types/1}itemType">
 *       &lt;sequence>
 *         &lt;element name="dishonestSupplierInfoData" type="{http://zakupki.gov.ru/223fz/dishonestSupplier/1}dishonestSupplierInfoDataType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dishonestSupplierInfoItemType", propOrder = {
    "dishonestSupplierInfoData"
})
public class DishonestSupplierInfoItemType
    extends ItemType
{

    @XmlElement(required = true)
    protected DishonestSupplierInfoDataType dishonestSupplierInfoData;

    /**
     * Gets the value of the dishonestSupplierInfoData property.
     * 
     * @return
     *     possible object is
     *     {@link DishonestSupplierInfoDataType }
     *     
     */
    public DishonestSupplierInfoDataType getDishonestSupplierInfoData() {
        return dishonestSupplierInfoData;
    }

    /**
     * Sets the value of the dishonestSupplierInfoData property.
     * 
     * @param value
     *     allowed object is
     *     {@link DishonestSupplierInfoDataType }
     *     
     */
    public void setDishonestSupplierInfoData(DishonestSupplierInfoDataType value) {
        this.dishonestSupplierInfoData = value;
    }

}
