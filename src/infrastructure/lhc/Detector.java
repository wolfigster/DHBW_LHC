package infrastructure.lhc;

import infrastructure.security.Reader;

import java.util.LinkedList;

public class Detector implements IDetector {

    private static String higgsBosonStructure = "higgs";
    private boolean isActivated;
    private LinkedList<Experiment> experimentList;
    private Reader reader;

    public Detector(boolean isActivated, LinkedList<Experiment> experimentList, Reader reader) {
        this.isActivated = isActivated;
        this.experimentList = experimentList;
        this.reader = reader;
    }

    public boolean isActivated() {
        return this.isActivated;
    }

    public LinkedList<Experiment> getExperimentList() {
        return this.experimentList;
    }

    public Reader getReader() {
        return this.reader;
    }
}
