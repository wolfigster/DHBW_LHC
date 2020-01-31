package infrastructure.lhc;

import com.google.common.eventbus.EventBus;
import infrastructure.lhc.experiment.ExperimentScope;

public enum ControlCenter {
    instance
    ;

    private String roomID = "C01";
    private EventBus eventBus;

    ControlCenter() {
        eventBus = new EventBus("ControlCenter");
    }

    public void startExperiment() {}

    public void startExperiment(ExperimentScope scope) {
        switch (scope) {
            case ESFull:
                break;
            case ES5:
                break;
            case ES10:
                break;
            case ES20:
                break;
        }
    }

    public void addSubscriber(Subscriber subscriber) {
        eventBus.register(subscriber);
    }
}
