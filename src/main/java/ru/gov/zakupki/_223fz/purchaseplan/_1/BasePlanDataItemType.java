//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.05 at 04:40:02 PM MSK 
//


package ru.gov.zakupki._223fz.purchaseplan._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ru.gov.zakupki._223fz.types._1.CustomerInfoType;
import ru.gov.zakupki._223fz.types._1.PurchasePlanItemStatusType;


/**
 * Позиция плана
 * 
 * <p>Java class for basePlanDataItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="basePlanDataItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="guid" type="{http://zakupki.gov.ru/223fz/types/1}guidType"/>
 *         &lt;element name="ordinalNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="contractSubject">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="2000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="planItemCustomer" type="{http://zakupki.gov.ru/223fz/types/1}customerInfoType"/>
 *         &lt;element name="minimumRequirements" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;whiteSpace value="collapse"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="contractEndDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="additionalInfo" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="1000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="modificationDescription" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="2000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="status" type="{http://zakupki.gov.ru/223fz/types/1}purchasePlanItemStatusType" minOccurs="0"/>
 *         &lt;element name="isPurchasePlaced" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="changedGWSAndDates" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="changedNMSKMoreTenPercent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="otherChanges" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="checkResult" type="{http://zakupki.gov.ru/223fz/purchasePlan/1}purchasePlanItemCheckResultType" minOccurs="0"/>
 *         &lt;element name="errorMessages" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="cancellationReason" type="{http://zakupki.gov.ru/223fz/purchasePlan/1}cancellationReasonType" minOccurs="0"/>
 *         &lt;element name="longTerm" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="shared" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="initialPositionData" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="initialPositionGuid" type="{http://zakupki.gov.ru/223fz/types/1}guidType"/>
 *                   &lt;element name="initialPlanGuid" type="{http://zakupki.gov.ru/223fz/types/1}guidType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="longTermVolumes" type="{http://zakupki.gov.ru/223fz/purchasePlan/1}longTermVolumeType" minOccurs="0"/>
 *         &lt;element name="longTermSMBVolumes" type="{http://zakupki.gov.ru/223fz/purchasePlan/1}longTermVolumeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "basePlanDataItemType", propOrder = {
    "guid",
    "ordinalNumber",
    "contractSubject",
    "planItemCustomer",
    "minimumRequirements",
    "contractEndDate",
    "additionalInfo",
    "modificationDescription",
    "status",
    "isPurchasePlaced",
    "changedGWSAndDates",
    "changedNMSKMoreTenPercent",
    "otherChanges",
    "checkResult",
    "errorMessages",
    "cancellationReason",
    "longTerm",
    "shared",
    "initialPositionData",
    "longTermVolumes",
    "longTermSMBVolumes"
})
@XmlSeeAlso({
    InnovationPlanDataItemType.class,
    PurchasePlanDataItemType.class
})
public abstract class BasePlanDataItemType {

    @XmlElement(required = true)
    protected String guid;
    protected int ordinalNumber;
    @XmlElement(required = true)
    protected String contractSubject;
    @XmlElement(required = true)
    protected CustomerInfoType planItemCustomer;
    protected String minimumRequirements;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar contractEndDate;
    protected String additionalInfo;
    protected String modificationDescription;
    @XmlSchemaType(name = "string")
    protected PurchasePlanItemStatusType status;
    protected Boolean isPurchasePlaced;
    protected Boolean changedGWSAndDates;
    protected Boolean changedNMSKMoreTenPercent;
    protected Boolean otherChanges;
    @XmlSchemaType(name = "string")
    protected PurchasePlanItemCheckResultType checkResult;
    protected String errorMessages;
    @XmlSchemaType(name = "string")
    protected CancellationReasonType cancellationReason;
    @XmlElement(defaultValue = "false")
    protected Boolean longTerm;
    protected Boolean shared;
    protected BasePlanDataItemType.InitialPositionData initialPositionData;
    protected LongTermVolumeType longTermVolumes;
    protected LongTermVolumeType longTermSMBVolumes;

    /**
     * Gets the value of the guid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuid() {
        return guid;
    }

    /**
     * Sets the value of the guid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuid(String value) {
        this.guid = value;
    }

    /**
     * Gets the value of the ordinalNumber property.
     * 
     */
    public int getOrdinalNumber() {
        return ordinalNumber;
    }

    /**
     * Sets the value of the ordinalNumber property.
     * 
     */
    public void setOrdinalNumber(int value) {
        this.ordinalNumber = value;
    }

    /**
     * Gets the value of the contractSubject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractSubject() {
        return contractSubject;
    }

    /**
     * Sets the value of the contractSubject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractSubject(String value) {
        this.contractSubject = value;
    }

    /**
     * Gets the value of the planItemCustomer property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerInfoType }
     *     
     */
    public CustomerInfoType getPlanItemCustomer() {
        return planItemCustomer;
    }

    /**
     * Sets the value of the planItemCustomer property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerInfoType }
     *     
     */
    public void setPlanItemCustomer(CustomerInfoType value) {
        this.planItemCustomer = value;
    }

    /**
     * Gets the value of the minimumRequirements property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinimumRequirements() {
        return minimumRequirements;
    }

    /**
     * Sets the value of the minimumRequirements property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinimumRequirements(String value) {
        this.minimumRequirements = value;
    }

    /**
     * Gets the value of the contractEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getContractEndDate() {
        return contractEndDate;
    }

    /**
     * Sets the value of the contractEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setContractEndDate(XMLGregorianCalendar value) {
        this.contractEndDate = value;
    }

    /**
     * Gets the value of the additionalInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalInfo() {
        return additionalInfo;
    }

    /**
     * Sets the value of the additionalInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalInfo(String value) {
        this.additionalInfo = value;
    }

    /**
     * Gets the value of the modificationDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModificationDescription() {
        return modificationDescription;
    }

    /**
     * Sets the value of the modificationDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModificationDescription(String value) {
        this.modificationDescription = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link PurchasePlanItemStatusType }
     *     
     */
    public PurchasePlanItemStatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchasePlanItemStatusType }
     *     
     */
    public void setStatus(PurchasePlanItemStatusType value) {
        this.status = value;
    }

    /**
     * Gets the value of the isPurchasePlaced property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPurchasePlaced() {
        return isPurchasePlaced;
    }

    /**
     * Sets the value of the isPurchasePlaced property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPurchasePlaced(Boolean value) {
        this.isPurchasePlaced = value;
    }

    /**
     * Gets the value of the changedGWSAndDates property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChangedGWSAndDates() {
        return changedGWSAndDates;
    }

    /**
     * Sets the value of the changedGWSAndDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChangedGWSAndDates(Boolean value) {
        this.changedGWSAndDates = value;
    }

    /**
     * Gets the value of the changedNMSKMoreTenPercent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChangedNMSKMoreTenPercent() {
        return changedNMSKMoreTenPercent;
    }

    /**
     * Sets the value of the changedNMSKMoreTenPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChangedNMSKMoreTenPercent(Boolean value) {
        this.changedNMSKMoreTenPercent = value;
    }

    /**
     * Gets the value of the otherChanges property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOtherChanges() {
        return otherChanges;
    }

    /**
     * Sets the value of the otherChanges property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOtherChanges(Boolean value) {
        this.otherChanges = value;
    }

    /**
     * Gets the value of the checkResult property.
     * 
     * @return
     *     possible object is
     *     {@link PurchasePlanItemCheckResultType }
     *     
     */
    public PurchasePlanItemCheckResultType getCheckResult() {
        return checkResult;
    }

    /**
     * Sets the value of the checkResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchasePlanItemCheckResultType }
     *     
     */
    public void setCheckResult(PurchasePlanItemCheckResultType value) {
        this.checkResult = value;
    }

    /**
     * Gets the value of the errorMessages property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorMessages() {
        return errorMessages;
    }

    /**
     * Sets the value of the errorMessages property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorMessages(String value) {
        this.errorMessages = value;
    }

    /**
     * Gets the value of the cancellationReason property.
     * 
     * @return
     *     possible object is
     *     {@link CancellationReasonType }
     *     
     */
    public CancellationReasonType getCancellationReason() {
        return cancellationReason;
    }

    /**
     * Sets the value of the cancellationReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancellationReasonType }
     *     
     */
    public void setCancellationReason(CancellationReasonType value) {
        this.cancellationReason = value;
    }

    /**
     * Gets the value of the longTerm property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLongTerm() {
        return longTerm;
    }

    /**
     * Sets the value of the longTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLongTerm(Boolean value) {
        this.longTerm = value;
    }

    /**
     * Gets the value of the shared property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShared() {
        return shared;
    }

    /**
     * Sets the value of the shared property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShared(Boolean value) {
        this.shared = value;
    }

    /**
     * Gets the value of the initialPositionData property.
     * 
     * @return
     *     possible object is
     *     {@link BasePlanDataItemType.InitialPositionData }
     *     
     */
    public BasePlanDataItemType.InitialPositionData getInitialPositionData() {
        return initialPositionData;
    }

    /**
     * Sets the value of the initialPositionData property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasePlanDataItemType.InitialPositionData }
     *     
     */
    public void setInitialPositionData(BasePlanDataItemType.InitialPositionData value) {
        this.initialPositionData = value;
    }

    /**
     * Gets the value of the longTermVolumes property.
     * 
     * @return
     *     possible object is
     *     {@link LongTermVolumeType }
     *     
     */
    public LongTermVolumeType getLongTermVolumes() {
        return longTermVolumes;
    }

    /**
     * Sets the value of the longTermVolumes property.
     * 
     * @param value
     *     allowed object is
     *     {@link LongTermVolumeType }
     *     
     */
    public void setLongTermVolumes(LongTermVolumeType value) {
        this.longTermVolumes = value;
    }

    /**
     * Gets the value of the longTermSMBVolumes property.
     * 
     * @return
     *     possible object is
     *     {@link LongTermVolumeType }
     *     
     */
    public LongTermVolumeType getLongTermSMBVolumes() {
        return longTermSMBVolumes;
    }

    /**
     * Sets the value of the longTermSMBVolumes property.
     * 
     * @param value
     *     allowed object is
     *     {@link LongTermVolumeType }
     *     
     */
    public void setLongTermSMBVolumes(LongTermVolumeType value) {
        this.longTermSMBVolumes = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="initialPositionGuid" type="{http://zakupki.gov.ru/223fz/types/1}guidType"/>
     *         &lt;element name="initialPlanGuid" type="{http://zakupki.gov.ru/223fz/types/1}guidType"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "initialPositionGuid",
        "initialPlanGuid"
    })
    public static class InitialPositionData {

        @XmlElement(required = true)
        protected String initialPositionGuid;
        @XmlElement(required = true)
        protected String initialPlanGuid;

        /**
         * Gets the value of the initialPositionGuid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInitialPositionGuid() {
            return initialPositionGuid;
        }

        /**
         * Sets the value of the initialPositionGuid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInitialPositionGuid(String value) {
            this.initialPositionGuid = value;
        }

        /**
         * Gets the value of the initialPlanGuid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInitialPlanGuid() {
            return initialPlanGuid;
        }

        /**
         * Sets the value of the initialPlanGuid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInitialPlanGuid(String value) {
            this.initialPlanGuid = value;
        }

    }

}
