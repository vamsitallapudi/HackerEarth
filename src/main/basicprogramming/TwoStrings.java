package main.basicprogramming;

import java.util.Arrays;
import java.util.Scanner;

public class TwoStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iter = sc.nextInt();
        while (iter-- >0){
            String str1 = sc.next();
            String str2 = sc.next();

            char[] str1Array = str1.toCharArray();
            char[] str2Array = str2.toCharArray();
            Arrays.sort(str1Array);
            Arrays.sort(str2Array);
            String sortedStr1 = new String(str1Array);
            String sortedStr2 = new String(str2Array);

            if(sortedStr1.equals(sortedStr2)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
