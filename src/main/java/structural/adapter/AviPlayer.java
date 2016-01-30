package structural.adapter;

/**
 * Avi player.
 */
public class AviPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {

    }

    @Override
    public void playAvi(String fileName) {
        System.out.println("Playing avi file: " + fileName);
    }
}
