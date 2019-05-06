//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.06 at 10:22:30 AM MSK 
//


package ru.gov.zakupki._223fz.stopcommodity._1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ru.gov.zakupki._223fz.types._1.CustomerInfo2Type;
import ru.gov.zakupki._223fz.types._1.StopCommodityStatus;


/**
 * Перечень товаров, работ, услуг для приостановки
 * 
 * <p>Java class for stopCommodityData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="stopCommodityData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="publicationDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="annualVolumeSMB" type="{http://zakupki.gov.ru/223fz/types/1}money2"/>
 *         &lt;element name="status" type="{http://zakupki.gov.ru/223fz/types/1}stopCommodityStatus" minOccurs="0"/>
 *         &lt;element name="annualVolumePercent" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="conclusionRegNumber">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;pattern value="\w(\d{10}|\d{16})"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="planRegNumber" type="{http://zakupki.gov.ru/223fz/types/1}registrationNumberType"/>
 *         &lt;element name="customerAgency" type="{http://zakupki.gov.ru/223fz/types/1}customerInfo2Type"/>
 *         &lt;element name="additionalInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stopCommodityItems" type="{http://zakupki.gov.ru/223fz/stopCommodity/1}stopCommodityItems" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "stopCommodityData", propOrder = {
    "publicationDate",
    "annualVolumeSMB",
    "status",
    "annualVolumePercent",
    "conclusionRegNumber",
    "planRegNumber",
    "customerAgency",
    "additionalInfo",
    "stopCommodityItems"
})
public class StopCommodityData {

    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar publicationDate;
    @XmlElement(required = true)
    protected BigDecimal annualVolumeSMB;
    @XmlSchemaType(name = "string")
    protected StopCommodityStatus status;
    @XmlElement(required = true)
    protected BigDecimal annualVolumePercent;
    @XmlElement(required = true)
    protected String conclusionRegNumber;
    @XmlElement(required = true)
    protected String planRegNumber;
    @XmlElement(required = true)
    protected CustomerInfo2Type customerAgency;
    protected String additionalInfo;
    @XmlElement(required = true)
    protected List<StopCommodityItems> stopCommodityItems;

    /**
     * Gets the value of the publicationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPublicationDate() {
        return publicationDate;
    }

    /**
     * Sets the value of the publicationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPublicationDate(XMLGregorianCalendar value) {
        this.publicationDate = value;
    }

    /**
     * Gets the value of the annualVolumeSMB property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAnnualVolumeSMB() {
        return annualVolumeSMB;
    }

    /**
     * Sets the value of the annualVolumeSMB property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAnnualVolumeSMB(BigDecimal value) {
        this.annualVolumeSMB = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link StopCommodityStatus }
     *     
     */
    public StopCommodityStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopCommodityStatus }
     *     
     */
    public void setStatus(StopCommodityStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the annualVolumePercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAnnualVolumePercent() {
        return annualVolumePercent;
    }

    /**
     * Sets the value of the annualVolumePercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAnnualVolumePercent(BigDecimal value) {
        this.annualVolumePercent = value;
    }

    /**
     * Gets the value of the conclusionRegNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConclusionRegNumber() {
        return conclusionRegNumber;
    }

    /**
     * Sets the value of the conclusionRegNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConclusionRegNumber(String value) {
        this.conclusionRegNumber = value;
    }

    /**
     * Gets the value of the planRegNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanRegNumber() {
        return planRegNumber;
    }

    /**
     * Sets the value of the planRegNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanRegNumber(String value) {
        this.planRegNumber = value;
    }

    /**
     * Gets the value of the customerAgency property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerInfo2Type }
     *     
     */
    public CustomerInfo2Type getCustomerAgency() {
        return customerAgency;
    }

    /**
     * Sets the value of the customerAgency property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerInfo2Type }
     *     
     */
    public void setCustomerAgency(CustomerInfo2Type value) {
        this.customerAgency = value;
    }

    /**
     * Gets the value of the additionalInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalInfo() {
        return additionalInfo;
    }

    /**
     * Sets the value of the additionalInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalInfo(String value) {
        this.additionalInfo = value;
    }

    /**
     * Gets the value of the stopCommodityItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stopCommodityItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStopCommodityItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StopCommodityItems }
     * 
     * 
     */
    public List<StopCommodityItems> getStopCommodityItems() {
        if (stopCommodityItems == null) {
            stopCommodityItems = new ArrayList<StopCommodityItems>();
        }
        return this.stopCommodityItems;
    }

}
