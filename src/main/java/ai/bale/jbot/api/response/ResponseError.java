package ai.bale.jbot.api.response;

public class ResponseError {

    private String code;
    private String tag;
    private String data;
    private String retryIn;

    public ResponseError() {
    }

    public String getCode() {
        return code;
    }

    public String getTag() {
        return tag;
    }

    public String getData() {
        return data;
    }

    public String getRetryIn() {
        return retryIn;
    }
}
