//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.05 at 04:39:36 PM MSK 
//


package ru.gov.zakupki._223fz.types._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Результат обработки позиции
 * 
 * <p>Java class for itemResultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="itemResultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="refguid" type="{http://zakupki.gov.ru/223fz/types/1}guidType"/>
 *         &lt;element name="entityGuid" type="{http://zakupki.gov.ru/223fz/types/1}guidType"/>
 *         &lt;element name="result" type="{http://zakupki.gov.ru/223fz/types/1}resultType"/>
 *         &lt;element name="violations" type="{http://zakupki.gov.ru/223fz/types/1}violationListType" minOccurs="0"/>
 *         &lt;element name="url" type="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "itemResultType", propOrder = {
    "refguid",
    "entityGuid",
    "result",
    "violations",
    "url"
})
public class ItemResultType {

    @XmlElement(required = true)
    protected String refguid;
    @XmlElement(required = true)
    protected String entityGuid;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ResultType result;
    protected ViolationListType violations;
    protected String url;

    /**
     * Gets the value of the refguid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefguid() {
        return refguid;
    }

    /**
     * Sets the value of the refguid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefguid(String value) {
        this.refguid = value;
    }

    /**
     * Gets the value of the entityGuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityGuid() {
        return entityGuid;
    }

    /**
     * Sets the value of the entityGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityGuid(String value) {
        this.entityGuid = value;
    }

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link ResultType }
     *     
     */
    public ResultType getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultType }
     *     
     */
    public void setResult(ResultType value) {
        this.result = value;
    }

    /**
     * Gets the value of the violations property.
     * 
     * @return
     *     possible object is
     *     {@link ViolationListType }
     *     
     */
    public ViolationListType getViolations() {
        return violations;
    }

    /**
     * Sets the value of the violations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ViolationListType }
     *     
     */
    public void setViolations(ViolationListType value) {
        this.violations = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

}
