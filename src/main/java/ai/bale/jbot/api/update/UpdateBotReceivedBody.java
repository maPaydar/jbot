package ai.bale.jbot.api.update;

import ai.bale.jbot.api.entity.Peer;

public class UpdateBotReceivedBody extends FatSeqUpdateBody {


    public UpdateBotReceivedBody(String type) {
        super(type);
    }

    public UpdateBotReceivedBody(String type, Peer peer) {
        super(type, peer);
    }
}
