package human_resources;

import java.util.Date;

public class ScientificAssistant extends Employee {

    private Date periodFrom;
    private Date periodUntil;

    public ScientificAssistant(int id, String name, int[][] iris, boolean isManager, boolean isMentor, boolean hasBudgetResponsibility, Date periodFrom, Date periodUntil) {
        super(id, name, iris, isManager, isMentor, hasBudgetResponsibility);
        this.periodFrom = periodFrom;
        this.periodUntil = periodUntil;
    }

    public ScientificAssistant(int id, String name, int[][] iris) {
        super(id, name, iris);
        this.periodFrom = new Date();
        this.periodUntil = new Date();
    }

    public ScientificAssistant(String name) {
        super(name);
        this.periodFrom = new Date();
        this.periodUntil = new Date();
    }

    public ScientificAssistant() {
        super();
        this.periodFrom = new Date();
        this.periodUntil = new Date();
    }

    public Date getPeriodFrom() {
        return this.periodFrom;
    }

    public Date getPeriodUntil() {
        return this.periodUntil;
    }
}
