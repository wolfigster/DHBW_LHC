package main;

import human_resources.ReceptionStaff;
import human_resources.Visitor;
import infrastructure.security.EmployeeManagement;
import infrastructure.security.Reception;
import infrastructure.security.Touchpad;
import infrastructure.security.Writer;

public class Application {

    public static void main(String... args) {
        init();
        useCase1();
    }

    public static void init() {
        System.out.println("Initialize the environment");
        EmployeeManagement.instance.addEmployee(new ReceptionStaff(0, "ReceptionStaff01", Helper.createTwoDimensionalIntegerArray(10, 10), true, false, false));
        Reception.instance.initialize((ReceptionStaff) EmployeeManagement.instance.getEmployeeFromName("ReceptionStaff01"), new Touchpad(), new Writer());
    }

    public static void useCase1() {
        System.out.println("Starting useCase1: Creation of a visitor ID-Card");
        Visitor visitor01 = new Visitor(1, "Visitor01", Helper.createTwoDimensionalIntegerArray(10, 10));
        Reception.instance.getReceptionStaff().createIDCard();
        Reception.instance.getReceptionStaff().assignLastIDCard(visitor01);

    }

    public static void useCase2() {
        System.out.println("Starting useCase2: Creation of an employee ID-Card");

    }

    public static void useCase3() {
        System.out.println("Starting useCase3: Reader checks access for visitor");

    }

    public static void useCase4() {
        System.out.println("Starting useCase4: Reader checks access for employee");

    }

    public static void useCase5() {
        System.out.println("Starting useCase5: Researcher accesses the experiments in the detector");

    }

    public static void useCase6() {
        System.out.println("Starting useCase6: HRA has readable access to the employee data");

    }

    public static void useCase7() {
        System.out.println("Starting useCase7: Security Center locks ID-Card");

    }
}
