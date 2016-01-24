package creational.builder;

/**
 * Abstract builder class.
 */
public abstract class Builder {

    /**
     * The name.
     */
    private String name;

    /**
     * The engine.
     */
    private String engine;

    /**
     * The transmission.
     */
    private String transmission;

    /**
     * The drivetrain.
     */
    private String drivetrain;


    public Builder withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Builds the engine component.
     *
     * @param engine the engine
     * @return The builder
     */
    public Builder withEngine(String engine) {
        this.engine = engine;
        return this;
    }

    /**
     * Builds the transmission
     *
     * @param transmission the transmission
     * @return the builder.
     */
    public Builder withTransmission(String transmission) {
        this.transmission = transmission;
        return this;
    }

    /**
     * Builds the drivetrain
     *
     * @param drivetrain the drivetrain.
     * @return the builder.
     */
    public Builder withDrivetrain(String drivetrain) {
        this.drivetrain = drivetrain;
        return this;
    }

    /**
     * Builds the car.
     *
     * @return the car
     */
    public Car buildCar() {
        Car car = new Car();
        car.setName(name);
        car.setDrivetrain(drivetrain);
        car.setEngine(engine);
        car.setTransmission(transmission);
        return car;
    }
}