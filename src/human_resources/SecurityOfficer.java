package human_resources;

import infrastructure.security.idcard.EmployeeIDCard;

public class SecurityOfficer extends Employee {

    private boolean hasWeapon;

    public SecurityOfficer(int id, String name, int[][] iris, boolean isManager, boolean isMentor, boolean hasBudgetResponsibility, boolean hasWeapon, EmployeeIDCard employeeIDCard) {
        super(id, name, iris, isManager, isMentor, hasBudgetResponsibility, employeeIDCard);
        this.hasWeapon = hasWeapon;
    }

    public SecurityOfficer(int id, String name, int[][] iris, boolean isManager, boolean isMentor, boolean hasBudgetResponsibility, boolean hasWeapon) {
        super(id, name, iris, isManager, isMentor, hasBudgetResponsibility);
        this.hasWeapon = hasWeapon;
    }

    public SecurityOfficer(int id, String name, int[][] iris) {
        super(id, name, iris);
        this.hasWeapon = false;
    }

    public SecurityOfficer(String name) {
        super(name);
        this.hasWeapon = false;
    }

    public SecurityOfficer() {
        super();
        this.hasWeapon = false;
    }

    public boolean hasWeapon() {
        return this.hasWeapon;
    }

    public void setWeapon(boolean hasWeapon) {
        this.hasWeapon = hasWeapon;
    }
}
