package human_resources;

import infrastructure.security.idcard.EmployeeIDCard;

public class HRAssistant extends Employee {

    public HRAssistant(int id, String name, int[][] iris, boolean isManager, boolean isMentor, boolean hasBudgetResponsibility, EmployeeIDCard employeeIDCard) {
        super(id, name, iris, isManager, isMentor, hasBudgetResponsibility, employeeIDCard);
    }

    public HRAssistant(int id, String name, int[][] iris, boolean isManager, boolean isMentor, boolean hasBudgetResponsibility) {
        super(id, name, iris, isManager, isMentor, hasBudgetResponsibility);
    }

    public HRAssistant(int id, String name, int[][] iris) {
        super(id, name, iris);
    }

    public HRAssistant(String name) {
        super(name);
    }

    public HRAssistant() {
        super();
    }
}
