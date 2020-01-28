package infrastructure.security.management;

import human_resources.Employee;

public interface IEmployeeManagement extends IROEmployeeManagement {

    void addEmployee(Employee employee);
    void removeEmployee(Employee employee);
}
