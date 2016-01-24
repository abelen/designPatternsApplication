package creational.abstractFactory;

/**
 * Nintendo class.
 */
public class Nintendo extends Game{

    private String game;

    public String getGame() {
        return game;
    }

    public void setGame(String game) {
        this.game = game;
    }

    @Override
    public String toString() {
        return "Nintendo Game Name: " + getGame();
    }

    @Override
    public void playGame() {
        java.lang.System.out.println("Playing Nintendo Game! Playing with power!");
    }
}