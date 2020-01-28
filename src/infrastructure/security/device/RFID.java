package infrastructure.security.device;

import infrastructure.security.idcard.IDCard;

public class RFID implements IReaderTechnology {

    IDCard idCard;

    @Override
    public void setIDCard(IDCard idCard) {
        this.idCard = idCard;
    }

    @Override
    public IDCard getIDCard() {
        return this.idCard;
    }
}
