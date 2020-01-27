package infrastructure.security.idcard;

public class EmployeeIDCard extends IDCard {

    private FingerChip fingerChip;

    public EmployeeIDCard() {
        super();
        this.fingerChip = new FingerChip();
    }

    public FingerChip getFingerChip() {
        return fingerChip;
    }

    public void setFingerChip(FingerChip fingerChip) {
        this.fingerChip = fingerChip;
    }
}
