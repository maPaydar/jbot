package ai.bale.jbot.api.messages;

public class VoiceExtension extends DocExtension {

    private int duration;

    public VoiceExtension() {
    }

    public VoiceExtension(int duration) {
        super("Voice");
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "VoiceExtension{" +
            "duration=" + duration +
            '}';
    }
}