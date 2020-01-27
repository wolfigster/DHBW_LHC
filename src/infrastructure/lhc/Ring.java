package infrastructure.lhc;

import infrastructure.lhc.experiment.Experiment;
import infrastructure.lhc.hadron.Proton;

public class Ring {

    private boolean isActivated;
    private Experiment experiment;
    private int energy;

    public void activate() {

    }

    public void activate(int initialEnergy) {

    }

    public void activateMagneticField() {

    }

    public void releaseProton() {

    }

    public void increaseEnergy(int delta) {

    }

    public void collide(Proton proton1, Proton proton2) {

    }

    public int decreaseEnergy() {

        return energy;
    }

    public void shutdown() {

    }
}
