package infrastructure.lhc;

public class Proton {

    private int[][][] structure; // = new int[100][100][100];
    private double weight;

    public Proton(int[][][] structure, double weight) {
        this.structure = structure;
        this.weight = weight;
    }

    public int[][][] getStructure() {
        return this.structure;
    }

    public double getWeight() {
        return this.weight;
    }
}
