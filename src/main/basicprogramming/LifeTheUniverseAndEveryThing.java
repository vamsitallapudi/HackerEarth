package main.basicprogramming;

import java.util.Scanner;

public class LifeTheUniverseAndEveryThing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        while(input!=42) {
            System.out.println(input);
            input = sc.nextInt();
        }

    }
}
