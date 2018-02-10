package main.basicprogramming;

import java.util.Scanner;

public class PalindromicString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        StringBuilder stringBuffer = new StringBuilder(input);
        String revString = stringBuffer.reverse().toString();
        if(input.equals(revString)) {
            System.out.println("YES");
        } else{
            System.out.println("NO");
        }
    }
}