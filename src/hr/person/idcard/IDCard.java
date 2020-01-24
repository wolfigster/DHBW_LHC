package hr.person.idcard;

import hr.Permission;

import java.util.ArrayList;
import java.util.Date;

public class IDCard {

    private String id;
    private Date validFrom;
    private Date validUntil;
    private int[][] irisStructure = new int[10][10];
    private ArrayList<Permission> permissionList;
    private boolean isLocked;

    public IDCard(String id, Date validFrom, Date validUntil, ArrayList<Permission> permissionList, boolean isLocked) {
        this.id = id;
        this.validFrom = validFrom;
        this.validUntil = validUntil;
        this.permissionList = permissionList;
        this.isLocked = isLocked;
    }
}
