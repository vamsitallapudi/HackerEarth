package main.basicprogramming;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SeatingArrangement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int iter = sc.nextInt();

        while (iter-- > 0) {
            int input = sc.nextInt();
            int rem = input %12;
            int dividend = input/12;
            HashMap<Integer, String> output = fetchOutput(rem);
            for ( Map.Entry<Integer, String> entry : output.entrySet()) {
                Integer key = (dividend-1)* 12 * entry.getKey()+1;
                String value = entry.getValue();
                System.out.println(key + " "+ value );
            }
        }
    }

    private static HashMap<Integer,String> fetchOutput(int input) {
        HashMap<Integer,String> hashMap = new HashMap<>();
        switch (input){
            case 1:
                hashMap.put(12,"WS");
                return hashMap;
            case 0:
                hashMap.put(1,"WS");
                return hashMap;
//            case 6:
//                return "7 WS";
//            case 7:
//                return "6 WS";
//            case 2:
//                return "11 MS";
//            case 11:
//                return "2 MS";
//            case 5:
//                return "8 MS";
//            case 8:
//                return "5 MS";
//            case 3:
//                return "10 AS";
//            case 10:
//                return "3 AS";
//            case 4:
//                return "9 AS";
//            case 9:
//                return "4 AS";
                default:
                    return null;
        }
    }
}
