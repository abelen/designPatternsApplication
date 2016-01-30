package creational.prototype;

/**
 * Sega Saturn system.
 */
public class Saturn extends System {

    private static final Saturn INSTANCE = new Saturn();

    public static Saturn getInstance() {
        return INSTANCE;
    }

    /**
     * Private constructor.
     */
    private Saturn() {
        setType("Saturn");
    }

    /**
     * Plays game.
     */
    public void playGame() {
        java.lang.System.out.println("Playing Sega saturn.");
    }
}
