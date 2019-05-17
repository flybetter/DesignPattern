package adapter;

public class AdapterPatternDemo {
    public static void main(String[] args) {
        MediaPlayer MediaPlayer = new AudioPlayer();
        MediaPlayer.play("mp4", "john.mp4");
        MediaPlayer.play("vlc", "john.vlc");

    }
}
