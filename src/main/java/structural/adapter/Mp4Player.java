package structural.adapter;

/**
 * Mp4 Player.
 * Source code from http://www.tutorialspoint.com/design_pattern/adapter_pattern.htm
 */
public class Mp4Player implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        System.out.println("Vlc play not supported.");
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file: " + fileName);
    }

    @Override
    public void playAvi(String fileName) {
        System.out.println("Avi play not supported.");
    }
}
