//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.23 at 05:15:39 PM MSK 
//


package ru.gov.zakupki._223fz.types._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Значения дополнительных полей извещения/протокола
 * 
 * <p>Java class for baseExtendBlockFieldType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="baseExtendBlockFieldType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="extendField" type="{http://zakupki.gov.ru/223fz/types/1}baseExtendFieldType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "baseExtendBlockFieldType", propOrder = {
    "extendField"
})
@XmlSeeAlso({
    NoticeExtendBlockFieldType.class,
    ProtocolExtendBlockFieldType.class
})
public class BaseExtendBlockFieldType {

    protected List<BaseExtendFieldType> extendField;

    /**
     * Gets the value of the extendField property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extendField property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtendField().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BaseExtendFieldType }
     * 
     * 
     */
    public List<BaseExtendFieldType> getExtendField() {
        if (extendField == null) {
            extendField = new ArrayList<BaseExtendFieldType>();
        }
        return this.extendField;
    }

}
