package main.basicprogramming;

import java.util.Scanner;

public class FindProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long[] array = new long[sc.nextInt()];
        for(int i =0;i<array.length;i++){
            array[i] = sc.nextLong();
        }
        System.out.println(getOutput(array));
    }

    private static long getOutput(long[] array) {
        long ans = 1;
        for(int i =0;i<array.length;i++){
            ans = (ans * array[i]) % (int) (Math.pow(10,9) + 7);
        }
        return ans;
    }
}