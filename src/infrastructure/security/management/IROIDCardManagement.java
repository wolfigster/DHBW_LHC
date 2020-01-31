package infrastructure.security.management;

import infrastructure.security.idcard.EmployeeIDCard;
import infrastructure.security.idcard.VisitorIDCard;

public interface IROIDCardManagement {

    VisitorIDCard getVisitorIDCard(String id);
    EmployeeIDCard getEmployeeIDCardFromID(String id);

    VisitorIDCard getLastVisitorIDCard();
    VisitorIDCard getFreeVisitorIDCard();

}
