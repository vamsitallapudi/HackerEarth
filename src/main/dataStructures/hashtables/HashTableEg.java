package main.dataStructures.hashtables;

public class HashTableEg {
    public static void main(String[] args) {
        String s =  "ababcd";
        char[] chars = s.toCharArray();
        countFrequency(chars);
    }


//To count the frequency of each alphabet in a string
    private static void countFrequency(char[] chars) {
        for(char i='a';i<='z';i++){
            int freq = 0;
            for (char c : chars) {
                if (c == i) {
                    ++freq;
                }
            }
            System.out.println(freq);
        }
    }
}
