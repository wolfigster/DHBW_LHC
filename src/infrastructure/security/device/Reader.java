package infrastructure.security.device;

import human_resources.Person;
import infrastructure.security.idcard.IDCard;
import infrastructure.security.idcard.Permission;

public class Reader implements IReader {

    private String currentEmployeeIris;
    private IDCard currentIDCard;
    private Touchpad touchpad;
    private IrisScanner irisScanner;

    public Reader() {
        this.touchpad = new Touchpad();
        this.irisScanner = new IrisScanner();
    }

    @Override
    public void insertIDCard(IDCard idCard) {
        currentIDCard = idCard;
    }

    @Override
    public void removeIDCard() {

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
