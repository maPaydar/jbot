package ai.bale.jbot.net;

import ai.bale.jbot.api.BotPacket;
import ai.bale.jbot.util.BotUtil;
import java.net.URI;
import java.nio.channels.NotYetConnectedException;
import org.java_websocket.WebSocket;
import org.java_websocket.client.WebSocketClient;
import org.java_websocket.framing.Framedata;
import org.java_websocket.handshake.ServerHandshake;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rx.Observable;
import rx.subjects.PublishSubject;

public class BotSocket extends WebSocketClient {

    private Logger log = LoggerFactory.getLogger(BotSocket.class);


    private PublishSubject<BotPacket> packetsSubject;

    public BotSocket(String uri) {
        super(URI.create(uri));
        packetsSubject = PublishSubject.create();
    }

    @Override
    public void onOpen(ServerHandshake handshakedata) {
        log.debug("onOpen " + handshakedata.getHttpStatusMessage());
        System.out.println("onOpen");
    }

    @Override
    public void onMessage(String message) {
        log.debug("onMessage " + message);
        packetsSubject.onNext(BotUtil.deserializeBotPacket(message));
    }

    @Override
    public void onClose(int code, String reason, boolean remote) {
        log.debug("onClose " + code + " " + reason);
    }

    @Override
    public void onError(Exception ex) {
        log.error(ex.getMessage());
    }

    public Observable<BotPacket> getMessageObservable() {
        return this.packetsSubject;
    }

    @Override
    public void onWebsocketPing(WebSocket conn, Framedata f) {
        super.onWebsocketPing(conn, f);
    }

    @Override
    public void send(String text) throws NotYetConnectedException {
        super.send(text);
    }
}
