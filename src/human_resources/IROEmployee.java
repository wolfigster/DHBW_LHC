package human_resources;

import infrastructure.security.idcard.EmployeeIDCard;

public interface IROEmployee {

    boolean isManager();
    boolean isMentor();
    boolean hasBudgetResponsibility();

    EmployeeIDCard getEmployeeIDCard();
}
