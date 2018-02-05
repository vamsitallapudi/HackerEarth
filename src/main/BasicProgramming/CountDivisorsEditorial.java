package main.BasicProgramming;

import java.util.Scanner;

public class CountDivisorsEditorial {
    /*
    * Solves the problem with O(1) time complexity instead of
    * O(N) time complexity
    * of the problem with solution which i've created
    * */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt(), r = sc.nextInt(), k = sc.nextInt();

        /*
        * No of numbers divisible by k in range from 1 to r is r/k. So the no. of numbers divisible by l in range from l to r is (r/k) - ((l-1)/k))
        * since nos divisible by k in  1 to l-1 range is (l-1)/k
        * */
        System.out.println((r/k)-((l-1)/k));
    }
}
