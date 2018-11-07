//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.11.07 at 09:43:41 AM MSK 
//


package ru.gov.zakupki._223fz.purchase._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Извещение о закупке "Запрос предложений в электронной форме, участниками которого могут являться только субъекты малого и среднего предпринимательства"
 * 
 * <p>Java class for purchaseNoticeZPESMBODataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="purchaseNoticeZPESMBODataType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/223fz/purchase/1}purchaseNoticeESMBODataType">
 *       &lt;sequence>
 *         &lt;element name="documentsRequirement" type="{http://zakupki.gov.ru/223fz/purchase/1}documentRequirementType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "purchaseNoticeZPESMBODataType", propOrder = {
    "documentsRequirement"
})
public class PurchaseNoticeZPESMBODataType
    extends PurchaseNoticeESMBODataType
{

    protected List<DocumentRequirementType> documentsRequirement;

    /**
     * Gets the value of the documentsRequirement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentsRequirement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentsRequirement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentRequirementType }
     * 
     * 
     */
    public List<DocumentRequirementType> getDocumentsRequirement() {
        if (documentsRequirement == null) {
            documentsRequirement = new ArrayList<DocumentRequirementType>();
        }
        return this.documentsRequirement;
    }

}
