package ai.bale.jbot.api.update;

import ai.bale.jbot.api.entity.Peer;
import ai.bale.jbot.api.messages.ApiMessage;

public class UpdateMessageBody extends FatSeqUpdateBody {

    private String randomId;
    private String date;
    private Peer sender;
    private ApiMessage message;

    public UpdateMessageBody() {
    }

    public Peer getSender() {
        return sender;
    }

    public String getDate() {
        return date;
    }

    public String getRandomId() {
        return randomId;
    }

    public ApiMessage getMessage() {
        return message;
    }
}