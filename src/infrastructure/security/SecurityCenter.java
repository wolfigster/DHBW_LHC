package infrastructure.security;

import human_resources.Employee;
import human_resources.SecurityOfficer;

public enum SecurityCenter {
    instance
    ;

    private SecurityOfficer securityOfficer;

    public void createEmployee(String name) {

    }

    public void assignIDCard(IDCard idCard, Employee employee) {

    }

    public void lockIDCard(IDCard idCard) {
        idCard.setLocked(true);
    }

    public void unlockIDCard(IDCard idCard) {
        idCard.setLocked(false);
    }

    public void clearIDCard(IDCard idCard) {
    }
}
