//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.23 at 05:19:14 PM MSK 
//


package ru.gov.zakupki._223fz.complaint._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.gov.zakupki._223fz.types._1.ItemType;


/**
 * Данные позиции в пакете
 * 
 * <p>Java class for complaintVerificationResultItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="complaintVerificationResultItemType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/223fz/types/1}itemType">
 *       &lt;sequence>
 *         &lt;element name="complaintVerificationResultData" type="{http://zakupki.gov.ru/223fz/complaint/1}complaintVerificationResultDataType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "complaintVerificationResultItemType", propOrder = {
    "complaintVerificationResultData"
})
public class ComplaintVerificationResultItemType
    extends ItemType
{

    @XmlElement(required = true)
    protected ComplaintVerificationResultDataType complaintVerificationResultData;

    /**
     * Gets the value of the complaintVerificationResultData property.
     * 
     * @return
     *     possible object is
     *     {@link ComplaintVerificationResultDataType }
     *     
     */
    public ComplaintVerificationResultDataType getComplaintVerificationResultData() {
        return complaintVerificationResultData;
    }

    /**
     * Sets the value of the complaintVerificationResultData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplaintVerificationResultDataType }
     *     
     */
    public void setComplaintVerificationResultData(ComplaintVerificationResultDataType value) {
        this.complaintVerificationResultData = value;
    }

}
