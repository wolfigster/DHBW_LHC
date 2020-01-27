package infrastructure.security.idcard;

public class FingerChip implements IChip {

    private String fingerprint = "";

    public FingerChip() {

    }

    @Override
    public void write(String string) {
        this.fingerprint = string;
    }

    @Override
    public String read() {
        return this.fingerprint;
    }
}
