package infrastructure.security;

import human_resources.Employee;

public class Reader implements IReader {

    private String currentEmployeeIris;
    private IDCard currentIDCard;

    public Reader() {

    }

    public String scanPassport(Passport passport) {

        return currentEmployeeIris;
    }

    public String scanIris(Employee employee) {

        return currentEmployeeIris;
    }

    public void insertIDCard(IDCard idCard) {
        currentIDCard = idCard;
    }

    public void removeIDCard() {
        currentIDCard = null;
    }

    public String getCurrentEmployeeIris() {
        return this.currentEmployeeIris;
    }
}
