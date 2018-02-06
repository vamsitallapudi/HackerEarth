package main.BasicProgramming;

import java.util.Scanner;

public class AsciiValue {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] ch = sc.next().toCharArray();
        System.out.println((int) ch[0]);
    }

}
