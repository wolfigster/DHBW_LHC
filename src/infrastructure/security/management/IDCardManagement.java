package infrastructure.security.management;

import human_resources.*;
import infrastructure.security.Reception;
import infrastructure.security.crypto.AES;
import infrastructure.security.crypto.MD5Hash;
import infrastructure.security.idcard.EmployeeIDCard;
import infrastructure.security.idcard.IDCard;
import infrastructure.security.idcard.Permission;
import infrastructure.security.idcard.VisitorIDCard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public enum IDCardManagement implements IIDCardManagement {
    instance
    ;

    private Map<Integer, VisitorIDCard> visitorIDCardMap = new HashMap<>();
    private Map<Integer, EmployeeIDCard> employeeIDCardMap = new HashMap<>();

    @Override
    public void addIDCard(VisitorIDCard visitorIDCard) {
        visitorIDCardMap.put(visitorIDCardMap.size() +1, visitorIDCard);
    }

    @Override
    public void removeIDCard(VisitorIDCard visitorIDCard) {
        visitorIDCardMap.values().remove(visitorIDCard);
    }

    @Override
    public void addIDCard(EmployeeIDCard employeeIDCard) {
        employeeIDCardMap.put(employeeIDCardMap.size() +1, employeeIDCard);
    }

    @Override
    public void removeIDCard(EmployeeIDCard employeeIDCard) {
        employeeIDCardMap.values().remove(employeeIDCard);
    }

    @Override
    public VisitorIDCard getVisitorIDCard(String id) {
        return null;
    }

    @Override
    public EmployeeIDCard getEmployeeIDCardFromID(String id) {
        return null;
    }

    public VisitorIDCard createVisitorIDCard() {
        VisitorIDCard visitorIDCard = new VisitorIDCard();
        visitorIDCardMap.put(visitorIDCardMap.size() + 1, visitorIDCard);
        return visitorIDCard;
    }

    public EmployeeIDCard createEmployeeIDCard() {
        EmployeeIDCard employeeIDCard = new EmployeeIDCard();
        employeeIDCardMap.put(employeeIDCardMap.size() + 1, employeeIDCard);
        return employeeIDCard;
    }

    public VisitorIDCard getLastVisitorIDCard() {
        return visitorIDCardMap.get(visitorIDCardMap.size());
    }

    public VisitorIDCard getFreeVisitorIDCard() {
        for (Map.Entry<Integer, VisitorIDCard> entry : visitorIDCardMap.entrySet()) {
            if(!entry.getValue().getPasswordChip().read().equals("")) {
                continue;
            }
            return entry.getValue();
        }
        return null;
    }

    public boolean verifyPassword(IDCard idCard, String password) {
        return AES.decrypt(idCard.getPasswordChip().read()).equals(password);
    }

    public void lockIDCard(IDCard idCard) {
        idCard.setLocked(true);
    }

    public void unlockIDCard(IDCard idCard) {
        idCard.setLocked(false);
    }

    public void changePassword(IDCard idCard, String password) {
        idCard.getPasswordChip().write(AES.encrypt(password));
    }

    public VisitorIDCard createVisitorIDCard(Person person) {
        VisitorIDCard visitorIDCard = IDCardManagement.instance.getFreeVisitorIDCard();
        Reception.instance.getWriter().writePasswordOnIDCard(visitorIDCard, AES.encrypt(Reception.instance.getReader().getTouchpad().read()));
        return visitorIDCard;
    }

    public void assignIDCard(VisitorIDCard visitorIDCard, Person person) {
        person.setIdCard(visitorIDCard);
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
        employeeIDCard.setIrisStructure(employee.getIris());
        Reception.instance.getWriter().writePasswordOnIDCard(employeeIDCard, AES.encrypt("helloLHC2020"));
        Reception.instance.getWriter().writeFingerprintOnEmployeeCard(employeeIDCard, MD5Hash.getMd5(employee.getName()));
        return employeeIDCard;
    }

    public void assignEmployeeIDCard(EmployeeIDCard employeeIDCard, Employee employee) {
        employee.setIdCard(employeeIDCard);
    }
}
