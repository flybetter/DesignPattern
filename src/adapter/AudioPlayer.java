package adapter;

public class AudioPlayer implements MediaPlayer {

    MediaAdapter mediaAdapter;

    @Override
    public void play(String mediaType, String fileName) {
        if (mediaType.equalsIgnoreCase("vlc")|| mediaType.equalsIgnoreCase("mp4")) {
            mediaAdapter= new MediaAdapter(mediaType);
            mediaAdapter.play(mediaType,fileName);
        }else {
            System.out.println("Invalid media :"+mediaType+" format not supported");
        }

    }
}
