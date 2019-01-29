package ai.bale.jbot.api.messages;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

@JsonTypeInfo(use = Id.NAME, property = "$type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = PhotoExtension.class, name = "Photo"),
    @JsonSubTypes.Type(value = VideoExtension.class, name = "Video"),
    @JsonSubTypes.Type(value = VoiceExtension.class, name = "Voice")
})
public class DocExtension {

    @JsonProperty("$type")
    private String type;

    public DocExtension() {
    }

    public DocExtension(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "DocExtension{" +
            "type='" + type + '\'' +
            '}';
    }
}
