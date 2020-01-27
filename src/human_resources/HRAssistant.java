package human_resources;

public class HRAssistant extends Employee {

    public HRAssistant(int id, String name, int[][] iris, boolean isManager, boolean isMentor, boolean hasBudgetResponsibility) {
        super(id, name, iris, isManager, isMentor, hasBudgetResponsibility);
    }

    public HRAssistant(int id, String name, int[][] iris) {
        super(id, name, iris);
    }

    public HRAssistant(String name) {
        super(name);
    }

    public HRAssistant() {
        super();
    }
}
