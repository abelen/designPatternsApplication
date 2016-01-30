package creational.prototype;

/**
 * Playstation system.
 */
public class Playstation extends System {

    /**
     * The singular instance.
     */
    private static final Playstation INSTANCE = new Playstation();

    /**
     * Returns the singular instance.
     *
     * @return the singular instance
     */
    public static Playstation getInstance() {
        return INSTANCE;
    }

    /**
     * Private constructor.
     */
    private Playstation() {
        setType("Playstation");
    }

    /**
     * Plays game.
     */
    public void playGame() {
        java.lang.System.out.println("Playing Sega saturn.");
    }

}
