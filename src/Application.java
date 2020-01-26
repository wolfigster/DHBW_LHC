public class Application {

    public static void main(String... args) {
        init();
    }

    public static void init() {
        System.out.println("Initialize the environment");

    }

    public static void useCase1() {
        System.out.println("Starting useCase1: Creation of a visitor ID-Card");

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
