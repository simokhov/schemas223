//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.11.07 at 09:42:20 AM MSK 
//


package ru.gov.zakupki._223fz.webrequest._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import ru.gov.zakupki._223fz.types._1.PacketType;
import ru.gov.zakupki._223fz.types._1.ResultType;
import ru.gov.zakupki._223fz.types._1.ViolationListType;


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
 *                   &lt;element name="refguid" type="{http://zakupki.gov.ru/223fz/types/1}guidType" minOccurs="0"/>
 *                   &lt;element name="result" type="{http://zakupki.gov.ru/223fz/types/1}resultType"/>
 *                   &lt;element name="publishedData" type="{http://zakupki.gov.ru/223fz/webRequest/1}publishedDataType" minOccurs="0"/>
 *                   &lt;element name="violations" type="{http://zakupki.gov.ru/223fz/types/1}violationListType" minOccurs="0"/>
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
@XmlRootElement(name = "publishedDataResponse")
public class PublishedDataResponse
    extends PacketType
{

    @XmlElement(required = true)
    protected PublishedDataResponse.Body body;

    /**
     * Gets the value of the body property.
     * 
     * @return
     *     possible object is
     *     {@link PublishedDataResponse.Body }
     *     
     */
    public PublishedDataResponse.Body getBody() {
        return body;
    }

    /**
     * Sets the value of the body property.
     * 
     * @param value
     *     allowed object is
     *     {@link PublishedDataResponse.Body }
     *     
     */
    public void setBody(PublishedDataResponse.Body value) {
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
     *         &lt;element name="refguid" type="{http://zakupki.gov.ru/223fz/types/1}guidType" minOccurs="0"/>
     *         &lt;element name="result" type="{http://zakupki.gov.ru/223fz/types/1}resultType"/>
     *         &lt;element name="publishedData" type="{http://zakupki.gov.ru/223fz/webRequest/1}publishedDataType" minOccurs="0"/>
     *         &lt;element name="violations" type="{http://zakupki.gov.ru/223fz/types/1}violationListType" minOccurs="0"/>
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
        "refguid",
        "result",
        "publishedData",
        "violations"
    })
    public static class Body {

        protected String refguid;
        @XmlElement(required = true)
        @XmlSchemaType(name = "string")
        protected ResultType result;
        protected PublishedDataType publishedData;
        protected ViolationListType violations;

        /**
         * Gets the value of the refguid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRefguid() {
            return refguid;
        }

        /**
         * Sets the value of the refguid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRefguid(String value) {
            this.refguid = value;
        }

        /**
         * Gets the value of the result property.
         * 
         * @return
         *     possible object is
         *     {@link ResultType }
         *     
         */
        public ResultType getResult() {
            return result;
        }

        /**
         * Sets the value of the result property.
         * 
         * @param value
         *     allowed object is
         *     {@link ResultType }
         *     
         */
        public void setResult(ResultType value) {
            this.result = value;
        }

        /**
         * Gets the value of the publishedData property.
         * 
         * @return
         *     possible object is
         *     {@link PublishedDataType }
         *     
         */
        public PublishedDataType getPublishedData() {
            return publishedData;
        }

        /**
         * Sets the value of the publishedData property.
         * 
         * @param value
         *     allowed object is
         *     {@link PublishedDataType }
         *     
         */
        public void setPublishedData(PublishedDataType value) {
            this.publishedData = value;
        }

        /**
         * Gets the value of the violations property.
         * 
         * @return
         *     possible object is
         *     {@link ViolationListType }
         *     
         */
        public ViolationListType getViolations() {
            return violations;
        }

        /**
         * Sets the value of the violations property.
         * 
         * @param value
         *     allowed object is
         *     {@link ViolationListType }
         *     
         */
        public void setViolations(ViolationListType value) {
            this.violations = value;
        }

    }

}
