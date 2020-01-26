package human_resources;

public class Researcher extends Employee {

    private boolean isSenior;

    public Researcher(int id, String name, int[][] iris, boolean isManager, boolean isMentor, boolean hasBudgetResponsibility, boolean isSenior) {
        this.id = id;
        this.name = name;
        this.iris = iris;
        this.isManager = isManager;
        this.isMentor = isMentor;
        this.hasBudgetResponsibility = hasBudgetResponsibility;
        this.isSenior = isSenior;
    }

    public boolean isSenior() {
        return this.isSenior;
    }

    public void setSenior(boolean senior) {
        this.isSenior = senior;
    }
}
