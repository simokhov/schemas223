//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.23 at 05:19:14 PM MSK 
//


package ru.gov.zakupki._223fz.types._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Поле шаблона извещения
 * 
 * <p>Java class for noticeTemplateFieldType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="noticeTemplateFieldType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/223fz/types/1}baseTemplateFieldType">
 *       &lt;sequence>
 *         &lt;element name="tabLevel" type="{http://zakupki.gov.ru/223fz/types/1}noticeTemplateFieldLevelType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "noticeTemplateFieldType", propOrder = {
    "tabLevel"
})
public class NoticeTemplateFieldType
    extends BaseTemplateFieldType
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected NoticeTemplateFieldLevelType tabLevel;

    /**
     * Gets the value of the tabLevel property.
     * 
     * @return
     *     possible object is
     *     {@link NoticeTemplateFieldLevelType }
     *     
     */
    public NoticeTemplateFieldLevelType getTabLevel() {
        return tabLevel;
    }

    /**
     * Sets the value of the tabLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoticeTemplateFieldLevelType }
     *     
     */
    public void setTabLevel(NoticeTemplateFieldLevelType value) {
        this.tabLevel = value;
    }

}
