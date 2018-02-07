package main.basicprogramming;

import java.util.Scanner;

public class AnagramsBestSoln {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Write your code here
        int t=sc.nextInt();
        while(t-- > 0){
            String s1,s2;
            s1=sc.next();
            s2=sc.next();
            int a[]=new int[26];
            int b[]=new int[26];
            for(int i=0;i<s1.length();i++)
                a[s1.charAt(i)-97]++;
            for(int i=0;i<s2.length();i++)
                b[s2.charAt(i)-97]++;
            int tot=0;
            for(int i=0;i<26;i++){
                tot+=Math.abs(a[i]-b[i]);
            }
            System.out.println(tot);
        }
    }
}