package ai.bale.jbot.api.request;

import ai.bale.jbot.api.entity.Peer;
import ai.bale.jbot.api.messages.Message;
import ai.bale.jbot.api.messages.QuotedMessage;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

public class RequestSendMessage extends Request {

    @JsonProperty("body")
    private RequestBody body;

    public RequestSendMessage(String id, String randomId, Message message, Peer peer,
        QuotedMessage quotedMessage) {
        super(id, "messaging");
        this.body = new RequestBody(peer, randomId, message, quotedMessage);
    }

    @Override
    public RequestBody getBody() {
        return body;
    }

    public class RequestBody extends ai.bale.jbot.api.request.RequestBody {

        private Peer peer;
        private String randomId;
        private Message message;

        @JsonInclude(Include.NON_NULL)
        private QuotedMessage quotedMessage;

        RequestBody(Peer peer, String randomId,
            Message message, QuotedMessage quotedMessage) {
            super("SendMessage");
            this.peer = peer;
            this.randomId = randomId;
            this.message = message;
            this.quotedMessage = quotedMessage;
        }

        public RequestBody() {
            super("SendMessage");
        }

        public Peer getPeer() {
            return peer;
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
    }
}
