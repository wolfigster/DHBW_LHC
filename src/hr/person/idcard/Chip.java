package hr.person.idcard;

import cryptography.AES;

public class Chip {
    private String password;

    public Chip(String password) {
        this.password = AES.decrypt(password);
    }

    public String getPassword() {
        return AES.encrypt(password);
    }
}
