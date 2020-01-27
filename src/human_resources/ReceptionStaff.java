package human_resources;

import infrastructure.security.Reception;
import infrastructure.security.crypto.AES;
import infrastructure.security.idcard.EmployeeIDCard;
import infrastructure.security.idcard.IDCard;
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

    public IDCard createIDCard(Person person) {
        IDCard idCard = IDCardManagement.instance.getFreeIDCard();
        idCard.setIrisStructure(person.iris);
        idCard.getPasswordChip().write(AES.encrypt(Reception.instance.getReader().getTouchpad().read()));
        return idCard;
    }

    public void assignIDCard(IDCard idCard, Person person) {
        person.setIdCard(idCard);
    }
}
