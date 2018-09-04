package it.poste.rtdm.serviceSAS2Kafka.schema;


import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
	"owner",
	"_id",
	"data"
})
@Configuration
public class KafkaMessage {

	@JsonProperty("owner")
	private String owner;
	@JsonProperty("_id")
	private Id id;
	@JsonProperty("data")
	private Data data;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public KafkaMessage() {
	}

	/**
	 * 
	 * @param id
	 * @param data
	 * @param owner
	 */

	public KafkaMessage(String owner, Id id, Data data) {
		super();
		this.owner = owner;
		this.id = id;
		this.data = data;
	}

	@JsonProperty("owner")
	public String getOwner() {
		return owner;
	}

	@JsonProperty("owner")
	public void setOwner(String owner) {
		this.owner = owner;
	}

	@JsonProperty("_id")
	public Id getId() {
		return id;
	}

	@JsonProperty("_id")
	public void setId(Id id) {
		this.id = id;
	}

	@JsonProperty("data")
	public Data getData() {
		return data;
	}

	@JsonProperty("data")
	public void setData(Data data) {
		this.data = data;
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
