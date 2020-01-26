package hr.person;

public abstract class Employee extends Person implements IEmployee {

    protected boolean isManager;
    protected boolean isMentor;
    protected boolean hasBudgetResponsibility;

    @Override
    public boolean isManager() {
        return isManager;
    }

    @Override
    public boolean isMentor() {
        return isMentor;
    }

    @Override
    public boolean isHasBudgetResponsibility() {
        return hasBudgetResponsibility;
    }
}
