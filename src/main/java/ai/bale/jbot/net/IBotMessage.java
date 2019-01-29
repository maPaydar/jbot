package ai.bale.jbot.net;

import ai.bale.jbot.api.entity.Peer;
import ai.bale.jbot.api.messages.Message;

public interface IBotMessage {

    void onReceived(Peer peer, Message message);
}
