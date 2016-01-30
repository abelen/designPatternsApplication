package structural.adapter;

/**
 * Generic Media Player interface
 */
public interface MediaPlayer {

    /**
     * Plays the file with the given audio type
     *
     * @param audioType the audio type of the file
     * @param fileName the filename
     */
    public void play(String audioType, String fileName);
}