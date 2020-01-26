package human_resources;

import infrastructure.security.IDCard;

public abstract class Person {

    protected int id;
    protected String name;
    protected int[][] iris = new int[10][10];
    protected IDCard idCard;

    protected int getId() {
        return this.id;
    }

    protected String getName() {
        return this.name;
    }

    protected int[][] getIris() {
        return this.iris;
    }
}
