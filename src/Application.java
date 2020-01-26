import hr.Reception;
import hr.SecurityCenter;
import hr.person.Researcher;
import hr.person.ScientificAssistant;
import hr.person.SecurityOfficer;
import hr.person.Visitor;

import java.util.Date;
import java.util.Random;

public class Application {

    public static void main(String... args) {
        SecurityCenter.instance.addEmployee(new Researcher(1, "Researcher01", createIris(), true, true, true, true));
        SecurityCenter.instance.addEmployee(new SecurityOfficer(2, "SecurityOfficer01", createIris(), false, false, false, true));
        SecurityCenter.instance.addEmployee(new Researcher(3, "Researcher02", createIris(), true, false, true, false));
        SecurityCenter.instance.addEmployee(new Researcher(4, "Researcher03", createIris(), false, false, false, true));
        Reception.instance.addVisitor(new Visitor(5, "Besucher01", createIris()));
        SecurityCenter.instance.addEmployee(new ScientificAssistant(6, "ScientificAssistant01", createIris(), true, true, false, new Date(), new Date()));
        SecurityCenter.instance.addEmployee(new Researcher(7, "Researcher04", createIris(), false, true, false, false));
        SecurityCenter.instance.addEmployee(new Researcher(8, "Researcher05", createIris(), false, false, false, true));
        Reception.instance.addVisitor(new Visitor(9, "Besucher02", createIris()));
        Reception.instance.addVisitor(new Visitor(10, "Besucher03", createIris()));
        SecurityCenter.instance.addEmployee(new ScientificAssistant(11, "ScientificAssistant02", createIris(), false, true, true, new Date(), new Date()));
        SecurityCenter.instance.addEmployee(new ScientificAssistant(12, "ScientificAssistant03", createIris(), false, false, false, new Date(), new Date()));
        SecurityCenter.instance.addEmployee(new ScientificAssistant(13, "ScientificAssistant04", createIris(), true, false, false, new Date(), new Date()));
        SecurityCenter.instance.addEmployee(new ScientificAssistant(14, "ScientificAssistant05", createIris(), false, true, false, new Date(), new Date()));
        Reception.instance.addVisitor(new Visitor(15, "Besucher04", createIris()));

        Reception.instance.getVisitorMap().forEach((id,visitor)->{
            Reception.instance.createIDCard(visitor, new Date(), new Date());
            System.out.println(visitor.getName());
            System.out.println(visitor.getIdCard().getId());
            int[][] idCardVisitorIris = visitor.getIdCard().getIrisStructure();
            int[][] visitorIris = visitor.getIris();
            for(int i = 0; i < 10; i++) {
                String line = "";
                for(int j = 0; j < 10; j++) {
                    line = line + visitorIris[i][j] + "-" + idCardVisitorIris[i][j] + "|";
                }
                System.out.println(line);
            }
        });
        SecurityCenter.instance.getEmployeeMap().forEach((id,employee)->{
            Reception.instance.createIDCard(employee, new Date(), new Date());
            System.out.println(employee.getName());
            System.out.println(employee.getIdCard().getId());
            int[][] idCardEmployeeIris = employee.getIdCard().getIrisStructure();
            int[][] employeeIris = employee.getIris();
            for(int i = 0; i < 10; i++) {
                String line = "";
                for(int j = 0; j < 10; j++) {
                    line = line + employeeIris[i][j] + "-" + idCardEmployeeIris[i][j] + "|";
                }
                System.out.println(line);
            }
        });
    }

    private static int[][] createIris() {
        Random random = new Random();
        int[][] iris = new int[10][10];
        for(int i = 0; i < 10; i++) {
            for(int j = 0; j < 10; j++) {
                iris[i][j] = random.nextInt(10);
            }
        }
        return iris;
    }

    private static void initialize() {
        // Create a hand full of blank ID-Cards
        // Create a Visitor and register him to a blank ID-Card
        //
    }
}
