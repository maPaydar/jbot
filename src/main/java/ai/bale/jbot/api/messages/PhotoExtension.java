package ai.bale.jbot.api.messages;

public class PhotoExtension extends DocExtension {

    private int width;
    private int height;

    public PhotoExtension() {
    }

    public PhotoExtension(int width, int height) {
        super("Photo");
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "PhotoExtension{" +
            "width=" + width +
            ", height=" + height +
            '}';
    }
}
