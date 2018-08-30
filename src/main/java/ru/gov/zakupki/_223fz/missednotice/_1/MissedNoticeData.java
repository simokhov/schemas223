//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.08.30 at 04:59:41 PM MSK 
//


package ru.gov.zakupki._223fz.missednotice._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ru.gov.zakupki._223fz.types._1.CustomerInfo2Type;
import ru.gov.zakupki._223fz.types._1.PlanInformationType;


/**
 * Извещения об отсутствии необходимости проведения
 * 
 * <p>Java class for missedNoticeData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="missedNoticeData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="placementDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="type" type="{http://zakupki.gov.ru/223fz/missedNotice/1}missedNoticeType"/>
 *         &lt;element name="regNumber" type="{http://zakupki.gov.ru/223fz/types/1}registrationNumberType"/>
 *         &lt;element name="planInformationType" type="{http://zakupki.gov.ru/223fz/types/1}planInformationType"/>
 *         &lt;element name="authorityAgency" type="{http://zakupki.gov.ru/223fz/types/1}customerInfo2Type"/>
 *         &lt;element name="customerAgency" type="{http://zakupki.gov.ru/223fz/types/1}customerInfo2Type"/>
 *         &lt;element name="additionalInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "missedNoticeData", propOrder = {
    "placementDate",
    "type",
    "regNumber",
    "planInformationType",
    "authorityAgency",
    "customerAgency",
    "additionalInfo"
})
public class MissedNoticeData {

    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar placementDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected MissedNoticeType type;
    @XmlElement(required = true)
    protected String regNumber;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected PlanInformationType planInformationType;
    @XmlElement(required = true)
    protected CustomerInfo2Type authorityAgency;
    @XmlElement(required = true)
    protected CustomerInfo2Type customerAgency;
    protected String additionalInfo;

    /**
     * Gets the value of the placementDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPlacementDate() {
        return placementDate;
    }

    /**
     * Sets the value of the placementDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPlacementDate(XMLGregorianCalendar value) {
        this.placementDate = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link MissedNoticeType }
     *     
     */
    public MissedNoticeType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link MissedNoticeType }
     *     
     */
    public void setType(MissedNoticeType value) {
        this.type = value;
    }

    /**
     * Gets the value of the regNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegNumber() {
        return regNumber;
    }

    /**
     * Sets the value of the regNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegNumber(String value) {
        this.regNumber = value;
    }

    /**
     * Gets the value of the planInformationType property.
     * 
     * @return
     *     possible object is
     *     {@link PlanInformationType }
     *     
     */
    public PlanInformationType getPlanInformationType() {
        return planInformationType;
    }

    /**
     * Sets the value of the planInformationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlanInformationType }
     *     
     */
    public void setPlanInformationType(PlanInformationType value) {
        this.planInformationType = value;
    }

    /**
     * Gets the value of the authorityAgency property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerInfo2Type }
     *     
     */
    public CustomerInfo2Type getAuthorityAgency() {
        return authorityAgency;
    }

    /**
     * Sets the value of the authorityAgency property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerInfo2Type }
     *     
     */
    public void setAuthorityAgency(CustomerInfo2Type value) {
        this.authorityAgency = value;
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

}