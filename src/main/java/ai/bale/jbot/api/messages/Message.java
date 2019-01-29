package ai.bale.jbot.api.messages;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

@JsonTypeInfo(use = Id.NAME, property = "$type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = TextMessage.class, name = "Text"),
    @JsonSubTypes.Type(value = DocMessage.class, name = "Document"),
    @JsonSubTypes.Type(value = StickerMessage.class, name = "Sticker"),
    @JsonSubTypes.Type(value = PurchaseMessage.class, name = "PurchaseMessage"),
    @JsonSubTypes.Type(value = TemplateMessage.class, name = "TemplateMessage"),

    @JsonSubTypes.Type(value = UnsupportedMessage.class, name = "Unsupported")
})
public abstract class Message {

    @JsonProperty("$type")
    private String type;

    public Message(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
