//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.23 at 05:18:32 PM MSK 
//


package ru.gov.zakupki._223fz.types._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Значения дополнительных полей шаблона протокола
 * 
 * <p>Java class for protocolExtendFieldValueListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="protocolExtendFieldValueListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="protocolExtendField" type="{http://zakupki.gov.ru/223fz/types/1}protocolExtendBlockFieldType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "protocolExtendFieldValueListType", propOrder = {
    "protocolExtendField"
})
public class ProtocolExtendFieldValueListType {

    protected List<ProtocolExtendBlockFieldType> protocolExtendField;

    /**
     * Gets the value of the protocolExtendField property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the protocolExtendField property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProtocolExtendField().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProtocolExtendBlockFieldType }
     * 
     * 
     */
    public List<ProtocolExtendBlockFieldType> getProtocolExtendField() {
        if (protocolExtendField == null) {
            protocolExtendField = new ArrayList<ProtocolExtendBlockFieldType>();
        }
        return this.protocolExtendField;
    }

}
