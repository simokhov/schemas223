//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.12.18 at 10:06:38 AM MSK 
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
import ru.gov.zakupki._223fz.types._1.ElectronicPlaceInfoType;
import ru.gov.zakupki._223fz.types._1.LotISListType;
import ru.gov.zakupki._223fz.types._1.NoticeExtendFieldValueListType;
import ru.gov.zakupki._223fz.types._1.NoticeTemplateFieldLevelType;
import ru.gov.zakupki._223fz.types._1.TemplateStructureTabType;


/**
 * Извещение о закупке "Иной способ"
 * 
 * <p>Java class for purchaseNoticeDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="purchaseNoticeDataType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/223fz/purchase/1}purchaseNoticeDataBaseType">
 *       &lt;sequence>
 *         &lt;element name="electronicPlaceInfo" type="{http://zakupki.gov.ru/223fz/types/1}electronicPlaceInfoType" minOccurs="0"/>
 *         &lt;element name="placingProcedure" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="examinationPlace">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *                         &lt;maxLength value="2000"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="examinationDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="summingupDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="summingupPlace" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *                         &lt;maxLength value="2000"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="submissionCloseDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="publicationPlannedDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
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
 *                             &lt;element name="tabLevel" type="{http://zakupki.gov.ru/223fz/types/1}noticeTemplateFieldLevelType"/>
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
 *         &lt;element name="extendFields" type="{http://zakupki.gov.ru/223fz/types/1}noticeExtendFieldValueListType" minOccurs="0"/>
 *         &lt;element name="lots" type="{http://zakupki.gov.ru/223fz/types/1}lotISListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "purchaseNoticeDataType", propOrder = {
    "electronicPlaceInfo",
    "placingProcedure",
    "submissionCloseDateTime",
    "publicationPlannedDate",
    "templateVersion",
    "templateStructure",
    "extendFields",
    "lots"
})
public class PurchaseNoticeDataType
    extends PurchaseNoticeDataBaseType
{

    protected ElectronicPlaceInfoType electronicPlaceInfo;
    protected PurchaseNoticeDataType.PlacingProcedure placingProcedure;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar submissionCloseDateTime;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar publicationPlannedDate;
    protected Long templateVersion;
    protected PurchaseNoticeDataType.TemplateStructure templateStructure;
    protected NoticeExtendFieldValueListType extendFields;
    protected LotISListType lots;

    /**
     * Gets the value of the electronicPlaceInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ElectronicPlaceInfoType }
     *     
     */
    public ElectronicPlaceInfoType getElectronicPlaceInfo() {
        return electronicPlaceInfo;
    }

    /**
     * Sets the value of the electronicPlaceInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElectronicPlaceInfoType }
     *     
     */
    public void setElectronicPlaceInfo(ElectronicPlaceInfoType value) {
        this.electronicPlaceInfo = value;
    }

    /**
     * Gets the value of the placingProcedure property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseNoticeDataType.PlacingProcedure }
     *     
     */
    public PurchaseNoticeDataType.PlacingProcedure getPlacingProcedure() {
        return placingProcedure;
    }

    /**
     * Sets the value of the placingProcedure property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseNoticeDataType.PlacingProcedure }
     *     
     */
    public void setPlacingProcedure(PurchaseNoticeDataType.PlacingProcedure value) {
        this.placingProcedure = value;
    }

    /**
     * Gets the value of the submissionCloseDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSubmissionCloseDateTime() {
        return submissionCloseDateTime;
    }

    /**
     * Sets the value of the submissionCloseDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSubmissionCloseDateTime(XMLGregorianCalendar value) {
        this.submissionCloseDateTime = value;
    }

    /**
     * Gets the value of the publicationPlannedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPublicationPlannedDate() {
        return publicationPlannedDate;
    }

    /**
     * Sets the value of the publicationPlannedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPublicationPlannedDate(XMLGregorianCalendar value) {
        this.publicationPlannedDate = value;
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
     *     {@link PurchaseNoticeDataType.TemplateStructure }
     *     
     */
    public PurchaseNoticeDataType.TemplateStructure getTemplateStructure() {
        return templateStructure;
    }

    /**
     * Sets the value of the templateStructure property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseNoticeDataType.TemplateStructure }
     *     
     */
    public void setTemplateStructure(PurchaseNoticeDataType.TemplateStructure value) {
        this.templateStructure = value;
    }

    /**
     * Gets the value of the extendFields property.
     * 
     * @return
     *     possible object is
     *     {@link NoticeExtendFieldValueListType }
     *     
     */
    public NoticeExtendFieldValueListType getExtendFields() {
        return extendFields;
    }

    /**
     * Sets the value of the extendFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoticeExtendFieldValueListType }
     *     
     */
    public void setExtendFields(NoticeExtendFieldValueListType value) {
        this.extendFields = value;
    }

    /**
     * Gets the value of the lots property.
     * 
     * @return
     *     possible object is
     *     {@link LotISListType }
     *     
     */
    public LotISListType getLots() {
        return lots;
    }

    /**
     * Sets the value of the lots property.
     * 
     * @param value
     *     allowed object is
     *     {@link LotISListType }
     *     
     */
    public void setLots(LotISListType value) {
        this.lots = value;
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
     *         &lt;element name="examinationPlace">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
     *               &lt;maxLength value="2000"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="examinationDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *         &lt;element name="summingupDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *         &lt;element name="summingupPlace" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
     *               &lt;maxLength value="2000"/>
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
    @XmlType(name = "", propOrder = {
        "examinationPlace",
        "examinationDateTime",
        "summingupDateTime",
        "summingupPlace"
    })
    public static class PlacingProcedure {

        @XmlElement(required = true)
        protected String examinationPlace;
        @XmlElement(required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar examinationDateTime;
        @XmlElement(required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar summingupDateTime;
        protected String summingupPlace;

        /**
         * Gets the value of the examinationPlace property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExaminationPlace() {
            return examinationPlace;
        }

        /**
         * Sets the value of the examinationPlace property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExaminationPlace(String value) {
            this.examinationPlace = value;
        }

        /**
         * Gets the value of the examinationDateTime property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getExaminationDateTime() {
            return examinationDateTime;
        }

        /**
         * Sets the value of the examinationDateTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setExaminationDateTime(XMLGregorianCalendar value) {
            this.examinationDateTime = value;
        }

        /**
         * Gets the value of the summingupDateTime property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getSummingupDateTime() {
            return summingupDateTime;
        }

        /**
         * Sets the value of the summingupDateTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setSummingupDateTime(XMLGregorianCalendar value) {
            this.summingupDateTime = value;
        }

        /**
         * Gets the value of the summingupPlace property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSummingupPlace() {
            return summingupPlace;
        }

        /**
         * Sets the value of the summingupPlace property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSummingupPlace(String value) {
            this.summingupPlace = value;
        }

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
     *                   &lt;element name="tabLevel" type="{http://zakupki.gov.ru/223fz/types/1}noticeTemplateFieldLevelType"/>
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
        protected List<PurchaseNoticeDataType.TemplateStructure.Level> level;

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
         * {@link PurchaseNoticeDataType.TemplateStructure.Level }
         * 
         * 
         */
        public List<PurchaseNoticeDataType.TemplateStructure.Level> getLevel() {
            if (level == null) {
                level = new ArrayList<PurchaseNoticeDataType.TemplateStructure.Level>();
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
         *         &lt;element name="tabLevel" type="{http://zakupki.gov.ru/223fz/types/1}noticeTemplateFieldLevelType"/>
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
            protected NoticeTemplateFieldLevelType tabLevel;
            @XmlElement(required = true)
            protected List<TemplateStructureTabType> tab;

            /**
             * Gets the value of the tabLevel property.
             * 
             * @return
             *     possible object is
             *     {@link NoticeTemplateFieldLevelType }
             *     
             */
            public NoticeTemplateFieldLevelType getTabLevel() {
                return tabLevel;
            }

            /**
             * Sets the value of the tabLevel property.
             * 
             * @param value
             *     allowed object is
             *     {@link NoticeTemplateFieldLevelType }
             *     
             */
            public void setTabLevel(NoticeTemplateFieldLevelType value) {
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
