package creational.singleton;

/**
 * Singleton enum type.
 */
public enum Saturn {

    /**
     * The single instance of saturn.
     */
    INSTANCE;

    /**
     * Plays the game.
     */
    public void playGame() {
        System.out.println("playing game.");
    }
}
