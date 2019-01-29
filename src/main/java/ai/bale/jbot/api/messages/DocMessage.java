package ai.bale.jbot.api.messages;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

@JsonTypeInfo(use = Id.NAME, property = "ext.type")
public class DocMessage extends Message {

    private String fileId;
    private String accessHash;
    private String name;
    private int fileSize;
    private String mimeType;
    private Caption caption;
    private String checkSum = "checksum";
    private String algorithm = "algorithm";
    private int fileStorageVersion = 1;
    private DocExtension ext;
    private Thumb thumb;

    public DocMessage(String fileId, String accessHash, String name, int fileSize,
        String mimeType, String captionText) {
        super("Document");
        this.fileId = fileId;
        this.accessHash = accessHash;
        this.name = name;
        this.fileSize = fileSize;
        this.mimeType = mimeType;
        this.caption = new Caption(captionText);
    }

    public DocMessage(String fileId, String accessHash, String name, int fileSize,
        String mimeType, String captionText, DocExtension ext, Thumb thumb) {
        this(fileId, accessHash, name, fileSize, mimeType, captionText);
        this.ext = ext;
        this.thumb = thumb;
    }

    @JsonCreator
    public DocMessage(@JsonProperty("fileId") String fileId,
        @JsonProperty("accessHash") String accessHash,
        @JsonProperty("name") String name,
        @JsonProperty("fileSize") int fileSize,
        @JsonProperty("mimeType") String mimeType,
        @JsonProperty("fileStorageVersion") int fileStorageVersion,
        @JsonProperty("caption") Caption caption,
        @JsonProperty("ext") DocExtension ext,
        @JsonProperty("thumb") Thumb thumb,
        @JsonProperty("checksum") String checkSum,
        @JsonProperty("algorithm") String algorithm) {
        this(fileId, accessHash, name, fileSize, mimeType, "");
        this.caption = caption;
        this.ext = ext;
        this.thumb = thumb;
    }


    public String getFileId() {
        return fileId;
    }

    public String getAccessHash() {
        return accessHash;
    }

    public String getName() {
        return name;
    }

    public int getFileSize() {
        return fileSize;
    }

    public String getMimeType() {
        return mimeType;
    }

    public String getCheckSum() {
        return checkSum;
    }

    public String getAlgorithm() {
        return algorithm;
    }

    public int getFileStorageVersion() {
        return fileStorageVersion;
    }

    public Caption getCaption() {
        return caption;
    }

    public Thumb getThumb() {
        return thumb;
    }

    public DocExtension getExt() {
        return ext;
    }

    @Override
    public String toString() {
        return "DocMessage{" +
            "fileId='" + fileId + '\'' +
            ", accessHash='" + accessHash + '\'' +
            ", name='" + name + '\'' +
            ", fileSize=" + fileSize +
            ", mimeType='" + mimeType + '\'' +
            ", caption=" + caption +
            ", checkSum='" + checkSum + '\'' +
            ", algorithm='" + algorithm + '\'' +
            ", fileStorageVersion=" + fileStorageVersion +
            ", ext=" + ext +
            ", thumb=" + thumb +
            '}';
    }
}
