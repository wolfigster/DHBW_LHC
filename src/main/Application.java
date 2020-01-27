package main;

import human_resources.ReceptionStaff;
import human_resources.Researcher;
import human_resources.Visitor;
import infrastructure.security.Reception;
import infrastructure.security.SecurityCenter;
import infrastructure.security.idcard.IDCard;
import infrastructure.security.management.IDCardManagement;

public class Application {


    public static void main(String... args) {
        init();
        useCase1();
        useCase2();
    }

    public static void init() {
        System.out.println("Initialize the environment");
        for(int i = 0; i < 20; i++) {
            IDCardManagement.instance.createIDCard();
        }
        ReceptionStaff receptionStaff01 = new ReceptionStaff("ReceptionStaff01");
        Reception.instance.initialize(receptionStaff01);

        //SecurityOfficer securityOfficer01 = new SecurityOfficer("SecurityOfficer01");
        ReceptionStaff receptionStaff02 = new ReceptionStaff("ReceptionStaff02");
        SecurityCenter.instance.initialize(receptionStaff02);
    }

    public static void useCase1() {
        System.out.println("Starting useCase1: Creation of a visitor ID-Card");
        Visitor visitor01 = new Visitor("Visitor01");
        IDCard idCard = Reception.instance.getReceptionStaff().createIDCard(visitor01);
        Reception.instance.getReceptionStaff().assignIDCard(idCard, visitor01);
    }

    public static void useCase2() {
        System.out.println("Starting useCase2: Creation of an employee ID-Card");
        Researcher researcher01 = new Researcher("Researcher01");
        IDCard idCard = SecurityCenter.instance.getReceptionStaff().createIDCard(researcher01);
        SecurityCenter.instance.getReceptionStaff().assignIDCard(idCard, researcher01);
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
