//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.09.04 at 02:16:19 PM CEST 
//


package it.poste.rtdm.serviceSAS2Kafka.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Message complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Message">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_CLIENTE_BIC" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NR_CONT_GG_SDP" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NR_SMS_GG_SDP" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TREATMENT_NM" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FL_TREAT_SMS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FL_SMS_ULT_TREAT_SDP" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Message", propOrder = {
    "idclientebic",
    "nrcontggsdp",
    "nrsmsggsdp",
    "treatmentnm",
    "fltreatsms",
    "flsmsulttreatsdp"
})
public class Message {

    @XmlElement(name = "ID_CLIENTE_BIC", required = true)
    protected String idclientebic;
    @XmlElement(name = "NR_CONT_GG_SDP", required = true, type = Integer.class, nillable = true)
    protected Integer nrcontggsdp;
    @XmlElement(name = "NR_SMS_GG_SDP", required = true, type = Integer.class, nillable = true)
    protected Integer nrsmsggsdp;
    @XmlElement(name = "TREATMENT_NM", required = true, nillable = true)
    protected String treatmentnm;
    @XmlElement(name = "FL_TREAT_SMS", required = true, nillable = true)
    protected String fltreatsms;
    @XmlElement(name = "FL_SMS_ULT_TREAT_SDP", required = true, nillable = true)
    protected String flsmsulttreatsdp;

    /**
     * Gets the value of the idclientebic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDCLIENTEBIC() {
        return idclientebic;
    }

    /**
     * Sets the value of the idclientebic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDCLIENTEBIC(String value) {
        this.idclientebic = value;
    }

    /**
     * Gets the value of the nrcontggsdp property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNRCONTGGSDP() {
        return nrcontggsdp;
    }

    /**
     * Sets the value of the nrcontggsdp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNRCONTGGSDP(Integer value) {
        this.nrcontggsdp = value;
    }

    /**
     * Gets the value of the nrsmsggsdp property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNRSMSGGSDP() {
        return nrsmsggsdp;
    }

    /**
     * Sets the value of the nrsmsggsdp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNRSMSGGSDP(Integer value) {
        this.nrsmsggsdp = value;
    }

    /**
     * Gets the value of the treatmentnm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTREATMENTNM() {
        return treatmentnm;
    }

    /**
     * Sets the value of the treatmentnm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTREATMENTNM(String value) {
        this.treatmentnm = value;
    }

    /**
     * Gets the value of the fltreatsms property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFLTREATSMS() {
        return fltreatsms;
    }

    /**
     * Sets the value of the fltreatsms property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFLTREATSMS(String value) {
        this.fltreatsms = value;
    }

    /**
     * Gets the value of the flsmsulttreatsdp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFLSMSULTTREATSDP() {
        return flsmsulttreatsdp;
    }

    /**
     * Sets the value of the flsmsulttreatsdp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFLSMSULTTREATSDP(String value) {
        this.flsmsulttreatsdp = value;
    }

}
