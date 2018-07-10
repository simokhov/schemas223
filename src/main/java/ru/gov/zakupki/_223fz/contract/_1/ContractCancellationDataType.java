//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.10 at 05:03:32 PM MSK 
//


package ru.gov.zakupki._223fz.contract._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Сведения о расторжении договора
 * 
 * <p>Java class for contractCancellationDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="contractCancellationDataType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/223fz/contract/1}contractCompletingDataType">
 *       &lt;sequence>
 *         &lt;element name="baseContractCancellationCode" type="{http://zakupki.gov.ru/223fz/contract/1}baseContractCancellationType"/>
 *         &lt;element name="baseContractCancellationName">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="2000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="baseRejectionDocCode" type="{http://zakupki.gov.ru/223fz/contract/1}baseRejectionDocType"/>
 *         &lt;element name="baseRejectionDocName">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="2000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="completionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="additionalDocDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="baseRejectionDocNum" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="2000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="baseRejectionDocDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contractCancellationDataType", propOrder = {
    "baseContractCancellationCode",
    "baseContractCancellationName",
    "baseRejectionDocCode",
    "baseRejectionDocName",
    "completionDate",
    "additionalDocDate",
    "baseRejectionDocNum",
    "baseRejectionDocDate"
})
public class ContractCancellationDataType
    extends ContractCompletingDataType
{

    @XmlElement(required = true)
    protected String baseContractCancellationCode;
    @XmlElement(required = true)
    protected String baseContractCancellationName;
    @XmlElement(required = true)
    protected String baseRejectionDocCode;
    @XmlElement(required = true)
    protected String baseRejectionDocName;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar completionDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar additionalDocDate;
    protected String baseRejectionDocNum;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar baseRejectionDocDate;

    /**
     * Gets the value of the baseContractCancellationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseContractCancellationCode() {
        return baseContractCancellationCode;
    }

    /**
     * Sets the value of the baseContractCancellationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseContractCancellationCode(String value) {
        this.baseContractCancellationCode = value;
    }

    /**
     * Gets the value of the baseContractCancellationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseContractCancellationName() {
        return baseContractCancellationName;
    }

    /**
     * Sets the value of the baseContractCancellationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseContractCancellationName(String value) {
        this.baseContractCancellationName = value;
    }

    /**
     * Gets the value of the baseRejectionDocCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseRejectionDocCode() {
        return baseRejectionDocCode;
    }

    /**
     * Sets the value of the baseRejectionDocCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseRejectionDocCode(String value) {
        this.baseRejectionDocCode = value;
    }

    /**
     * Gets the value of the baseRejectionDocName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseRejectionDocName() {
        return baseRejectionDocName;
    }

    /**
     * Sets the value of the baseRejectionDocName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseRejectionDocName(String value) {
        this.baseRejectionDocName = value;
    }

    /**
     * Gets the value of the completionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCompletionDate() {
        return completionDate;
    }

    /**
     * Sets the value of the completionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCompletionDate(XMLGregorianCalendar value) {
        this.completionDate = value;
    }

    /**
     * Gets the value of the additionalDocDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAdditionalDocDate() {
        return additionalDocDate;
    }

    /**
     * Sets the value of the additionalDocDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAdditionalDocDate(XMLGregorianCalendar value) {
        this.additionalDocDate = value;
    }

    /**
     * Gets the value of the baseRejectionDocNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseRejectionDocNum() {
        return baseRejectionDocNum;
    }

    /**
     * Sets the value of the baseRejectionDocNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseRejectionDocNum(String value) {
        this.baseRejectionDocNum = value;
    }

    /**
     * Gets the value of the baseRejectionDocDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBaseRejectionDocDate() {
        return baseRejectionDocDate;
    }

    /**
     * Sets the value of the baseRejectionDocDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBaseRejectionDocDate(XMLGregorianCalendar value) {
        this.baseRejectionDocDate = value;
    }

}
