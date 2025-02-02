package infrastructure.lhc;

import com.google.common.eventbus.Subscribe;
import infrastructure.lhc.experiment.Experiment;
import infrastructure.security.device.Reader;

import java.util.LinkedList;

public class Detector extends Subscriber implements IDetector {

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

    public Reader getReader() {
        return this.reader;
    }

    @Override
    public LinkedList<Experiment> getExperimentList() {
        return this.experimentList;
    }

    @Subscribe
    public void receive(Analyse analyse) {

    }
}
