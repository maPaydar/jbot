package ai.bale.jbot.api.messages;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Caption {

    @JsonProperty("$type")
    private String type;
    private String text;

    public Caption() {
    }

    public Caption(String text) {
        this.type = "Text";
        this.text = text;
    }

    public String getType() {
        return type;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "Caption{" +
            "type='" + type + '\'' +
            ", text='" + text + '\'' +
            '}';
    }
}
