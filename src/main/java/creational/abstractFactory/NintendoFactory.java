package creational.abstractFactory;

/**
 * Factory class that creates Nintendo games.
 */
public class NintendoFactory extends AbstractFactory {


    @Override
    public Game createGame(String name) {
        Nintendo nintendo = new Nintendo();
        nintendo.setGame(name);
        return nintendo;
    }
}
