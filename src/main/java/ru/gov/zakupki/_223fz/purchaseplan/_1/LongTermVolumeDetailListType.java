//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.04.26 at 09:55:47 AM MSK 
//


package ru.gov.zakupki._223fz.purchaseplan._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Объёмы оплаты долгосрочного договора по годам
 * 
 * <p>Java class for longTermVolumeDetailListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="longTermVolumeDetailListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="longTermVolumeDetail" type="{http://zakupki.gov.ru/223fz/purchasePlan/1}longTermVolumeDetailType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "longTermVolumeDetailListType", propOrder = {
    "longTermVolumeDetail"
})
public class LongTermVolumeDetailListType {

    @XmlElement(required = true)
    protected List<LongTermVolumeDetailType> longTermVolumeDetail;

    /**
     * Gets the value of the longTermVolumeDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the longTermVolumeDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLongTermVolumeDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LongTermVolumeDetailType }
     * 
     * 
     */
    public List<LongTermVolumeDetailType> getLongTermVolumeDetail() {
        if (longTermVolumeDetail == null) {
            longTermVolumeDetail = new ArrayList<LongTermVolumeDetailType>();
        }
        return this.longTermVolumeDetail;
    }

}
