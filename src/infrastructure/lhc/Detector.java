package infrastructure.lhc;

import infrastructure.lhc.experiment.Experiment;
import infrastructure.security.device.Reader;

import java.util.LinkedList;

public class Detector {

    private static String higgsBosonStructure = "higgs";
    private boolean isActivated;
    private LinkedList<Experiment> experimentList;
    private Reader reader;
}
