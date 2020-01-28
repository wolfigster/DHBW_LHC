package infrastructure.security.management;

import infrastructure.security.idcard.EmployeeIDCard;
import infrastructure.security.idcard.VisitorIDCard;

public interface IIDCardManagement extends IROIDCardManagement {

    VisitorIDCard getVisitorIDCard(String id);
    EmployeeIDCard getEmployeeIDCardFromID(String id);

    VisitorIDCard getLastVisitorIDCard();
    VisitorIDCard getFreeVisitorIDCard();

    void addIDCard(VisitorIDCard visitorIDCard);
    void removeIDCard(VisitorIDCard visitorIDCard);
    VisitorIDCard createVisitorIDCard();

    void addIDCard(EmployeeIDCard employeeIDCard);
    void removeIDCard(EmployeeIDCard employeeIDCard);
    EmployeeIDCard createEmployeeIDCard();
}
