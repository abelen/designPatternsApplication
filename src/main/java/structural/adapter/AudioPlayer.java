package structural.adapter;

/**
 * Audio player class
 * Source code from http://www.tutorialspoint.com/design_pattern/adapter_pattern.htm
 */
public class AudioPlayer implements MediaPlayer {

    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {

        // play mp3 music files
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3 file. Name: " + fileName);

            // using the adapter to play other formats.
        } else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4") ||
                audioType.equalsIgnoreCase("avi")) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        } else {
            System.out.println("Invalid media. " + audioType + " format not supported.");
        }
    }
}
