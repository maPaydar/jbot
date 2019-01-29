package ai.bale.jbot.api.update;

import ai.bale.jbot.api.entity.Peer;
import ai.bale.jbot.api.messages.Message;
import ai.bale.jbot.api.messages.QuotedMessage;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class UpdateMessageBody extends FatSeqUpdateBody {

    @JsonProperty("randomId")
    private String randomId;
    private String date;
    private Peer sender;
    private Message message;
    private QuotedMessage quotedMessage;

    @JsonCreator
    public UpdateMessageBody(@JsonProperty("peer") Peer peer,
        @JsonProperty("randomId") String randomId,
        @JsonProperty("date") String date,
        @JsonProperty("sender") Peer sender,
        @JsonProperty("message") Message message,
        @JsonProperty("quotedMessage") QuotedMessage quotedMessage) {
        super("Message", peer);
        this.randomId = randomId;
        this.date = date;
        this.sender = sender;
        this.message = message;
        this.quotedMessage = quotedMessage;
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

    public Message getMessage() {
        return message;
    }

    public QuotedMessage getQuotedMessage() {
        return quotedMessage;
    }

    @Override
    public String toString() {
        return "UpdateMessageBody{" +
            "type='" + getType() + '\'' +
            ", peer=" + getPeer() +
            ", randomId='" + randomId + '\'' +
            ", date='" + date + '\'' +
            ", sender=" + sender +
            ", message=" + message +
            ", quotedMessage=" + quotedMessage +
            '}';
    }
}