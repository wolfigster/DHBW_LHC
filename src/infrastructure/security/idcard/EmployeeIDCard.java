package infrastructure.security.idcard;

public class EmployeeIDCard extends IDCard {

    private int[][] irisStructure; // = new int[10][10];
    private FingerChip fingerChip;

    public EmployeeIDCard() {
        super();
        this.irisStructure = new int[10][10];
        this.fingerChip = new FingerChip();
    }

    public int[][] getIrisStructure() {
        return this.irisStructure;
    }

    public void setIrisStructure(int[][] irisStructure) {
        this.irisStructure = irisStructure;
    }

    public FingerChip getFingerChip() {
        return fingerChip;
    }

    public void setFingerChip(FingerChip fingerChip) {
        this.fingerChip = fingerChip;
    }
}
