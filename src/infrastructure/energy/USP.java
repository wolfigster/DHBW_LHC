package infrastructure.energy;

public class USP {

    private boolean isStandBy;
    private boolean isActivated;
    private Battery[] batteries = new Battery[25];

    public USP() {
        for(int i = 0; i < 25; i++) {
            batteries[i] = new Battery();
        }
    }

    public void determineChargeState() {

    }

    public void charge(ThreePinPlug plug) {

    }

    public int takeOut() {

        return 0;
    }

    public boolean isStandBy() {
        return this.isStandBy;
    }

    public boolean isActivated() {
        return this.isActivated;
    }

    public Battery[] getBatteries() {
        return this.batteries;
    }
}
