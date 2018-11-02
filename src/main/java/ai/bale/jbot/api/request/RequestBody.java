package ai.bale.jbot.api.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public abstract class RequestBody {

    @JsonProperty("$type")
    private String type;

    public RequestBody(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
