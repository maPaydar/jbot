package ai.bale.jbot;

import ai.bale.jbot.api.BotPacket;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;

public class EntityTest {


    public static void main(String[] args) throws IOException {

        ObjectMapper mapper = new ObjectMapper();
        String json = "{\"$type\":\"FatSeqUpdate\",\"seq\":11676,\"body\":{\"$type\":\"Message\",\"peer\":{\"$type\":\"User\",\"id\":1472433338,\"accessHash\":\"-6189360920334688263\"},\"sender\":{\"$type\":\"User\",\"id\":1472433338,\"accessHash\":\"-6189360920334688263\"},\"date\":\"1541763623803\",\"randomId\":\"-2926056821309036765\",\"message\":{\"$type\":\"Unsupported\"},\"quotedMessage\":{\"messageId\":\"-537116117673827539\",\"publicGroupId\":null,\"senderId\":1472433338,\"messageDate\":\"1541763441333\",\"message\":{\"$type\":\"Unsupported\"}}},\"users\":[[1472433338,{\"id\":1472433338,\"accessHash\":\"-6189360920334688263\",\"name\":\"امین\u200Cپایدار\",\"sex\":1,\"about\":\"کربلا اکسیر مستی و جنونه!\",\"avatar\":{\"smallImage\":{\"fileLocation\":{\"fileId\":\"-5776886868885567231\",\"accessHash\":\"1472433338\",\"fileStorageVersion\":1},\"width\":100,\"height\":100,\"fileSize\":3323},\"largeImage\":{\"fileLocation\":{\"fileId\":\"5479719662238828546\",\"accessHash\":\"1472433338\",\"fileStorageVersion\":1},\"width\":200,\"height\":200,\"fileSize\":8651},\"fullImage\":{\"fileLocation\":{\"fileId\":\"3496552529451747330\",\"accessHash\":\"1472433338\",\"fileStorageVersion\":1},\"width\":1158,\"height\":1158,\"fileSize\":223596}},\"username\":\"aminpaydar\",\"isBot\":false,\"contactRecords\":[],\"timeZone\":\"Asia/Tehran\",\"preferredLanguages\":[\"fa-IR\",\"fa\"],\"botCommands\":[{\"slashCommand\":\"help\",\"description\":\"توضیحات اولیه\",\"locKey\":\"توضیحات اولیه\"},{\"slashCommand\":\"salam\",\"description\":\"avalin command\",\"locKey\":\"avalin command\"}]}]],\"groups\":[]}";
//        String json = "{\"$type\":\"FatSeqUpdate\",\"seq\":11611,\"body\":{\"$type\":\"Message\",\"peer\":{\"$type\":\"User\",\"id\":1472433338,\"accessHash\":\"-6189360920334688263\"},\"sender\":{\"$type\":\"User\",\"id\":1472433338,\"accessHash\":\"-6189360920334688263\"},\"date\":\"1541362008842\",\"randomId\":\"-8062314699613722505\",\"message\":{\"$type\":\"Text\",\"text\":\"aasdf\"}},\"users\":[[1472433338,{\"id\":1472433338,\"accessHash\":\"-6189360920334688263\",\"name\":\"امین\u200Cپایدار\",\"sex\":1,\"about\":\"کربلا اکسیر مستی و جنونه!\",\"avatar\":{\"smallImage\":{\"fileLocation\":{\"fileId\":\"-5776886868885567231\",\"accessHash\":\"1472433338\",\"fileStorageVersion\":1},\"width\":100,\"height\":100,\"fileSize\":3323},\"largeImage\":{\"fileLocation\":{\"fileId\":\"5479719662238828546\",\"accessHash\":\"1472433338\",\"fileStorageVersion\":1},\"width\":200,\"height\":200,\"fileSize\":8651},\"fullImage\":{\"fileLocation\":{\"fileId\":\"3496552529451747330\",\"accessHash\":\"1472433338\",\"fileStorageVersion\":1},\"width\":1158,\"height\":1158,\"fileSize\":223596}},\"username\":\"aminpaydar\",\"isBot\":false,\"contactRecords\":[],\"timeZone\":\"Asia/Tehran\",\"preferredLanguages\":[\"fa-IR\",\"fa\"],\"botCommands\":[{\"slashCommand\":\"help\",\"description\":\"توضیحات اولیه\",\"locKey\":\"توضیحات اولیه\"},{\"slashCommand\":\"salam\",\"description\":\"avalin command\",\"locKey\":\"avalin command\"}]}]],\"groups\":[]}";
        BotPacket botPacket = mapper.readValue(json, BotPacket.class);
        System.out.println(botPacket);
    }
}
