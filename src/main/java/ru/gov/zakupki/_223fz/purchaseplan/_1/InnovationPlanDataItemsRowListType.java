//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.23 at 05:20:27 PM MSK 
//


package ru.gov.zakupki._223fz.purchaseplan._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Строки позиции плана инновационной закупки
 * 
 * <p>Java class for innovationPlanDataItemsRowListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="innovationPlanDataItemsRowListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="innovationPlanRowItem" type="{http://zakupki.gov.ru/223fz/purchasePlan/1}innovationPlanDataItemRowType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "innovationPlanDataItemsRowListType", propOrder = {
    "innovationPlanRowItem"
})
public class InnovationPlanDataItemsRowListType {

    protected List<InnovationPlanDataItemRowType> innovationPlanRowItem;

    /**
     * Gets the value of the innovationPlanRowItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the innovationPlanRowItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInnovationPlanRowItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InnovationPlanDataItemRowType }
     * 
     * 
     */
    public List<InnovationPlanDataItemRowType> getInnovationPlanRowItem() {
        if (innovationPlanRowItem == null) {
            innovationPlanRowItem = new ArrayList<InnovationPlanDataItemRowType>();
        }
        return this.innovationPlanRowItem;
    }

}
