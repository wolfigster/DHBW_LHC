package human_resources;

import infrastructure.security.idcard.IDCard;
import main.Helper;

public abstract class Person {

    protected int id;
    protected String name;
    protected int[][] iris = new int[10][10];
    protected IDCard idCard;

    public Person(int id, String name, int[][] iris) {
        this.id = id;
        this.name = name;
        this.iris = iris;
    }

    public Person(String name) {
        this.id = Integer.parseInt(Helper.getNumericString(6));
        this.name = name;
        this.iris = Helper.createTwoDimensionalIntegerArray(10, 10);
    }

    public Person() {
        this.id = Integer.parseInt(Helper.getNumericString(6));
        this.name = Helper.getCharString(15);
        this.iris = Helper.createTwoDimensionalIntegerArray(10, 10);
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int[][] getIris() {
        return this.iris;
    }

    public IDCard getIdCard() {
        return this.idCard;
    }

    public void setIdCard(IDCard idCard) {
        this.idCard = idCard;
    }

}
