package ai.bale.jbot.api.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RequestGetKeys extends Request {

    @JsonProperty("body")
    private RequestBody body;

    public RequestGetKeys(String id, String keyspace) {
        super(id, "keyvalue");
        this.body = new RequestBody(keyspace);
    }


    @Override
    public RequestBody getBody() {
        return body;
    }

    class RequestBody extends ai.bale.jbot.api.request.RequestBody {

        private String keyspace;

        RequestBody(String keyspace) {
            super("GetKeys");
            this.keyspace = keyspace;
        }

        public String getKeyspace() {
            return keyspace;
        }
    }
}
