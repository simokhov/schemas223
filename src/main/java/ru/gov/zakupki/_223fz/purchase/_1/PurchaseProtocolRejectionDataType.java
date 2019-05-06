//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.06 at 10:22:30 AM MSK 
//


package ru.gov.zakupki._223fz.purchase._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Протокол отказа от заключения договора (для конкурса, аукциона, запроса котировок и предложений в электронной форме, участниками которого могут являться только субъекты малого и среднего предпринимательства)
 * 
 * <p>Java class for purchaseProtocolRejectionDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="purchaseProtocolRejectionDataType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/223fz/purchase/1}purchaseProtocolDataType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;sequence>
 *             &lt;element name="protocolFCDRegistryNumber" minOccurs="0">
 *               &lt;simpleType>
 *                 &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *                   &lt;maxLength value="100"/>
 *                 &lt;/restriction>
 *               &lt;/simpleType>
 *             &lt;/element>
 *             &lt;element name="protocolFCODRegistryNumber" minOccurs="0">
 *               &lt;simpleType>
 *                 &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *                   &lt;maxLength value="100"/>
 *                 &lt;/restriction>
 *               &lt;/simpleType>
 *             &lt;/element>
 *             &lt;element name="protocolZRPZRegistryNumber" minOccurs="0">
 *               &lt;simpleType>
 *                 &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *                   &lt;maxLength value="100"/>
 *                 &lt;/restriction>
 *               &lt;/simpleType>
 *             &lt;/element>
 *             &lt;element name="protocolFKVORegistryNumber" minOccurs="0">
 *               &lt;simpleType>
 *                 &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *                   &lt;maxLength value="100"/>
 *                 &lt;/restriction>
 *               &lt;/simpleType>
 *             &lt;/element>
 *             &lt;element name="protocolRZ1RegistryNumber" minOccurs="0">
 *               &lt;simpleType>
 *                 &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *                   &lt;maxLength value="100"/>
 *                 &lt;/restriction>
 *               &lt;/simpleType>
 *             &lt;/element>
 *           &lt;/sequence>
 *           &lt;sequence>
 *             &lt;element name="protocolRZRegistryNumber" minOccurs="0">
 *               &lt;simpleType>
 *                 &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *                   &lt;maxLength value="100"/>
 *                 &lt;/restriction>
 *               &lt;/simpleType>
 *             &lt;/element>
 *           &lt;/sequence>
 *         &lt;/choice>
 *         &lt;element name="protocolSummingupInfo" type="{http://zakupki.gov.ru/223fz/purchase/1}protocolSummingupRefferenceDataType"/>
 *         &lt;element name="protocolRejectionFinalProtocolApplicationInfo" type="{http://zakupki.gov.ru/223fz/purchase/1}protocolRejectionFinalProtocolApplicationInfoType"/>
 *         &lt;element name="protocolRejectionDecisionInfo" type="{http://zakupki.gov.ru/223fz/purchase/1}protocolRejectionDecisionInfoType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "purchaseProtocolRejectionDataType", propOrder = {
    "protocolFCDRegistryNumber",
    "protocolFCODRegistryNumber",
    "protocolZRPZRegistryNumber",
    "protocolFKVORegistryNumber",
    "protocolRZ1RegistryNumber",
    "protocolRZRegistryNumber",
    "protocolSummingupInfo",
    "protocolRejectionFinalProtocolApplicationInfo",
    "protocolRejectionDecisionInfo"
})
@XmlSeeAlso({
    ru.gov.zakupki._223fz.purchase._1.PurchaseProtocolRejectionKESMBOItemType.PurchaseProtocolRejectionKESMBOData.class,
    ru.gov.zakupki._223fz.purchase._1.PurchaseProtocolRejectionAESMBOItemType.PurchaseProtocolRejectionAESMBOData.class,
    ru.gov.zakupki._223fz.purchase._1.PurchaseProtocolRejectionZPESMBOItemType.PurchaseProtocolRejectionZPESMBOData.class,
    ru.gov.zakupki._223fz.purchase._1.PurchaseProtocolRejectionZKESMBOItemType.PurchaseProtocolRejectionZKESMBOData.class
})
public class PurchaseProtocolRejectionDataType
    extends PurchaseProtocolDataType
{

    protected String protocolFCDRegistryNumber;
    protected String protocolFCODRegistryNumber;
    protected String protocolZRPZRegistryNumber;
    protected String protocolFKVORegistryNumber;
    protected String protocolRZ1RegistryNumber;
    protected String protocolRZRegistryNumber;
    @XmlElement(required = true)
    protected ProtocolSummingupRefferenceDataType protocolSummingupInfo;
    @XmlElement(required = true)
    protected ProtocolRejectionFinalProtocolApplicationInfoType protocolRejectionFinalProtocolApplicationInfo;
    @XmlElement(required = true)
    protected ProtocolRejectionDecisionInfoType protocolRejectionDecisionInfo;

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
     * Gets the value of the protocolZRPZRegistryNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtocolZRPZRegistryNumber() {
        return protocolZRPZRegistryNumber;
    }

    /**
     * Sets the value of the protocolZRPZRegistryNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtocolZRPZRegistryNumber(String value) {
        this.protocolZRPZRegistryNumber = value;
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

    /**
     * Gets the value of the protocolRZRegistryNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtocolRZRegistryNumber() {
        return protocolRZRegistryNumber;
    }

    /**
     * Sets the value of the protocolRZRegistryNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtocolRZRegistryNumber(String value) {
        this.protocolRZRegistryNumber = value;
    }

    /**
     * Gets the value of the protocolSummingupInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ProtocolSummingupRefferenceDataType }
     *     
     */
    public ProtocolSummingupRefferenceDataType getProtocolSummingupInfo() {
        return protocolSummingupInfo;
    }

    /**
     * Sets the value of the protocolSummingupInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolSummingupRefferenceDataType }
     *     
     */
    public void setProtocolSummingupInfo(ProtocolSummingupRefferenceDataType value) {
        this.protocolSummingupInfo = value;
    }

    /**
     * Gets the value of the protocolRejectionFinalProtocolApplicationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ProtocolRejectionFinalProtocolApplicationInfoType }
     *     
     */
    public ProtocolRejectionFinalProtocolApplicationInfoType getProtocolRejectionFinalProtocolApplicationInfo() {
        return protocolRejectionFinalProtocolApplicationInfo;
    }

    /**
     * Sets the value of the protocolRejectionFinalProtocolApplicationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolRejectionFinalProtocolApplicationInfoType }
     *     
     */
    public void setProtocolRejectionFinalProtocolApplicationInfo(ProtocolRejectionFinalProtocolApplicationInfoType value) {
        this.protocolRejectionFinalProtocolApplicationInfo = value;
    }

    /**
     * Gets the value of the protocolRejectionDecisionInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ProtocolRejectionDecisionInfoType }
     *     
     */
    public ProtocolRejectionDecisionInfoType getProtocolRejectionDecisionInfo() {
        return protocolRejectionDecisionInfo;
    }

    /**
     * Sets the value of the protocolRejectionDecisionInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolRejectionDecisionInfoType }
     *     
     */
    public void setProtocolRejectionDecisionInfo(ProtocolRejectionDecisionInfoType value) {
        this.protocolRejectionDecisionInfo = value;
    }

}
