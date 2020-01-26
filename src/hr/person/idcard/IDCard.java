package hr.person.idcard;

import hr.Permission;
import management.RandomString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class IDCard {

    private final String id;
    private Date validFrom;
    private Date validUntil;
    private int[][] irisStructure = new int[10][10];
    private ArrayList<Permission> permissionList = new ArrayList<>();
    private boolean isLocked;
    private Chip chip;

    public IDCard() {
        this.id = RandomString.getAlphaNumericString(6);
    }

    public IDCard(String id, Date validFrom, Date validUntil, int[][] irisStructure, boolean isLocked, Chip chip, Permission... permissions) {
        this.id = id;
        this.validFrom = validFrom;
        this.validUntil = validUntil;
        this.irisStructure = irisStructure;
        this.permissionList.addAll(Arrays.asList(permissions));
        this.isLocked = isLocked;
        this.chip = chip;
    }

    public String getId() {
        return id;
    }

    public Date getValidFrom() {
        return validFrom;
    }

    public Date getValidUntil() {
        return validUntil;
    }

    public int[][] getIrisStructure() {
        return irisStructure;
    }

    public ArrayList<Permission> getPermissionList() {
        return permissionList;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void setLocked(boolean locked) {
        isLocked = locked;
    }

    public Chip getChip() {
        return chip;
    }
}
