//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.06 at 10:27:43 AM MSK 
//


package ru.gov.zakupki._223fz.decisionsuspension._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.gov.zakupki._223fz.types._1.ItemType;


/**
 * Данные позиции в пакете
 * 
 * <p>Java class for decisionSuspensionItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="decisionSuspensionItemType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/223fz/types/1}itemType">
 *       &lt;sequence>
 *         &lt;element name="decisionSuspensionData" type="{http://zakupki.gov.ru/223fz/decisionSuspension/1}decisionSuspensionData"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "decisionSuspensionItemType", propOrder = {
    "decisionSuspensionData"
})
public class DecisionSuspensionItemType
    extends ItemType
{

    @XmlElement(required = true)
    protected DecisionSuspensionData decisionSuspensionData;

    /**
     * Gets the value of the decisionSuspensionData property.
     * 
     * @return
     *     possible object is
     *     {@link DecisionSuspensionData }
     *     
     */
    public DecisionSuspensionData getDecisionSuspensionData() {
        return decisionSuspensionData;
    }

    /**
     * Sets the value of the decisionSuspensionData property.
     * 
     * @param value
     *     allowed object is
     *     {@link DecisionSuspensionData }
     *     
     */
    public void setDecisionSuspensionData(DecisionSuspensionData value) {
        this.decisionSuspensionData = value;
    }

}
