//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.10 at 05:03:32 PM MSK 
//


package ru.gov.zakupki._223fz.purchase._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Список заявок по лотам
 * 
 * <p>Java class for protocolPAEPLotApplicationListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="protocolPAEPLotApplicationListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="protocolLotApplications" type="{http://zakupki.gov.ru/223fz/purchase/1}protocolPAEPLotApplications" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "protocolPAEPLotApplicationListType", propOrder = {
    "protocolLotApplications"
})
public class ProtocolPAEPLotApplicationListType {

    @XmlElement(required = true)
    protected List<ProtocolPAEPLotApplications> protocolLotApplications;

    /**
     * Gets the value of the protocolLotApplications property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the protocolLotApplications property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProtocolLotApplications().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProtocolPAEPLotApplications }
     * 
     * 
     */
    public List<ProtocolPAEPLotApplications> getProtocolLotApplications() {
        if (protocolLotApplications == null) {
            protocolLotApplications = new ArrayList<ProtocolPAEPLotApplications>();
        }
        return this.protocolLotApplications;
    }

}
