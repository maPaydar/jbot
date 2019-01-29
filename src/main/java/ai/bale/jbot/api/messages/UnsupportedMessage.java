package ai.bale.jbot.api.messages;

public class UnsupportedMessage extends Message {

    public UnsupportedMessage() {
        super("Unsupported");
    }

    @Override
    public String toString() {
        return "UnsupportedMessage{}";
    }
}
