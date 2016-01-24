package creational.builder;

/**
 * The driver class.
 */
public class Driver {

    public static void main(String[] args) {

        Builder builder = new ConcreteBuilder();
        builder.withName("Camaro");
        builder.withDrivetrain("RWD");
        builder.withEngine("3.8L V6");
        builder.withTransmission("Manual");

        Car camaro = builder.buildCar();
        System.out.println(camaro);
    }
}
