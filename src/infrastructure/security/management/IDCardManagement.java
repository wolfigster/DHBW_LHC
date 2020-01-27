package infrastructure.security.management;

import infrastructure.security.idcard.EmployeeIDCard;
import infrastructure.security.idcard.IDCard;
import infrastructure.security.idcard.VisitorIDCard;

import java.util.HashMap;
import java.util.Map;

public enum IDCardManagement {
    instance
    ;

    private Map<Integer, IDCard> idCardMap = new HashMap<>();
    private Map<Integer, EmployeeIDCard> employeeIDCardMap = new HashMap<>();

    public void addIDCard(IDCard idCard) {
        idCardMap.put(idCardMap.size() +1, idCard);
    }

    public void removeIDCard(IDCard idCard) {
        idCardMap.values().remove(idCard);
    }

    public void addEmployeeIDCard(EmployeeIDCard employeeIDCard) {
        employeeIDCardMap.put(employeeIDCardMap.size() +1, employeeIDCard);
    }

    public void removeEmployeeIDCard(EmployeeIDCard employeeIDCard) {
        employeeIDCardMap.values().remove(employeeIDCard);
    }

    public void createIDCard() {
        idCardMap.put(idCardMap.size() + 1, new VisitorIDCard());
    }

    public EmployeeIDCard createEmployeeIDCard() {
        EmployeeIDCard employeeIDCard = new EmployeeIDCard();
        employeeIDCardMap.put(employeeIDCardMap.size() + 1, employeeIDCard);
        return employeeIDCard;
    }

    public IDCard getLastIDCard() {
        return idCardMap.get(idCardMap.size());
    }

    public IDCard getFreeIDCard() {
        for (Map.Entry<Integer, IDCard> entry : idCardMap.entrySet()) {
            if(!entry.getValue().getPasswordChip().read().equals("")) {
                continue;
            }
            return entry.getValue();
        }
        return null;
    }
}
