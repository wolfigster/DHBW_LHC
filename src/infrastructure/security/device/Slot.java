package infrastructure.security.device;

import infrastructure.security.idcard.IDCard;

public class Slot implements IReaderTechnology {

    private IDCard idCard;

    @Override
    public void setIDCard(IDCard idCard) {
        this.idCard = idCard;
    }

    @Override
    public IDCard getIDCard() {
        return this.idCard;
    }
}
