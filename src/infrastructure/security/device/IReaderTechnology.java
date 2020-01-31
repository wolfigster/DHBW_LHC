package infrastructure.security.device;

import infrastructure.security.idcard.IDCard;

public interface IReaderTechnology {

    void setIDCard(IDCard idCard);
    IDCard getIDCard();
}
