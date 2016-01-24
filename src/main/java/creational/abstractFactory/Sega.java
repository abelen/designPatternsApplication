package creational.abstractFactory;

/**
 * Sega game.
 */
public class Sega extends Game {

    private String game;

    public String getGame() {
        return game;
    }

    public void setGame(String game) {
        this.game = game;
    }

    @Override
    public String toString() {
        return "Sega Game Name: " + getGame();
    }

    @Override
    public void playGame() {
        java.lang.System.out.println("Playing Sega Game! Sega does what Nintendon't!");
    }
}