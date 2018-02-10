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
            int dividend = (input-1)/12;
            HashMap<Integer, String> output = fetchOutput(rem);
            for (Map.Entry<Integer, String> entry : output.entrySet()) {
                Integer key = (dividend)* 12 + entry.getKey();
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
            case 6:
                hashMap.put(7,"WS");
                return hashMap;
            case 7:
                hashMap.put(6,"WS");
                return hashMap;
            case 2:
                hashMap.put(11,"MS");
                return hashMap;
            case 11:
                hashMap.put(2, "MS");
                return hashMap;
            case 5:
                hashMap.put(8, "MS");
                return hashMap;
            case 8:
                hashMap.put(5, "MS");
                return hashMap;
            case 3:
                hashMap.put(10, "AS");
                return hashMap;
            case 10:
                hashMap.put(3, "AS");
                return hashMap;
            case 4:
                hashMap.put(9, "AS");
                return hashMap;
            case 9:
                hashMap.put(4, "AS");
                return hashMap;
            default:
                return hashMap;
        }
    }
}
