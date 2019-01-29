package ai.bale.jbot.api.messages;

import ai.bale.jbot.api.entity.Photo;
import java.util.Arrays;

public class StickerMessage extends Message {

    private int stickerId;
    private byte[] fastPreview;
    private Photo image256;
    private Photo image512;
    private int stickerCollectionId;
    private String stickerCollectionAccessHash;

    public StickerMessage() {
        super("Sticker");
    }

    public StickerMessage(int stickerId, byte[] fastPreview, Photo image256,
        Photo image512, int stickerCollectionId, String stickerCollectionAccessHash) {
        super("Sticker");
        this.stickerId = stickerId;
        this.fastPreview = fastPreview;
        this.image256 = image256;
        this.image512 = image512;
        this.stickerCollectionId = stickerCollectionId;
        this.stickerCollectionAccessHash = stickerCollectionAccessHash;
    }

    public int getStickerId() {
        return stickerId;
    }

    public byte[] getFastPreview() {
        return fastPreview;
    }

    public Photo getImage256() {
        return image256;
    }

    public Photo getImage512() {
        return image512;
    }

    public int getStickerCollectionId() {
        return stickerCollectionId;
    }

    public String getStickerCollectionAccessHash() {
        return stickerCollectionAccessHash;
    }

    @Override
    public String toString() {
        return "StickerMessage{" +
            "stickerId=" + stickerId +
            ", fastPreview=" + Arrays.toString(fastPreview) +
            ", image256=" + image256 +
            ", image512=" + image512 +
            ", stickerCollectionId=" + stickerCollectionId +
            ", stickerCollectionAccessHash='" + stickerCollectionAccessHash + '\'' +
            '}';
    }
}
