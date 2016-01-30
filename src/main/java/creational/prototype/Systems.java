package creational.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * Data structure that holds different systems.
 */
public class Systems {

    private static Map<String, System> systemMap = new HashMap<String, System>();

    static {
        populateMap();
    }

    private static void populateMap() {
        systemMap.put("Saturn", Saturn.getInstance());
        systemMap.put("Playstation", Playstation.getInstance());
    }

    public static  System getSystem(String systemName) {
        System system = systemMap.get(systemName);
        return (System) system.clone();
    }
}
