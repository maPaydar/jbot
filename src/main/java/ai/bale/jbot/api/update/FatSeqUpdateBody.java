package ai.bale.jbot.api.update;

import ai.bale.jbot.api.entity.Peer;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeInfo(use = Id.NAME, property = "$type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = UpdateMessageBody.class, name = "Message"),
    @JsonSubTypes.Type(value = UpdateBotReceivedBody.class, name = "BotReceivedUpdate"),
    @JsonSubTypes.Type(value = UpdateBotReadBody.class, name = "BotReadUpdate")
})
public abstract class FatSeqUpdateBody {

    @JsonProperty("$type")
    private String type;

    @JsonProperty("peer")
    private Peer peer;

    public FatSeqUpdateBody() {
    }

    public String getType() {
        return type;
    }

    public Peer getPeer() {
        return peer;
    }

    @Override
    public String toString() {
        return "FatSeqUpdateBody{" +
            "type='" + type + '\'' +
            ", peer=" + peer +
            '}';
    }
}
