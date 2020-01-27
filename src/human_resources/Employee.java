package human_resources;

public abstract class Employee extends Person implements IEmployee  {

    protected boolean isManager;
    protected boolean isMentor;
    protected boolean hasBudgetResponsibility;

    public Employee(int id, String name, int[][] iris, boolean isManager, boolean isMentor, boolean hasBudgetResponsibility) {
        super(id, name, iris);
        this.isManager = isManager;
        this.isMentor = isMentor;
        this.hasBudgetResponsibility = hasBudgetResponsibility;
    }

    public Employee(int id, String name, int[][] iris) {
        super(id, name, iris);
        this.isManager = false;
        this.isMentor = false;
        this.hasBudgetResponsibility = false;
    }

    public Employee(String name) {
        super(name);
        this.isManager = false;
        this.isMentor = false;
        this.hasBudgetResponsibility = false;
    }

    public Employee() {
        super();
        this.isManager = false;
        this.isMentor = false;
        this.hasBudgetResponsibility = false;
    }

    @Override
    public boolean isManager() {
        return this.isManager;
    }

    @Override
    public boolean isMentor() {
        return this.isMentor;
    }

    @Override
    public boolean hasBudgetResponsibility() {
        return this.hasBudgetResponsibility;
    }

    @Override
    public void setManager(boolean isManager) {
        this.isManager = isManager;
    }

    @Override
    public void setMentor(boolean isMentor) {
        this.isMentor = isMentor;
    }

    @Override
    public void setBudgetResponsibility(boolean hasBudgetResponsibility) {
        this.hasBudgetResponsibility = hasBudgetResponsibility;
    }

}
