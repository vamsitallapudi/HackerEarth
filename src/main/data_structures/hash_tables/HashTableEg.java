package main.data_structures.hash_tables;

public class HashTableEg {
    public static void main(String[] args) {
        String s =  "ababcd";
        char[] chars = s.toCharArray();
        countFrequency(chars);
    }


//To count the frequency of each alphabet in a string
    private static void countFrequency(char[] chars) {
        for(char i='a';i<='z';i++){
//            System.out.println(i);
            int freq = 0;
            for(int j= 0; j<chars.length;j++){
                if(chars[j] == i) {
                    ++freq;
                }
            }
            System.out.println(freq);
        }
    }
}
