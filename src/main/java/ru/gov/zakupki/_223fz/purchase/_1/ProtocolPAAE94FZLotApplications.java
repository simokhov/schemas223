//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.10 at 05:03:32 PM MSK 
//


package ru.gov.zakupki._223fz.purchase._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Результаты торгов аукциона по лоту
 * 
 * <p>Java class for protocolPAAE94FZLotApplications complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="protocolPAAE94FZLotApplications">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lot" type="{http://zakupki.gov.ru/223fz/purchase/1}protocolLotType"/>
 *         &lt;element name="lotParameters" type="{http://zakupki.gov.ru/223fz/purchase/1}lotParameters"/>
 *         &lt;element name="application" type="{http://zakupki.gov.ru/223fz/purchase/1}protocolPAAE94FZApplicationType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "protocolPAAE94FZLotApplications", propOrder = {
    "lot",
    "lotParameters",
    "application"
})
public class ProtocolPAAE94FZLotApplications {

    @XmlElement(required = true)
    protected ProtocolLotType lot;
    @XmlElement(required = true)
    protected LotParameters lotParameters;
    protected List<ProtocolPAAE94FZApplicationType> application;

    /**
     * Gets the value of the lot property.
     * 
     * @return
     *     possible object is
     *     {@link ProtocolLotType }
     *     
     */
    public ProtocolLotType getLot() {
        return lot;
    }

    /**
     * Sets the value of the lot property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolLotType }
     *     
     */
    public void setLot(ProtocolLotType value) {
        this.lot = value;
    }

    /**
     * Gets the value of the lotParameters property.
     * 
     * @return
     *     possible object is
     *     {@link LotParameters }
     *     
     */
    public LotParameters getLotParameters() {
        return lotParameters;
    }

    /**
     * Sets the value of the lotParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link LotParameters }
     *     
     */
    public void setLotParameters(LotParameters value) {
        this.lotParameters = value;
    }

    /**
     * Gets the value of the application property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the application property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplication().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProtocolPAAE94FZApplicationType }
     * 
     * 
     */
    public List<ProtocolPAAE94FZApplicationType> getApplication() {
        if (application == null) {
            application = new ArrayList<ProtocolPAAE94FZApplicationType>();
        }
        return this.application;
    }

}
