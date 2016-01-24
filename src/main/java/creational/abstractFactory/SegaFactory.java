package creational.abstractFactory;

/**
 * Factory class that creates Sega games.
 */
public class SegaFactory extends AbstractFactory {
    @Override
    public Game createGame(String name) {
        Sega sega = new Sega();
        sega.setGame(name);
        return sega;
    }
}
