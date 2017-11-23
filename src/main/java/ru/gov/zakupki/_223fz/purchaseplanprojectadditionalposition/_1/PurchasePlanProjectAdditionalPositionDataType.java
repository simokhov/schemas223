//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.23 at 05:26:25 PM MSK 
//


package ru.gov.zakupki._223fz.purchaseplanprojectadditionalposition._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import ru.gov.zakupki._223fz.purchaseplan._1.InnovationPlanItemsListType;
import ru.gov.zakupki._223fz.purchaseplan._1.PlanType;
import ru.gov.zakupki._223fz.purchaseplan._1.PurchasePlanItemsListType;
import ru.gov.zakupki._223fz.types._1.CustomerInfoType;


/**
 * Проект плана закупки
 * 
 * <p>Java class for purchasePlanProjectAdditionalPositionDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="purchasePlanProjectAdditionalPositionDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="guid" type="{http://zakupki.gov.ru/223fz/types/1}guidType"/>
 *         &lt;element name="customer" type="{http://zakupki.gov.ru/223fz/types/1}customerInfoType" minOccurs="0"/>
 *         &lt;element name="placer" type="{http://zakupki.gov.ru/223fz/types/1}customerInfoType"/>
 *         &lt;element name="planType" type="{http://zakupki.gov.ru/223fz/purchasePlan/1}planType"/>
 *         &lt;choice>
 *           &lt;element name="purchasePlanItems" type="{http://zakupki.gov.ru/223fz/purchasePlan/1}purchasePlanItemsListType" minOccurs="0"/>
 *           &lt;element name="innovationPlanItems" type="{http://zakupki.gov.ru/223fz/purchasePlan/1}innovationPlanItemsListType" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="purchasePlanItemsSMB" type="{http://zakupki.gov.ru/223fz/purchasePlan/1}purchasePlanItemsListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "purchasePlanProjectAdditionalPositionDataType", propOrder = {
    "guid",
    "customer",
    "placer",
    "planType",
    "purchasePlanItems",
    "innovationPlanItems",
    "purchasePlanItemsSMB"
})
public class PurchasePlanProjectAdditionalPositionDataType {

    @XmlElement(required = true)
    protected String guid;
    protected CustomerInfoType customer;
    @XmlElement(required = true)
    protected CustomerInfoType placer;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected PlanType planType;
    protected PurchasePlanItemsListType purchasePlanItems;
    protected InnovationPlanItemsListType innovationPlanItems;
    protected PurchasePlanItemsListType purchasePlanItemsSMB;

    /**
     * Gets the value of the guid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuid() {
        return guid;
    }

    /**
     * Sets the value of the guid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuid(String value) {
        this.guid = value;
    }

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerInfoType }
     *     
     */
    public CustomerInfoType getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerInfoType }
     *     
     */
    public void setCustomer(CustomerInfoType value) {
        this.customer = value;
    }

    /**
     * Gets the value of the placer property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerInfoType }
     *     
     */
    public CustomerInfoType getPlacer() {
        return placer;
    }

    /**
     * Sets the value of the placer property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerInfoType }
     *     
     */
    public void setPlacer(CustomerInfoType value) {
        this.placer = value;
    }

    /**
     * Gets the value of the planType property.
     * 
     * @return
     *     possible object is
     *     {@link PlanType }
     *     
     */
    public PlanType getPlanType() {
        return planType;
    }

    /**
     * Sets the value of the planType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlanType }
     *     
     */
    public void setPlanType(PlanType value) {
        this.planType = value;
    }

    /**
     * Gets the value of the purchasePlanItems property.
     * 
     * @return
     *     possible object is
     *     {@link PurchasePlanItemsListType }
     *     
     */
    public PurchasePlanItemsListType getPurchasePlanItems() {
        return purchasePlanItems;
    }

    /**
     * Sets the value of the purchasePlanItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchasePlanItemsListType }
     *     
     */
    public void setPurchasePlanItems(PurchasePlanItemsListType value) {
        this.purchasePlanItems = value;
    }

    /**
     * Gets the value of the innovationPlanItems property.
     * 
     * @return
     *     possible object is
     *     {@link InnovationPlanItemsListType }
     *     
     */
    public InnovationPlanItemsListType getInnovationPlanItems() {
        return innovationPlanItems;
    }

    /**
     * Sets the value of the innovationPlanItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link InnovationPlanItemsListType }
     *     
     */
    public void setInnovationPlanItems(InnovationPlanItemsListType value) {
        this.innovationPlanItems = value;
    }

    /**
     * Gets the value of the purchasePlanItemsSMB property.
     * 
     * @return
     *     possible object is
     *     {@link PurchasePlanItemsListType }
     *     
     */
    public PurchasePlanItemsListType getPurchasePlanItemsSMB() {
        return purchasePlanItemsSMB;
    }

    /**
     * Sets the value of the purchasePlanItemsSMB property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchasePlanItemsListType }
     *     
     */
    public void setPurchasePlanItemsSMB(PurchasePlanItemsListType value) {
        this.purchasePlanItemsSMB = value;
    }

}
