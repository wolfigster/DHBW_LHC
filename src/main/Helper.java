package main;

import java.util.Random;

public class Helper {
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

    public static int[][] createTwoDimensionalIntegerArray(int row, int col) {
        Random random = new Random();
        int[][] iris = new int[row][col];
        for(int i = 0; i < col; i++) {
            for(int j = 0; j < row; j++) {
                iris[i][j] = random.nextInt(10);
            }
        }
        return iris;
    }
}
