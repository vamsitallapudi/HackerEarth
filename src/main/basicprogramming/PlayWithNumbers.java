package main.basicprogramming;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class PlayWithNumbers {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long[] array = new long[Integer.parseInt(st.nextToken())];
        long iter = Long.parseLong(st.nextToken());

        StringTokenizer stArray = new StringTokenizer(br.readLine());
        for(int i=0;i<array.length;i++){
            array[i] = Long.parseLong(stArray.nextToken());
        }
        while(iter-- > 0){
            StringTokenizer stInput = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(stInput.nextToken());
            int b = Integer.parseInt(stInput.nextToken());

            long[] temp = Arrays.copyOfRange(array, a-1,b);

            long outputFloored = 0L;
            for(long i: temp){
                outputFloored +=Math.floor(i);
            }
            System.out.println(outputFloored/temp.length);
        }
    }
}
