//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.23 at 05:29:18 PM MSK 
//


package ru.gov.zakupki._223fz.userblockinfo._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ru.gov.zakupki._223fz.types._1.UserType;


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
 *         &lt;element name="user" type="{http://zakupki.gov.ru/223fz/types/1}userType"/>
 *         &lt;element name="blockReason" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="2000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="unblockReason" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="2000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="blockPeriod" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="blockDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   &lt;element name="unblockDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
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
    "user",
    "blockReason",
    "unblockReason",
    "blockPeriod"
})
@XmlRootElement(name = "userBlockInfo")
public class UserBlockInfo {

    @XmlElement(required = true)
    protected UserType user;
    protected String blockReason;
    protected String unblockReason;
    protected UserBlockInfo.BlockPeriod blockPeriod;

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link UserType }
     *     
     */
    public UserType getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserType }
     *     
     */
    public void setUser(UserType value) {
        this.user = value;
    }

    /**
     * Gets the value of the blockReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlockReason() {
        return blockReason;
    }

    /**
     * Sets the value of the blockReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlockReason(String value) {
        this.blockReason = value;
    }

    /**
     * Gets the value of the unblockReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnblockReason() {
        return unblockReason;
    }

    /**
     * Sets the value of the unblockReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnblockReason(String value) {
        this.unblockReason = value;
    }

    /**
     * Gets the value of the blockPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link UserBlockInfo.BlockPeriod }
     *     
     */
    public UserBlockInfo.BlockPeriod getBlockPeriod() {
        return blockPeriod;
    }

    /**
     * Sets the value of the blockPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserBlockInfo.BlockPeriod }
     *     
     */
    public void setBlockPeriod(UserBlockInfo.BlockPeriod value) {
        this.blockPeriod = value;
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
     *         &lt;element name="blockDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         &lt;element name="unblockDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
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
        "blockDate",
        "unblockDate"
    })
    public static class BlockPeriod {

        @XmlElement(required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar blockDate;
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar unblockDate;

        /**
         * Gets the value of the blockDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getBlockDate() {
            return blockDate;
        }

        /**
         * Sets the value of the blockDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setBlockDate(XMLGregorianCalendar value) {
            this.blockDate = value;
        }

        /**
         * Gets the value of the unblockDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getUnblockDate() {
            return unblockDate;
        }

        /**
         * Sets the value of the unblockDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setUnblockDate(XMLGregorianCalendar value) {
            this.unblockDate = value;
        }

    }

}
