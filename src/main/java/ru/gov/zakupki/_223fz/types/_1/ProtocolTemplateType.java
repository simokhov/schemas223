//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.23 at 05:19:45 PM MSK 
//


package ru.gov.zakupki._223fz.types._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Шаблон протокола
 * 
 * <p>Java class for protocolTemplateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="protocolTemplateType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/223fz/types/1}baseTemplateType">
 *       &lt;sequence>
 *         &lt;element name="blocks" type="{http://zakupki.gov.ru/223fz/types/1}protocolTemplateHideBlocks" minOccurs="0"/>
 *         &lt;element name="fields" type="{http://zakupki.gov.ru/223fz/types/1}protocolTemplateFieldList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "protocolTemplateType", propOrder = {
    "blocks",
    "fields"
})
public class ProtocolTemplateType
    extends BaseTemplateType
{

    protected ProtocolTemplateHideBlocks blocks;
    protected ProtocolTemplateFieldList fields;

    /**
     * Gets the value of the blocks property.
     * 
     * @return
     *     possible object is
     *     {@link ProtocolTemplateHideBlocks }
     *     
     */
    public ProtocolTemplateHideBlocks getBlocks() {
        return blocks;
    }

    /**
     * Sets the value of the blocks property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolTemplateHideBlocks }
     *     
     */
    public void setBlocks(ProtocolTemplateHideBlocks value) {
        this.blocks = value;
    }

    /**
     * Gets the value of the fields property.
     * 
     * @return
     *     possible object is
     *     {@link ProtocolTemplateFieldList }
     *     
     */
    public ProtocolTemplateFieldList getFields() {
        return fields;
    }

    /**
     * Sets the value of the fields property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolTemplateFieldList }
     *     
     */
    public void setFields(ProtocolTemplateFieldList value) {
        this.fields = value;
    }

}
