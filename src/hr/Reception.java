package hr;

import hr.person.Person;
import hr.person.ReceptionStaff;
import hr.person.Visitor;
import hr.person.idcard.Chip;
import hr.person.idcard.IDCard;
import management.IDCardManagement;
import management.RandomString;

import java.util.*;

public enum Reception implements IReception{
    instance
    ;

    private Map<Integer, Visitor> visitorMap = new HashMap<>();

    @Override
    public void createIDCard(Person person, Date validFrom, Date validUntil, Permission... permissions) {
        if(permissions.length == 0) permissions = new Permission[]{Permission.Visitor};
        IDCard idCard = new IDCard(RandomString.getAlphaNumericString(6), validFrom,
                validUntil, person.getIris(),
                false, new Chip(RandomString.getAlphaNumericString(8)),
                permissions);
        IDCardManagement.instance.addIDCard(idCard);
        person.setIdCard(idCard);
    }

    public void addVisitor(Visitor visitor) {
        visitorMap.put(visitorMap.size() +1, visitor);
    }

    public void removeVisitor(Visitor visitor) {
        visitorMap.values().remove(visitor);
    }

    public Map<Integer, Visitor> getVisitorMap() {
        return this.visitorMap;
    }
}
