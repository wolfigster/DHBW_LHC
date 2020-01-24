package lhc;

import infrastructure.experiment.Experiment;
import management.Reader;

import java.util.LinkedList;

public class Detector {

    private static String higgsBosonStructure = "higgs";
    private boolean isActivated;
    private LinkedList<Experiment> experimentList;
    private Reader reader;
}
