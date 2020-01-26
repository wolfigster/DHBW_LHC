package human_resources;

public interface IEmployee extends IROEmployee {

    @Override
    boolean isManager();

    @Override
    boolean isMentor();

    @Override
    boolean hasBudgetResponsibility();

    void setManager(boolean isManager);
    void setMentor(boolean isMentor);
    void setBudgetResponsibility(boolean hasBudgetResponsibility);
}
