package ro.isr.devschool.designpatterns.structural.adapter;

/**
 * Created by Mucefix on 10/11/16.
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        //do nothing
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+fileName);
    }
}
