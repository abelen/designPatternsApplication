package creational.prototype;

/**
 * Driver class.
 */
public class Driver {

    public static void main(String[] args) {

        System cloneSystem = (System) Systems.getSystem("Saturn");
        java.lang.System.out.println("System 1 " + cloneSystem.getType());

        System cloneSystem2 = (System) Systems.getSystem("Playstation");
        java.lang.System.out.println("System 2 " + cloneSystem2.getType());
    }
}
