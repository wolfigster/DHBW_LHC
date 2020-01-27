package infrastructure.lhc.hadron;

public class ProtonTrap {

    private ProtonTrapID ProtonTrapID;
    private Proton[] protons; // = new Proton[100];

    public ProtonTrap(ProtonTrapID protonTrapID, Proton[] protons) {
        this.ProtonTrapID = protonTrapID;
        this.protons = protons;
    }

    public void loadData(String dataFilePath) {

    }

    public void release() {

    }

    public ProtonTrapID getProtonTrapID() {
        return this.ProtonTrapID;
    }

    public Proton[] getProtons() {
        return this.protons;
    }
}
