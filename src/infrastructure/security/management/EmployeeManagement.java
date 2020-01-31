package infrastructure.security.management;

import human_resources.Employee;

import java.util.HashMap;
import java.util.Map;

public enum EmployeeManagement implements IEmployeeManagement {
    instance
    ;
    private Map<Integer, Employee> employeeMap = new HashMap<Integer, Employee>();

    @Override
    public void addEmployee(Employee employee) {
        employeeMap.put(employeeMap.size() +1, employee);
    }

    @Override
    public void removeEmployee(Employee employee) {
        employeeMap.values().remove(employee);
    }

    @Override
    public Employee getEmployeeFromName(String name) {
        for (Map.Entry<Integer, Employee> entry : employeeMap.entrySet()) {
            if(!entry.getValue().getName().equalsIgnoreCase(name)) {
                continue;
            }
            return entry.getValue();
        }
        return null;
    }

    @Override
    public Employee getEmployeeFromID(int id) {
        return employeeMap.get(id);
    }

    @Override
    public Employee getEmployeeFromIrisStructure(int[][] irisStructure) {
        for (Map.Entry<Integer, Employee> entry : employeeMap.entrySet()) {
            if(entry.getValue().getIris() == irisStructure) {
                continue;
            }
            return entry.getValue();
        }
        return null;
    }
}
