package infrastructure.security.idcard;

public class EmployeeIDCard extends IDCard {

    private PasswordChip passwordChip;
    private FingerChip fingerChip;

    public EmployeeIDCard() {
        super();
        this.passwordChip = new PasswordChip();
        this.fingerChip = new FingerChip();
    }

    public PasswordChip getPasswordChip() {
        return passwordChip;
    }

    public void setPasswordChip(PasswordChip passwordChip) {
        this.passwordChip = passwordChip;
    }

    public FingerChip getFingerChip() {
        return fingerChip;
    }

    public void setFingerChip(FingerChip fingerChip) {
        this.fingerChip = fingerChip;
    }
}
