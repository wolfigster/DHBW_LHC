package infrastructure.lhc.experiment;

public class RunExperimentPartial {

    private ExperimentScope experimentScope;

    public RunExperimentPartial(ExperimentScope experimentScope) {
        this.experimentScope = experimentScope;
    }

    public ExperimentScope getExperimentScope() {
        return experimentScope;
    }
}
