//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.23 at 05:26:25 PM MSK 
//


package ru.gov.zakupki._223fz.types._1;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Колонка табличного представления данных
 * 
 * <p>Java class for templateTableColumnType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="templateTableColumnType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="colIndex">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="1"/>
 *               &lt;maxInclusive value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="colName">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="colType" type="{http://zakupki.gov.ru/223fz/types/1}extendFieldType"/>
 *         &lt;element name="colLength" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="20"/>
 *               &lt;fractionDigits value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="colMandatory" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="integrCode" type="{http://zakupki.gov.ru/223fz/types/1}integrCodeType"/>
 *         &lt;element name="typeInfo">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="400"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "templateTableColumnType", propOrder = {
    "colIndex",
    "colName",
    "colType",
    "colLength",
    "colMandatory",
    "integrCode",
    "typeInfo"
})
public class TemplateTableColumnType {

    protected int colIndex;
    @XmlElement(required = true)
    protected String colName;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ExtendFieldType colType;
    protected BigDecimal colLength;
    protected boolean colMandatory;
    @XmlElement(required = true)
    protected String integrCode;
    @XmlElement(required = true)
    protected String typeInfo;

    /**
     * Gets the value of the colIndex property.
     * 
     */
    public int getColIndex() {
        return colIndex;
    }

    /**
     * Sets the value of the colIndex property.
     * 
     */
    public void setColIndex(int value) {
        this.colIndex = value;
    }

    /**
     * Gets the value of the colName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColName() {
        return colName;
    }

    /**
     * Sets the value of the colName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColName(String value) {
        this.colName = value;
    }

    /**
     * Gets the value of the colType property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendFieldType }
     *     
     */
    public ExtendFieldType getColType() {
        return colType;
    }

    /**
     * Sets the value of the colType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendFieldType }
     *     
     */
    public void setColType(ExtendFieldType value) {
        this.colType = value;
    }

    /**
     * Gets the value of the colLength property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getColLength() {
        return colLength;
    }

    /**
     * Sets the value of the colLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setColLength(BigDecimal value) {
        this.colLength = value;
    }

    /**
     * Gets the value of the colMandatory property.
     * 
     */
    public boolean isColMandatory() {
        return colMandatory;
    }

    /**
     * Sets the value of the colMandatory property.
     * 
     */
    public void setColMandatory(boolean value) {
        this.colMandatory = value;
    }

    /**
     * Gets the value of the integrCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntegrCode() {
        return integrCode;
    }

    /**
     * Sets the value of the integrCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntegrCode(String value) {
        this.integrCode = value;
    }

    /**
     * Gets the value of the typeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeInfo() {
        return typeInfo;
    }

    /**
     * Sets the value of the typeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeInfo(String value) {
        this.typeInfo = value;
    }

}
