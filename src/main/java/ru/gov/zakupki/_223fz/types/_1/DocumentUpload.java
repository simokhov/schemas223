//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.06 at 10:22:30 AM MSK 
//


package ru.gov.zakupki._223fz.types._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/223fz/types/1}packetType">
 *       &lt;sequence>
 *         &lt;element name="body">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;choice>
 *                     &lt;element name="orderClauseDocumentUpload">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;extension base="{http://zakupki.gov.ru/223fz/types/1}documentUploadBaseData">
 *                           &lt;/extension>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="noticeDocumentUpload">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;extension base="{http://zakupki.gov.ru/223fz/types/1}documentUploadBaseData">
 *                           &lt;/extension>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="protocolDocumentUpload">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;extension base="{http://zakupki.gov.ru/223fz/types/1}documentUploadBaseData">
 *                           &lt;/extension>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="purchaseContractDocumentUpload">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;extension base="{http://zakupki.gov.ru/223fz/types/1}documentUploadBaseData">
 *                           &lt;/extension>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="purchasePlanDocumentUpload">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;extension base="{http://zakupki.gov.ru/223fz/types/1}documentUploadBaseData">
 *                           &lt;/extension>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="purchasePlanProjectDocumentUpload">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;extension base="{http://zakupki.gov.ru/223fz/types/1}documentUploadBaseData">
 *                           &lt;/extension>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="purchaseContractAccountDocumentUpload">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;extension base="{http://zakupki.gov.ru/223fz/types/1}documentUploadBaseData">
 *                           &lt;/extension>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="purchaseRejectionDocumentUpload">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;extension base="{http://zakupki.gov.ru/223fz/types/1}documentUploadBaseData">
 *                           &lt;/extension>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="explanationDocumentUpload">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;extension base="{http://zakupki.gov.ru/223fz/types/1}documentUploadBaseData">
 *                           &lt;/extension>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="explanationRequestDocumentUpload">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;extension base="{http://zakupki.gov.ru/223fz/types/1}documentUploadBaseData">
 *                           &lt;/extension>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="changeRequirementsDocumentUpload">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;extension base="{http://zakupki.gov.ru/223fz/types/1}documentUploadBaseData">
 *                           &lt;/extension>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="contractDocumentUpload">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;extension base="{http://zakupki.gov.ru/223fz/types/1}documentUploadBaseData">
 *                           &lt;/extension>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="contractCompletionDocumentUpload">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;extension base="{http://zakupki.gov.ru/223fz/types/1}documentUploadBaseData">
 *                           &lt;/extension>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="contractCancellationDocumentUpload">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;extension base="{http://zakupki.gov.ru/223fz/types/1}documentUploadBaseData">
 *                           &lt;/extension>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/choice>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "body"
})
@XmlRootElement(name = "documentUpload")
public class DocumentUpload
    extends PacketType
{

    @XmlElement(required = true)
    protected DocumentUpload.Body body;

    /**
     * Gets the value of the body property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentUpload.Body }
     *     
     */
    public DocumentUpload.Body getBody() {
        return body;
    }

    /**
     * Sets the value of the body property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentUpload.Body }
     *     
     */
    public void setBody(DocumentUpload.Body value) {
        this.body = value;
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
     *         &lt;choice>
     *           &lt;element name="orderClauseDocumentUpload">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;extension base="{http://zakupki.gov.ru/223fz/types/1}documentUploadBaseData">
     *                 &lt;/extension>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element name="noticeDocumentUpload">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;extension base="{http://zakupki.gov.ru/223fz/types/1}documentUploadBaseData">
     *                 &lt;/extension>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element name="protocolDocumentUpload">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;extension base="{http://zakupki.gov.ru/223fz/types/1}documentUploadBaseData">
     *                 &lt;/extension>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element name="purchaseContractDocumentUpload">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;extension base="{http://zakupki.gov.ru/223fz/types/1}documentUploadBaseData">
     *                 &lt;/extension>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element name="purchasePlanDocumentUpload">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;extension base="{http://zakupki.gov.ru/223fz/types/1}documentUploadBaseData">
     *                 &lt;/extension>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element name="purchasePlanProjectDocumentUpload">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;extension base="{http://zakupki.gov.ru/223fz/types/1}documentUploadBaseData">
     *                 &lt;/extension>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element name="purchaseContractAccountDocumentUpload">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;extension base="{http://zakupki.gov.ru/223fz/types/1}documentUploadBaseData">
     *                 &lt;/extension>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element name="purchaseRejectionDocumentUpload">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;extension base="{http://zakupki.gov.ru/223fz/types/1}documentUploadBaseData">
     *                 &lt;/extension>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element name="explanationDocumentUpload">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;extension base="{http://zakupki.gov.ru/223fz/types/1}documentUploadBaseData">
     *                 &lt;/extension>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element name="explanationRequestDocumentUpload">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;extension base="{http://zakupki.gov.ru/223fz/types/1}documentUploadBaseData">
     *                 &lt;/extension>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element name="changeRequirementsDocumentUpload">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;extension base="{http://zakupki.gov.ru/223fz/types/1}documentUploadBaseData">
     *                 &lt;/extension>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element name="contractDocumentUpload">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;extension base="{http://zakupki.gov.ru/223fz/types/1}documentUploadBaseData">
     *                 &lt;/extension>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element name="contractCompletionDocumentUpload">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;extension base="{http://zakupki.gov.ru/223fz/types/1}documentUploadBaseData">
     *                 &lt;/extension>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element name="contractCancellationDocumentUpload">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;extension base="{http://zakupki.gov.ru/223fz/types/1}documentUploadBaseData">
     *                 &lt;/extension>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *         &lt;/choice>
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
        "orderClauseDocumentUpload",
        "noticeDocumentUpload",
        "protocolDocumentUpload",
        "purchaseContractDocumentUpload",
        "purchasePlanDocumentUpload",
        "purchasePlanProjectDocumentUpload",
        "purchaseContractAccountDocumentUpload",
        "purchaseRejectionDocumentUpload",
        "explanationDocumentUpload",
        "explanationRequestDocumentUpload",
        "changeRequirementsDocumentUpload",
        "contractDocumentUpload",
        "contractCompletionDocumentUpload",
        "contractCancellationDocumentUpload"
    })
    public static class Body {

        protected DocumentUpload.Body.OrderClauseDocumentUpload orderClauseDocumentUpload;
        protected DocumentUpload.Body.NoticeDocumentUpload noticeDocumentUpload;
        protected DocumentUpload.Body.ProtocolDocumentUpload protocolDocumentUpload;
        protected DocumentUpload.Body.PurchaseContractDocumentUpload purchaseContractDocumentUpload;
        protected DocumentUpload.Body.PurchasePlanDocumentUpload purchasePlanDocumentUpload;
        protected DocumentUpload.Body.PurchasePlanProjectDocumentUpload purchasePlanProjectDocumentUpload;
        protected DocumentUpload.Body.PurchaseContractAccountDocumentUpload purchaseContractAccountDocumentUpload;
        protected DocumentUpload.Body.PurchaseRejectionDocumentUpload purchaseRejectionDocumentUpload;
        protected DocumentUpload.Body.ExplanationDocumentUpload explanationDocumentUpload;
        protected DocumentUpload.Body.ExplanationRequestDocumentUpload explanationRequestDocumentUpload;
        protected DocumentUpload.Body.ChangeRequirementsDocumentUpload changeRequirementsDocumentUpload;
        protected DocumentUpload.Body.ContractDocumentUpload contractDocumentUpload;
        protected DocumentUpload.Body.ContractCompletionDocumentUpload contractCompletionDocumentUpload;
        protected DocumentUpload.Body.ContractCancellationDocumentUpload contractCancellationDocumentUpload;

        /**
         * Gets the value of the orderClauseDocumentUpload property.
         * 
         * @return
         *     possible object is
         *     {@link DocumentUpload.Body.OrderClauseDocumentUpload }
         *     
         */
        public DocumentUpload.Body.OrderClauseDocumentUpload getOrderClauseDocumentUpload() {
            return orderClauseDocumentUpload;
        }

        /**
         * Sets the value of the orderClauseDocumentUpload property.
         * 
         * @param value
         *     allowed object is
         *     {@link DocumentUpload.Body.OrderClauseDocumentUpload }
         *     
         */
        public void setOrderClauseDocumentUpload(DocumentUpload.Body.OrderClauseDocumentUpload value) {
            this.orderClauseDocumentUpload = value;
        }

        /**
         * Gets the value of the noticeDocumentUpload property.
         * 
         * @return
         *     possible object is
         *     {@link DocumentUpload.Body.NoticeDocumentUpload }
         *     
         */
        public DocumentUpload.Body.NoticeDocumentUpload getNoticeDocumentUpload() {
            return noticeDocumentUpload;
        }

        /**
         * Sets the value of the noticeDocumentUpload property.
         * 
         * @param value
         *     allowed object is
         *     {@link DocumentUpload.Body.NoticeDocumentUpload }
         *     
         */
        public void setNoticeDocumentUpload(DocumentUpload.Body.NoticeDocumentUpload value) {
            this.noticeDocumentUpload = value;
        }

        /**
         * Gets the value of the protocolDocumentUpload property.
         * 
         * @return
         *     possible object is
         *     {@link DocumentUpload.Body.ProtocolDocumentUpload }
         *     
         */
        public DocumentUpload.Body.ProtocolDocumentUpload getProtocolDocumentUpload() {
            return protocolDocumentUpload;
        }

        /**
         * Sets the value of the protocolDocumentUpload property.
         * 
         * @param value
         *     allowed object is
         *     {@link DocumentUpload.Body.ProtocolDocumentUpload }
         *     
         */
        public void setProtocolDocumentUpload(DocumentUpload.Body.ProtocolDocumentUpload value) {
            this.protocolDocumentUpload = value;
        }

        /**
         * Gets the value of the purchaseContractDocumentUpload property.
         * 
         * @return
         *     possible object is
         *     {@link DocumentUpload.Body.PurchaseContractDocumentUpload }
         *     
         */
        public DocumentUpload.Body.PurchaseContractDocumentUpload getPurchaseContractDocumentUpload() {
            return purchaseContractDocumentUpload;
        }

        /**
         * Sets the value of the purchaseContractDocumentUpload property.
         * 
         * @param value
         *     allowed object is
         *     {@link DocumentUpload.Body.PurchaseContractDocumentUpload }
         *     
         */
        public void setPurchaseContractDocumentUpload(DocumentUpload.Body.PurchaseContractDocumentUpload value) {
            this.purchaseContractDocumentUpload = value;
        }

        /**
         * Gets the value of the purchasePlanDocumentUpload property.
         * 
         * @return
         *     possible object is
         *     {@link DocumentUpload.Body.PurchasePlanDocumentUpload }
         *     
         */
        public DocumentUpload.Body.PurchasePlanDocumentUpload getPurchasePlanDocumentUpload() {
            return purchasePlanDocumentUpload;
        }

        /**
         * Sets the value of the purchasePlanDocumentUpload property.
         * 
         * @param value
         *     allowed object is
         *     {@link DocumentUpload.Body.PurchasePlanDocumentUpload }
         *     
         */
        public void setPurchasePlanDocumentUpload(DocumentUpload.Body.PurchasePlanDocumentUpload value) {
            this.purchasePlanDocumentUpload = value;
        }

        /**
         * Gets the value of the purchasePlanProjectDocumentUpload property.
         * 
         * @return
         *     possible object is
         *     {@link DocumentUpload.Body.PurchasePlanProjectDocumentUpload }
         *     
         */
        public DocumentUpload.Body.PurchasePlanProjectDocumentUpload getPurchasePlanProjectDocumentUpload() {
            return purchasePlanProjectDocumentUpload;
        }

        /**
         * Sets the value of the purchasePlanProjectDocumentUpload property.
         * 
         * @param value
         *     allowed object is
         *     {@link DocumentUpload.Body.PurchasePlanProjectDocumentUpload }
         *     
         */
        public void setPurchasePlanProjectDocumentUpload(DocumentUpload.Body.PurchasePlanProjectDocumentUpload value) {
            this.purchasePlanProjectDocumentUpload = value;
        }

        /**
         * Gets the value of the purchaseContractAccountDocumentUpload property.
         * 
         * @return
         *     possible object is
         *     {@link DocumentUpload.Body.PurchaseContractAccountDocumentUpload }
         *     
         */
        public DocumentUpload.Body.PurchaseContractAccountDocumentUpload getPurchaseContractAccountDocumentUpload() {
            return purchaseContractAccountDocumentUpload;
        }

        /**
         * Sets the value of the purchaseContractAccountDocumentUpload property.
         * 
         * @param value
         *     allowed object is
         *     {@link DocumentUpload.Body.PurchaseContractAccountDocumentUpload }
         *     
         */
        public void setPurchaseContractAccountDocumentUpload(DocumentUpload.Body.PurchaseContractAccountDocumentUpload value) {
            this.purchaseContractAccountDocumentUpload = value;
        }

        /**
         * Gets the value of the purchaseRejectionDocumentUpload property.
         * 
         * @return
         *     possible object is
         *     {@link DocumentUpload.Body.PurchaseRejectionDocumentUpload }
         *     
         */
        public DocumentUpload.Body.PurchaseRejectionDocumentUpload getPurchaseRejectionDocumentUpload() {
            return purchaseRejectionDocumentUpload;
        }

        /**
         * Sets the value of the purchaseRejectionDocumentUpload property.
         * 
         * @param value
         *     allowed object is
         *     {@link DocumentUpload.Body.PurchaseRejectionDocumentUpload }
         *     
         */
        public void setPurchaseRejectionDocumentUpload(DocumentUpload.Body.PurchaseRejectionDocumentUpload value) {
            this.purchaseRejectionDocumentUpload = value;
        }

        /**
         * Gets the value of the explanationDocumentUpload property.
         * 
         * @return
         *     possible object is
         *     {@link DocumentUpload.Body.ExplanationDocumentUpload }
         *     
         */
        public DocumentUpload.Body.ExplanationDocumentUpload getExplanationDocumentUpload() {
            return explanationDocumentUpload;
        }

        /**
         * Sets the value of the explanationDocumentUpload property.
         * 
         * @param value
         *     allowed object is
         *     {@link DocumentUpload.Body.ExplanationDocumentUpload }
         *     
         */
        public void setExplanationDocumentUpload(DocumentUpload.Body.ExplanationDocumentUpload value) {
            this.explanationDocumentUpload = value;
        }

        /**
         * Gets the value of the explanationRequestDocumentUpload property.
         * 
         * @return
         *     possible object is
         *     {@link DocumentUpload.Body.ExplanationRequestDocumentUpload }
         *     
         */
        public DocumentUpload.Body.ExplanationRequestDocumentUpload getExplanationRequestDocumentUpload() {
            return explanationRequestDocumentUpload;
        }

        /**
         * Sets the value of the explanationRequestDocumentUpload property.
         * 
         * @param value
         *     allowed object is
         *     {@link DocumentUpload.Body.ExplanationRequestDocumentUpload }
         *     
         */
        public void setExplanationRequestDocumentUpload(DocumentUpload.Body.ExplanationRequestDocumentUpload value) {
            this.explanationRequestDocumentUpload = value;
        }

        /**
         * Gets the value of the changeRequirementsDocumentUpload property.
         * 
         * @return
         *     possible object is
         *     {@link DocumentUpload.Body.ChangeRequirementsDocumentUpload }
         *     
         */
        public DocumentUpload.Body.ChangeRequirementsDocumentUpload getChangeRequirementsDocumentUpload() {
            return changeRequirementsDocumentUpload;
        }

        /**
         * Sets the value of the changeRequirementsDocumentUpload property.
         * 
         * @param value
         *     allowed object is
         *     {@link DocumentUpload.Body.ChangeRequirementsDocumentUpload }
         *     
         */
        public void setChangeRequirementsDocumentUpload(DocumentUpload.Body.ChangeRequirementsDocumentUpload value) {
            this.changeRequirementsDocumentUpload = value;
        }

        /**
         * Gets the value of the contractDocumentUpload property.
         * 
         * @return
         *     possible object is
         *     {@link DocumentUpload.Body.ContractDocumentUpload }
         *     
         */
        public DocumentUpload.Body.ContractDocumentUpload getContractDocumentUpload() {
            return contractDocumentUpload;
        }

        /**
         * Sets the value of the contractDocumentUpload property.
         * 
         * @param value
         *     allowed object is
         *     {@link DocumentUpload.Body.ContractDocumentUpload }
         *     
         */
        public void setContractDocumentUpload(DocumentUpload.Body.ContractDocumentUpload value) {
            this.contractDocumentUpload = value;
        }

        /**
         * Gets the value of the contractCompletionDocumentUpload property.
         * 
         * @return
         *     possible object is
         *     {@link DocumentUpload.Body.ContractCompletionDocumentUpload }
         *     
         */
        public DocumentUpload.Body.ContractCompletionDocumentUpload getContractCompletionDocumentUpload() {
            return contractCompletionDocumentUpload;
        }

        /**
         * Sets the value of the contractCompletionDocumentUpload property.
         * 
         * @param value
         *     allowed object is
         *     {@link DocumentUpload.Body.ContractCompletionDocumentUpload }
         *     
         */
        public void setContractCompletionDocumentUpload(DocumentUpload.Body.ContractCompletionDocumentUpload value) {
            this.contractCompletionDocumentUpload = value;
        }

        /**
         * Gets the value of the contractCancellationDocumentUpload property.
         * 
         * @return
         *     possible object is
         *     {@link DocumentUpload.Body.ContractCancellationDocumentUpload }
         *     
         */
        public DocumentUpload.Body.ContractCancellationDocumentUpload getContractCancellationDocumentUpload() {
            return contractCancellationDocumentUpload;
        }

        /**
         * Sets the value of the contractCancellationDocumentUpload property.
         * 
         * @param value
         *     allowed object is
         *     {@link DocumentUpload.Body.ContractCancellationDocumentUpload }
         *     
         */
        public void setContractCancellationDocumentUpload(DocumentUpload.Body.ContractCancellationDocumentUpload value) {
            this.contractCancellationDocumentUpload = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://zakupki.gov.ru/223fz/types/1}documentUploadBaseData">
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class ChangeRequirementsDocumentUpload
            extends DocumentUploadBaseData
        {


        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://zakupki.gov.ru/223fz/types/1}documentUploadBaseData">
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class ContractCancellationDocumentUpload
            extends DocumentUploadBaseData
        {


        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://zakupki.gov.ru/223fz/types/1}documentUploadBaseData">
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class ContractCompletionDocumentUpload
            extends DocumentUploadBaseData
        {


        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://zakupki.gov.ru/223fz/types/1}documentUploadBaseData">
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class ContractDocumentUpload
            extends DocumentUploadBaseData
        {


        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://zakupki.gov.ru/223fz/types/1}documentUploadBaseData">
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class ExplanationDocumentUpload
            extends DocumentUploadBaseData
        {


        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://zakupki.gov.ru/223fz/types/1}documentUploadBaseData">
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class ExplanationRequestDocumentUpload
            extends DocumentUploadBaseData
        {


        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://zakupki.gov.ru/223fz/types/1}documentUploadBaseData">
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class NoticeDocumentUpload
            extends DocumentUploadBaseData
        {


        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://zakupki.gov.ru/223fz/types/1}documentUploadBaseData">
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class OrderClauseDocumentUpload
            extends DocumentUploadBaseData
        {


        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://zakupki.gov.ru/223fz/types/1}documentUploadBaseData">
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class ProtocolDocumentUpload
            extends DocumentUploadBaseData
        {


        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://zakupki.gov.ru/223fz/types/1}documentUploadBaseData">
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class PurchaseContractAccountDocumentUpload
            extends DocumentUploadBaseData
        {


        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://zakupki.gov.ru/223fz/types/1}documentUploadBaseData">
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class PurchaseContractDocumentUpload
            extends DocumentUploadBaseData
        {


        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://zakupki.gov.ru/223fz/types/1}documentUploadBaseData">
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class PurchasePlanDocumentUpload
            extends DocumentUploadBaseData
        {


        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://zakupki.gov.ru/223fz/types/1}documentUploadBaseData">
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class PurchasePlanProjectDocumentUpload
            extends DocumentUploadBaseData
        {


        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://zakupki.gov.ru/223fz/types/1}documentUploadBaseData">
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class PurchaseRejectionDocumentUpload
            extends DocumentUploadBaseData
        {


        }

    }

}
