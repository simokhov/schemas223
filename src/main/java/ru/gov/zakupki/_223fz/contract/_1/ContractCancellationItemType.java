//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.05 at 04:40:02 PM MSK 
//


package ru.gov.zakupki._223fz.contract._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.gov.zakupki._223fz.types._1.ItemType;


/**
 * Данные позиции в пакете
 * 
 * <p>Java class for contractCancellationItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="contractCancellationItemType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/223fz/types/1}itemType">
 *       &lt;sequence>
 *         &lt;element name="contractCancellationData" type="{http://zakupki.gov.ru/223fz/contract/1}contractCancellationDataType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contractCancellationItemType", propOrder = {
    "contractCancellationData"
})
public class ContractCancellationItemType
    extends ItemType
{

    @XmlElement(required = true)
    protected ContractCancellationDataType contractCancellationData;

    /**
     * Gets the value of the contractCancellationData property.
     * 
     * @return
     *     possible object is
     *     {@link ContractCancellationDataType }
     *     
     */
    public ContractCancellationDataType getContractCancellationData() {
        return contractCancellationData;
    }

    /**
     * Sets the value of the contractCancellationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractCancellationDataType }
     *     
     */
    public void setContractCancellationData(ContractCancellationDataType value) {
        this.contractCancellationData = value;
    }

}
