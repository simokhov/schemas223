//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.23 at 05:17:31 PM MSK 
//


package ru.gov.zakupki._223fz.reference._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.gov.zakupki._223fz.types._1.ItemType;


/**
 * Данные позиции в пакете
 * 
 * <p>Java class for nsiOrganizationItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="nsiOrganizationItemType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/223fz/types/1}itemType">
 *       &lt;sequence>
 *         &lt;element name="nsiOrganizationData" type="{http://zakupki.gov.ru/223fz/reference/1}nsiOrganizationDataType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "nsiOrganizationItemType", propOrder = {
    "nsiOrganizationData"
})
public class NsiOrganizationItemType
    extends ItemType
{

    @XmlElement(required = true)
    protected NsiOrganizationDataType nsiOrganizationData;

    /**
     * Gets the value of the nsiOrganizationData property.
     * 
     * @return
     *     possible object is
     *     {@link NsiOrganizationDataType }
     *     
     */
    public NsiOrganizationDataType getNsiOrganizationData() {
        return nsiOrganizationData;
    }

    /**
     * Sets the value of the nsiOrganizationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link NsiOrganizationDataType }
     *     
     */
    public void setNsiOrganizationData(NsiOrganizationDataType value) {
        this.nsiOrganizationData = value;
    }

}
