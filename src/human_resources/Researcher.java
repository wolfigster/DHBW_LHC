package human_resources;

public class Researcher extends Employee {

    private boolean isSenior;

    public Researcher(int id, String name, int[][] iris, boolean isManager, boolean isMentor, boolean hasBudgetResponsibility, boolean isSenior) {
        super(id, name, iris, isManager, isMentor, hasBudgetResponsibility);
        this.isSenior = isSenior;
    }

    public Researcher(int id, String name, int[][] iris) {
        super(id, name, iris);
        this.isSenior = false;
    }

    public Researcher(String name) {
        super(name);
        this.isSenior = false;
    }

    public Researcher() {
        super();
        this.isSenior = false;
    }

    public boolean isSenior() {
        return this.isSenior;
    }

    public void setSenior(boolean senior) {
        this.isSenior = senior;
    }
}