package ai.bale.jbot.api.response;

import ai.bale.jbot.api.BotPacket;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Response extends BotPacket {

    private String id;

    private Map<Object, Object> body;

    public Response() {
        super();
    }

    public String getId() {
        return id;
    }

    public Map<Object, Object> getBody() {
        return body;
    }
}
