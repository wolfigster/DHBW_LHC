package human_resources;

import infrastructure.security.Reception;
import infrastructure.security.crypto.AES;
import infrastructure.security.crypto.MD5Hash;
import infrastructure.security.idcard.EmployeeIDCard;
import infrastructure.security.idcard.IDCard;
import infrastructure.security.idcard.Permission;
import infrastructure.security.management.IDCardManagement;

import java.util.ArrayList;

public class SecurityStaff extends Employee {

    public SecurityStaff(int id, String name, int[][] iris, boolean isManager, boolean isMentor, boolean hasBudgetResponsibility, EmployeeIDCard employeeIDCard) {
        super(id, name, iris, isManager, isMentor, hasBudgetResponsibility, employeeIDCard);
    }

    public SecurityStaff(int id, String name, int[][] iris, boolean isManager, boolean isMentor, boolean hasBudgetResponsibility) {
        super(id, name, iris, isManager, isMentor, hasBudgetResponsibility);
    }

    public SecurityStaff(int id, String name, int[][] iris) {
        super(id, name, iris);
    }

    public SecurityStaff(String name) {
        super(name);
    }

    public SecurityStaff() {
        super();
    }

    public EmployeeIDCard createEmployeeIDCard(Employee employee) {
        return IDCardManagement.instance.createEmployeeIDCard(employee);
    }

    public void assignEmployeeIDCard(EmployeeIDCard employeeIDCard, Employee employee) {
        IDCardManagement.instance.assignEmployeeIDCard(employeeIDCard, employee);
    }

    public void lockIDCard(IDCard idCard) {
        idCard.setLocked(true);
    }

    public void unlockIDCard(IDCard idCard) {
        idCard.setLocked(false);
    }
}