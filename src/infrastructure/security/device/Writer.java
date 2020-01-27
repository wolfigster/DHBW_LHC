package infrastructure.security.device;

import infrastructure.security.idcard.EmployeeIDCard;
import infrastructure.security.idcard.IDCard;

public class Writer implements IWriter{

    @Override
    public void writeOnIDCardPWChip(IDCard idCard, String password) {
        idCard.getPasswordChip().write(password);
    }

    @Override
    public void writeOnIDCardFNChip(EmployeeIDCard employeeIDCard, String fingerprint) {
        employeeIDCard.getFingerChip().write(fingerprint);
    }
}
