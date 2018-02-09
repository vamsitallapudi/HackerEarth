package main.basicprogramming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SeatingArrangementPartiallyAccepted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iterations = sc.nextInt();
        while (iterations-- > 0) {
            boolean flag = false;
            ArrayList<Integer> a = new ArrayList<>(55);
            ArrayList<Integer> b = new ArrayList<>(55);

            ArrayList<Integer> arrayList = new ArrayList<>(6);
            for (int i = 0; i < 108; i++) {
                if ((i) % 6 == 0) {
                    flag = !flag;
                    fetchArrayListAndReverseAndClear(b, arrayList);
                }
                if (flag) {
                    a.add(i + 1);
                } else {
                    arrayList.add(i + 1);
                }
            }
            if (arrayList.size() > 0) {
                fetchArrayListAndReverseAndClear(b, arrayList);
            }

            int input = sc.nextInt();
            String str = !flag?fetchSeatType(input%6):fetchSeatType(6-(input%6));
            if (a.contains(input)) {
                System.out.println(b.get(a.indexOf(input))+ " " + str);
            } else if (b.contains(input)) {
                System.out.println(a.get(b.indexOf(input))+ " " + str);
            }
        }
    }

    private static String fetchSeatType(int i) {
        switch (i){
            case 0:
                return "WS";
            case 1:
                return "WS";
            case 2:
                return "MS";
            case 3:
                return "AS";
            case 4:
                return "AS";
            case 5:
                return "MS";
            default:
                return "";

        }

    }

    private static void fetchArrayListAndReverseAndClear(ArrayList<Integer> d, ArrayList<Integer> arrayList) {
        Collections.reverse(arrayList);
        d.addAll(arrayList);
        arrayList.clear();
    }
}
