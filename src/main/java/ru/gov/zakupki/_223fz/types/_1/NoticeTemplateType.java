//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.23 at 05:25:55 PM MSK 
//


package ru.gov.zakupki._223fz.types._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Шаблон извещения
 * 
 * <p>Java class for noticeTemplateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="noticeTemplateType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/223fz/types/1}baseTemplateType">
 *       &lt;sequence>
 *         &lt;element name="copyOfType" type="{http://zakupki.gov.ru/223fz/types/1}templateExtendPurchaseTypes"/>
 *         &lt;element name="hiddenFields" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="fields" type="{http://zakupki.gov.ru/223fz/types/1}noticeTemplateFieldList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "noticeTemplateType", propOrder = {
    "copyOfType",
    "hiddenFields",
    "fields"
})
public class NoticeTemplateType
    extends BaseTemplateType
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TemplateExtendPurchaseTypes copyOfType;
    protected String hiddenFields;
    protected NoticeTemplateFieldList fields;

    /**
     * Gets the value of the copyOfType property.
     * 
     * @return
     *     possible object is
     *     {@link TemplateExtendPurchaseTypes }
     *     
     */
    public TemplateExtendPurchaseTypes getCopyOfType() {
        return copyOfType;
    }

    /**
     * Sets the value of the copyOfType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TemplateExtendPurchaseTypes }
     *     
     */
    public void setCopyOfType(TemplateExtendPurchaseTypes value) {
        this.copyOfType = value;
    }

    /**
     * Gets the value of the hiddenFields property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHiddenFields() {
        return hiddenFields;
    }

    /**
     * Sets the value of the hiddenFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHiddenFields(String value) {
        this.hiddenFields = value;
    }

    /**
     * Gets the value of the fields property.
     * 
     * @return
     *     possible object is
     *     {@link NoticeTemplateFieldList }
     *     
     */
    public NoticeTemplateFieldList getFields() {
        return fields;
    }

    /**
     * Sets the value of the fields property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoticeTemplateFieldList }
     *     
     */
    public void setFields(NoticeTemplateFieldList value) {
        this.fields = value;
    }

}
