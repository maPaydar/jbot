package ai.bale.jbot.api.messages;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class TemplateButton {

    @JsonProperty("$type")
    private String type;
    private String text;
    private String value;
    private int action;

    @JsonIgnore
    private ITemplateButtonClicked onClicked;

    public TemplateButton(String text, String value) {
        this.type = "Button";
        this.text = text;
        this.value = value;
        this.action = 0;
    }

    public TemplateButton(String text, String value, int action, ITemplateButtonClicked onClicked) {
        this.type = "Button";
        this.text = text;
        this.value = value;
        this.action = action;
        this.onClicked = onClicked;
    }

    public void setTemplateButtonClicked(ITemplateButtonClicked onClicked) {
        this.onClicked = onClicked;
    }

    /**
     * @return the text
     */
    public String getText() {
        return text;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /**
     * @return the action
     */
    public int getAction() {
        return action;
    }

    @Override
    public String toString() {
        return "TemplateButton{" +
            "type=" + type +
            ", text=" + text +
            ", value=" + value +
            ", action=" + action +
            '}';
    }
}
