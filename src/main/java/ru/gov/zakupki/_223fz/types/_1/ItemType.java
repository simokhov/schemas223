//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.04.26 at 09:55:47 AM MSK 
//


package ru.gov.zakupki._223fz.types._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import ru.gov.zakupki._223fz.complaint._1.ComplaintDecisionItemType;
import ru.gov.zakupki._223fz.complaint._1.ComplaintItemType;
import ru.gov.zakupki._223fz.complaint._1.ComplaintVerificationPlanItemType;
import ru.gov.zakupki._223fz.complaint._1.ComplaintVerificationResultItemType;
import ru.gov.zakupki._223fz.complaint._1.ComplaintWithdrawItemType;
import ru.gov.zakupki._223fz.contract._1.ContractCancellationItemType;
import ru.gov.zakupki._223fz.contract._1.ContractItemType;
import ru.gov.zakupki._223fz.contract._1.PerformanceContractItemType;
import ru.gov.zakupki._223fz.contract._1.SubcontractorInfoItemType;
import ru.gov.zakupki._223fz.dishonestsupplier._1.DishonestApplicationItemType;
import ru.gov.zakupki._223fz.dishonestsupplier._1.DishonestApplicationRejectItemType;
import ru.gov.zakupki._223fz.dishonestsupplier._1.DishonestSupplierExcludeItemType;
import ru.gov.zakupki._223fz.dishonestsupplier._1.DishonestSupplierIncludeItemType;
import ru.gov.zakupki._223fz.dishonestsupplier._1.DishonestSupplierItemType;
import ru.gov.zakupki._223fz.dishonestsupplier._1.DishonestSupplierRejectItemType;
import ru.gov.zakupki._223fz.orderclauselist._1.OrderClauseItemType;
import ru.gov.zakupki._223fz.purchase._1.ChangeRequirementsItemType;
import ru.gov.zakupki._223fz.purchase._1.ExplanationItemType;
import ru.gov.zakupki._223fz.purchase._1.ListGWSItemType;
import ru.gov.zakupki._223fz.purchase._1.ListInnovItemType;
import ru.gov.zakupki._223fz.purchase._1.ProtocolCancellationType;
import ru.gov.zakupki._223fz.purchase._1.ProtocolLotAllocationItemType;
import ru.gov.zakupki._223fz.purchase._1.PurchaseContractAccountItemType;
import ru.gov.zakupki._223fz.purchase._1.PurchaseContractItemType;
import ru.gov.zakupki._223fz.purchase._1.PurchaseLotCancellationItemType;
import ru.gov.zakupki._223fz.purchase._1.PurchaseNoticeAE94FZItemType;
import ru.gov.zakupki._223fz.purchase._1.PurchaseNoticeAEItemType;
import ru.gov.zakupki._223fz.purchase._1.PurchaseNoticeEPItemType;
import ru.gov.zakupki._223fz.purchase._1.PurchaseNoticeItemType;
import ru.gov.zakupki._223fz.purchase._1.PurchaseNoticeOAItemType;
import ru.gov.zakupki._223fz.purchase._1.PurchaseNoticeOKItemType;
import ru.gov.zakupki._223fz.purchase._1.PurchaseNoticeZKItemType;
import ru.gov.zakupki._223fz.purchase._1.PurchaseProtocolItemType;
import ru.gov.zakupki._223fz.purchase._1.PurchaseProtocolOSZItemType;
import ru.gov.zakupki._223fz.purchase._1.PurchaseProtocolPAAE94FZItemType;
import ru.gov.zakupki._223fz.purchase._1.PurchaseProtocolPAAEItemType;
import ru.gov.zakupki._223fz.purchase._1.PurchaseProtocolPAEPItemType;
import ru.gov.zakupki._223fz.purchase._1.PurchaseProtocolPAOAItemType;
import ru.gov.zakupki._223fz.purchase._1.PurchaseProtocolRZ1AEItemType;
import ru.gov.zakupki._223fz.purchase._1.PurchaseProtocolRZ2AEItemType;
import ru.gov.zakupki._223fz.purchase._1.PurchaseProtocolRZAEItemType;
import ru.gov.zakupki._223fz.purchase._1.PurchaseProtocolRZOAItemType;
import ru.gov.zakupki._223fz.purchase._1.PurchaseProtocolRZOKItemType;
import ru.gov.zakupki._223fz.purchase._1.PurchaseProtocolVKItemType;
import ru.gov.zakupki._223fz.purchase._1.PurchaseProtocolZKItemType;
import ru.gov.zakupki._223fz.purchase._1.PurchaseRejectionType;
import ru.gov.zakupki._223fz.purchase._1.VolumeInnovPurchaseItemType;
import ru.gov.zakupki._223fz.purchase._1.VolumeMonitoringItemType;
import ru.gov.zakupki._223fz.purchase._1.VolumePurchaseItemType;
import ru.gov.zakupki._223fz.purchaseplan._1.PurchasePlanItemType;
import ru.gov.zakupki._223fz.purchaseplanadditionalposition._1.PurchasePlanAdditionalPositionItemType;
import ru.gov.zakupki._223fz.purchaseplanproject._1.PurchasePlanProjectItemType;
import ru.gov.zakupki._223fz.purchaseplanprojectadditionalposition._1.PurchasePlanProjectAdditionalPositionItemType;
import ru.gov.zakupki._223fz.reference._1.NsiOkatoItemType;
import ru.gov.zakupki._223fz.reference._1.NsiOkdpItemType;
import ru.gov.zakupki._223fz.reference._1.NsiOkeiItemType;
import ru.gov.zakupki._223fz.reference._1.NsiOkfsItemType;
import ru.gov.zakupki._223fz.reference._1.NsiOkoguItemType;
import ru.gov.zakupki._223fz.reference._1.NsiOkopfItemType;
import ru.gov.zakupki._223fz.reference._1.NsiOkpd2ItemType;
import ru.gov.zakupki._223fz.reference._1.NsiOktmoItemType;
import ru.gov.zakupki._223fz.reference._1.NsiOkvItemType;
import ru.gov.zakupki._223fz.reference._1.NsiOkved2ItemType;
import ru.gov.zakupki._223fz.reference._1.NsiOkvedItemType;
import ru.gov.zakupki._223fz.reference._1.NsiOrderClauseTypeItemType;
import ru.gov.zakupki._223fz.reference._1.NsiOrganizationItemType;
import ru.gov.zakupki._223fz.reference._1.NsiProtocolTypeItemType;
import ru.gov.zakupki._223fz.reference._1.NsiPurchaseMethodItemType;
import ru.gov.zakupki._223fz.revenue._1.RevenueCancelItemType;
import ru.gov.zakupki._223fz.revenue._1.RevenueItemType;


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
    ComplaintDecisionItemType.class,
    ComplaintWithdrawItemType.class,
    ComplaintVerificationResultItemType.class,
    ComplaintVerificationPlanItemType.class,
    ComplaintItemType.class,
    PerformanceContractItemType.class,
    SubcontractorInfoItemType.class,
    ContractItemType.class,
    ContractCancellationItemType.class,
    DishonestSupplierRejectItemType.class,
    DishonestApplicationRejectItemType.class,
    DishonestSupplierExcludeItemType.class,
    DishonestApplicationItemType.class,
    DishonestSupplierIncludeItemType.class,
    DishonestSupplierItemType.class,
    OrderClauseItemType.class,
    PurchaseProtocolVKItemType.class,
    PurchaseProtocolRZOAItemType.class,
    ExplanationItemType.class,
    PurchaseProtocolRZ1AEItemType.class,
    VolumePurchaseItemType.class,
    ProtocolLotAllocationItemType.class,
    PurchaseProtocolItemType.class,
    VolumeMonitoringItemType.class,
    PurchaseProtocolRZ2AEItemType.class,
    PurchaseLotCancellationItemType.class,
    PurchaseNoticeEPItemType.class,
    PurchaseNoticeAE94FZItemType.class,
    PurchaseContractItemType.class,
    ChangeRequirementsItemType.class,
    PurchaseNoticeOAItemType.class,
    PurchaseProtocolPAOAItemType.class,
    VolumeInnovPurchaseItemType.class,
    ListInnovItemType.class,
    PurchaseNoticeItemType.class,
    ProtocolCancellationType.class,
    PurchaseProtocolPAEPItemType.class,
    PurchaseProtocolRZOKItemType.class,
    PurchaseContractAccountItemType.class,
    PurchaseNoticeOKItemType.class,
    ListGWSItemType.class,
    PurchaseProtocolPAAEItemType.class,
    PurchaseNoticeZKItemType.class,
    PurchaseRejectionType.class,
    PurchaseProtocolRZAEItemType.class,
    PurchaseProtocolPAAE94FZItemType.class,
    PurchaseProtocolOSZItemType.class,
    PurchaseProtocolZKItemType.class,
    PurchaseNoticeAEItemType.class,
    PurchasePlanItemType.class,
    PurchasePlanAdditionalPositionItemType.class,
    PurchasePlanProjectItemType.class,
    PurchasePlanProjectAdditionalPositionItemType.class,
    NsiOkpd2ItemType.class,
    NsiOkfsItemType.class,
    NsiOkoguItemType.class,
    NsiProtocolTypeItemType.class,
    NsiOkopfItemType.class,
    NsiOkeiItemType.class,
    NsiOktmoItemType.class,
    NsiOkatoItemType.class,
    NsiOkdpItemType.class,
    NsiOkvItemType.class,
    NsiOkved2ItemType.class,
    NsiPurchaseMethodItemType.class,
    NsiOkvedItemType.class,
    NsiOrderClauseTypeItemType.class,
    NsiOrganizationItemType.class,
    RevenueCancelItemType.class,
    RevenueItemType.class
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
