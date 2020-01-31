package infrastructure.security.device;

import infrastructure.security.idcard.EmployeeIDCard;
import infrastructure.security.idcard.IDCard;
import infrastructure.security.idcard.Permission;

import java.util.ArrayList;
import java.util.Date;

public class Writer implements IWriter{

    @Override
    public void writePasswordOnIDCard(IDCard idCard, String password) {
        idCard.getPasswordChip().write(password);
    }

    @Override
    public void writeFingerprintOnEmployeeCard(EmployeeIDCard employeeIDCard, String fingerprint) {
        employeeIDCard.getFingerChip().write(fingerprint);
    }

    @Override
    public void writeIrisStructureOnEmployeeCard(EmployeeIDCard employeeIDCard, int[][] iris) {
        employeeIDCard.setIrisStructure(iris);
    }

    @Override
    public void writeValidFromOnIDCard(IDCard idCard, Date validFrom) {
        idCard.setValidFrom(validFrom);
    }

    @Override
    public void writeValidUntilOnIDCard(IDCard idCard, Date validUntil) {
        idCard.setValidUntil(validUntil);
    }

    @Override
    public void writePermissionListOnIDCard(IDCard idCard, ArrayList<Permission> permissionList) {
        idCard.setPermissionList(permissionList);
    }
}
