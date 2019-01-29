package ai.bale.jbot.api;

import ai.bale.jbot.api.response.Response;
import ai.bale.jbot.api.update.FatSeqUpdate;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeInfo(use = Id.NAME, property = "$type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = Response.class, name = "Response"),
    @JsonSubTypes.Type(value = FatSeqUpdate.class, name = "FatSeqUpdate")
})
public class BotPacket {

    @JsonProperty("$type")
    private String type;

    public BotPacket() {
    }

    public BotPacket(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
