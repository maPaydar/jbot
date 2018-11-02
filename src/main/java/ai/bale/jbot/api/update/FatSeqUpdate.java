package ai.bale.jbot.api.update;

import ai.bale.jbot.api.BotPacket;
import ai.bale.jbot.api.entity.User;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeInfo(use = Id.NAME, property = "$type")
public class FatSeqUpdate extends BotPacket {

    @JsonProperty("$type")
    private String type = "FatSeqUpdate";
    private int seq;

    private List<User> users;
    //    private List<Map<Integer, Group>> groups;
    private FatSeqUpdateBody body;

    public FatSeqUpdate() {
    }

    public String getType() {
        return type;
    }

    public int getSeq() {
        return seq;
    }

//    public List<Map<Integer, User>> getUsers() {
//        return users;
//    }
//
//    public List<Map<Integer, Group>> getGroups() {
//        return groups;
//    }

    public FatSeqUpdateBody getBody() {
        return body;
    }

    @Override
    public String toString() {
        return "FatSeqUpdate{" +
            "type='" + type + '\'' +
            ", seq=" + seq +
            ", users=" + users +
            ", body=" + body +
            '}';
    }
}
