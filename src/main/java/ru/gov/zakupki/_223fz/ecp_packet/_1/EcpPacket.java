//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.08.30 at 04:59:41 PM MSK 
//


package ru.gov.zakupki._223fz.ecp_packet._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import ru.gov.zakupki._223fz.purchase._1.ExplanationItemType;
import ru.gov.zakupki._223fz.purchase._1.ProtocolCancellationType;
import ru.gov.zakupki._223fz.purchase._1.PurchaseNoticeAESMBOItemType;
import ru.gov.zakupki._223fz.purchase._1.PurchaseNoticeKESMBOItemType;
import ru.gov.zakupki._223fz.purchase._1.PurchaseProtocolCollationAESMBOItemType;
import ru.gov.zakupki._223fz.purchase._1.PurchaseProtocolFCDKESMBOItemType;
import ru.gov.zakupki._223fz.purchase._1.PurchaseProtocolFCODKESMBOItemType;
import ru.gov.zakupki._223fz.purchase._1.PurchaseProtocolFKVOKESMBOItemType;
import ru.gov.zakupki._223fz.purchase._1.PurchaseProtocolQSAESMBOItemType;
import ru.gov.zakupki._223fz.purchase._1.PurchaseProtocolQSZPESMBOItemType;
import ru.gov.zakupki._223fz.purchase._1.PurchaseProtocolRZ1AESMBOItemType;
import ru.gov.zakupki._223fz.purchase._1.PurchaseProtocolRZ1KESMBOItemType;
import ru.gov.zakupki._223fz.purchase._1.PurchaseProtocolRZ1ZPESMBOItemType;
import ru.gov.zakupki._223fz.purchase._1.PurchaseProtocolRZZKESMBOItemType;
import ru.gov.zakupki._223fz.purchase._1.PurchaseProtocolSummingupAESMBOItemType;
import ru.gov.zakupki._223fz.purchase._1.PurchaseProtocolSummingupKESMBOItemType;
import ru.gov.zakupki._223fz.purchase._1.PurchaseProtocolSummingupZKESMBOItemType;
import ru.gov.zakupki._223fz.purchase._1.PurchaseProtocolSummingupZPESMBOItemType;
import ru.gov.zakupki._223fz.types._1.DocumentType;
import ru.gov.zakupki._223fz.types._1.PacketType;


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
 *                     &lt;element name="purchaseNoticeKESMBO" type="{http://zakupki.gov.ru/223fz/purchase/1}purchaseNoticeKESMBOItemType"/>
 *                     &lt;element name="purchaseNoticeAESMBO" type="{http://zakupki.gov.ru/223fz/purchase/1}purchaseNoticeAESMBOItemType"/>
 *                     &lt;element name="explanation" type="{http://zakupki.gov.ru/223fz/purchase/1}explanationItemType"/>
 *                     &lt;element name="protocolCancellation" type="{http://zakupki.gov.ru/223fz/purchase/1}protocolCancellationType"/>
 *                     &lt;element name="purchaseProtocolFCODKESMBO" type="{http://zakupki.gov.ru/223fz/purchase/1}purchaseProtocolFCODKESMBOItemType"/>
 *                     &lt;element name="purchaseProtocolFCDKESMBO" type="{http://zakupki.gov.ru/223fz/purchase/1}purchaseProtocolFCDKESMBOItemType"/>
 *                     &lt;element name="purchaseProtocolFKVOKESMBO" type="{http://zakupki.gov.ru/223fz/purchase/1}purchaseProtocolFKVOKESMBOItemType"/>
 *                     &lt;element name="purchaseProtocolRZ1KESMBO" type="{http://zakupki.gov.ru/223fz/purchase/1}purchaseProtocolRZ1KESMBOItemType"/>
 *                     &lt;element name="purchaseProtocolSummingupKESMBO" type="{http://zakupki.gov.ru/223fz/purchase/1}purchaseProtocolSummingupKESMBOItemType"/>
 *                     &lt;element name="purchaseProtocolRZ1AESMBO" type="{http://zakupki.gov.ru/223fz/purchase/1}purchaseProtocolRZ1AESMBOItemType"/>
 *                     &lt;element name="purchaseProtocolCollationAESMBO" type="{http://zakupki.gov.ru/223fz/purchase/1}purchaseProtocolCollationAESMBOItemType"/>
 *                     &lt;element name="purchaseProtocolQSAESMBO" type="{http://zakupki.gov.ru/223fz/purchase/1}purchaseProtocolQSAESMBOItemType"/>
 *                     &lt;element name="purchaseProtocolSummingupAESMBO" type="{http://zakupki.gov.ru/223fz/purchase/1}purchaseProtocolSummingupAESMBOItemType"/>
 *                     &lt;element name="purchaseProtocolRZZKESMBO" type="{http://zakupki.gov.ru/223fz/purchase/1}purchaseProtocolRZZKESMBOItemType"/>
 *                     &lt;element name="purchaseProtocolSummingupZKESMBO" type="{http://zakupki.gov.ru/223fz/purchase/1}purchaseProtocolSummingupZKESMBOItemType"/>
 *                     &lt;element name="purchaseProtocolRZ1ZPESMBO" type="{http://zakupki.gov.ru/223fz/purchase/1}purchaseProtocolRZ1ZPESMBOItemType"/>
 *                     &lt;element name="purchaseProtocolQSZPESMBO" type="{http://zakupki.gov.ru/223fz/purchase/1}purchaseProtocolQSZPESMBOItemType"/>
 *                     &lt;element name="purchaseProtocolSummingupZPESMBO" type="{http://zakupki.gov.ru/223fz/purchase/1}purchaseProtocolSummingupZPESMBOItemType"/>
 *                   &lt;/choice>
 *                   &lt;element name="printForm" type="{http://zakupki.gov.ru/223fz/types/1}documentType"/>
 *                   &lt;element name="cryptoSign" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
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
@XmlRootElement(name = "ecp-packet")
public class EcpPacket
    extends PacketType
{

    @XmlElement(required = true)
    protected EcpPacket.Body body;

    /**
     * Gets the value of the body property.
     * 
     * @return
     *     possible object is
     *     {@link EcpPacket.Body }
     *     
     */
    public EcpPacket.Body getBody() {
        return body;
    }

    /**
     * Sets the value of the body property.
     * 
     * @param value
     *     allowed object is
     *     {@link EcpPacket.Body }
     *     
     */
    public void setBody(EcpPacket.Body value) {
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
     *           &lt;element name="purchaseNoticeKESMBO" type="{http://zakupki.gov.ru/223fz/purchase/1}purchaseNoticeKESMBOItemType"/>
     *           &lt;element name="purchaseNoticeAESMBO" type="{http://zakupki.gov.ru/223fz/purchase/1}purchaseNoticeAESMBOItemType"/>
     *           &lt;element name="explanation" type="{http://zakupki.gov.ru/223fz/purchase/1}explanationItemType"/>
     *           &lt;element name="protocolCancellation" type="{http://zakupki.gov.ru/223fz/purchase/1}protocolCancellationType"/>
     *           &lt;element name="purchaseProtocolFCODKESMBO" type="{http://zakupki.gov.ru/223fz/purchase/1}purchaseProtocolFCODKESMBOItemType"/>
     *           &lt;element name="purchaseProtocolFCDKESMBO" type="{http://zakupki.gov.ru/223fz/purchase/1}purchaseProtocolFCDKESMBOItemType"/>
     *           &lt;element name="purchaseProtocolFKVOKESMBO" type="{http://zakupki.gov.ru/223fz/purchase/1}purchaseProtocolFKVOKESMBOItemType"/>
     *           &lt;element name="purchaseProtocolRZ1KESMBO" type="{http://zakupki.gov.ru/223fz/purchase/1}purchaseProtocolRZ1KESMBOItemType"/>
     *           &lt;element name="purchaseProtocolSummingupKESMBO" type="{http://zakupki.gov.ru/223fz/purchase/1}purchaseProtocolSummingupKESMBOItemType"/>
     *           &lt;element name="purchaseProtocolRZ1AESMBO" type="{http://zakupki.gov.ru/223fz/purchase/1}purchaseProtocolRZ1AESMBOItemType"/>
     *           &lt;element name="purchaseProtocolCollationAESMBO" type="{http://zakupki.gov.ru/223fz/purchase/1}purchaseProtocolCollationAESMBOItemType"/>
     *           &lt;element name="purchaseProtocolQSAESMBO" type="{http://zakupki.gov.ru/223fz/purchase/1}purchaseProtocolQSAESMBOItemType"/>
     *           &lt;element name="purchaseProtocolSummingupAESMBO" type="{http://zakupki.gov.ru/223fz/purchase/1}purchaseProtocolSummingupAESMBOItemType"/>
     *           &lt;element name="purchaseProtocolRZZKESMBO" type="{http://zakupki.gov.ru/223fz/purchase/1}purchaseProtocolRZZKESMBOItemType"/>
     *           &lt;element name="purchaseProtocolSummingupZKESMBO" type="{http://zakupki.gov.ru/223fz/purchase/1}purchaseProtocolSummingupZKESMBOItemType"/>
     *           &lt;element name="purchaseProtocolRZ1ZPESMBO" type="{http://zakupki.gov.ru/223fz/purchase/1}purchaseProtocolRZ1ZPESMBOItemType"/>
     *           &lt;element name="purchaseProtocolQSZPESMBO" type="{http://zakupki.gov.ru/223fz/purchase/1}purchaseProtocolQSZPESMBOItemType"/>
     *           &lt;element name="purchaseProtocolSummingupZPESMBO" type="{http://zakupki.gov.ru/223fz/purchase/1}purchaseProtocolSummingupZPESMBOItemType"/>
     *         &lt;/choice>
     *         &lt;element name="printForm" type="{http://zakupki.gov.ru/223fz/types/1}documentType"/>
     *         &lt;element name="cryptoSign" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
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
        "purchaseNoticeKESMBO",
        "purchaseNoticeAESMBO",
        "explanation",
        "protocolCancellation",
        "purchaseProtocolFCODKESMBO",
        "purchaseProtocolFCDKESMBO",
        "purchaseProtocolFKVOKESMBO",
        "purchaseProtocolRZ1KESMBO",
        "purchaseProtocolSummingupKESMBO",
        "purchaseProtocolRZ1AESMBO",
        "purchaseProtocolCollationAESMBO",
        "purchaseProtocolQSAESMBO",
        "purchaseProtocolSummingupAESMBO",
        "purchaseProtocolRZZKESMBO",
        "purchaseProtocolSummingupZKESMBO",
        "purchaseProtocolRZ1ZPESMBO",
        "purchaseProtocolQSZPESMBO",
        "purchaseProtocolSummingupZPESMBO",
        "printForm",
        "cryptoSign"
    })
    public static class Body {

        protected PurchaseNoticeKESMBOItemType purchaseNoticeKESMBO;
        protected PurchaseNoticeAESMBOItemType purchaseNoticeAESMBO;
        protected ExplanationItemType explanation;
        protected ProtocolCancellationType protocolCancellation;
        protected PurchaseProtocolFCODKESMBOItemType purchaseProtocolFCODKESMBO;
        protected PurchaseProtocolFCDKESMBOItemType purchaseProtocolFCDKESMBO;
        protected PurchaseProtocolFKVOKESMBOItemType purchaseProtocolFKVOKESMBO;
        protected PurchaseProtocolRZ1KESMBOItemType purchaseProtocolRZ1KESMBO;
        protected PurchaseProtocolSummingupKESMBOItemType purchaseProtocolSummingupKESMBO;
        protected PurchaseProtocolRZ1AESMBOItemType purchaseProtocolRZ1AESMBO;
        protected PurchaseProtocolCollationAESMBOItemType purchaseProtocolCollationAESMBO;
        protected PurchaseProtocolQSAESMBOItemType purchaseProtocolQSAESMBO;
        protected PurchaseProtocolSummingupAESMBOItemType purchaseProtocolSummingupAESMBO;
        protected PurchaseProtocolRZZKESMBOItemType purchaseProtocolRZZKESMBO;
        protected PurchaseProtocolSummingupZKESMBOItemType purchaseProtocolSummingupZKESMBO;
        protected PurchaseProtocolRZ1ZPESMBOItemType purchaseProtocolRZ1ZPESMBO;
        protected PurchaseProtocolQSZPESMBOItemType purchaseProtocolQSZPESMBO;
        protected PurchaseProtocolSummingupZPESMBOItemType purchaseProtocolSummingupZPESMBO;
        @XmlElement(required = true)
        protected DocumentType printForm;
        @XmlElement(required = true)
        protected byte[] cryptoSign;

        /**
         * Gets the value of the purchaseNoticeKESMBO property.
         * 
         * @return
         *     possible object is
         *     {@link PurchaseNoticeKESMBOItemType }
         *     
         */
        public PurchaseNoticeKESMBOItemType getPurchaseNoticeKESMBO() {
            return purchaseNoticeKESMBO;
        }

        /**
         * Sets the value of the purchaseNoticeKESMBO property.
         * 
         * @param value
         *     allowed object is
         *     {@link PurchaseNoticeKESMBOItemType }
         *     
         */
        public void setPurchaseNoticeKESMBO(PurchaseNoticeKESMBOItemType value) {
            this.purchaseNoticeKESMBO = value;
        }

        /**
         * Gets the value of the purchaseNoticeAESMBO property.
         * 
         * @return
         *     possible object is
         *     {@link PurchaseNoticeAESMBOItemType }
         *     
         */
        public PurchaseNoticeAESMBOItemType getPurchaseNoticeAESMBO() {
            return purchaseNoticeAESMBO;
        }

        /**
         * Sets the value of the purchaseNoticeAESMBO property.
         * 
         * @param value
         *     allowed object is
         *     {@link PurchaseNoticeAESMBOItemType }
         *     
         */
        public void setPurchaseNoticeAESMBO(PurchaseNoticeAESMBOItemType value) {
            this.purchaseNoticeAESMBO = value;
        }

        /**
         * Gets the value of the explanation property.
         * 
         * @return
         *     possible object is
         *     {@link ExplanationItemType }
         *     
         */
        public ExplanationItemType getExplanation() {
            return explanation;
        }

        /**
         * Sets the value of the explanation property.
         * 
         * @param value
         *     allowed object is
         *     {@link ExplanationItemType }
         *     
         */
        public void setExplanation(ExplanationItemType value) {
            this.explanation = value;
        }

        /**
         * Gets the value of the protocolCancellation property.
         * 
         * @return
         *     possible object is
         *     {@link ProtocolCancellationType }
         *     
         */
        public ProtocolCancellationType getProtocolCancellation() {
            return protocolCancellation;
        }

        /**
         * Sets the value of the protocolCancellation property.
         * 
         * @param value
         *     allowed object is
         *     {@link ProtocolCancellationType }
         *     
         */
        public void setProtocolCancellation(ProtocolCancellationType value) {
            this.protocolCancellation = value;
        }

        /**
         * Gets the value of the purchaseProtocolFCODKESMBO property.
         * 
         * @return
         *     possible object is
         *     {@link PurchaseProtocolFCODKESMBOItemType }
         *     
         */
        public PurchaseProtocolFCODKESMBOItemType getPurchaseProtocolFCODKESMBO() {
            return purchaseProtocolFCODKESMBO;
        }

        /**
         * Sets the value of the purchaseProtocolFCODKESMBO property.
         * 
         * @param value
         *     allowed object is
         *     {@link PurchaseProtocolFCODKESMBOItemType }
         *     
         */
        public void setPurchaseProtocolFCODKESMBO(PurchaseProtocolFCODKESMBOItemType value) {
            this.purchaseProtocolFCODKESMBO = value;
        }

        /**
         * Gets the value of the purchaseProtocolFCDKESMBO property.
         * 
         * @return
         *     possible object is
         *     {@link PurchaseProtocolFCDKESMBOItemType }
         *     
         */
        public PurchaseProtocolFCDKESMBOItemType getPurchaseProtocolFCDKESMBO() {
            return purchaseProtocolFCDKESMBO;
        }

        /**
         * Sets the value of the purchaseProtocolFCDKESMBO property.
         * 
         * @param value
         *     allowed object is
         *     {@link PurchaseProtocolFCDKESMBOItemType }
         *     
         */
        public void setPurchaseProtocolFCDKESMBO(PurchaseProtocolFCDKESMBOItemType value) {
            this.purchaseProtocolFCDKESMBO = value;
        }

        /**
         * Gets the value of the purchaseProtocolFKVOKESMBO property.
         * 
         * @return
         *     possible object is
         *     {@link PurchaseProtocolFKVOKESMBOItemType }
         *     
         */
        public PurchaseProtocolFKVOKESMBOItemType getPurchaseProtocolFKVOKESMBO() {
            return purchaseProtocolFKVOKESMBO;
        }

        /**
         * Sets the value of the purchaseProtocolFKVOKESMBO property.
         * 
         * @param value
         *     allowed object is
         *     {@link PurchaseProtocolFKVOKESMBOItemType }
         *     
         */
        public void setPurchaseProtocolFKVOKESMBO(PurchaseProtocolFKVOKESMBOItemType value) {
            this.purchaseProtocolFKVOKESMBO = value;
        }

        /**
         * Gets the value of the purchaseProtocolRZ1KESMBO property.
         * 
         * @return
         *     possible object is
         *     {@link PurchaseProtocolRZ1KESMBOItemType }
         *     
         */
        public PurchaseProtocolRZ1KESMBOItemType getPurchaseProtocolRZ1KESMBO() {
            return purchaseProtocolRZ1KESMBO;
        }

        /**
         * Sets the value of the purchaseProtocolRZ1KESMBO property.
         * 
         * @param value
         *     allowed object is
         *     {@link PurchaseProtocolRZ1KESMBOItemType }
         *     
         */
        public void setPurchaseProtocolRZ1KESMBO(PurchaseProtocolRZ1KESMBOItemType value) {
            this.purchaseProtocolRZ1KESMBO = value;
        }

        /**
         * Gets the value of the purchaseProtocolSummingupKESMBO property.
         * 
         * @return
         *     possible object is
         *     {@link PurchaseProtocolSummingupKESMBOItemType }
         *     
         */
        public PurchaseProtocolSummingupKESMBOItemType getPurchaseProtocolSummingupKESMBO() {
            return purchaseProtocolSummingupKESMBO;
        }

        /**
         * Sets the value of the purchaseProtocolSummingupKESMBO property.
         * 
         * @param value
         *     allowed object is
         *     {@link PurchaseProtocolSummingupKESMBOItemType }
         *     
         */
        public void setPurchaseProtocolSummingupKESMBO(PurchaseProtocolSummingupKESMBOItemType value) {
            this.purchaseProtocolSummingupKESMBO = value;
        }

        /**
         * Gets the value of the purchaseProtocolRZ1AESMBO property.
         * 
         * @return
         *     possible object is
         *     {@link PurchaseProtocolRZ1AESMBOItemType }
         *     
         */
        public PurchaseProtocolRZ1AESMBOItemType getPurchaseProtocolRZ1AESMBO() {
            return purchaseProtocolRZ1AESMBO;
        }

        /**
         * Sets the value of the purchaseProtocolRZ1AESMBO property.
         * 
         * @param value
         *     allowed object is
         *     {@link PurchaseProtocolRZ1AESMBOItemType }
         *     
         */
        public void setPurchaseProtocolRZ1AESMBO(PurchaseProtocolRZ1AESMBOItemType value) {
            this.purchaseProtocolRZ1AESMBO = value;
        }

        /**
         * Gets the value of the purchaseProtocolCollationAESMBO property.
         * 
         * @return
         *     possible object is
         *     {@link PurchaseProtocolCollationAESMBOItemType }
         *     
         */
        public PurchaseProtocolCollationAESMBOItemType getPurchaseProtocolCollationAESMBO() {
            return purchaseProtocolCollationAESMBO;
        }

        /**
         * Sets the value of the purchaseProtocolCollationAESMBO property.
         * 
         * @param value
         *     allowed object is
         *     {@link PurchaseProtocolCollationAESMBOItemType }
         *     
         */
        public void setPurchaseProtocolCollationAESMBO(PurchaseProtocolCollationAESMBOItemType value) {
            this.purchaseProtocolCollationAESMBO = value;
        }

        /**
         * Gets the value of the purchaseProtocolQSAESMBO property.
         * 
         * @return
         *     possible object is
         *     {@link PurchaseProtocolQSAESMBOItemType }
         *     
         */
        public PurchaseProtocolQSAESMBOItemType getPurchaseProtocolQSAESMBO() {
            return purchaseProtocolQSAESMBO;
        }

        /**
         * Sets the value of the purchaseProtocolQSAESMBO property.
         * 
         * @param value
         *     allowed object is
         *     {@link PurchaseProtocolQSAESMBOItemType }
         *     
         */
        public void setPurchaseProtocolQSAESMBO(PurchaseProtocolQSAESMBOItemType value) {
            this.purchaseProtocolQSAESMBO = value;
        }

        /**
         * Gets the value of the purchaseProtocolSummingupAESMBO property.
         * 
         * @return
         *     possible object is
         *     {@link PurchaseProtocolSummingupAESMBOItemType }
         *     
         */
        public PurchaseProtocolSummingupAESMBOItemType getPurchaseProtocolSummingupAESMBO() {
            return purchaseProtocolSummingupAESMBO;
        }

        /**
         * Sets the value of the purchaseProtocolSummingupAESMBO property.
         * 
         * @param value
         *     allowed object is
         *     {@link PurchaseProtocolSummingupAESMBOItemType }
         *     
         */
        public void setPurchaseProtocolSummingupAESMBO(PurchaseProtocolSummingupAESMBOItemType value) {
            this.purchaseProtocolSummingupAESMBO = value;
        }

        /**
         * Gets the value of the purchaseProtocolRZZKESMBO property.
         * 
         * @return
         *     possible object is
         *     {@link PurchaseProtocolRZZKESMBOItemType }
         *     
         */
        public PurchaseProtocolRZZKESMBOItemType getPurchaseProtocolRZZKESMBO() {
            return purchaseProtocolRZZKESMBO;
        }

        /**
         * Sets the value of the purchaseProtocolRZZKESMBO property.
         * 
         * @param value
         *     allowed object is
         *     {@link PurchaseProtocolRZZKESMBOItemType }
         *     
         */
        public void setPurchaseProtocolRZZKESMBO(PurchaseProtocolRZZKESMBOItemType value) {
            this.purchaseProtocolRZZKESMBO = value;
        }

        /**
         * Gets the value of the purchaseProtocolSummingupZKESMBO property.
         * 
         * @return
         *     possible object is
         *     {@link PurchaseProtocolSummingupZKESMBOItemType }
         *     
         */
        public PurchaseProtocolSummingupZKESMBOItemType getPurchaseProtocolSummingupZKESMBO() {
            return purchaseProtocolSummingupZKESMBO;
        }

        /**
         * Sets the value of the purchaseProtocolSummingupZKESMBO property.
         * 
         * @param value
         *     allowed object is
         *     {@link PurchaseProtocolSummingupZKESMBOItemType }
         *     
         */
        public void setPurchaseProtocolSummingupZKESMBO(PurchaseProtocolSummingupZKESMBOItemType value) {
            this.purchaseProtocolSummingupZKESMBO = value;
        }

        /**
         * Gets the value of the purchaseProtocolRZ1ZPESMBO property.
         * 
         * @return
         *     possible object is
         *     {@link PurchaseProtocolRZ1ZPESMBOItemType }
         *     
         */
        public PurchaseProtocolRZ1ZPESMBOItemType getPurchaseProtocolRZ1ZPESMBO() {
            return purchaseProtocolRZ1ZPESMBO;
        }

        /**
         * Sets the value of the purchaseProtocolRZ1ZPESMBO property.
         * 
         * @param value
         *     allowed object is
         *     {@link PurchaseProtocolRZ1ZPESMBOItemType }
         *     
         */
        public void setPurchaseProtocolRZ1ZPESMBO(PurchaseProtocolRZ1ZPESMBOItemType value) {
            this.purchaseProtocolRZ1ZPESMBO = value;
        }

        /**
         * Gets the value of the purchaseProtocolQSZPESMBO property.
         * 
         * @return
         *     possible object is
         *     {@link PurchaseProtocolQSZPESMBOItemType }
         *     
         */
        public PurchaseProtocolQSZPESMBOItemType getPurchaseProtocolQSZPESMBO() {
            return purchaseProtocolQSZPESMBO;
        }

        /**
         * Sets the value of the purchaseProtocolQSZPESMBO property.
         * 
         * @param value
         *     allowed object is
         *     {@link PurchaseProtocolQSZPESMBOItemType }
         *     
         */
        public void setPurchaseProtocolQSZPESMBO(PurchaseProtocolQSZPESMBOItemType value) {
            this.purchaseProtocolQSZPESMBO = value;
        }

        /**
         * Gets the value of the purchaseProtocolSummingupZPESMBO property.
         * 
         * @return
         *     possible object is
         *     {@link PurchaseProtocolSummingupZPESMBOItemType }
         *     
         */
        public PurchaseProtocolSummingupZPESMBOItemType getPurchaseProtocolSummingupZPESMBO() {
            return purchaseProtocolSummingupZPESMBO;
        }

        /**
         * Sets the value of the purchaseProtocolSummingupZPESMBO property.
         * 
         * @param value
         *     allowed object is
         *     {@link PurchaseProtocolSummingupZPESMBOItemType }
         *     
         */
        public void setPurchaseProtocolSummingupZPESMBO(PurchaseProtocolSummingupZPESMBOItemType value) {
            this.purchaseProtocolSummingupZPESMBO = value;
        }

        /**
         * Gets the value of the printForm property.
         * 
         * @return
         *     possible object is
         *     {@link DocumentType }
         *     
         */
        public DocumentType getPrintForm() {
            return printForm;
        }

        /**
         * Sets the value of the printForm property.
         * 
         * @param value
         *     allowed object is
         *     {@link DocumentType }
         *     
         */
        public void setPrintForm(DocumentType value) {
            this.printForm = value;
        }

        /**
         * Gets the value of the cryptoSign property.
         * 
         * @return
         *     possible object is
         *     byte[]
         */
        public byte[] getCryptoSign() {
            return cryptoSign;
        }

        /**
         * Sets the value of the cryptoSign property.
         * 
         * @param value
         *     allowed object is
         *     byte[]
         */
        public void setCryptoSign(byte[] value) {
            this.cryptoSign = value;
        }

    }

}
