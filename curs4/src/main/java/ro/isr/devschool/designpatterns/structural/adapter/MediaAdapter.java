package ro.isr.devschool.designpatterns.structural.adapter;

/**
 * Created by Mucefix on 10/11/16.
 */
public class MediaAdapter implements MediaPlayer {
    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType){
        switch (audioType){
            case "vlc": advancedMediaPlayer = new VlcPlayer();
                        break;
            case "mp4": advancedMediaPlayer = new Mp4Player();
                        break;
            default: advancedMediaPlayer = null;
        }
    }
    @Override
    public void play(String audioType, String fileName) {
        switch (audioType){
            case "vlc": advancedMediaPlayer.playVlc(fileName);
                        break;
            case "mp4": advancedMediaPlayer.playMp4(fileName);
                        break;
            default: throw new NullPointerException();
        }
    }
}
