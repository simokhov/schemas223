//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.23 at 05:23:33 PM MSK 
//


package ru.gov.zakupki._223fz.types._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for lotTypeIS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="lotTypeIS">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/223fz/types/1}lotType">
 *       &lt;sequence>
 *         &lt;element name="extendFields" type="{http://zakupki.gov.ru/223fz/types/1}noticeExtendFieldValueListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lotTypeIS", propOrder = {
    "extendFields"
})
public class LotTypeIS
    extends LotType
{

    protected NoticeExtendFieldValueListType extendFields;

    /**
     * Gets the value of the extendFields property.
     * 
     * @return
     *     possible object is
     *     {@link NoticeExtendFieldValueListType }
     *     
     */
    public NoticeExtendFieldValueListType getExtendFields() {
        return extendFields;
    }

    /**
     * Sets the value of the extendFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoticeExtendFieldValueListType }
     *     
     */
    public void setExtendFields(NoticeExtendFieldValueListType value) {
        this.extendFields = value;
    }

}
