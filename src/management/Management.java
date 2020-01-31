package management;

import hr.person.Employee;
import hr.person.idcard.IDCard;

import java.util.HashMap;

public enum Management {
    instance
    ;

    private HashMap<Integer, Employee> employeeMap = new HashMap<Integer, Employee>();
    private HashMap<Integer, IDCard> idCardHashMap = new HashMap<Integer, IDCard>();

    public void createEmployee(String name) {

    }

    public void assignIDCard(IDCard idCard, Employee employee) {

    }

    public void lockIDCard(IDCard idCard) {

    }

    public void clearIDCard(IDCard idCard) {

    }
}
