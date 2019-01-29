package ai.bale.jbot.api.messages;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class TextMessage extends Message {

    @JsonProperty("text")
    private String text;

    @JsonCreator
    public TextMessage(@JsonProperty("text") String text) {
        super("Text");
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "TextMessage{" +
            "text='" + text + '\'' +
            '}';
    }
}
