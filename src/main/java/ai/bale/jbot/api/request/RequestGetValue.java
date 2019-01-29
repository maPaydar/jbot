package ai.bale.jbot.api.request;

public class RequestGetValue extends Request {

    private RequestBody body;

    public RequestGetValue(String id, String keyspace, String key) {
        super(id, "keyvalue");
        this.body = new RequestBody(keyspace, key);
    }

    @Override
    public RequestBody getBody() {
        return body;
    }

    class RequestBody extends ai.bale.jbot.api.request.RequestBody {

        private String keyspace;
        private String key;

        RequestBody(String keyspace, String key) {
            super("GetValue");
            this.keyspace = keyspace;
            this.key = key;
        }

        public String getKeyspace() {
            return keyspace;
        }

        public String getKey() {
            return key;
        }
    }
}
