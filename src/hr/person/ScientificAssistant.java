package hr.person;

import java.util.Date;

public class ScientificAssistant extends Employee {

    private Date periodFrom;
    private Date periodUntil;

    public ScientificAssistant(int id, String name, int[][] iris, boolean isManager, boolean isMentor, boolean hasBudgetResponsibility, Date periodFrom, Date periodUntil) {
        this.id = id;
        this.name = name;
        this.iris = iris;
        this.isManager = isManager;
        this.isMentor = isMentor;
        this.hasBudgetResponsibility = hasBudgetResponsibility;
        this.periodFrom = periodFrom;
        this.periodUntil = periodUntil;
    }

    public Date getPeriodFrom() {
        return periodFrom;
    }

    public Date getPeriodUntil() {
        return periodUntil;
    }
}
