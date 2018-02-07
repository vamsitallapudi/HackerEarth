package main.BasicProgramming;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AnagramsOtherSolns {
    public static void main(String[] args) {


        //Scanner
        Scanner s = new Scanner(System.in);
        int N = Integer.parseInt(s.nextLine());                 // Reading input from STDIN

        for(int i = 0; i<N;i++) {

            String[] v1 = s.nextLine().split("");
            String[] v2 = s.nextLine().split("");

            Map<String,Integer> v1map = new HashMap<String,Integer>();
            Map<String,Integer> v2map = new HashMap<String,Integer>();

            for(int j = 0;j<v1.length;j++) {
                if(v1map.containsKey(v1[j])) {
                    v1map.put(v1[j],v1map.get(v1[j])+1);
                } else {
                    v1map.put(v1[j],1);
                }
            }

            for(int j = 0;j<v2.length;j++) {
                if(v2map.containsKey(v2[j])) {
                    v2map.put(v2[j],v2map.get(v2[j])+1);
                } else {
                    v2map.put(v2[j],1);
                }
            }


            int output = 0;

            for (Map.Entry<String, Integer> entry : v1map.entrySet()) {
                String k = entry.getKey();
                Integer v = entry.getValue();
                // System.out.println(k+" "+v);
                // System.out.println(v);
                if(v2map.containsKey(k)) {

                    int diff= v - v2map.get(k);
                    output = output + (diff<0?diff*-1:diff);
                    //  System.out.println(output);
                    // System.out.println(output+" "+v+" "+v2map.get(k));
                    v2map.remove(k);
                } else {
                    output = output + v;
                    // System.out.println(output);
                }
            }
            for (Map.Entry<String, Integer> entry : v2map.entrySet()) {
                String k = entry.getKey();
                Integer v = entry.getValue();
                //System.out.println(k+" "+v);
                output = output + v;
            }

            System.out.println(output);
        }
    }
}
