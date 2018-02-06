package main.BasicProgramming;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

public class Anagrams {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String x = br.readLine();
            String y = br.readLine();
            ArrayList<Character> charX = new ArrayList<>();
            ArrayList<Character> charY = new ArrayList<>();
            for (char a : x.toCharArray()) {
                charX.add(a);
            }
            for (char a : y.toCharArray()) {
                charY.add(a);
            }
            if (charX.size() < charY.size())
                fetchSimilarChars(charX, charY);
            else
                fetchSimilarChars(charY, charX);
            System.out.println(charX.size() + charY.size());
        }
    }

    private static void fetchSimilarChars(ArrayList<Character> charA, ArrayList<Character> charB) {

        Iterator<Character> charAIterator = charA.iterator();

        while (charAIterator.hasNext()) {
            int x = charAIterator.next();
            Iterator<Character> charBIterator = charB.iterator();
            while (charBIterator.hasNext()) {
                int y = charBIterator.next();
                if (x == y) {
                    charAIterator.remove();
                    charBIterator.remove();
                    break;
                }
            }
        }
    }
}
