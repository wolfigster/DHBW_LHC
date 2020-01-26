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
        this.validFrom = new Date();
        this.validUntil = new Date();
        this.permissionList.add(Permission.Visitor);
        this.isLocked = false;
        this.chip = new Chip();
    }

    public String getId() {
        return this.id;
    }

    public Date getValidFrom() {
        return this.validFrom;
    }

    public void setValidFrom(Date validFrom) {
        this.validFrom = validFrom;
    }

    public Date getValidUntil() {
        return this.validUntil;
    }

    public void setValidUntil(Date validUntil) {
        this.validUntil = validUntil;
    }

    public int[][] getIrisStructure() {
        return this.irisStructure;
    }

    public void setIrisStructure(int[][] irisStructure) {
        this.irisStructure = irisStructure;
    }

    public ArrayList<Permission> getPermissionList() {
        return this.permissionList;
    }

    public void setPermissionList(ArrayList<Permission> permissionList) {
        this.permissionList = permissionList;
    }

    public boolean isLocked() {
        return this.isLocked;
    }

    public void setLocked(boolean locked) {
        this.isLocked = locked;
    }

    public Chip getChip() {
        return this.chip;
    }

    public void setChip(Chip chip) {
        this.chip = chip;
    }
}
