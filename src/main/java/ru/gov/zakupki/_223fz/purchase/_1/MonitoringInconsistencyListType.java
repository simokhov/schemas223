//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.23 at 05:29:18 PM MSK 
//


package ru.gov.zakupki._223fz.purchase._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Значение показателя несоответсвия
 * 
 * <p>Java class for monitoringInconsistencyListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="monitoringInconsistencyListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="monitoringInconsistencyType" type="{http://zakupki.gov.ru/223fz/purchase/1}monitoringInconsistencyType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "monitoringInconsistencyListType", propOrder = {
    "monitoringInconsistencyType"
})
public class MonitoringInconsistencyListType {

    @XmlElement(required = true)
    protected List<MonitoringInconsistencyType> monitoringInconsistencyType;

    /**
     * Gets the value of the monitoringInconsistencyType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the monitoringInconsistencyType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMonitoringInconsistencyType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MonitoringInconsistencyType }
     * 
     * 
     */
    public List<MonitoringInconsistencyType> getMonitoringInconsistencyType() {
        if (monitoringInconsistencyType == null) {
            monitoringInconsistencyType = new ArrayList<MonitoringInconsistencyType>();
        }
        return this.monitoringInconsistencyType;
    }

}
