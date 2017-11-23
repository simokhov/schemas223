//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.23 at 05:26:25 PM MSK 
//


package ru.gov.zakupki._223fz.types._1;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Прикрепленные документы
 * 
 * <p>Java class for documentListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="documentListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="totalDocumentsCount" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="additionalDocumentsCount" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="prevDocument" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="guid" type="{http://zakupki.gov.ru/223fz/types/1}guidType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="document" type="{http://zakupki.gov.ru/223fz/types/1}documentType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "documentListType", propOrder = {
    "totalDocumentsCount",
    "additionalDocumentsCount",
    "prevDocument",
    "document"
})
public class DocumentListType {

    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger totalDocumentsCount;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger additionalDocumentsCount;
    protected List<DocumentListType.PrevDocument> prevDocument;
    protected List<DocumentType> document;

    /**
     * Gets the value of the totalDocumentsCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalDocumentsCount() {
        return totalDocumentsCount;
    }

    /**
     * Sets the value of the totalDocumentsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalDocumentsCount(BigInteger value) {
        this.totalDocumentsCount = value;
    }

    /**
     * Gets the value of the additionalDocumentsCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAdditionalDocumentsCount() {
        return additionalDocumentsCount;
    }

    /**
     * Sets the value of the additionalDocumentsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAdditionalDocumentsCount(BigInteger value) {
        this.additionalDocumentsCount = value;
    }

    /**
     * Gets the value of the prevDocument property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prevDocument property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrevDocument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentListType.PrevDocument }
     * 
     * 
     */
    public List<DocumentListType.PrevDocument> getPrevDocument() {
        if (prevDocument == null) {
            prevDocument = new ArrayList<DocumentListType.PrevDocument>();
        }
        return this.prevDocument;
    }

    /**
     * Gets the value of the document property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the document property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentType }
     * 
     * 
     */
    public List<DocumentType> getDocument() {
        if (document == null) {
            document = new ArrayList<DocumentType>();
        }
        return this.document;
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
     *         &lt;element name="guid" type="{http://zakupki.gov.ru/223fz/types/1}guidType"/>
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
        "guid"
    })
    public static class PrevDocument {

        @XmlElement(required = true)
        protected String guid;

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

    }

}
