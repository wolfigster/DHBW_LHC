package human_resources;

import infrastructure.security.IDCard;
import infrastructure.security.IDCardManagement;
import infrastructure.security.VisitorIDCard;
import main.Helper;

public class ReceptionStaff extends Employee {

    public ReceptionStaff(int id, String name, int[][] iris, boolean isManager, boolean isMentor, boolean hasBudgetResponsibility) {
        this.id = id;
        this.name = name;
        this.iris = iris;
        this.isManager = isManager;
        this.isMentor = isMentor;
        this.hasBudgetResponsibility = hasBudgetResponsibility;
    }

    public void createIDCard() {
        IDCardManagement.instance.addIDCard(new VisitorIDCard());
    }

    public void assignIDCard(IDCard idCard, Visitor visitor) {
        visitor.setIdCard(idCard);
    }

    public void assignLastIDCard(Visitor visitor) {
        visitor.setIdCard(IDCardManagement.instance.getLastIDCard());
    }
}
