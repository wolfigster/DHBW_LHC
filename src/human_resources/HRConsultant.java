package human_resources;

import infrastructure.security.idcard.EmployeeIDCard;

public class HRConsultant extends Employee {

    public HRConsultant(int id, String name, int[][] iris, boolean isManager, boolean isMentor, boolean hasBudgetResponsibility, EmployeeIDCard employeeIDCard) {
        super(id, name, iris, isManager, isMentor, hasBudgetResponsibility, employeeIDCard);
    }

    public HRConsultant(int id, String name, int[][] iris, boolean isManager, boolean isMentor, boolean hasBudgetResponsibility) {
        super(id, name, iris, isManager, isMentor, hasBudgetResponsibility);
    }

    public HRConsultant(int id, String name, int[][] iris) {
        super(id, name, iris);
    }

    public HRConsultant(String name) {
        super(name);
    }

    public HRConsultant() {
        super();
    }
}
