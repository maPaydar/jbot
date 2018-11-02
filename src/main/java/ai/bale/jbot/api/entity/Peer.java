package ai.bale.jbot.api.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class Peer {

    @JsonProperty("$type")
    private String type;
    private int id;
    private String accessHash;
    private String name;
    private String sex;
    private String about;
    private String avatar;
    private String username;
    private boolean isBot;
    private List<String> contactRecords;
    private String timeZone;
    private List<String> preferredLanguages;
    private List<BotCommand> botCommands;

    public Peer() {
    }

    public Peer(String type, int id, String accessHash) {
        this.type = type;
        this.id = id;
        this.accessHash = accessHash;
    }

    public int getId() {
        return id;
    }

    public String getAccessHash() {
        return accessHash;
    }
}
