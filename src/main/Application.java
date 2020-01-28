package main;

import human_resources.*;
import infrastructure.security.Reception;
import infrastructure.security.SecurityCenter;
import infrastructure.security.device.Reader;
import infrastructure.security.idcard.EmployeeIDCard;
import infrastructure.security.idcard.IDCard;
import infrastructure.security.idcard.VisitorIDCard;
import infrastructure.security.management.IDCardManagement;

public class Application {

    public static void main(String... args) {
        init();
        for(String arg : args) {
            if (arg.equals("input")) {
                Helper.withInput = true;
                break;
            }
        }
        for(String arg : args) {
            if(arg.equals("1")) {
                useCase1();
            }
            if(arg.equals("2")) {
                useCase2();
            }
            if(arg.equals("3")) {
                useCase3();
            }
            if(arg.equals("4")) {
                useCase4();
            }
            if(arg.equals("5")) {
                useCase5();
            }
            if(arg.equals("6")) {
                useCase6();
            }
            if(arg.equals("7")) {
                useCase7();
            }
        }
    }

    public static void init() {
        System.out.println("Initialize the environment");
        for(int i = 0; i < 20; i++) {
            IDCardManagement.instance.createVisitorIDCard();
        }
        ReceptionStaff receptionStaff01 = new ReceptionStaff("ReceptionStaff01");
        Reception.instance.initialize(receptionStaff01);

        SecurityStaff securityStaff01 = new SecurityStaff("SecurityStaff01");
        SecurityCenter.instance.initialize(securityStaff01);
    }

    public static void useCase1() {
        System.out.println("Starting useCase1: Creation of a visitor ID-Card");
        Visitor visitor01 = new Visitor("Visitor01");
        VisitorIDCard visitorIDCard = Reception.instance.getReceptionStaff().createIDCard(visitor01);
        Reception.instance.getReceptionStaff().assignIDCard(visitorIDCard, visitor01);
    }

    public static void useCase2() {
        System.out.println("Starting useCase2: Creation of an employee ID-Card");
        Researcher researcher01 = new Researcher("Researcher01");
        EmployeeIDCard employeeIDCard = SecurityCenter.instance.getSecurityStaff().createEmployeeIDCard(researcher01);
        SecurityCenter.instance.getSecurityStaff().assignEmployeeIDCard(employeeIDCard, researcher01);
    }

    public static void useCase3() {
        System.out.println("Starting useCase3: Reader checks access for visitor");
        Visitor visitor01 = new Visitor("Visitor01");
        VisitorIDCard visitorIDCard = Reception.instance.getReceptionStaff().createIDCard(visitor01);
        Reception.instance.getReceptionStaff().assignIDCard(visitorIDCard, visitor01);
        //System.out.println(SecurityCenter.instance.getReader().hasAccess(visitor01)); // false

    }

    public static void useCase4() {
        System.out.println("Starting useCase4: Reader checks access for employee");
        // useCase2
        ScientificAssistant scientificAssistant01 = new ScientificAssistant("ScientificAssistant01");
        EmployeeIDCard employeeIDCard = SecurityCenter.instance.getSecurityStaff().createEmployeeIDCard(scientificAssistant01);
        SecurityCenter.instance.getSecurityStaff().assignEmployeeIDCard(employeeIDCard, scientificAssistant01);
        //System.out.println(SecurityCenter.instance.getReader().hasAccess(scientificAssistant01)); // true
    }

    public static void useCase5() {
        System.out.println("Starting useCase5: Researcher accesses the experiments in the detector");

    }

    public static void useCase6() {
        System.out.println("Starting useCase6: HRAssistant has readable access to the employee data");

    }

    public static void useCase7() {
        System.out.println("Starting useCase7: Security Center locks ID-Card");
        // useCase2
        ScientificAssistant scientificAssistant01 = new ScientificAssistant("ScientificAssistant01");
        EmployeeIDCard employeeIDCard = SecurityCenter.instance.getSecurityStaff().createEmployeeIDCard(scientificAssistant01);
        SecurityCenter.instance.getSecurityStaff().assignEmployeeIDCard(employeeIDCard, scientificAssistant01);

        SecurityCenter.instance.getSecurityStaff().lockIDCard(scientificAssistant01.getIdCard());
    }
}
