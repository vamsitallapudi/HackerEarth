package main.basicprogramming;

import java.util.Scanner;

public class ToggleString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] chr = sc.nextLine().toCharArray();
        char[] temp = new char[chr.length];
        for(int i= 0;i<chr.length;i++){
            if(Character.isLowerCase(chr[i])) {
                temp[i] = Character.toUpperCase(chr[i]);
            }
            if(Character.isUpperCase(chr[i])) {
                temp[i] = Character.toLowerCase(chr[i]);
            }
        }
        System.out.println(String.valueOf(temp));

    }
}
