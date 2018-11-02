package ai.bale.jbot;

import ai.bale.jbot.net.BotApiHandler;

public class Runner {

    public static void main(String[] args) {
        BotApiHandler apiHandler = new BotApiHandler("");

        apiHandler.getMessages().subscribe(System.out::println);
    }
}
