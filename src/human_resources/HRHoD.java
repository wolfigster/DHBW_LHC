package human_resources;

public class HRHoD extends Employee {

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
