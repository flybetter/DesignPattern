package adapter;

public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println(" vlcplayer, the filename:" + fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}
