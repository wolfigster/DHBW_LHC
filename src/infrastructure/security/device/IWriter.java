package infrastructure.security.device;

import infrastructure.security.idcard.EmployeeIDCard;
import infrastructure.security.idcard.IDCard;
import infrastructure.security.idcard.Permission;

import java.util.ArrayList;
import java.util.Date;

public interface IWriter {

    void writePasswordOnIDCard(IDCard idCard, String password);
    void writeFingerprintOnEmployeeCard(EmployeeIDCard employeeIDCard, String fingerprint);
    void writeIrisStructureOnEmployeeCard(EmployeeIDCard idCard, int[][] iris);
    void writeValidFromOnIDCard(IDCard idCard, Date validFrom);
    void writeValidUntilOnIDCard(IDCard idCard, Date validUntil);
    void writePermissionListOnIDCard(IDCard idCard, ArrayList<Permission> permissionList);
}
