package creational.builder;

/**
 * A car.
 */
public class Car {

    /**
     * The name.
     */
    public String name;

    /**
     * The Engine.
     */
    public String engine;

    /**
     * The transmission.
     */
    public String transmission;

    /**
     * The drivetrain.
     */
    public String drivetrain;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the engine.
     *
     * @return the engine.
     */
    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getDrivetrain() {
        return drivetrain;
    }

    public void setDrivetrain(String drivetrain) {
        this.drivetrain = drivetrain;
    }

    public String toString() {
        return "Car Name: " + name + " Engine: " + engine + " Transmission: " + transmission +
                " Drivetrain: " + drivetrain;
    }
}
