package ai.bale.jbot.net;

import static ai.bale.jbot.util.BotUtil.stringify;

import ai.bale.jbot.api.request.Request;
import ai.bale.jbot.api.request.RequestSendMessage;
import ai.bale.jbot.api.entity.User;
import ai.bale.jbot.api.messages.ApiTextMessage;
import ai.bale.jbot.api.response.Response;
import ai.bale.jbot.api.update.FatSeqUpdate;
import ai.bale.jbot.api.update.UpdateMessageBody;
import ai.bale.jbot.util.BotUtil;
import ai.bale.jbot.util.Consts;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import rx.Observable;

/**
 *
 */
public class BotApiHandler {

    private AtomicLong requestId = new AtomicLong(0);
    private BotSocket socket;
    private List<String> requestIds = new ArrayList<>();

    /**
     * Create web socket to bale ws api
     *
     * @param token Your bale bot token
     */
    public BotApiHandler(String token) {
        socket = new BotSocket(Consts.API_URL + token);
        socket.connect();

        socket.getMessageObservable()
            .filter(botPacket -> botPacket instanceof Response)
            .map(botPacket -> (Response) botPacket)
            .subscribe(response -> {
                requestIds.remove(response.getId());
            });
    }

    /**
     * Sends Text message to the current user
     *
     * @param user The current user
     * @param text The text of message
     */
    public Observable<Void> sendText(User user, String text) {
        Request request = new RequestSendMessage(String.valueOf(requestId.addAndGet(1)),
            BotUtil.generateRandomId(),
            new ApiTextMessage(text),
            user, null);

        requestIds.add(request.getId());

        return sendRequest(request);
    }

    /**
     *
     * @param request
     * @return
     */
    private Observable<Void> sendRequest(Request request) {
        return Observable.fromCallable(() -> {
            String json = stringify(request);
            socket.send(json);
            return null;
        });
    }

    public Observable<FatSeqUpdate> getUpdates() {
        return socket.getMessageObservable()
            .filter(botPacket -> botPacket instanceof FatSeqUpdate)
            .map(botPacket -> (FatSeqUpdate) botPacket);
    }

    public Observable<FatSeqUpdate> getMessages() {
        return getUpdates()
            .filter(fatSeqUpdate -> fatSeqUpdate.getBody() instanceof UpdateMessageBody);
    }


}
