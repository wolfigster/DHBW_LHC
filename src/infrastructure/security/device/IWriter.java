package infrastructure.security.device;

import infrastructure.security.idcard.EmployeeIDCard;
import infrastructure.security.idcard.IDCard;

public interface IWriter {

    void writeOnIDCardPWChip(IDCard idCard, String password);
    void writeOnIDCardFNChip(EmployeeIDCard employeeIDCard, String fingerprint);
}
