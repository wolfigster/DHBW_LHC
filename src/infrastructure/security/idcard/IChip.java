package infrastructure.security.idcard;

public interface IChip {
    void write(String string);
    String read();
}
