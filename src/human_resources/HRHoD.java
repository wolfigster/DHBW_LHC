package human_resources;

import infrastructure.security.idcard.EmployeeIDCard;

public class HRHoD extends Employee {

    public HRHoD(int id, String name, int[][] iris, boolean isManager, boolean isMentor, boolean hasBudgetResponsibility, EmployeeIDCard employeeIDCard) {
        super(id, name, iris, isManager, isMentor, hasBudgetResponsibility, employeeIDCard);
    }

    public HRHoD(int id, String name, int[][] iris, boolean isManager, boolean isMentor, boolean hasBudgetResponsibility) {
        super(id, name, iris, isManager, isMentor, hasBudgetResponsibility);
    }

    public HRHoD(int id, String name, int[][] iris) {
        super(id, name, iris);
    }

    public HRHoD(String name) {
        super(name);
    }

    public HRHoD() {
        super();
    }
}
