package human_resources;

import infrastructure.security.Reception;
import infrastructure.security.crypto.AES;
import infrastructure.security.crypto.MD5Hash;
import infrastructure.security.idcard.EmployeeIDCard;
import infrastructure.security.idcard.IDCard;
import infrastructure.security.idcard.Permission;
import infrastructure.security.management.EmployeeManagement;
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
        EmployeeIDCard employeeIDCard = IDCardManagement.instance.createEmployeeIDCard();
        ArrayList<Permission> permissionList = new ArrayList<>();
        if(Researcher.class.equals(employee.getClass())) {
            permissionList.add(Permission.ControlCenter);
            permissionList.add(Permission.Researcher);
            employeeIDCard.setPermissionList(permissionList);
        } else if(ScientificAssistant.class.equals(employee.getClass())) {
            permissionList.add(Permission.Researcher);
            employeeIDCard.setPermissionList(permissionList);
        } else if(SecurityOfficer.class.equals(employee.getClass())) {
            permissionList.add(Permission.Security);
            employeeIDCard.setPermissionList(permissionList);
        } else if(SecurityStaff.class.equals(employee.getClass())) {
            permissionList.add(Permission.Security);
            permissionList.add(Permission.HR);
            employeeIDCard.setPermissionList(permissionList);
        } else if(ReceptionStaff.class.equals(employee.getClass())) {
            permissionList.add(Permission.HR);
            employeeIDCard.setPermissionList(permissionList);
        }
        employeeIDCard.setIrisStructure(employee.iris);
        Reception.instance.getWriter().writeOnIDCardPWChip(employeeIDCard, AES.encrypt(Reception.instance.getReader().getTouchpad().read()));
        Reception.instance.getWriter().writeOnIDCardFNChip(employeeIDCard, MD5Hash.getMd5(employee.getName()));
        return employeeIDCard;
    }

    public void assignEmployeeIDCard(EmployeeIDCard employeeIDCard, Employee employee) {
        employee.setIdCard(employeeIDCard);
    }

    public void lockIDCard(IDCard idCard) {
        idCard.setLocked(true);
    }

    public void unlockIDCard(IDCard idCard) {
        idCard.setLocked(false);
    }
}