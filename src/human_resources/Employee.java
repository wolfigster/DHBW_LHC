package human_resources;

public abstract class Employee extends Person implements IEmployee  {

    protected boolean isManager;
    protected boolean isMentor;
    protected boolean hasBudgetResponsibility;

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
