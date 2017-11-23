//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.23 at 05:27:28 PM MSK 
//


package ru.gov.zakupki._223fz.types._1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Значение поля данных
 * 
 * <p>Java class for fieldValueType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="fieldValueType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="string">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="1000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="text">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="2000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="integer" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="boolean" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="dateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="url">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="1000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="attachments" type="{http://zakupki.gov.ru/223fz/types/1}documentListType"/>
 *         &lt;element name="nsi">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="currency" type="{http://zakupki.gov.ru/223fz/types/1}currencyType"/>
 *                   &lt;element name="okei" type="{http://zakupki.gov.ru/223fz/types/1}okeiProductType"/>
 *                   &lt;element name="okdp" type="{http://zakupki.gov.ru/223fz/types/1}okdpProductType"/>
 *                   &lt;element name="okpd2" type="{http://zakupki.gov.ru/223fz/types/1}okpd2ProductType"/>
 *                   &lt;element name="okved" type="{http://zakupki.gov.ru/223fz/types/1}okvedProductType"/>
 *                   &lt;element name="okved2" type="{http://zakupki.gov.ru/223fz/types/1}okved2ProductType"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="table">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="rows">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="row" type="{http://zakupki.gov.ru/223fz/types/1}extendTableRowType" maxOccurs="unbounded"/>
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
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fieldValueType", propOrder = {
    "string",
    "text",
    "integer",
    "number",
    "_boolean",
    "dateTime",
    "date",
    "url",
    "attachments",
    "nsi",
    "table"
})
public class FieldValueType {

    protected String string;
    protected String text;
    protected Integer integer;
    protected BigDecimal number;
    @XmlElement(name = "boolean")
    protected Boolean _boolean;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateTime;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar date;
    protected String url;
    protected DocumentListType attachments;
    protected FieldValueType.Nsi nsi;
    protected FieldValueType.Table table;

    /**
     * Gets the value of the string property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getString() {
        return string;
    }

    /**
     * Sets the value of the string property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setString(String value) {
        this.string = value;
    }

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
    }

    /**
     * Gets the value of the integer property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInteger() {
        return integer;
    }

    /**
     * Sets the value of the integer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInteger(Integer value) {
        this.integer = value;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNumber(BigDecimal value) {
        this.number = value;
    }

    /**
     * Gets the value of the boolean property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBoolean() {
        return _boolean;
    }

    /**
     * Sets the value of the boolean property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBoolean(Boolean value) {
        this._boolean = value;
    }

    /**
     * Gets the value of the dateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateTime() {
        return dateTime;
    }

    /**
     * Sets the value of the dateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateTime(XMLGregorianCalendar value) {
        this.dateTime = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
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

    /**
     * Gets the value of the attachments property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentListType }
     *     
     */
    public DocumentListType getAttachments() {
        return attachments;
    }

    /**
     * Sets the value of the attachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentListType }
     *     
     */
    public void setAttachments(DocumentListType value) {
        this.attachments = value;
    }

    /**
     * Gets the value of the nsi property.
     * 
     * @return
     *     possible object is
     *     {@link FieldValueType.Nsi }
     *     
     */
    public FieldValueType.Nsi getNsi() {
        return nsi;
    }

    /**
     * Sets the value of the nsi property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldValueType.Nsi }
     *     
     */
    public void setNsi(FieldValueType.Nsi value) {
        this.nsi = value;
    }

    /**
     * Gets the value of the table property.
     * 
     * @return
     *     possible object is
     *     {@link FieldValueType.Table }
     *     
     */
    public FieldValueType.Table getTable() {
        return table;
    }

    /**
     * Sets the value of the table property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldValueType.Table }
     *     
     */
    public void setTable(FieldValueType.Table value) {
        this.table = value;
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
     *       &lt;choice>
     *         &lt;element name="currency" type="{http://zakupki.gov.ru/223fz/types/1}currencyType"/>
     *         &lt;element name="okei" type="{http://zakupki.gov.ru/223fz/types/1}okeiProductType"/>
     *         &lt;element name="okdp" type="{http://zakupki.gov.ru/223fz/types/1}okdpProductType"/>
     *         &lt;element name="okpd2" type="{http://zakupki.gov.ru/223fz/types/1}okpd2ProductType"/>
     *         &lt;element name="okved" type="{http://zakupki.gov.ru/223fz/types/1}okvedProductType"/>
     *         &lt;element name="okved2" type="{http://zakupki.gov.ru/223fz/types/1}okved2ProductType"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "currency",
        "okei",
        "okdp",
        "okpd2",
        "okved",
        "okved2"
    })
    public static class Nsi {

        protected CurrencyType currency;
        protected OkeiProductType okei;
        protected OkdpProductType okdp;
        protected Okpd2ProductType okpd2;
        protected OkvedProductType okved;
        protected Okved2ProductType okved2;

        /**
         * Gets the value of the currency property.
         * 
         * @return
         *     possible object is
         *     {@link CurrencyType }
         *     
         */
        public CurrencyType getCurrency() {
            return currency;
        }

        /**
         * Sets the value of the currency property.
         * 
         * @param value
         *     allowed object is
         *     {@link CurrencyType }
         *     
         */
        public void setCurrency(CurrencyType value) {
            this.currency = value;
        }

        /**
         * Gets the value of the okei property.
         * 
         * @return
         *     possible object is
         *     {@link OkeiProductType }
         *     
         */
        public OkeiProductType getOkei() {
            return okei;
        }

        /**
         * Sets the value of the okei property.
         * 
         * @param value
         *     allowed object is
         *     {@link OkeiProductType }
         *     
         */
        public void setOkei(OkeiProductType value) {
            this.okei = value;
        }

        /**
         * Gets the value of the okdp property.
         * 
         * @return
         *     possible object is
         *     {@link OkdpProductType }
         *     
         */
        public OkdpProductType getOkdp() {
            return okdp;
        }

        /**
         * Sets the value of the okdp property.
         * 
         * @param value
         *     allowed object is
         *     {@link OkdpProductType }
         *     
         */
        public void setOkdp(OkdpProductType value) {
            this.okdp = value;
        }

        /**
         * Gets the value of the okpd2 property.
         * 
         * @return
         *     possible object is
         *     {@link Okpd2ProductType }
         *     
         */
        public Okpd2ProductType getOkpd2() {
            return okpd2;
        }

        /**
         * Sets the value of the okpd2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link Okpd2ProductType }
         *     
         */
        public void setOkpd2(Okpd2ProductType value) {
            this.okpd2 = value;
        }

        /**
         * Gets the value of the okved property.
         * 
         * @return
         *     possible object is
         *     {@link OkvedProductType }
         *     
         */
        public OkvedProductType getOkved() {
            return okved;
        }

        /**
         * Sets the value of the okved property.
         * 
         * @param value
         *     allowed object is
         *     {@link OkvedProductType }
         *     
         */
        public void setOkved(OkvedProductType value) {
            this.okved = value;
        }

        /**
         * Gets the value of the okved2 property.
         * 
         * @return
         *     possible object is
         *     {@link Okved2ProductType }
         *     
         */
        public Okved2ProductType getOkved2() {
            return okved2;
        }

        /**
         * Sets the value of the okved2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link Okved2ProductType }
         *     
         */
        public void setOkved2(Okved2ProductType value) {
            this.okved2 = value;
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
     *         &lt;element name="rows">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="row" type="{http://zakupki.gov.ru/223fz/types/1}extendTableRowType" maxOccurs="unbounded"/>
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
        "rows"
    })
    public static class Table {

        @XmlElement(required = true)
        protected FieldValueType.Table.Rows rows;

        /**
         * Gets the value of the rows property.
         * 
         * @return
         *     possible object is
         *     {@link FieldValueType.Table.Rows }
         *     
         */
        public FieldValueType.Table.Rows getRows() {
            return rows;
        }

        /**
         * Sets the value of the rows property.
         * 
         * @param value
         *     allowed object is
         *     {@link FieldValueType.Table.Rows }
         *     
         */
        public void setRows(FieldValueType.Table.Rows value) {
            this.rows = value;
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
         *         &lt;element name="row" type="{http://zakupki.gov.ru/223fz/types/1}extendTableRowType" maxOccurs="unbounded"/>
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
            "row"
        })
        public static class Rows {

            @XmlElement(required = true)
            protected List<ExtendTableRowType> row;

            /**
             * Gets the value of the row property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the row property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getRow().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ExtendTableRowType }
             * 
             * 
             */
            public List<ExtendTableRowType> getRow() {
                if (row == null) {
                    row = new ArrayList<ExtendTableRowType>();
                }
                return this.row;
            }

        }

    }

}
