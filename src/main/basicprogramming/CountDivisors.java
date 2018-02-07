package main.basicprogramming;

import java.util.ArrayList;
import java.util.Scanner;

public class CountDivisors {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        ArrayList<Integer> numList = new ArrayList<>();
        String[] numListArray = num.split(" ");
        int k = 0;

        for(String i : numListArray){
           numList.add(Integer.parseInt(i));
        }

        for(int i = numList.get(0);i<= numList.get(1); i++){
            if(i%numList.get(2)==0){
                k+=1;
            }
        }
        System.out.println(k);

    }
}
