//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.23 at 05:21:14 PM MSK 
//


package ru.gov.zakupki._223fz.purchase._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ru.gov.zakupki._223fz.types._1.ProtocolExtendFieldValueListType;
import ru.gov.zakupki._223fz.types._1.ProtocolTemplateFieldLevelType;
import ru.gov.zakupki._223fz.types._1.ProtocolTemplateHideBlocks;
import ru.gov.zakupki._223fz.types._1.TemplateStructureTabType;


/**
 * Протокол закупки
 * 
 * <p>Java class for purchaseProtocolDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="purchaseProtocolDataType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/223fz/purchase/1}purchaseProtocolBaseDataType">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="typeName">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="2000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="targetPhaseCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="procedureDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="procedurePlace" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="2000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="lotApplicationsList" type="{http://zakupki.gov.ru/223fz/purchase/1}protocolLotApplicationListType"/>
 *         &lt;element name="protocolSignDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="templateVersion" type="{http://zakupki.gov.ru/223fz/types/1}templateVersionType" minOccurs="0"/>
 *         &lt;element name="templateStructure" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="level" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="tabLevel" type="{http://zakupki.gov.ru/223fz/types/1}protocolTemplateFieldLevelType"/>
 *                             &lt;element name="tab" type="{http://zakupki.gov.ru/223fz/types/1}templateStructureTabType" maxOccurs="unbounded"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="templateBlocks" type="{http://zakupki.gov.ru/223fz/types/1}protocolTemplateHideBlocks" minOccurs="0"/>
 *         &lt;element name="extendFields" type="{http://zakupki.gov.ru/223fz/types/1}protocolExtendFieldValueListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "purchaseProtocolDataType", propOrder = {
    "type",
    "typeName",
    "targetPhaseCode",
    "procedureDate",
    "procedurePlace",
    "lotApplicationsList",
    "protocolSignDate",
    "templateVersion",
    "templateStructure",
    "templateBlocks",
    "extendFields"
})
public class PurchaseProtocolDataType
    extends PurchaseProtocolBaseDataType
{

    protected long type;
    @XmlElement(required = true)
    protected String typeName;
    protected Long targetPhaseCode;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar procedureDate;
    protected String procedurePlace;
    @XmlElement(required = true)
    protected ProtocolLotApplicationListType lotApplicationsList;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar protocolSignDate;
    protected Long templateVersion;
    protected PurchaseProtocolDataType.TemplateStructure templateStructure;
    protected ProtocolTemplateHideBlocks templateBlocks;
    protected ProtocolExtendFieldValueListType extendFields;

    /**
     * Gets the value of the type property.
     * 
     */
    public long getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     */
    public void setType(long value) {
        this.type = value;
    }

    /**
     * Gets the value of the typeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeName() {
        return typeName;
    }

    /**
     * Sets the value of the typeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeName(String value) {
        this.typeName = value;
    }

    /**
     * Gets the value of the targetPhaseCode property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTargetPhaseCode() {
        return targetPhaseCode;
    }

    /**
     * Sets the value of the targetPhaseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTargetPhaseCode(Long value) {
        this.targetPhaseCode = value;
    }

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
     * Gets the value of the lotApplicationsList property.
     * 
     * @return
     *     possible object is
     *     {@link ProtocolLotApplicationListType }
     *     
     */
    public ProtocolLotApplicationListType getLotApplicationsList() {
        return lotApplicationsList;
    }

    /**
     * Sets the value of the lotApplicationsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolLotApplicationListType }
     *     
     */
    public void setLotApplicationsList(ProtocolLotApplicationListType value) {
        this.lotApplicationsList = value;
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
     * Gets the value of the templateVersion property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTemplateVersion() {
        return templateVersion;
    }

    /**
     * Sets the value of the templateVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTemplateVersion(Long value) {
        this.templateVersion = value;
    }

    /**
     * Gets the value of the templateStructure property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseProtocolDataType.TemplateStructure }
     *     
     */
    public PurchaseProtocolDataType.TemplateStructure getTemplateStructure() {
        return templateStructure;
    }

    /**
     * Sets the value of the templateStructure property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseProtocolDataType.TemplateStructure }
     *     
     */
    public void setTemplateStructure(PurchaseProtocolDataType.TemplateStructure value) {
        this.templateStructure = value;
    }

    /**
     * Gets the value of the templateBlocks property.
     * 
     * @return
     *     possible object is
     *     {@link ProtocolTemplateHideBlocks }
     *     
     */
    public ProtocolTemplateHideBlocks getTemplateBlocks() {
        return templateBlocks;
    }

    /**
     * Sets the value of the templateBlocks property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolTemplateHideBlocks }
     *     
     */
    public void setTemplateBlocks(ProtocolTemplateHideBlocks value) {
        this.templateBlocks = value;
    }

    /**
     * Gets the value of the extendFields property.
     * 
     * @return
     *     possible object is
     *     {@link ProtocolExtendFieldValueListType }
     *     
     */
    public ProtocolExtendFieldValueListType getExtendFields() {
        return extendFields;
    }

    /**
     * Sets the value of the extendFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolExtendFieldValueListType }
     *     
     */
    public void setExtendFields(ProtocolExtendFieldValueListType value) {
        this.extendFields = value;
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
     *         &lt;element name="level" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="tabLevel" type="{http://zakupki.gov.ru/223fz/types/1}protocolTemplateFieldLevelType"/>
     *                   &lt;element name="tab" type="{http://zakupki.gov.ru/223fz/types/1}templateStructureTabType" maxOccurs="unbounded"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
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
    @XmlType(name = "", propOrder = {
        "level"
    })
    public static class TemplateStructure {

        @XmlElement(required = true)
        protected List<PurchaseProtocolDataType.TemplateStructure.Level> level;

        /**
         * Gets the value of the level property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the level property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLevel().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PurchaseProtocolDataType.TemplateStructure.Level }
         * 
         * 
         */
        public List<PurchaseProtocolDataType.TemplateStructure.Level> getLevel() {
            if (level == null) {
                level = new ArrayList<PurchaseProtocolDataType.TemplateStructure.Level>();
            }
            return this.level;
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
         *         &lt;element name="tabLevel" type="{http://zakupki.gov.ru/223fz/types/1}protocolTemplateFieldLevelType"/>
         *         &lt;element name="tab" type="{http://zakupki.gov.ru/223fz/types/1}templateStructureTabType" maxOccurs="unbounded"/>
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
            "tabLevel",
            "tab"
        })
        public static class Level {

            @XmlElement(required = true)
            @XmlSchemaType(name = "string")
            protected ProtocolTemplateFieldLevelType tabLevel;
            @XmlElement(required = true)
            protected List<TemplateStructureTabType> tab;

            /**
             * Gets the value of the tabLevel property.
             * 
             * @return
             *     possible object is
             *     {@link ProtocolTemplateFieldLevelType }
             *     
             */
            public ProtocolTemplateFieldLevelType getTabLevel() {
                return tabLevel;
            }

            /**
             * Sets the value of the tabLevel property.
             * 
             * @param value
             *     allowed object is
             *     {@link ProtocolTemplateFieldLevelType }
             *     
             */
            public void setTabLevel(ProtocolTemplateFieldLevelType value) {
                this.tabLevel = value;
            }

            /**
             * Gets the value of the tab property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the tab property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getTab().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TemplateStructureTabType }
             * 
             * 
             */
            public List<TemplateStructureTabType> getTab() {
                if (tab == null) {
                    tab = new ArrayList<TemplateStructureTabType>();
                }
                return this.tab;
            }

        }

    }

}
