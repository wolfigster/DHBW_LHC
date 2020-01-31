package hr;

import hr.person.Employee;
import hr.person.Person;
import hr.person.idcard.Chip;
import hr.person.idcard.IDCard;
import management.IDCardManagement;
import management.RandomString;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public enum SecurityCenter implements IReception {
    instance
    ;

    private Map<Integer, Employee> employeeMap = new HashMap<>();

    @Override
    public void createIDCard(Person person, Date validFrom, Date validUntil, Permission... permissions) {
        IDCardManagement.instance.addIDCard(new IDCard(RandomString.getAlphaNumericString(6), validFrom,
                validUntil, person.getIris(),
                false, new Chip(RandomString.getAlphaNumericString(8)),
                permissions));
    }

    public void addEmployee(Employee employee) {
        employeeMap.put(employeeMap.size() +1, employee);
    }

    public void removeEmployee(Employee employee) {
        employeeMap.values().remove(employee);
    }

    public Map<Integer, Employee> getEmployeeMap() {
        return this.employeeMap;
    }
}
