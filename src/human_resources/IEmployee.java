package human_resources;

import infrastructure.security.idcard.EmployeeIDCard;

public interface IEmployee extends IROEmployee {

    @Override
    boolean isManager();

    @Override
    boolean isMentor();

    @Override
    boolean hasBudgetResponsibility();

    @Override
    EmployeeIDCard getEmployeeIDCard();

    void setManager(boolean isManager);
    void setMentor(boolean isMentor);
    void setBudgetResponsibility(boolean hasBudgetResponsibility);
    void setEmployeeIDCard(EmployeeIDCard employeeIDCard);
}
