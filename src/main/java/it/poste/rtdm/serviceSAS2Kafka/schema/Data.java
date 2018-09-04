package it.poste.rtdm.serviceSAS2Kafka.schema;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"NR_CONT_GG_SDP",
"DS_ULT_TREATMENT_SDP",
"DT_ULT_TREATMENT_SDP$datetime",
"NR_SMS_GG_SDP",
"DT_SMS_ULT_TREAT_SDP$datetime",
"FL_SMS_ULT_TREAT_SDP"
})
public class Data {

@JsonProperty("NR_CONT_GG_SDP")
private Integer nRCONTGGSDP;
@JsonProperty("DS_ULT_TREATMENT_SDP")
private String dSULTTREATMENTSDP;
@JsonProperty("DT_ULT_TREATMENT_SDP$datetime")
private Date dTULTTREATMENTSDP$datetime;
@JsonProperty("NR_SMS_GG_SDP")
private Integer nRSMSGGSDP;
@JsonProperty("DT_SMS_ULT_TREAT_SDP$datetime")
private Date dTSMSULTTREATSDP$datetime;
@JsonProperty("FL_SMS_ULT_TREAT_SDP")
private String fLSMSULTTREATSDP;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

/**
* No args constructor for use in serialization
* 
*/
public Data() {
}

/**
* 
* @param dSULTTREATMENTSDP
* @param fLSMSULTTREATSDP
* @param dTSMSULTTREATSDP$datetime
* @param dTULTTREATMENTSDP$datetime
* @param nRSMSGGSDP
* @param nRCONTGGSDP
*/
public Data(Integer nRCONTGGSDP, String dSULTTREATMENTSDP, Date dTULTTREATMENTSDP$datetime, Integer nRSMSGGSDP, Date dTSMSULTTREATSDP$datetime, String fLSMSULTTREATSDP) {
super();
this.nRCONTGGSDP = nRCONTGGSDP;
this.dSULTTREATMENTSDP = dSULTTREATMENTSDP;
this.dTULTTREATMENTSDP$datetime = dTULTTREATMENTSDP$datetime;
this.nRSMSGGSDP = nRSMSGGSDP;
this.dTSMSULTTREATSDP$datetime = dTSMSULTTREATSDP$datetime;
this.fLSMSULTTREATSDP = fLSMSULTTREATSDP;
}

@JsonProperty("NR_CONT_GG_SDP")
public Integer getNRCONTGGSDP() {
return nRCONTGGSDP;
}

@JsonProperty("NR_CONT_GG_SDP")
public void setNRCONTGGSDP(Integer nRCONTGGSDP) {
this.nRCONTGGSDP = nRCONTGGSDP;
}

@JsonProperty("DS_ULT_TREATMENT_SDP")
public String getDSULTTREATMENTSDP() {
return dSULTTREATMENTSDP;
}

@JsonProperty("DS_ULT_TREATMENT_SDP")
public void setDSULTTREATMENTSDP(String dSULTTREATMENTSDP) {
this.dSULTTREATMENTSDP = dSULTTREATMENTSDP;
}

@JsonProperty("DT_ULT_TREATMENT_SDP$datetime")
public Date getDTULTTREATMENTSDP$datetime() {
return dTULTTREATMENTSDP$datetime;
}

@JsonProperty("DT_ULT_TREATMENT_SDP$datetime")
public void setDTULTTREATMENTSDP$datetime(Date dTULTTREATMENTSDP$datetime) {
this.dTULTTREATMENTSDP$datetime = dTULTTREATMENTSDP$datetime;
}

@JsonProperty("NR_SMS_GG_SDP")
public Integer getNRSMSGGSDP() {
return nRSMSGGSDP;
}

@JsonProperty("NR_SMS_GG_SDP")
public void setNRSMSGGSDP(Integer nRSMSGGSDP) {
this.nRSMSGGSDP = nRSMSGGSDP;
}

@JsonProperty("DT_SMS_ULT_TREAT_SDP$datetime")
public Date getDTSMSULTTREATSDP$datetime() {
return dTSMSULTTREATSDP$datetime;
}

@JsonProperty("DT_SMS_ULT_TREAT_SDP$datetime")
public void setDTSMSULTTREATSDP$datetime(Date dTSMSULTTREATSDP$datetime) {
this.dTSMSULTTREATSDP$datetime = dTSMSULTTREATSDP$datetime;
}

@JsonProperty("FL_SMS_ULT_TREAT_SDP")
public String getFLSMSULTTREATSDP() {
return fLSMSULTTREATSDP;
}

@JsonProperty("FL_SMS_ULT_TREAT_SDP")
public void setFLSMSULTTREATSDP(String fLSMSULTTREATSDP) {
this.fLSMSULTTREATSDP = fLSMSULTTREATSDP;
}

@JsonAnyGetter
public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

@JsonAnySetter
public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}