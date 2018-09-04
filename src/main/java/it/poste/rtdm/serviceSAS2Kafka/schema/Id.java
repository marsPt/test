package it.poste.rtdm.serviceSAS2Kafka.schema;

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
"ID_CLIENTE_BIC"
})
public class Id {

@JsonProperty("ID_CLIENTE_BIC")
private String iDCLIENTEBIC;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

/**
* No args constructor for use in serialization
* 
*/
public Id() {
}

/**
* 
* @param iDCLIENTEBIC
*/
public Id(String iDCLIENTEBIC) {
super();
this.iDCLIENTEBIC = iDCLIENTEBIC;
}

@JsonProperty("ID_CLIENTE_BIC")
public String getIDCLIENTEBIC() {
return iDCLIENTEBIC;
}

@JsonProperty("ID_CLIENTE_BIC")
public void setIDCLIENTEBIC(String iDCLIENTEBIC) {
this.iDCLIENTEBIC = iDCLIENTEBIC;
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