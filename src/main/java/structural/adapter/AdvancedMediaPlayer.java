package structural.adapter;

/**
 * Advanced Media Player interface
 */
public interface AdvancedMediaPlayer {

    /**
     * Plays a vlc file.
     *
     * @param fileName the filename
     */
    public void playVlc(String fileName);

    /**
     * Plays a mp4 file.
     *
     * @param fileName the filename
     */
    public void playMp4(String fileName);
}
