package ai.bale.jbot.api.messages;

import ai.bale.jbot.api.entity.Peer;

public class QuotedMessage {

    private String messageId;
    private String publicGroupId;
    private String senderId;
    private String messageDate;
    private Message message;
    private Peer peer;

    public QuotedMessage() {
    }

    public QuotedMessage(String messageId, String publicGroupId, String senderId,
        String messageDate, Message message, Peer peer) {
        this.messageId = messageId;
        this.publicGroupId = publicGroupId;
        this.senderId = senderId;
        this.messageDate = messageDate;
        this.message = message;
        this.peer = peer;
    }

    public String getMessageId() {
        return messageId;
    }

    public String getPublicGroupId() {
        return publicGroupId;
    }

    public String getSenderId() {
        return senderId;
    }

    public String getMessageDate() {
        return messageDate;
    }

    public Message getMessage() {
        return message;
    }

    public Peer getPeer() {
        return peer;
    }

    @Override
    public String toString() {
        return "QuotedMessage{" +
            "messageId='" + messageId + '\'' +
            ", publicGroupId='" + publicGroupId + '\'' +
            ", senderId='" + senderId + '\'' +
            ", messageDate='" + messageDate + '\'' +
            ", message=" + message +
            ", peer=" + peer +
            '}';
    }
}
