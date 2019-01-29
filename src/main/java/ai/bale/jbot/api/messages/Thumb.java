package ai.bale.jbot.api.messages;

public class Thumb {

    private int width;
    private int height;
    private String thumb;

    public Thumb() {
    }

    public Thumb(int width, int height, String thumb) {
        this.width = width;
        this.height = height;
        this.thumb = thumb;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String getThumb() {
        return thumb;
    }

    @Override
    public String toString() {
        return "Thumb{" +
            "width=" + width +
            ", height=" + height +
            ", thumb='" + thumb + '\'' +
            '}';
    }
}
