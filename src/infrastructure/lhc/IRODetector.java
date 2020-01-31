package infrastructure.lhc;

import infrastructure.lhc.experiment.Experiment;

import java.util.LinkedList;

public interface IRODetector {

    LinkedList<Experiment> getExperimentList();

}
