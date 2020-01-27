package infrastructure.security.device;

import main.Helper;

import java.util.Scanner;

public class Touchpad {

    Scanner scanner = new Scanner(System.in);

    public Touchpad() {

    }

    public String read() {
        if(Helper.withInput) {
            System.out.println("Please enter your password:");
            return scanner.next();
        }
        return Helper.getAlphaNumericString(8);
    }
}
