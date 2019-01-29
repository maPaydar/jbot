package ai.bale.jbot.api.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public abstract class Request {

    @JsonProperty("$type")
    private String type = "Request";
    private String id;
    private String service;

    public Request(String id, String service) {
        this.id = id;
        this.service = service;
    }

    public String getType() {
        return type;
    }

    public String getId() {
        return id;
    }

    public String getService() {
        return service;
    }

    public abstract RequestBody getBody();
}
