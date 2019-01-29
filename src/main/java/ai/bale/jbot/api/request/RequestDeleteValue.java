package ai.bale.jbot.api.request;

public class RequestDeleteValue extends Request {

    private RequestBody body;

    public RequestDeleteValue(String id, String keyspace, String key) {
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
            super("DeleteValue");
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
