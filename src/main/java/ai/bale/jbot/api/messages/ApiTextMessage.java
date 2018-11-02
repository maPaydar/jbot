package ai.bale.jbot.api.messages;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ApiTextMessage extends ApiMessage {

    @JsonProperty("text")
    private String text;

    public ApiTextMessage() {
    }

    public ApiTextMessage(String text) {
        super("Text");
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
