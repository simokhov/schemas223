//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.23 at 05:28:36 PM MSK 
//


package ru.gov.zakupki._223fz.dishonestsupplier._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import ru.gov.zakupki._223fz.types._1.ContractInfoType;
import ru.gov.zakupki._223fz.types._1.CustomerMainInfoType;


/**
 * Информация о заявке
 * 
 * <p>Java class for commonApplicationInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="commonApplicationInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="includeReason" type="{http://zakupki.gov.ru/223fz/dishonestSupplier/1}includeReasonType"/>
 *         &lt;element name="includeReasonText" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="controlAgency" type="{http://zakupki.gov.ru/223fz/types/1}customerMainInfoType"/>
 *         &lt;element name="topSecret" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="supplier" type="{http://zakupki.gov.ru/223fz/dishonestSupplier/1}supplierInfoType"/>
 *         &lt;element name="purchaseInfo" type="{http://zakupki.gov.ru/223fz/dishonestSupplier/1}purchaseInfoDataType" minOccurs="0"/>
 *         &lt;element name="contractInfo" type="{http://zakupki.gov.ru/223fz/types/1}contractInfoType" minOccurs="0"/>
 *         &lt;element name="contractItems" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="contractItem" type="{http://zakupki.gov.ru/223fz/dishonestSupplier/1}contractItemType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "commonApplicationInfoType", propOrder = {
    "includeReason",
    "includeReasonText",
    "controlAgency",
    "topSecret",
    "supplier",
    "purchaseInfo",
    "contractInfo",
    "contractItems"
})
public class CommonApplicationInfoType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected IncludeReasonType includeReason;
    protected String includeReasonText;
    @XmlElement(required = true)
    protected CustomerMainInfoType controlAgency;
    protected boolean topSecret;
    @XmlElement(required = true)
    protected SupplierInfoType supplier;
    protected PurchaseInfoDataType purchaseInfo;
    protected ContractInfoType contractInfo;
    protected CommonApplicationInfoType.ContractItems contractItems;

    /**
     * Gets the value of the includeReason property.
     * 
     * @return
     *     possible object is
     *     {@link IncludeReasonType }
     *     
     */
    public IncludeReasonType getIncludeReason() {
        return includeReason;
    }

    /**
     * Sets the value of the includeReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncludeReasonType }
     *     
     */
    public void setIncludeReason(IncludeReasonType value) {
        this.includeReason = value;
    }

    /**
     * Gets the value of the includeReasonText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncludeReasonText() {
        return includeReasonText;
    }

    /**
     * Sets the value of the includeReasonText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncludeReasonText(String value) {
        this.includeReasonText = value;
    }

    /**
     * Gets the value of the controlAgency property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerMainInfoType }
     *     
     */
    public CustomerMainInfoType getControlAgency() {
        return controlAgency;
    }

    /**
     * Sets the value of the controlAgency property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerMainInfoType }
     *     
     */
    public void setControlAgency(CustomerMainInfoType value) {
        this.controlAgency = value;
    }

    /**
     * Gets the value of the topSecret property.
     * 
     */
    public boolean isTopSecret() {
        return topSecret;
    }

    /**
     * Sets the value of the topSecret property.
     * 
     */
    public void setTopSecret(boolean value) {
        this.topSecret = value;
    }

    /**
     * Gets the value of the supplier property.
     * 
     * @return
     *     possible object is
     *     {@link SupplierInfoType }
     *     
     */
    public SupplierInfoType getSupplier() {
        return supplier;
    }

    /**
     * Sets the value of the supplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplierInfoType }
     *     
     */
    public void setSupplier(SupplierInfoType value) {
        this.supplier = value;
    }

    /**
     * Gets the value of the purchaseInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseInfoDataType }
     *     
     */
    public PurchaseInfoDataType getPurchaseInfo() {
        return purchaseInfo;
    }

    /**
     * Sets the value of the purchaseInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseInfoDataType }
     *     
     */
    public void setPurchaseInfo(PurchaseInfoDataType value) {
        this.purchaseInfo = value;
    }

    /**
     * Gets the value of the contractInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ContractInfoType }
     *     
     */
    public ContractInfoType getContractInfo() {
        return contractInfo;
    }

    /**
     * Sets the value of the contractInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractInfoType }
     *     
     */
    public void setContractInfo(ContractInfoType value) {
        this.contractInfo = value;
    }

    /**
     * Gets the value of the contractItems property.
     * 
     * @return
     *     possible object is
     *     {@link CommonApplicationInfoType.ContractItems }
     *     
     */
    public CommonApplicationInfoType.ContractItems getContractItems() {
        return contractItems;
    }

    /**
     * Sets the value of the contractItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonApplicationInfoType.ContractItems }
     *     
     */
    public void setContractItems(CommonApplicationInfoType.ContractItems value) {
        this.contractItems = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="contractItem" type="{http://zakupki.gov.ru/223fz/dishonestSupplier/1}contractItemType" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "contractItem"
    })
    public static class ContractItems {

        @XmlElement(required = true)
        protected List<ContractItemType> contractItem;

        /**
         * Gets the value of the contractItem property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the contractItem property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getContractItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ContractItemType }
         * 
         * 
         */
        public List<ContractItemType> getContractItem() {
            if (contractItem == null) {
                contractItem = new ArrayList<ContractItemType>();
            }
            return this.contractItem;
        }

    }

}
