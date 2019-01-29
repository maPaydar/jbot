package ai.bale.jbot;

import ai.bale.jbot.net.BotApiHandler;

public class Runner {

    public static void main(String[] args) {
        BotApiHandler apiHandler = new BotApiHandler("ca0afc22f74eb9172d3c493069b04661ed676e9a");
        apiHandler.subscribe((peer, message) -> {
            System.out.println("Peer: " + peer + " Message: " + message);
            
            apiHandler.sendText(peer, "Hello").subscribe();
        });
    }
}
