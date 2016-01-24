package creational.abstractFactory;

/**
 * Class that runs the factory classes.
 */
public class Driver {

    public static void main(String[] args) {
        AbstractFactory segaFactory = new SegaFactory();
        AbstractFactory nintendoFactory = new NintendoFactory();

        Game segaGame = segaFactory.createGame("Comix Zone");
        Game nintendoGame = nintendoFactory.createGame("Super Mario World");

        segaGame.playGame();
        nintendoGame.playGame();
    }
}
