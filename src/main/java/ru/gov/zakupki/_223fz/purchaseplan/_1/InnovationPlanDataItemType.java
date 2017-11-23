//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.23 at 05:22:02 PM MSK 
//


package ru.gov.zakupki._223fz.purchaseplan._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Позиция плана инновационной закупки
 * 
 * <p>Java class for innovationPlanDataItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="innovationPlanDataItemType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/223fz/purchasePlan/1}basePlanDataItemType">
 *       &lt;sequence>
 *         &lt;element name="purchasePeriodYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="innovationPlanDataItemRows" type="{http://zakupki.gov.ru/223fz/purchasePlan/1}innovationPlanDataItemsRowListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "innovationPlanDataItemType", propOrder = {
    "purchasePeriodYear",
    "innovationPlanDataItemRows"
})
public class InnovationPlanDataItemType
    extends BasePlanDataItemType
{

    protected int purchasePeriodYear;
    protected InnovationPlanDataItemsRowListType innovationPlanDataItemRows;

    /**
     * Gets the value of the purchasePeriodYear property.
     * 
     */
    public int getPurchasePeriodYear() {
        return purchasePeriodYear;
    }

    /**
     * Sets the value of the purchasePeriodYear property.
     * 
     */
    public void setPurchasePeriodYear(int value) {
        this.purchasePeriodYear = value;
    }

    /**
     * Gets the value of the innovationPlanDataItemRows property.
     * 
     * @return
     *     possible object is
     *     {@link InnovationPlanDataItemsRowListType }
     *     
     */
    public InnovationPlanDataItemsRowListType getInnovationPlanDataItemRows() {
        return innovationPlanDataItemRows;
    }

    /**
     * Sets the value of the innovationPlanDataItemRows property.
     * 
     * @param value
     *     allowed object is
     *     {@link InnovationPlanDataItemsRowListType }
     *     
     */
    public void setInnovationPlanDataItemRows(InnovationPlanDataItemsRowListType value) {
        this.innovationPlanDataItemRows = value;
    }

}
