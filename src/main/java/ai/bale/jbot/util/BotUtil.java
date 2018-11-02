package ai.bale.jbot.util;

import ai.bale.jbot.api.BotPacket;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.Random;

public class BotUtil {

    private static Random random = new Random(920);
    private static ObjectMapper mapper = new ObjectMapper();

    /**
     *
     * @return
     */
    public static String generateRandomId() {
        return String.valueOf(random.nextLong());
    }

    public static String stringify(Object o) {
        try {
            return mapper.writeValueAsString(o);
        } catch (JsonProcessingException e) {
        }
        return "";
    }

    public static BotPacket deserializeBotPacket(String json) {
        try {
            return mapper.readValue(json, BotPacket.class);
        } catch (IOException e) {
        }
        return null;
    }
}
