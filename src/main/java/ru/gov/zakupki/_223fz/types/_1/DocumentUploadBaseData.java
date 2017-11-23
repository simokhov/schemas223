//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.23 at 05:21:14 PM MSK 
//


package ru.gov.zakupki._223fz.types._1;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Базовый тип для загружаемого документа
 * 
 * <p>Java class for documentUploadBaseData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="documentUploadBaseData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="guid" type="{http://zakupki.gov.ru/223fz/types/1}guidType"/>
 *         &lt;element name="entityGuid" type="{http://zakupki.gov.ru/223fz/types/1}guidType"/>
 *         &lt;element name="placer" type="{http://zakupki.gov.ru/223fz/types/1}customerInfoType"/>
 *         &lt;element name="additionalDocumentsCount" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *         &lt;element name="documentNumber" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *         &lt;element name="document" type="{http://zakupki.gov.ru/223fz/types/1}documentType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "documentUploadBaseData", propOrder = {
    "guid",
    "entityGuid",
    "placer",
    "additionalDocumentsCount",
    "documentNumber",
    "document"
})
@XmlSeeAlso({
    ru.gov.zakupki._223fz.types._1.DocumentUpload.Body.OrderClauseDocumentUpload.class,
    ru.gov.zakupki._223fz.types._1.DocumentUpload.Body.NoticeDocumentUpload.class,
    ru.gov.zakupki._223fz.types._1.DocumentUpload.Body.ProtocolDocumentUpload.class,
    ru.gov.zakupki._223fz.types._1.DocumentUpload.Body.PurchaseContractDocumentUpload.class,
    ru.gov.zakupki._223fz.types._1.DocumentUpload.Body.PurchasePlanDocumentUpload.class,
    ru.gov.zakupki._223fz.types._1.DocumentUpload.Body.PurchaseContractAccountDocumentUpload.class,
    ru.gov.zakupki._223fz.types._1.DocumentUpload.Body.PurchaseRejectionDocumentUpload.class,
    ru.gov.zakupki._223fz.types._1.DocumentUpload.Body.ExplanationDocumentUpload.class,
    ru.gov.zakupki._223fz.types._1.DocumentUpload.Body.ChangeRequirementsDocumentUpload.class,
    ru.gov.zakupki._223fz.types._1.DocumentUpload.Body.ContractDocumentUpload.class
})
public abstract class DocumentUploadBaseData {

    @XmlElement(required = true)
    protected String guid;
    @XmlElement(required = true)
    protected String entityGuid;
    @XmlElement(required = true)
    protected CustomerInfoType placer;
    @XmlElement(required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger additionalDocumentsCount;
    @XmlElement(required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger documentNumber;
    @XmlElement(required = true)
    protected DocumentType document;

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
     * Gets the value of the entityGuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityGuid() {
        return entityGuid;
    }

    /**
     * Sets the value of the entityGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityGuid(String value) {
        this.entityGuid = value;
    }

    /**
     * Gets the value of the placer property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerInfoType }
     *     
     */
    public CustomerInfoType getPlacer() {
        return placer;
    }

    /**
     * Sets the value of the placer property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerInfoType }
     *     
     */
    public void setPlacer(CustomerInfoType value) {
        this.placer = value;
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
     * Gets the value of the documentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDocumentNumber() {
        return documentNumber;
    }

    /**
     * Sets the value of the documentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDocumentNumber(BigInteger value) {
        this.documentNumber = value;
    }

    /**
     * Gets the value of the document property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentType }
     *     
     */
    public DocumentType getDocument() {
        return document;
    }

    /**
     * Sets the value of the document property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentType }
     *     
     */
    public void setDocument(DocumentType value) {
        this.document = value;
    }

}
