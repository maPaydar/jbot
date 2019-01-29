package ai.bale.jbot.api.entity;

public class Photo {

    private FileLocation fileLocation;
    private int width;
    private int height;
    private int fileSize;

    public Photo() {
    }

    public Photo(FileLocation fileLocation, int width, int height, int fileSize) {
        this.fileLocation = fileLocation;
        this.width = width;
        this.height = height;
        this.fileSize = fileSize;
    }

    public FileLocation getFileLocation() {
        return fileLocation;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getFileSize() {
        return fileSize;
    }

    @Override
    public String toString() {
        return "Photo{" +
            "fileLocation=" + fileLocation +
            ", width=" + width +
            ", height=" + height +
            ", fileSize=" + fileSize +
            '}';
    }
}
