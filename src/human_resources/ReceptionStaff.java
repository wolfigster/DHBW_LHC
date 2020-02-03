package human_resources;

import infrastructure.security.Reception;
import infrastructure.security.crypto.AES;
import infrastructure.security.idcard.EmployeeIDCard;
import infrastructure.security.idcard.IDCard;
import infrastructure.security.idcard.VisitorIDCard;
import infrastructure.security.management.IDCardManagement;

public class ReceptionStaff extends Employee {

    public ReceptionStaff(int id, String name, int[][] iris, boolean isManager, boolean isMentor, boolean hasBudgetResponsibility, EmployeeIDCard employeeIDCard) {
        super(id, name, iris, isManager, isMentor, hasBudgetResponsibility, employeeIDCard);
    }

    public ReceptionStaff(int id, String name, int[][] iris, boolean isManager, boolean isMentor, boolean hasBudgetResponsibility) {
        super(id, name, iris, isManager, isMentor, hasBudgetResponsibility);
    }

    public ReceptionStaff(int id, String name, int[][] iris) {
        super(id, name, iris);
    }

    public ReceptionStaff(String name) {
        super(name);
    }

    public ReceptionStaff() {
        super();
    }

    public VisitorIDCard createIDCard(Person person) {
        return IDCardManagement.instance.createVisitorIDCard(person);
    }

    public void assignIDCard(VisitorIDCard visitorIDCard, Person person) {
        IDCardManagement.instance.assignIDCard(visitorIDCard, person);
    }
}
