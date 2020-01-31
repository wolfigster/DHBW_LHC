package infrastructure.security.device;

import infrastructure.security.idcard.EmployeeIDCard;
import infrastructure.security.idcard.Permission;
import infrastructure.security.idcard.VisitorIDCard;

import java.util.ArrayList;
import java.util.Date;

public interface IReader {

    void insertIDCard(VisitorIDCard visitorIDCard, IReaderTechnology iReaderTechnology);
    void insertIDCard(EmployeeIDCard employeeIDCard, IReaderTechnology iReaderTechnology);
    void removeIDCard();

    String readPasswordFromIDCard();
    String readFingerprintFromIDCard();
    int[][] readIrisStructureFromIDCard();
    boolean readLockedStateFromIDCard();
    ArrayList<Permission> readPermissionListFromIDCard();
    Date readValidFromIDCard();
    Date readValidUntilIDCard();

    boolean readIsValidDate();

}
