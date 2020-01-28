package infrastructure.security.device;

import human_resources.Person;
import infrastructure.security.idcard.EmployeeIDCard;
import infrastructure.security.idcard.IDCard;
import infrastructure.security.idcard.Permission;
import infrastructure.security.idcard.VisitorIDCard;

import java.util.ArrayList;
import java.util.Date;

public class Reader implements IReader {

    private String currentEmployeeIris;
    private IDCard currentIDCard;
    private IReaderTechnology iReaderTechnology;
    private Touchpad touchpad;
    private IrisScanner irisScanner;

    public Reader() {
        this.touchpad = new Touchpad();
        this.irisScanner = new IrisScanner();
    }

    @Override
    public void insertIDCard(VisitorIDCard visitorIDCard, IReaderTechnology iReaderTechnology) {
        this.currentIDCard = visitorIDCard;
        this.iReaderTechnology = iReaderTechnology;
    }

    @Override
    public void insertIDCard(EmployeeIDCard employeeIDCard, IReaderTechnology iReaderTechnology) {
        currentIDCard = employeeIDCard;
    }

    @Override
    public void removeIDCard() {

    }

    @Override
    public String readPasswordFromIDCard() {
        return currentIDCard.getPasswordChip().read();
    }

    @Override
    public String readFingerprintFromIDCard() {
        EmployeeIDCard employeeIDCard = (EmployeeIDCard) currentIDCard;
        return employeeIDCard.getFingerChip().read();
    }

    @Override
    public int[][] readIrisStructureFromIDCard() {
        EmployeeIDCard employeeIDCard = (EmployeeIDCard) currentIDCard;
        return employeeIDCard.getIrisStructure();
    }

    @Override
    public boolean readLockedStateFromIDCard() {
        return currentIDCard.isLocked();
    }

    @Override
    public ArrayList<Permission> readPermissionListFromIDCard() {
        return currentIDCard.getPermissionList();
    }

    @Override
    public Date readValidFromIDCard() {
        return currentIDCard.getValidFrom();
    }

    @Override
    public Date readValidUntilIDCard() {
        return currentIDCard.getValidUntil();
    }

    @Override
    public boolean readIsValidDate() {
        Date now = new Date();
        return (now.after(readValidFromIDCard()) && now.before(readValidUntilIDCard()));
    }

    public Touchpad getTouchpad() {
        return touchpad;
    }

    public IrisScanner getIrisScanner() {
        return irisScanner;
    }

    public boolean hasAccess(Person person) {
        return !person.getIdCard().getPermissionList().contains(Permission.Visitor);
    }
}
