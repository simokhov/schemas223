//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.23 at 05:11:07 PM MSK 
//


package ru.gov.zakupki._223fz.purchaseplan._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Строки позиции плана
 * 
 * <p>Java class for purchasePlanDataItemsRowListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="purchasePlanDataItemsRowListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="purchasePlanRowItem" type="{http://zakupki.gov.ru/223fz/purchasePlan/1}purchasePlanDataItemRowType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "purchasePlanDataItemsRowListType", propOrder = {
    "purchasePlanRowItem"
})
public class PurchasePlanDataItemsRowListType {

    protected List<PurchasePlanDataItemRowType> purchasePlanRowItem;

    /**
     * Gets the value of the purchasePlanRowItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the purchasePlanRowItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPurchasePlanRowItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PurchasePlanDataItemRowType }
     * 
     * 
     */
    public List<PurchasePlanDataItemRowType> getPurchasePlanRowItem() {
        if (purchasePlanRowItem == null) {
            purchasePlanRowItem = new ArrayList<PurchasePlanDataItemRowType>();
        }
        return this.purchasePlanRowItem;
    }

}
