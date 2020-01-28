package infrastructure.security.management;

import infrastructure.security.idcard.EmployeeIDCard;
import infrastructure.security.idcard.IDCard;
import infrastructure.security.idcard.VisitorIDCard;

import java.util.HashMap;
import java.util.Map;

public enum IDCardManagement implements IIDCardManagement {
    instance
    ;

    private Map<Integer, VisitorIDCard> visitorIDCardMap = new HashMap<>();
    private Map<Integer, EmployeeIDCard> employeeIDCardMap = new HashMap<>();

    @Override
    public void addIDCard(VisitorIDCard visitorIDCard) {
        visitorIDCardMap.put(visitorIDCardMap.size() +1, visitorIDCard);
    }

    @Override
    public void removeIDCard(VisitorIDCard visitorIDCard) {
        visitorIDCardMap.values().remove(visitorIDCard);
    }

    @Override
    public void addIDCard(EmployeeIDCard employeeIDCard) {
        employeeIDCardMap.put(employeeIDCardMap.size() +1, employeeIDCard);
    }

    @Override
    public void removeIDCard(EmployeeIDCard employeeIDCard) {
        employeeIDCardMap.values().remove(employeeIDCard);
    }

    @Override
    public VisitorIDCard getVisitorIDCard(String id) {
        return null;
    }

    @Override
    public EmployeeIDCard getEmployeeIDCardFromID(String id) {
        return null;
    }

    public VisitorIDCard createVisitorIDCard() {
        VisitorIDCard visitorIDCard = new VisitorIDCard();
        visitorIDCardMap.put(visitorIDCardMap.size() + 1, visitorIDCard);
        return visitorIDCard;
    }

    public EmployeeIDCard createEmployeeIDCard() {
        EmployeeIDCard employeeIDCard = new EmployeeIDCard();
        employeeIDCardMap.put(employeeIDCardMap.size() + 1, employeeIDCard);
        return employeeIDCard;
    }

    public VisitorIDCard getLastVisitorIDCard() {
        return visitorIDCardMap.get(visitorIDCardMap.size());
    }

    public VisitorIDCard getFreeVisitorIDCard() {
        for (Map.Entry<Integer, VisitorIDCard> entry : visitorIDCardMap.entrySet()) {
            if(!entry.getValue().getPasswordChip().read().equals("")) {
                continue;
            }
            return entry.getValue();
        }
        return null;
    }
}
