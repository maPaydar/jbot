package ai.bale.jbot.api.messages;

public class VideoExtension extends DocExtension {

    private int width;
    private int height;
    private int duration;

    public VideoExtension() {
    }

    public VideoExtension(int width, int height, int duration) {
        super("Video");
        this.width = width;
        this.height = height;
        this.duration = duration;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "VideoExtension{" +
            "width=" + width +
            ", height=" + height +
            ", duration=" + duration +
            '}';
    }
}
