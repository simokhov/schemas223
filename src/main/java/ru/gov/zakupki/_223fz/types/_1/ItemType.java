//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.23 at 05:08:29 PM MSK 
//


package ru.gov.zakupki._223fz.types._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import ru.gov.zakupki._223fz.orderclauselist._1.OrderClauseItemType;
import ru.gov.zakupki._223fz.purchase._1.ChangeRequirementsItemType;
import ru.gov.zakupki._223fz.purchase._1.ExplanationItemType;
import ru.gov.zakupki._223fz.purchase._1.PurchaseContractAccountItemType;
import ru.gov.zakupki._223fz.purchase._1.PurchaseContractItemType;
import ru.gov.zakupki._223fz.purchase._1.PurchaseNoticeAEItemType;
import ru.gov.zakupki._223fz.purchase._1.PurchaseNoticeEPItemType;
import ru.gov.zakupki._223fz.purchase._1.PurchaseNoticeItemType;
import ru.gov.zakupki._223fz.purchase._1.PurchaseNoticeOAItemType;
import ru.gov.zakupki._223fz.purchase._1.PurchaseNoticeOKItemType;
import ru.gov.zakupki._223fz.purchase._1.PurchaseNoticeZKItemType;
import ru.gov.zakupki._223fz.purchase._1.PurchaseProtocolItemType;
import ru.gov.zakupki._223fz.purchase._1.PurchaseProtocolOSZItemType;
import ru.gov.zakupki._223fz.purchase._1.PurchaseProtocolPAAEItemType;
import ru.gov.zakupki._223fz.purchase._1.PurchaseProtocolPAOAItemType;
import ru.gov.zakupki._223fz.purchase._1.PurchaseProtocolRZAEItemType;
import ru.gov.zakupki._223fz.purchase._1.PurchaseProtocolRZOAItemType;
import ru.gov.zakupki._223fz.purchase._1.PurchaseProtocolRZOKItemType;
import ru.gov.zakupki._223fz.purchase._1.PurchaseProtocolVKItemType;
import ru.gov.zakupki._223fz.purchase._1.PurchaseProtocolZKItemType;
import ru.gov.zakupki._223fz.purchase._1.PurchaseRejectionType;
import ru.gov.zakupki._223fz.purchaseplan._1.PurchasePlanItemType;
import ru.gov.zakupki._223fz.reference._1.NsiOkatoItemType;
import ru.gov.zakupki._223fz.reference._1.NsiOkdpItemType;
import ru.gov.zakupki._223fz.reference._1.NsiOkeiItemType;
import ru.gov.zakupki._223fz.reference._1.NsiOkfsItemType;
import ru.gov.zakupki._223fz.reference._1.NsiOkoguItemType;
import ru.gov.zakupki._223fz.reference._1.NsiOkopfItemType;
import ru.gov.zakupki._223fz.reference._1.NsiOktmoItemType;
import ru.gov.zakupki._223fz.reference._1.NsiOkvItemType;
import ru.gov.zakupki._223fz.reference._1.NsiOkvedItemType;
import ru.gov.zakupki._223fz.reference._1.NsiOrganizationItemType;
import ru.gov.zakupki._223fz.reference._1.NsiProtocolTypeItemType;
import ru.gov.zakupki._223fz.reference._1.NsiPurchaseMethodItemType;


/**
 * Данные позиции в пакете
 * 
 * <p>Java class for itemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="itemType">
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
@XmlType(name = "itemType", propOrder = {
    "guid"
})
@XmlSeeAlso({
    OrderClauseItemType.class,
    PurchasePlanItemType.class,
    PurchaseContractAccountItemType.class,
    PurchaseProtocolVKItemType.class,
    PurchaseProtocolRZOAItemType.class,
    ExplanationItemType.class,
    PurchaseNoticeOKItemType.class,
    PurchaseProtocolPAAEItemType.class,
    PurchaseNoticeZKItemType.class,
    PurchaseRejectionType.class,
    PurchaseProtocolItemType.class,
    PurchaseProtocolRZAEItemType.class,
    PurchaseProtocolOSZItemType.class,
    PurchaseNoticeEPItemType.class,
    PurchaseProtocolZKItemType.class,
    PurchaseContractItemType.class,
    ChangeRequirementsItemType.class,
    PurchaseNoticeAEItemType.class,
    PurchaseNoticeOAItemType.class,
    PurchaseProtocolPAOAItemType.class,
    PurchaseNoticeItemType.class,
    PurchaseProtocolRZOKItemType.class,
    NsiOkfsItemType.class,
    NsiOkoguItemType.class,
    NsiOktmoItemType.class,
    NsiOkatoItemType.class,
    NsiOkdpItemType.class,
    NsiOkvItemType.class,
    NsiProtocolTypeItemType.class,
    NsiPurchaseMethodItemType.class,
    NsiOkopfItemType.class,
    NsiOkvedItemType.class,
    NsiOkeiItemType.class,
    NsiOrganizationItemType.class
})
public abstract class ItemType {

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
