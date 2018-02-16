package main.basicprogramming;

import java.util.Scanner;

public class MagicalWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int iter = sc.nextInt();
        while (iter-- > 0) {
            int size = sc.nextInt();
            sc.nextLine();
            String str = sc.nextLine();
            char[] chars = str.toCharArray();

            for (int j = 0; j < size; j++) {
                int i = chars[j];
                if (i == 65 || i == 66 || i == 67 || i == 68 || i == 69)
                    chars[j] = 67;
                else if (i == 70 || i == 72 || i == 71)
                    chars[j] = 71;
                else if (i == 73 || i == 74 || i == 75 || i == 76)
                    chars[j] = 73;
                else if (i == 77 || i == 78 || i == 79 || i == 80 || i == 81)
                    chars[j] = 79;
                else if (i == 82 || i == 83 || i == 84 || i == 85 || i == 86)
                    chars[j] = 83;
                else if (i == 87 || i == 88 || i == 89 || i == 90)
                    chars[j] = 89;
                else if (i == 97 || i == 98 || i == 99)
                    chars[j] = 97;
                else if (i == 100 || i == 101 || i == 102)
                    chars[j] = 101;
                else if (i == 103 || i == 104 || i == 105)
                    chars[j] = 103;
                else if (i == 106 || i == 107 || i == 108)
                    chars[j] = 107;
                else if (i == 109 || i == 110 || i == 111)
                    chars[j] = 109;
                else if (i == 112 || i == 113 || i == 114 || i == 115 || i == 116 || i == 117 || i == 118 || i == 119 || i == 120 || i == 121 || i == 122)
                    chars[j] = 113;
                else if (i == 94 || i == 95)
                    chars[j] = 97;
                else if (i == 91 || i == 92 || i == 93)
                    chars[j] = 89;
                else if (i == 123 || i == 124 || i == 125)
                    chars[j] = 113;
                else
                    chars[j] = 67;
            }
            System.out.println(String.valueOf(chars));
        }
    }
}
