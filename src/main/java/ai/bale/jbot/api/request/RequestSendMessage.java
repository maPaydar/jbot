package ai.bale.jbot.api.request;

import ai.bale.jbot.api.entity.Peer;
import ai.bale.jbot.api.entity.User;
import ai.bale.jbot.api.messages.ApiMessage;
import ai.bale.jbot.api.messages.ApiQuotedMessage;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.istack.internal.Nullable;

public class RequestSendMessage extends Request {

    @JsonProperty("body")
    private RequestBody body;

    public RequestSendMessage(String id, String randomId, ApiMessage message, User user,
        @Nullable ApiQuotedMessage quotedMessage) {
        super(id, "messaging");
        this.body = new RequestBody(user, randomId, message, quotedMessage);
    }

    @Override
    public RequestBody getBody() {
        return body;
    }

    public class RequestBody extends ai.bale.jbot.api.request.RequestBody {

        private Peer peer;
        private String randomId;
        private ApiMessage message;

        @JsonInclude(Include.NON_NULL)
        private ApiQuotedMessage quotedMessage;

        public RequestBody(Peer peer, String randomId,
            ApiMessage message, @Nullable ApiQuotedMessage quotedMessage) {
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

        public ApiMessage getMessage() {
            return message;
        }

        public ApiQuotedMessage getQuotedMessage() {
            return quotedMessage;
        }
    }
}
