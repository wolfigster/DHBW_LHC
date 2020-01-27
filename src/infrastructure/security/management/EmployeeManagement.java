package infrastructure.security.management;

import human_resources.Employee;

import java.util.HashMap;
import java.util.Map;

public enum EmployeeManagement {
    instance
    ;
    private Map<Integer, Employee> employeeMap = new HashMap<Integer, Employee>();

    public void addEmployee(Employee employee) {
        employeeMap.put(employeeMap.size() +1, employee);
    }

    public void removeEmployee(Employee employee) {
        employeeMap.values().remove(employee);
    }

    public Employee getEmployeeFromName(String name) {
        for (Map.Entry<Integer, Employee> entry : employeeMap.entrySet()) {
            if(!entry.getValue().getName().equalsIgnoreCase(name)) {
                continue;
            }
            return entry.getValue();
        }
        return null;
    }
}
