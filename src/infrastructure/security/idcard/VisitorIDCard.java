package infrastructure.security.idcard;

public class VisitorIDCard extends IDCard {

    private PasswordChip passwordChip;

    public VisitorIDCard() {
        super();
        this.passwordChip = new PasswordChip();
    }

    public PasswordChip getPasswordChip() {
        return passwordChip;
    }

    public void setPasswordChip(PasswordChip passwordChip) {
        this.passwordChip = passwordChip;
    }
}
