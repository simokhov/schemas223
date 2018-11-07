//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.11.07 at 09:43:41 AM MSK 
//


package ru.gov.zakupki._223fz.purchase._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Протокол признания участника уклонившимся от заключения договора (для конкурса, аукциона, запроса котировок и предложений в электронной форме, участниками которого могут являться только субъекты малого и среднего предпринимательства)
 * 
 * <p>Java class for purchaseProtocolEvasionDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="purchaseProtocolEvasionDataType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/223fz/purchase/1}purchaseProtocolDataType">
 *       &lt;sequence>
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
 *         &lt;choice>
 *           &lt;sequence>
 *             &lt;element name="protocolFCODRegistryNumber" minOccurs="0">
 *               &lt;simpleType>
 *                 &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *                   &lt;maxLength value="100"/>
 *                 &lt;/restriction>
 *               &lt;/simpleType>
 *             &lt;/element>
 *             &lt;element name="protocolFCDRegistryNumber" minOccurs="0">
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
 *         &lt;element name="protocolEvasionFinalProtocolApplicationInfo" type="{http://zakupki.gov.ru/223fz/purchase/1}protocolEvasionFinalProtocolApplicationInfoType"/>
 *         &lt;element name="protocolEvasionDecisionInfo" type="{http://zakupki.gov.ru/223fz/purchase/1}protocolEvasionDecisionInfoType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "purchaseProtocolEvasionDataType", propOrder = {
    "commissionNumber",
    "commissionName",
    "commissionResult",
    "protocolFCODRegistryNumber",
    "protocolFCDRegistryNumber",
    "protocolFKVORegistryNumber",
    "protocolRZ1RegistryNumber",
    "protocolRZRegistryNumber",
    "protocolSummingupInfo",
    "protocolEvasionFinalProtocolApplicationInfo",
    "protocolEvasionDecisionInfo"
})
@XmlSeeAlso({
    ru.gov.zakupki._223fz.purchase._1.PurchaseProtocolEvasionAESMBOItemType.PurchaseProtocolEvasionAESMBOData.class,
    ru.gov.zakupki._223fz.purchase._1.PurchaseProtocolEvasionZPESMBOItemType.PurchaseProtocolEvasionZPESMBOData.class,
    ru.gov.zakupki._223fz.purchase._1.PurchaseProtocolEvasionZKESMBOItemType.PurchaseProtocolEvasionZKESMBOData.class,
    ru.gov.zakupki._223fz.purchase._1.PurchaseProtocolEvasionKESMBOItemType.PurchaseProtocolEvasionKESMBOData.class
})
public class PurchaseProtocolEvasionDataType
    extends PurchaseProtocolDataType
{

    protected String commissionNumber;
    protected String commissionName;
    protected String commissionResult;
    protected String protocolFCODRegistryNumber;
    protected String protocolFCDRegistryNumber;
    protected String protocolFKVORegistryNumber;
    protected String protocolRZ1RegistryNumber;
    protected String protocolRZRegistryNumber;
    @XmlElement(required = true)
    protected ProtocolSummingupRefferenceDataType protocolSummingupInfo;
    @XmlElement(required = true)
    protected ProtocolEvasionFinalProtocolApplicationInfoType protocolEvasionFinalProtocolApplicationInfo;
    @XmlElement(required = true)
    protected ProtocolEvasionDecisionInfoType protocolEvasionDecisionInfo;

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
     * Gets the value of the protocolEvasionFinalProtocolApplicationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ProtocolEvasionFinalProtocolApplicationInfoType }
     *     
     */
    public ProtocolEvasionFinalProtocolApplicationInfoType getProtocolEvasionFinalProtocolApplicationInfo() {
        return protocolEvasionFinalProtocolApplicationInfo;
    }

    /**
     * Sets the value of the protocolEvasionFinalProtocolApplicationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolEvasionFinalProtocolApplicationInfoType }
     *     
     */
    public void setProtocolEvasionFinalProtocolApplicationInfo(ProtocolEvasionFinalProtocolApplicationInfoType value) {
        this.protocolEvasionFinalProtocolApplicationInfo = value;
    }

    /**
     * Gets the value of the protocolEvasionDecisionInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ProtocolEvasionDecisionInfoType }
     *     
     */
    public ProtocolEvasionDecisionInfoType getProtocolEvasionDecisionInfo() {
        return protocolEvasionDecisionInfo;
    }

    /**
     * Sets the value of the protocolEvasionDecisionInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolEvasionDecisionInfoType }
     *     
     */
    public void setProtocolEvasionDecisionInfo(ProtocolEvasionDecisionInfoType value) {
        this.protocolEvasionDecisionInfo = value;
    }

}
