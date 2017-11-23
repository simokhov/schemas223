//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.23 at 05:22:02 PM MSK 
//


package ru.gov.zakupki._223fz.types._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Описание вкладки шаблона
 * 
 * <p>Java class for templateStructureTabType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="templateStructureTabType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tabOrdinal" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="tabName">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="130"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="fixedName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="130"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="section" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="sectionOrdinal" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                   &lt;element name="sectionName">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *                         &lt;maxLength value="130"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="fixedName" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *                         &lt;maxLength value="130"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
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
@XmlType(name = "templateStructureTabType", propOrder = {
    "tabOrdinal",
    "tabName",
    "fixedName",
    "section"
})
public class TemplateStructureTabType {

    protected long tabOrdinal;
    @XmlElement(required = true)
    protected String tabName;
    protected String fixedName;
    @XmlElement(required = true)
    protected List<TemplateStructureTabType.Section> section;

    /**
     * Gets the value of the tabOrdinal property.
     * 
     */
    public long getTabOrdinal() {
        return tabOrdinal;
    }

    /**
     * Sets the value of the tabOrdinal property.
     * 
     */
    public void setTabOrdinal(long value) {
        this.tabOrdinal = value;
    }

    /**
     * Gets the value of the tabName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTabName() {
        return tabName;
    }

    /**
     * Sets the value of the tabName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTabName(String value) {
        this.tabName = value;
    }

    /**
     * Gets the value of the fixedName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFixedName() {
        return fixedName;
    }

    /**
     * Sets the value of the fixedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFixedName(String value) {
        this.fixedName = value;
    }

    /**
     * Gets the value of the section property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the section property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TemplateStructureTabType.Section }
     * 
     * 
     */
    public List<TemplateStructureTabType.Section> getSection() {
        if (section == null) {
            section = new ArrayList<TemplateStructureTabType.Section>();
        }
        return this.section;
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
     *         &lt;element name="sectionOrdinal" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *         &lt;element name="sectionName">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
     *               &lt;maxLength value="130"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="fixedName" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
     *               &lt;maxLength value="130"/>
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
        "sectionOrdinal",
        "sectionName",
        "fixedName"
    })
    public static class Section {

        protected long sectionOrdinal;
        @XmlElement(required = true)
        protected String sectionName;
        protected String fixedName;

        /**
         * Gets the value of the sectionOrdinal property.
         * 
         */
        public long getSectionOrdinal() {
            return sectionOrdinal;
        }

        /**
         * Sets the value of the sectionOrdinal property.
         * 
         */
        public void setSectionOrdinal(long value) {
            this.sectionOrdinal = value;
        }

        /**
         * Gets the value of the sectionName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSectionName() {
            return sectionName;
        }

        /**
         * Sets the value of the sectionName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSectionName(String value) {
            this.sectionName = value;
        }

        /**
         * Gets the value of the fixedName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFixedName() {
            return fixedName;
        }

        /**
         * Sets the value of the fixedName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFixedName(String value) {
            this.fixedName = value;
        }

    }

}
