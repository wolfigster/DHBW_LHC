package hr.person;

import hr.person.idcard.IDCard;

public abstract class Person {
    protected int id;
    protected String name;
    protected int[][] iris = new int[10][10];
    protected IDCard idCard;

    protected int getId() {
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
