package human_resources;

public class Visitor extends Person {

    public Visitor(int id, String name, int[][] iris) {
        super(id, name, iris);
        this.id = id;
        this.name = name;
        this.iris = iris;
    }

    public Visitor(String name) {
        super(name);
    }

    public Visitor() {
        super();
    }
}
