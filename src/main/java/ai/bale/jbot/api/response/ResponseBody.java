package ai.bale.jbot.api.response;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

@JsonTypeInfo(use = Id.NAME)
public abstract class ResponseBody {

    public ResponseBody() {
    }
}
