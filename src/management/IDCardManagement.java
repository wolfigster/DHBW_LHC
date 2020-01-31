package management;

import hr.IReception;
import hr.Permission;
import hr.person.Person;
import hr.person.idcard.IDCard;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public enum IDCardManagement implements IReception {
    instance
    ;

    private Map<Integer, IDCard> idCardMap = new HashMap<>();

    public void lockIDCard(IDCard idCard) {

    }

    public void clearIDCard(IDCard idCard) {

    }

    public void addIDCard(IDCard idCard) {
        idCardMap.put(idCardMap.size() +1, idCard);
    }

    public void removeIDCard(IDCard idCard) {
        idCardMap.values().remove(idCard);
    }

    @Override
    public void createIDCard(Person person, Date validFrom, Date validUntil, Permission... permissions) {

    }
}
