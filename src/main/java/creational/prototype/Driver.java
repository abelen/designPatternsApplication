package creational.prototype;

/**
 * Driver class.
 */
public class Driver {

    public static void main(String[] args) {

        // using a copy that is cached and then returning that instance.
        System cloneSystem = Systems.getSystem("Saturn");
        java.lang.System.out.println("System 1 " + cloneSystem.getType());

        System cloneSystem2 = Systems.getSystem("Playstation");
        java.lang.System.out.println("System 2 " + cloneSystem2.getType());
    }
}
