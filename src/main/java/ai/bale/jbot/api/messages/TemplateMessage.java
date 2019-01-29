package ai.bale.jbot.api.messages;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TemplateMessage extends Message {

    private String templateMessage;
    @JsonProperty("generalMessage")
    private Message message;
    @JsonProperty("btnList")
    private List<TemplateButton> buttons;

    public TemplateMessage() {
        super("TemplateMessage");
    }
}
