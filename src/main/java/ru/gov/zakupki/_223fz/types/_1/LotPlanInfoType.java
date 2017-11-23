//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.23 at 05:25:55 PM MSK 
//


package ru.gov.zakupki._223fz.types._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Информация о плане и позиции
 * 
 * <p>Java class for lotPlanInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="lotPlanInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="planRegistrationNumber" type="{http://zakupki.gov.ru/223fz/types/1}registrationNumberType" minOccurs="0"/>
 *         &lt;element name="planGuid" type="{http://zakupki.gov.ru/223fz/types/1}guidType"/>
 *         &lt;element name="positionNumber" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="lotPlanPosition" type="{http://zakupki.gov.ru/223fz/types/1}lotPlanPositionType"/>
 *         &lt;element name="positionGuid" type="{http://zakupki.gov.ru/223fz/types/1}guidType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lotPlanInfoType", propOrder = {
    "planRegistrationNumber",
    "planGuid",
    "positionNumber",
    "lotPlanPosition",
    "positionGuid"
})
public class LotPlanInfoType {

    protected String planRegistrationNumber;
    @XmlElement(required = true)
    protected String planGuid;
    protected long positionNumber;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected LotPlanPositionType lotPlanPosition;
    @XmlElement(required = true)
    protected String positionGuid;

    /**
     * Gets the value of the planRegistrationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanRegistrationNumber() {
        return planRegistrationNumber;
    }

    /**
     * Sets the value of the planRegistrationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanRegistrationNumber(String value) {
        this.planRegistrationNumber = value;
    }

    /**
     * Gets the value of the planGuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanGuid() {
        return planGuid;
    }

    /**
     * Sets the value of the planGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanGuid(String value) {
        this.planGuid = value;
    }

    /**
     * Gets the value of the positionNumber property.
     * 
     */
    public long getPositionNumber() {
        return positionNumber;
    }

    /**
     * Sets the value of the positionNumber property.
     * 
     */
    public void setPositionNumber(long value) {
        this.positionNumber = value;
    }

    /**
     * Gets the value of the lotPlanPosition property.
     * 
     * @return
     *     possible object is
     *     {@link LotPlanPositionType }
     *     
     */
    public LotPlanPositionType getLotPlanPosition() {
        return lotPlanPosition;
    }

    /**
     * Sets the value of the lotPlanPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link LotPlanPositionType }
     *     
     */
    public void setLotPlanPosition(LotPlanPositionType value) {
        this.lotPlanPosition = value;
    }

    /**
     * Gets the value of the positionGuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPositionGuid() {
        return positionGuid;
    }

    /**
     * Sets the value of the positionGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPositionGuid(String value) {
        this.positionGuid = value;
    }

}
