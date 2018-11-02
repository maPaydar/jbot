package ai.bale.jbot.api.messages;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeInfo(use = Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "$type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = ApiTextMessage.class, name = "Text")
})
public abstract class ApiMessage {

    @JsonProperty("$type")
    private String type;

    public ApiMessage() {
    }

    public ApiMessage(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
