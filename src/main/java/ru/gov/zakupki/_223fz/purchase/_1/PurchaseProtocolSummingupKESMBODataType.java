//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.05 at 04:40:02 PM MSK 
//


package ru.gov.zakupki._223fz.purchase._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Итоговый протокол конкурса в электронной форме, участниками которого могут являться только субъекты малого и среднего предпринимательства
 * 
 * <p>Java class for purchaseProtocolSummingupKESMBODataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="purchaseProtocolSummingupKESMBODataType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/223fz/purchase/1}purchaseProtocolBaseDataType">
 *       &lt;sequence>
 *         &lt;element name="procedureDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="procedurePlace">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="2000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="protocolSignDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="commissionNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="commissionName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="1000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="commissionResult" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="2000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="protocolFCODRegistryNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="protocolFCDRegistryNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="protocolFKVORegistryNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="protocolRZ1RegistryNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "purchaseProtocolSummingupKESMBODataType", propOrder = {
    "procedureDate",
    "procedurePlace",
    "protocolSignDate",
    "commissionNumber",
    "commissionName",
    "commissionResult",
    "protocolFCODRegistryNumber",
    "protocolFCDRegistryNumber",
    "protocolFKVORegistryNumber",
    "protocolRZ1RegistryNumber"
})
public class PurchaseProtocolSummingupKESMBODataType
    extends PurchaseProtocolBaseDataType
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar procedureDate;
    @XmlElement(required = true)
    protected String procedurePlace;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar protocolSignDate;
    protected String commissionNumber;
    protected String commissionName;
    protected String commissionResult;
    protected String protocolFCODRegistryNumber;
    protected String protocolFCDRegistryNumber;
    protected String protocolFKVORegistryNumber;
    protected String protocolRZ1RegistryNumber;

    /**
     * Gets the value of the procedureDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProcedureDate() {
        return procedureDate;
    }

    /**
     * Sets the value of the procedureDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProcedureDate(XMLGregorianCalendar value) {
        this.procedureDate = value;
    }

    /**
     * Gets the value of the procedurePlace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcedurePlace() {
        return procedurePlace;
    }

    /**
     * Sets the value of the procedurePlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcedurePlace(String value) {
        this.procedurePlace = value;
    }

    /**
     * Gets the value of the protocolSignDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProtocolSignDate() {
        return protocolSignDate;
    }

    /**
     * Sets the value of the protocolSignDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProtocolSignDate(XMLGregorianCalendar value) {
        this.protocolSignDate = value;
    }

    /**
     * Gets the value of the commissionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommissionNumber() {
        return commissionNumber;
    }

    /**
     * Sets the value of the commissionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommissionNumber(String value) {
        this.commissionNumber = value;
    }

    /**
     * Gets the value of the commissionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommissionName() {
        return commissionName;
    }

    /**
     * Sets the value of the commissionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommissionName(String value) {
        this.commissionName = value;
    }

    /**
     * Gets the value of the commissionResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommissionResult() {
        return commissionResult;
    }

    /**
     * Sets the value of the commissionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommissionResult(String value) {
        this.commissionResult = value;
    }

    /**
     * Gets the value of the protocolFCODRegistryNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtocolFCODRegistryNumber() {
        return protocolFCODRegistryNumber;
    }

    /**
     * Sets the value of the protocolFCODRegistryNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtocolFCODRegistryNumber(String value) {
        this.protocolFCODRegistryNumber = value;
    }

    /**
     * Gets the value of the protocolFCDRegistryNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtocolFCDRegistryNumber() {
        return protocolFCDRegistryNumber;
    }

    /**
     * Sets the value of the protocolFCDRegistryNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtocolFCDRegistryNumber(String value) {
        this.protocolFCDRegistryNumber = value;
    }

    /**
     * Gets the value of the protocolFKVORegistryNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtocolFKVORegistryNumber() {
        return protocolFKVORegistryNumber;
    }

    /**
     * Sets the value of the protocolFKVORegistryNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtocolFKVORegistryNumber(String value) {
        this.protocolFKVORegistryNumber = value;
    }

    /**
     * Gets the value of the protocolRZ1RegistryNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtocolRZ1RegistryNumber() {
        return protocolRZ1RegistryNumber;
    }

    /**
     * Sets the value of the protocolRZ1RegistryNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtocolRZ1RegistryNumber(String value) {
        this.protocolRZ1RegistryNumber = value;
    }

}
