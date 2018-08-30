//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.08.30 at 04:59:41 PM MSK 
//


package ru.gov.zakupki._223fz.types._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import ru.gov.zakupki._223fz.complaint._1.Complaint;
import ru.gov.zakupki._223fz.complaint._1.ComplaintDecision;
import ru.gov.zakupki._223fz.complaint._1.ComplaintVerificationPlan;
import ru.gov.zakupki._223fz.complaint._1.ComplaintVerificationResult;
import ru.gov.zakupki._223fz.complaint._1.ComplaintWithdraw;
import ru.gov.zakupki._223fz.contract._1.Contract;
import ru.gov.zakupki._223fz.contract._1.ContractCancellation;
import ru.gov.zakupki._223fz.contract._1.PerformanceContract;
import ru.gov.zakupki._223fz.contract._1.SubcontractorInfo;
import ru.gov.zakupki._223fz.decisionsuspension._1.DecisionSuspension;
import ru.gov.zakupki._223fz.disagreementprotocol._1.DisagreementProtocol;
import ru.gov.zakupki._223fz.dishonestsupplier._1.DishonestApplication;
import ru.gov.zakupki._223fz.dishonestsupplier._1.DishonestApplicationRejectType;
import ru.gov.zakupki._223fz.dishonestsupplier._1.DishonestSupplier;
import ru.gov.zakupki._223fz.dishonestsupplier._1.DishonestSupplierExcludeType;
import ru.gov.zakupki._223fz.dishonestsupplier._1.DishonestSupplierIncludeType;
import ru.gov.zakupki._223fz.dishonestsupplier._1.DishonestSupplierReject;
import ru.gov.zakupki._223fz.ecp_packet._1.EcpPacket;
import ru.gov.zakupki._223fz.exclusion._1.Exclusion;
import ru.gov.zakupki._223fz.machinerylistinfo._1.MachineryListInfo;
import ru.gov.zakupki._223fz.missednotice._1.MissedNotice;
import ru.gov.zakupki._223fz.notificationissue._1.NotificationIssue;
import ru.gov.zakupki._223fz.orderclauselist._1.OrderClause;
import ru.gov.zakupki._223fz.purchase._1.ChangeRequirements;
import ru.gov.zakupki._223fz.purchase._1.Explanation;
import ru.gov.zakupki._223fz.purchase._1.ExplanationRequest;
import ru.gov.zakupki._223fz.purchase._1.ListGWS;
import ru.gov.zakupki._223fz.purchase._1.ListInnov;
import ru.gov.zakupki._223fz.purchase._1.ProtocolCancellation;
import ru.gov.zakupki._223fz.purchase._1.ProtocolLotAllocation;
import ru.gov.zakupki._223fz.purchase._1.PurchaseContract;
import ru.gov.zakupki._223fz.purchase._1.PurchaseContractAccount;
import ru.gov.zakupki._223fz.purchase._1.PurchaseLotCancellation;
import ru.gov.zakupki._223fz.purchase._1.PurchaseNotice;
import ru.gov.zakupki._223fz.purchase._1.PurchaseNoticeAE;
import ru.gov.zakupki._223fz.purchase._1.PurchaseNoticeAE94FZ;
import ru.gov.zakupki._223fz.purchase._1.PurchaseNoticeAESMBO;
import ru.gov.zakupki._223fz.purchase._1.PurchaseNoticeEP;
import ru.gov.zakupki._223fz.purchase._1.PurchaseNoticeKESMBO;
import ru.gov.zakupki._223fz.purchase._1.PurchaseNoticeOA;
import ru.gov.zakupki._223fz.purchase._1.PurchaseNoticeOK;
import ru.gov.zakupki._223fz.purchase._1.PurchaseNoticeZK;
import ru.gov.zakupki._223fz.purchase._1.PurchaseNoticeZKESMBO;
import ru.gov.zakupki._223fz.purchase._1.PurchaseNoticeZPESMBO;
import ru.gov.zakupki._223fz.purchase._1.PurchaseProtocol;
import ru.gov.zakupki._223fz.purchase._1.PurchaseProtocolCC;
import ru.gov.zakupki._223fz.purchase._1.PurchaseProtocolCCKESMBO;
import ru.gov.zakupki._223fz.purchase._1.PurchaseProtocolEvasion;
import ru.gov.zakupki._223fz.purchase._1.PurchaseProtocolEvasionKESMBO;
import ru.gov.zakupki._223fz.purchase._1.PurchaseProtocolOSZ;
import ru.gov.zakupki._223fz.purchase._1.PurchaseProtocolPAAE;
import ru.gov.zakupki._223fz.purchase._1.PurchaseProtocolPAAE94FZ;
import ru.gov.zakupki._223fz.purchase._1.PurchaseProtocolPAEP;
import ru.gov.zakupki._223fz.purchase._1.PurchaseProtocolPAOA;
import ru.gov.zakupki._223fz.purchase._1.PurchaseProtocolRZ1AE;
import ru.gov.zakupki._223fz.purchase._1.PurchaseProtocolRZ1KESMBO;
import ru.gov.zakupki._223fz.purchase._1.PurchaseProtocolRZ2AE;
import ru.gov.zakupki._223fz.purchase._1.PurchaseProtocolRZAE;
import ru.gov.zakupki._223fz.purchase._1.PurchaseProtocolRZOA;
import ru.gov.zakupki._223fz.purchase._1.PurchaseProtocolRZOK;
import ru.gov.zakupki._223fz.purchase._1.PurchaseProtocolRejection;
import ru.gov.zakupki._223fz.purchase._1.PurchaseProtocolRejectionKESMBO;
import ru.gov.zakupki._223fz.purchase._1.PurchaseProtocolVK;
import ru.gov.zakupki._223fz.purchase._1.PurchaseProtocolZK;
import ru.gov.zakupki._223fz.purchase._1.PurchaseRejection;
import ru.gov.zakupki._223fz.purchase._1.VolumeInnovPurchase;
import ru.gov.zakupki._223fz.purchase._1.VolumeMonitoring;
import ru.gov.zakupki._223fz.purchase._1.VolumePurchase;
import ru.gov.zakupki._223fz.purchaseplan._1.PurchasePlan;
import ru.gov.zakupki._223fz.purchaseplanadditionalposition._1.PurchasePlanAdditionalPosition;
import ru.gov.zakupki._223fz.purchaseplanproject._1.PurchasePlanProject;
import ru.gov.zakupki._223fz.purchaseplanprojectadditionalposition._1.PurchasePlanProjectAdditionalPosition;
import ru.gov.zakupki._223fz.reference._1.NsiOkato;
import ru.gov.zakupki._223fz.reference._1.NsiOkdp;
import ru.gov.zakupki._223fz.reference._1.NsiOkei;
import ru.gov.zakupki._223fz.reference._1.NsiOkfs;
import ru.gov.zakupki._223fz.reference._1.NsiOkogu;
import ru.gov.zakupki._223fz.reference._1.NsiOkopf;
import ru.gov.zakupki._223fz.reference._1.NsiOkpd2;
import ru.gov.zakupki._223fz.reference._1.NsiOktmo;
import ru.gov.zakupki._223fz.reference._1.NsiOkv;
import ru.gov.zakupki._223fz.reference._1.NsiOkved;
import ru.gov.zakupki._223fz.reference._1.NsiOkved2;
import ru.gov.zakupki._223fz.reference._1.NsiOrderClauseType;
import ru.gov.zakupki._223fz.reference._1.NsiOrganization;
import ru.gov.zakupki._223fz.reference._1.NsiProtocolType;
import ru.gov.zakupki._223fz.reference._1.NsiPurchaseMethod;
import ru.gov.zakupki._223fz.revenue._1.Revenue;
import ru.gov.zakupki._223fz.revenue._1.RevenueCancel;
import ru.gov.zakupki._223fz.stopcommodity._1.StopCommodity;
import ru.gov.zakupki._223fz.typalorderclauselist._1.TypalOrderClause;
import ru.gov.zakupki._223fz.webrequest._1.PlanVersionsDataResponse;
import ru.gov.zakupki._223fz.webrequest._1.PublishedDataRequest;
import ru.gov.zakupki._223fz.webrequest._1.PublishedDataResponse;


/**
 * Пакет данных
 * 
 * <p>Java class for packetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="packetType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="header" type="{http://zakupki.gov.ru/223fz/types/1}headerType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "packetType", propOrder = {
    "header"
})
@XmlSeeAlso({
    PlanVersionsDataResponse.class,
    PublishedDataRequest.class,
    PublishedDataResponse.class,
    TypalOrderClause.class,
    StopCommodity.class,
    RevenueCancel.class,
    Revenue.class,
    NsiProtocolType.class,
    NsiOkved2 .class,
    NsiOkogu.class,
    NsiOkdp.class,
    NsiOkfs.class,
    NsiOkato.class,
    NsiOkpd2 .class,
    NsiOkved.class,
    NsiOkei.class,
    NsiOktmo.class,
    NsiPurchaseMethod.class,
    NsiOrderClauseType.class,
    NsiOkv.class,
    NsiOkopf.class,
    NsiOrganization.class,
    PurchasePlanProjectAdditionalPosition.class,
    PurchasePlanProject.class,
    PurchasePlanAdditionalPosition.class,
    PurchasePlan.class,
    OrderClause.class,
    NotificationIssue.class,
    MissedNotice.class,
    MachineryListInfo.class,
    Exclusion.class,
    PurchaseProtocolEvasion.class,
    PurchaseNoticeKESMBO.class,
    PurchaseProtocolPAEP.class,
    PurchaseNoticeOA.class,
    ListGWS.class,
    PurchaseLotCancellation.class,
    PurchaseNoticeAESMBO.class,
    PurchaseProtocolRejection.class,
    VolumePurchase.class,
    ListInnov.class,
    PurchaseNoticeZPESMBO.class,
    PurchaseProtocolPAAE94FZ.class,
    PurchaseProtocolRZOK.class,
    PurchaseNoticeAE.class,
    PurchaseProtocolEvasionKESMBO.class,
    PurchaseProtocolCC.class,
    PurchaseNoticeZKESMBO.class,
    PurchaseNoticeAE94FZ.class,
    PurchaseProtocolRZ2AE.class,
    PurchaseNoticeOK.class,
    PurchaseProtocolRZ1AE.class,
    VolumeMonitoring.class,
    PurchaseProtocolRZOA.class,
    PurchaseProtocolPAAE.class,
    VolumeInnovPurchase.class,
    ExplanationRequest.class,
    PurchaseNotice.class,
    PurchaseNoticeZK.class,
    ProtocolCancellation.class,
    PurchaseProtocolRZAE.class,
    PurchaseProtocolZK.class,
    PurchaseNoticeEP.class,
    PurchaseContract.class,
    PurchaseProtocolPAOA.class,
    PurchaseProtocolCCKESMBO.class,
    PurchaseProtocolVK.class,
    Explanation.class,
    PurchaseProtocolRZ1KESMBO.class,
    PurchaseProtocolOSZ.class,
    PurchaseProtocolRejectionKESMBO.class,
    PurchaseRejection.class,
    ChangeRequirements.class,
    PurchaseProtocol.class,
    ProtocolLotAllocation.class,
    PurchaseContractAccount.class,
    EcpPacket.class,
    DishonestSupplierIncludeType.class,
    DishonestApplicationRejectType.class,
    DishonestApplication.class,
    DishonestSupplierReject.class,
    DishonestSupplier.class,
    DishonestSupplierExcludeType.class,
    DisagreementProtocol.class,
    DecisionSuspension.class,
    SubcontractorInfo.class,
    Contract.class,
    PerformanceContract.class,
    ContractCancellation.class,
    ComplaintWithdraw.class,
    ComplaintDecision.class,
    Complaint.class,
    ComplaintVerificationResult.class,
    ComplaintVerificationPlan.class,
    Confirmation.class,
    DocumentUpload.class
})
public abstract class PacketType {

    @XmlElement(required = true)
    protected HeaderType header;

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link HeaderType }
     *     
     */
    public HeaderType getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link HeaderType }
     *     
     */
    public void setHeader(HeaderType value) {
        this.header = value;
    }

}
