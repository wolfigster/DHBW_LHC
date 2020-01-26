package infrastructure.security;

import java.util.ArrayList;
import java.util.Date;

public class IDCard {

    private String id;
    private Date validFrom;
    private Date validUntil;
    private int[][] irisStructure = new int[10][10];
    private ArrayList<Permission> permissionList;
    private boolean isLocked;
    private Chip chip;

    public IDCard(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }

    public Date getValidFrom() {
        return this.validFrom;
    }

    public Date getValidUntil() {
        return this.validUntil;
    }

    public int[][] getIrisStructure() {
        return this.irisStructure;
    }

    public ArrayList<Permission> getPermissionList() {
        return this.permissionList;
    }

    public boolean isLocked() {
        return this.isLocked;
    }

    public Chip getChip() {
        return this.chip;
    }
}
