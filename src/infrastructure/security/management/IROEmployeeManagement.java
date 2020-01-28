package infrastructure.security.management;

import human_resources.Employee;

public interface IROEmployeeManagement {

    Employee getEmployeeFromName(String name);
    Employee getEmployeeFromID(int id);
    Employee getEmployeeFromIrisStructure(int[][] irisStructure);
}
