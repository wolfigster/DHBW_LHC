package infrastructure.lhc;

import com.google.common.eventbus.EventBus;
import infrastructure.lhc.experiment.ExperimentScope;
import infrastructure.lhc.experiment.RunExperimentPartial;

public enum ControlCenter {
    instance
    ;

    private String roomID = "C01";
    private Workplace workplace;
    private EventBus eventBus;

    ControlCenter() {
        eventBus = new EventBus("ControlCenter");
    }

    public void startExperiment() {}

    public void startExperiment(ExperimentScope scope) {
        eventBus.post(new RunExperimentPartial(scope));
    }

    public void addSubscriber(Subscriber subscriber) {
        eventBus.register(subscriber);
    }
}
