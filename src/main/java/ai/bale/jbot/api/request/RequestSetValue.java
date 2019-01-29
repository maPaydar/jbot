package ai.bale.jbot.api.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RequestSetValue extends Request {

    @JsonProperty("body")
    private RequestBody body;

    public RequestSetValue(String id, String keyspace, String key, String value) {
        super(id, "keyvalue");
        this.body = new RequestBody(keyspace, key, value);
    }

    @Override
    public RequestBody getBody() {
        return body;
    }


    class RequestBody extends ai.bale.jbot.api.request.RequestBody {

        private String keyspace;
        private String key;
        private String value;

        RequestBody(String keyspace, String key, String value) {
            super("SetValue");
            this.keyspace = keyspace;
            this.key = key;
            this.value = value;
        }

        public String getKeyspace() {
            return keyspace;
        }

        public String getKey() {
            return key;
        }

        public String getValue() {
            return value;
        }
    }
}
