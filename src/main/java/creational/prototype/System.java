package creational.prototype;

/**
 * System abstract class which acts the prototype that it can be used for the concrete subclasses.
 */
public abstract class System  implements Cloneable {

    private String type;

    public abstract void playGame();

    public Object clone() {
        Object clone = null;

        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
