//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.12.18 at 10:06:38 AM MSK 
//


package ru.gov.zakupki._223fz.types._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Скрываемые группы полей протокола
 * 
 * <p>Java class for protocolTemplateHideBlocks complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="protocolTemplateHideBlocks">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hideCommDecision" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="hideCommDecisionAccess" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="hideCommDecisionResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="hideProcedure" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="hideCancellation" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "protocolTemplateHideBlocks", propOrder = {
    "hideCommDecision",
    "hideCommDecisionAccess",
    "hideCommDecisionResult",
    "hideProcedure",
    "hideCancellation"
})
public class ProtocolTemplateHideBlocks {

    protected boolean hideCommDecision;
    protected boolean hideCommDecisionAccess;
    protected boolean hideCommDecisionResult;
    protected boolean hideProcedure;
    protected boolean hideCancellation;

    /**
     * Gets the value of the hideCommDecision property.
     * 
     */
    public boolean isHideCommDecision() {
        return hideCommDecision;
    }

    /**
     * Sets the value of the hideCommDecision property.
     * 
     */
    public void setHideCommDecision(boolean value) {
        this.hideCommDecision = value;
    }

    /**
     * Gets the value of the hideCommDecisionAccess property.
     * 
     */
    public boolean isHideCommDecisionAccess() {
        return hideCommDecisionAccess;
    }

    /**
     * Sets the value of the hideCommDecisionAccess property.
     * 
     */
    public void setHideCommDecisionAccess(boolean value) {
        this.hideCommDecisionAccess = value;
    }

    /**
     * Gets the value of the hideCommDecisionResult property.
     * 
     */
    public boolean isHideCommDecisionResult() {
        return hideCommDecisionResult;
    }

    /**
     * Sets the value of the hideCommDecisionResult property.
     * 
     */
    public void setHideCommDecisionResult(boolean value) {
        this.hideCommDecisionResult = value;
    }

    /**
     * Gets the value of the hideProcedure property.
     * 
     */
    public boolean isHideProcedure() {
        return hideProcedure;
    }

    /**
     * Sets the value of the hideProcedure property.
     * 
     */
    public void setHideProcedure(boolean value) {
        this.hideProcedure = value;
    }

    /**
     * Gets the value of the hideCancellation property.
     * 
     */
    public boolean isHideCancellation() {
        return hideCancellation;
    }

    /**
     * Sets the value of the hideCancellation property.
     * 
     */
    public void setHideCancellation(boolean value) {
        this.hideCancellation = value;
    }

}
