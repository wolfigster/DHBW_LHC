package human_resources;

import infrastructure.lhc.IRODetector;
import infrastructure.security.idcard.EmployeeIDCard;

public class Researcher extends Employee {

    private boolean isSenior;
    private IRODetector iroDetector;

    public Researcher(int id, String name, int[][] iris, boolean isManager, boolean isMentor, boolean hasBudgetResponsibility, boolean isSenior, EmployeeIDCard employeeIDCard, IRODetector iroDetector) {
        super(id, name, iris, isManager, isMentor, hasBudgetResponsibility, employeeIDCard);
        this.isSenior = isSenior;
        this.iroDetector = iroDetector;
    }

    public Researcher(int id, String name, int[][] iris, boolean isManager, boolean isMentor, boolean hasBudgetResponsibility, boolean isSenior, IRODetector iroDetector) {
        super(id, name, iris, isManager, isMentor, hasBudgetResponsibility);
        this.isSenior = isSenior;
        this.iroDetector = iroDetector;
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

    public IRODetector getIroDetector() {
        return iroDetector;
    }

    public void setIroDetector(IRODetector iroDetector) {
        this.iroDetector = iroDetector;
    }
}