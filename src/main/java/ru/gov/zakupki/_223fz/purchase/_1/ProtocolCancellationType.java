//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.06 at 10:27:43 AM MSK 
//


package ru.gov.zakupki._223fz.purchase._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.gov.zakupki._223fz.types._1.ItemType;


/**
 * Данные позиции в пакете
 * 
 * <p>Java class for protocolCancellationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="protocolCancellationType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/223fz/types/1}itemType">
 *       &lt;sequence>
 *         &lt;element name="protocolCancellationData" type="{http://zakupki.gov.ru/223fz/purchase/1}protocolCancellationDataType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "protocolCancellationType", propOrder = {
    "protocolCancellationData"
})
public class ProtocolCancellationType
    extends ItemType
{

    @XmlElement(required = true)
    protected ProtocolCancellationDataType protocolCancellationData;

    /**
     * Gets the value of the protocolCancellationData property.
     * 
     * @return
     *     possible object is
     *     {@link ProtocolCancellationDataType }
     *     
     */
    public ProtocolCancellationDataType getProtocolCancellationData() {
        return protocolCancellationData;
    }

    /**
     * Sets the value of the protocolCancellationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolCancellationDataType }
     *     
     */
    public void setProtocolCancellationData(ProtocolCancellationDataType value) {
        this.protocolCancellationData = value;
    }

}
