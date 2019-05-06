//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.06 at 10:27:43 AM MSK 
//


package ru.gov.zakupki._223fz.purchase._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Протокол запроса разъяснений положений заявки для конкурса в электронной форме, участниками которого могут быть только субъекты малого и среднего предпринимательства
 * 
 * <p>Java class for purchaseProtocolZRPZKESMBODataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="purchaseProtocolZRPZKESMBODataType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/223fz/purchase/1}purchaseProtocolDataType">
 *       &lt;sequence>
 *         &lt;element name="protocolFCDRegistrationNumber" type="{http://zakupki.gov.ru/223fz/types/1}registrationNumber11-2Type" minOccurs="0"/>
 *         &lt;element name="protocolFCODRegistrationNumber" type="{http://zakupki.gov.ru/223fz/types/1}registrationNumber11-2Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "purchaseProtocolZRPZKESMBODataType", propOrder = {
    "protocolFCDRegistrationNumber",
    "protocolFCODRegistrationNumber"
})
public class PurchaseProtocolZRPZKESMBODataType
    extends PurchaseProtocolDataType
{

    protected String protocolFCDRegistrationNumber;
    protected String protocolFCODRegistrationNumber;

    /**
     * Gets the value of the protocolFCDRegistrationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtocolFCDRegistrationNumber() {
        return protocolFCDRegistrationNumber;
    }

    /**
     * Sets the value of the protocolFCDRegistrationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtocolFCDRegistrationNumber(String value) {
        this.protocolFCDRegistrationNumber = value;
    }

    /**
     * Gets the value of the protocolFCODRegistrationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtocolFCODRegistrationNumber() {
        return protocolFCODRegistrationNumber;
    }

    /**
     * Sets the value of the protocolFCODRegistrationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtocolFCODRegistrationNumber(String value) {
        this.protocolFCODRegistrationNumber = value;
    }

}
