package _01;

public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String filename) {
        System.out.println("Playing Vlc file. name:"+filename);
    }

    @Override
    public void playMp4(String fileName) {

    }
}
