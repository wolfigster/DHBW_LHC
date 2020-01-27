package human_resources;

public class ReceptionStaff extends Employee {

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
}
