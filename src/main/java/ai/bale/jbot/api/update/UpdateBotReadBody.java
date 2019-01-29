package ai.bale.jbot.api.update;

import ai.bale.jbot.api.entity.Peer;

public class UpdateBotReadBody extends FatSeqUpdateBody {

    public UpdateBotReadBody(String type) {
        super(type);
    }

    public UpdateBotReadBody(String type, Peer peer) {
        super(type, peer);
    }
}
