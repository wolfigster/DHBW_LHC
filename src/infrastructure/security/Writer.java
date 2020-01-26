package infrastructure.security;

public class Writer implements IWriter {

    private IDCard currentIDCard;

    public Writer() {

    }

    public void insertPassword(String password) {
        currentIDCard.getChip().setPassword(password);
    }

    public void insertIDCard(IDCard idCard) {
        currentIDCard = idCard;
    }

    public void removeIDCard() {
        currentIDCard = null;
    }
}
