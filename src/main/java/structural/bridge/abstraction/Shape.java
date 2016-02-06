package structural.bridge.abstraction;

import structural.bridge.impl.DrawAPI;

/**
 * Created by anthonybelen on 1/30/16.
 */
public abstract class Shape {

    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
