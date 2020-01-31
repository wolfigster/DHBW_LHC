package human_resources;

import infrastructure.security.management.IROEmployeeManagement;

public class HRDepartment {

    private IROEmployeeManagement iroEmployeeManagement;

    public HRDepartment(IROEmployeeManagement iroEmployeeManagement) {
        this.iroEmployeeManagement = iroEmployeeManagement;
    }

    public IROEmployeeManagement getIroEmployeeManagement() {
        return iroEmployeeManagement;
    }

    public void setIroEmployeeManagement(IROEmployeeManagement iroEmployeeManagement) {
        this.iroEmployeeManagement = iroEmployeeManagement;
    }
}
