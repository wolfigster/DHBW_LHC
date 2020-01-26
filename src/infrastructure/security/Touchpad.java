package infrastructure.security;

import infrastructure.security.cryptography.AES;

import java.util.Scanner;

public class Touchpad {

    public Touchpad() {

    }

    public String getInput() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        return AES.decrypt(input);
    }
}
