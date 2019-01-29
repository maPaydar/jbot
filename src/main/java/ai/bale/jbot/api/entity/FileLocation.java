package ai.bale.jbot.api.entity;

public class FileLocation {

    private String fileId;
    private String accessHash;
    private int fileStorageVersion = 1;

    public FileLocation() {
    }

    public FileLocation(String fileId, String accessHash, int fileStorageVersion) {
        this.fileId = fileId;
        this.accessHash = accessHash;
        this.fileStorageVersion = fileStorageVersion;
    }

    public String getFileId() {
        return fileId;
    }

    public String getAccessHash() {
        return accessHash;
    }

    public int getFileStorageVersion() {
        return fileStorageVersion;
    }

    @Override
    public String toString() {
        return "FileLocation{" +
            "fileId='" + fileId + '\'' +
            ", accessHash='" + accessHash + '\'' +
            ", fileStorageVersion=" + fileStorageVersion +
            '}';
    }
}
