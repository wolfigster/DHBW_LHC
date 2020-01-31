package infrastructure.security.idcard;

import main.Helper;

import java.util.ArrayList;
import java.util.Date;

public abstract class IDCard {

    private String id;
    private Date validFrom;
    private Date validUntil;
    private ArrayList<Permission> permissionList = new ArrayList<>();
    private boolean isLocked;
    private PasswordChip passwordChip;

    public IDCard() {
        this.id = Helper.getAlphaNumericString(6);
        this.validFrom = new Date();
        this.validUntil = new Date();
        this.permissionList.add(Permission.Visitor);
        this.isLocked = false;
        this.passwordChip = new PasswordChip();
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

    public PasswordChip getPasswordChip() {
        return passwordChip;
    }

    public void setPasswordChip(PasswordChip passwordChip) {
        this.passwordChip = passwordChip;
    }
}
