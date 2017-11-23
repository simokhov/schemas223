//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.23 at 05:24:12 PM MSK 
//


package ru.gov.zakupki._223fz.types._1;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Значение поля данных
 * 
 * <p>Java class for tableColumnValueType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tableColumnValueType">
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
 *                   &lt;element name="okved" type="{http://zakupki.gov.ru/223fz/types/1}okvedProductType"/>
 *                 &lt;/choice>
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
@XmlType(name = "tableColumnValueType", propOrder = {
    "string",
    "text",
    "integer",
    "number",
    "_boolean",
    "dateTime",
    "date",
    "url",
    "attachments",
    "nsi"
})
public class TableColumnValueType {

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
    protected TableColumnValueType.Nsi nsi;

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
     *     {@link TableColumnValueType.Nsi }
     *     
     */
    public TableColumnValueType.Nsi getNsi() {
        return nsi;
    }

    /**
     * Sets the value of the nsi property.
     * 
     * @param value
     *     allowed object is
     *     {@link TableColumnValueType.Nsi }
     *     
     */
    public void setNsi(TableColumnValueType.Nsi value) {
        this.nsi = value;
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
     *         &lt;element name="okved" type="{http://zakupki.gov.ru/223fz/types/1}okvedProductType"/>
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
        "okved"
    })
    public static class Nsi {

        protected CurrencyType currency;
        protected OkeiProductType okei;
        protected OkdpProductType okdp;
        protected OkvedProductType okved;

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

    }

}
