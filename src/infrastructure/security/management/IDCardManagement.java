package infrastructure.security.management;

import infrastructure.security.idcard.IDCard;
import infrastructure.security.idcard.VisitorIDCard;

import java.util.HashMap;
import java.util.Map;

public enum IDCardManagement {
    instance
    ;

    private Map<Integer, IDCard> idCardMap = new HashMap<>();

    public void addIDCard(IDCard idCard) {
        idCardMap.put(idCardMap.size() +1, idCard);
    }

    public void removeIDCard(IDCard idCard) {
        idCardMap.values().remove(idCard);
    }

    public void createIDCard() {
        idCardMap.put(idCardMap.size() + 1, new VisitorIDCard());
    }

    public IDCard getLastIDCard() {
        return idCardMap.get(idCardMap.size());
    }

    public IDCard getFreeIDCard() {
        for (Map.Entry<Integer, IDCard> entry : idCardMap.entrySet()) {
            if(!entry.getValue().getPasswordChip().read().equals("")) {
                continue;
            }
            return entry.getValue();
        }
        return null;
    }
}
