package infrastructure.lhc;

public class Magnet {

    private boolean isActivated;
    private MagneticDirection direction;
    private int fieldStrength;

    public Magnet(boolean isActivated, MagneticDirection direction, int fieldStrength) {
        this.isActivated = isActivated;
        this.direction = direction;
        this.fieldStrength = fieldStrength;
    }

    public void activate() {

    }

    public void deactivated() {

    }

    public boolean isActivated() {
        return this.isActivated;
    }

    public MagneticDirection getDirection() {
        return this.direction;
    }

    public int getFieldStrength() {
        return this.fieldStrength;
    }
}
