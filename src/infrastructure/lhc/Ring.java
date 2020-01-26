package infrastructure.lhc;

public class Ring {

    private boolean isActivated;
    private Experiment currentExperiment;
    private int energy;
    private Magnet[] magnets; // = new Magnet[72];
    private ProtonTrap[] protonTraps; // = new ProtonTrap[2];
    private Detector detector;

    public Ring(boolean isActivated, Experiment experiment, int energy, Magnet[] magnets, ProtonTrap[] protonTraps, Detector detector) {
        this.isActivated = isActivated;
        this.currentExperiment = experiment;
        this.energy = energy;
        this.magnets = magnets;
        this.protonTraps = protonTraps;
        this.detector = detector;
    }

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

    public void collide(Proton proton01, Proton proton02) {

    }

    public int decreaseEnergy() {

        return energy;
    }

    public void shutdown() {

    }

    public boolean isActivated() {
        return this.isActivated;
    }

    public Experiment getCurrentExperiment() {
        return this.currentExperiment;
    }

    public int getEnergy() {
        return this.energy;
    }

    public Magnet[] getMagnets() {
        return this.magnets;
    }

    public ProtonTrap[] getProtonTraps() {
        return this.protonTraps;
    }

    public Detector getDetector() {
        return this.detector;
    }
}
