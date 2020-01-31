package lhc.proton;

public class ProtonTrap {

    private int ProtonTrapID;
    private Proton[] protons;

    public ProtonTrap(int protonTrapID, Proton[] protons) {
        this.ProtonTrapID = protonTrapID;
        this.protons = protons;
    }

    public void loadData(String dataFilePath) {

    }

    public void release() {

    }

    public int getProtonTrapID() {
        return ProtonTrapID;
    }

    public Proton[] getProtons() {
        return protons;
    }
}
