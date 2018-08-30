//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.08.30 at 04:59:41 PM MSK 
//


package ru.gov.zakupki._223fz.conclusion._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Строки несоответствия отрицательного заключения, уведомления о несоответствии
 * 
 * <p>Java class for discrepancyPositionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="discrepancyPositionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="positionNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="contractSubject" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="discrepancyInfo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "discrepancyPositionType", propOrder = {
    "positionNumber",
    "contractSubject",
    "discrepancyInfo"
})
public class DiscrepancyPositionType {

    @XmlElement(required = true)
    protected String positionNumber;
    @XmlElement(required = true)
    protected String contractSubject;
    @XmlElement(required = true)
    protected String discrepancyInfo;

    /**
     * Gets the value of the positionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPositionNumber() {
        return positionNumber;
    }

    /**
     * Sets the value of the positionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPositionNumber(String value) {
        this.positionNumber = value;
    }

    /**
     * Gets the value of the contractSubject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractSubject() {
        return contractSubject;
    }

    /**
     * Sets the value of the contractSubject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractSubject(String value) {
        this.contractSubject = value;
    }

    /**
     * Gets the value of the discrepancyInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscrepancyInfo() {
        return discrepancyInfo;
    }

    /**
     * Sets the value of the discrepancyInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscrepancyInfo(String value) {
        this.discrepancyInfo = value;
    }

}
