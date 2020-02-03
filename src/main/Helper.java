package main;

import java.util.Random;

public class Helper {

    public static boolean withInput;

    public static String getAlphaNumericString(int n) {
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "0123456789"
                + "abcdefghijklmnopqrstuvxyz";
        StringBuilder stringBuilder = new StringBuilder(n);
        for(int i = 0; i < n; i++) {
            int index = (int)(AlphaNumericString.length() * Math.random());
            stringBuilder.append(AlphaNumericString.charAt(index));
        }
        return stringBuilder.toString();
    }

    public static String getNumericString(int n) {
        String AlphaNumericString = "0123456789";
        StringBuilder stringBuilder = new StringBuilder(n);
        for(int i = 0; i < n; i++) {
            int index = (int)(AlphaNumericString.length() * Math.random());
            stringBuilder.append(AlphaNumericString.charAt(index));
        }
        return stringBuilder.toString();
    }

    public static String getCharString(int n) {
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
        + "abcdefghijklmnopqrstuvxyz";
        StringBuilder stringBuilder = new StringBuilder(n);
        for(int i = 0; i < n; i++) {
            int index = (int)(AlphaNumericString.length() * Math.random());
            stringBuilder.append(AlphaNumericString.charAt(index));
        }
        return stringBuilder.toString();
    }

    public static int[][] createTwoDimensionalIntegerArray(int row, int col) {
        Random random = new Random();
        int[][] arr = new int[row][col];
        for(int i = 0; i < col; i++) {
            for(int j = 0; j < row; j++) {
                arr[i][j] = random.nextInt(10);
            }
        }
        return arr;
    }
}
