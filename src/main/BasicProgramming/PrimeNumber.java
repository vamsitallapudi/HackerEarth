package main.BasicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class PrimeNumber {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        ArrayList<Integer> primeNos = new ArrayList<>();
        for(int i=2;i<n;i++){
            if(isPrime(i)){
                primeNos.add(i);
            }
        }
        StringBuffer sb = new StringBuffer();
        for(int i: primeNos){
            sb.append(i);
            sb.append(" ");
        }

        System.out.println(sb.toString().trim());


    }

    private static boolean isPrime(int n) {

        for(int i=2;i<=n/2; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
