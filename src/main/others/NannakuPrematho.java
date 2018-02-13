package main.others;

import java.util.*;

public class NannakuPrematho {
    private static List<Integer> b = new ArrayList<>();
    public static void main(String[] args) {

        for(int i=0;i<100;i++){
            b.add(i+1);
        }
        eliminateNext(0);
        System.out.println(b.get(0));

    }

    private static void eliminateNext(int i) {
        if(i==b.size()-1){
            i=0;
        }
        int count = 0;
        for(Integer x:b){
            if(x!=null){
               count++;
            }
        }
        if(count<=1) {
            return;
        }
        for(int j=i+1;j<b.size();j++){
            if(b.get(j)!=null){
                b.set(j,null);
                eliminateNext(j+1);
                break;
            }
        }

    }
}