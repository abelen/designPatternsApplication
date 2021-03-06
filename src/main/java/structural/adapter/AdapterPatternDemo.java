package structural.adapter;

/**
 * Client class that demonstrates the Adapter Pattern.
 * Source code from http://www.tutorialspoint.com/design_pattern/adapter_pattern.htm
 */
public class AdapterPatternDemo {

    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "chala-head-chala.mp3");
        audioPlayer.play("mp4", "get wild.mp4");
        audioPlayer.play("vlc", "bla.vlc");
        audioPlayer.play("avi", "movie.avi");
    }
}