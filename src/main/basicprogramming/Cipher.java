package main.basicprogramming;

import java.util.Scanner;

public class Cipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] chars = sc.nextLine().toCharArray();
        int iter = sc.nextInt();
        for (int i = 0; i < chars.length; i++) {
            if (Character.isLetterOrDigit(chars[i])) {
                int value = (int) chars[i];
                for (int j = 0; j < iter; j++) {
                    value +=1;
                    if (value == 91) {
                        value = 65;
                    } else if (value == 123) {
                        value = 97;
                    } else if (value == 58) {
                        value = 48;
                    }
                }
                chars[i] = (char) value;
            }
        }
        System.out.println(String.copyValueOf(chars));
    }
}
