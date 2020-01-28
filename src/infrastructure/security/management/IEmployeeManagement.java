package infrastructure.security.management;

import human_resources.Employee;

public interface IEmployeeManagement extends IROEmployeeManagement {

    Employee getEmployeeFromName(String name);
    Employee getEmployeeFromID(int id);
    Employee getEmployeeFromIrisStructure(int[][] irisStructure);

    void addEmployee(Employee employee);
    void removeEmployee(Employee employee);
}
