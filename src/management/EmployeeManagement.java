package management;

import hr.person.Employee;
import hr.person.idcard.IDCard;

import java.util.HashMap;
import java.util.Map;

public enum EmployeeManagement {
    instance
    ;

    private Map<Integer, Employee> employeeMap = new HashMap<>();

    void createEmployee(String name) {

    }

    void assignIDCard(IDCard idCard, Employee employee) {

    }
}
