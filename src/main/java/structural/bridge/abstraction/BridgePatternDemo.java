package structural.bridge.abstraction;

import structural.bridge.impl.GreenCircle;
import structural.bridge.impl.RedCircle;

/**
 * Client classes that demonstrates the bridge pattern.
 */
public class BridgePatternDemo {

    public static void main(String[] args) {
        Shape redCircle = new Circle(10,10, 10, new RedCircle());
        Shape greenCircle = new Circle(50, 50, 50, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
