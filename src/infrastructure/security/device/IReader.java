package infrastructure.security.device;

import infrastructure.security.idcard.IDCard;

public interface IReader {

    void insertIDCard(IDCard idCard);
    void removeIDCard();

}
