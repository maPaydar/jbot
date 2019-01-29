package ai.bale.jbot.api.entity;

public class User extends Peer {

    public User(int id, String accessHash) {
        super("User", id, accessHash);
    }
}
