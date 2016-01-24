package creational.abstractFactory;

/**
 * Nintendo class.
 */
public class Nintendo extends Game{

    private String game;
    private System system;

    public String getGame() {
        return game;
    }

    public void setGame(String game) {
        this.game = game;
    }

    public System getSystem() {
        return system;
    }

    public void setSystem(System system) {
        this.system = system;
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