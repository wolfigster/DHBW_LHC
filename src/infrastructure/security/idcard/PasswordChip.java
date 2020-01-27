package infrastructure.security.idcard;

public class PasswordChip implements IChip {

    private String password = "";

    public PasswordChip() {

    }

    @Override
    public void write(String string) {
        this.password = string;
    }

    @Override
    public String read() {
        return this.password;
    }
}
