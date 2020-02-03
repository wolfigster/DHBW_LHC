package human_resources;

import infrastructure.security.management.EmployeeManagement;
import infrastructure.security.management.IROEmployeeManagement;

public enum HRDepartment {
    instance
    ;

    private IROEmployeeManagement iroEmployeeManagement;

    HRDepartment() {
        this.iroEmployeeManagement = EmployeeManagement.instance;
    }

    public IROEmployeeManagement getIroEmployeeManagement() {
        return iroEmployeeManagement;
    }

    public void setIroEmployeeManagement(IROEmployeeManagement iroEmployeeManagement) {
        this.iroEmployeeManagement = iroEmployeeManagement;
    }
}
