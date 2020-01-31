package hr.person;

public class Visitor extends Person {

    public Visitor(int id, String name, int[][] iris) {
        this.id = id;
        this.name = name;
        this.iris = iris;
    }
}
