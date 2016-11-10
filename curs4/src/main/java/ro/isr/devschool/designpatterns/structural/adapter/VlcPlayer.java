package ro.isr.devschool.designpatterns.structural.adapter;

/**
 * Created by Mucefix on 10/11/16.
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name+ "+fileName);
    }

    @Override
    public void playMp4(String fileName) {
       //throw new NoSuchMethodException();
    }
}
