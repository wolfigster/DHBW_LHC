package hr.person;

public class SecurityOfficer extends Employee {

    private boolean hasWeapon;

    public SecurityOfficer(int id, String name, int[][] iris, boolean isManager, boolean isMentor, boolean hasBudgetResponsibility, boolean hasWeapon) {
        this.id = id;
        this.name = name;
        this.iris = iris;
        this.isManager = isManager;
        this.isMentor = isMentor;
        this.hasBudgetResponsibility = hasBudgetResponsibility;
        this.hasWeapon = hasWeapon;
    }

    public boolean isHasWeapon() {
        return hasWeapon;
    }
}
