//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.06 at 10:22:30 AM MSK 
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
 * <p>Java class for volumeMonitoringItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="volumeMonitoringItemType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/223fz/types/1}itemType">
 *       &lt;sequence>
 *         &lt;element name="volumeMonitoringData" type="{http://zakupki.gov.ru/223fz/purchase/1}volumeMonitoringData"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "volumeMonitoringItemType", propOrder = {
    "volumeMonitoringData"
})
public class VolumeMonitoringItemType
    extends ItemType
{

    @XmlElement(required = true)
    protected VolumeMonitoringData volumeMonitoringData;

    /**
     * Gets the value of the volumeMonitoringData property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeMonitoringData }
     *     
     */
    public VolumeMonitoringData getVolumeMonitoringData() {
        return volumeMonitoringData;
    }

    /**
     * Sets the value of the volumeMonitoringData property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeMonitoringData }
     *     
     */
    public void setVolumeMonitoringData(VolumeMonitoringData value) {
        this.volumeMonitoringData = value;
    }

}
