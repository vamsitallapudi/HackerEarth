package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RoyAndHisProfilePicture {
    public static void main(String[] args) throws IOException {
        /* Sample code to perform I/O:
         * Use either of these methods for input
         */

        //Using BufferedReader to try new since i've used scanner many times but not BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(br.readLine());
        int photos = Integer.parseInt(br.readLine());

        for(int i= 0;i< photos;i++) {
//            If any of the width or height is less than L, user is prompted to upload another one. Print "UPLOAD ANOTHER" in this case.
            String size = br.readLine();
            String[] lenAndWidth = size.split(" ");
            int len = Integer.parseInt(lenAndWidth[0]);
            int breadth = Integer.parseInt(lenAndWidth[1]);
            if(len<length || breadth<length){
                System.out.println("UPLOAD ANOTHER");
            } else if(len==breadth){
                System.out.println("ACCEPTED");
            } else {
                System.out.println("CROP IT");
            }
        }

//        //Scanner
//        Scanner s = new Scanner(System.in);
//        String name = s.nextLine();                 // Reading input from STDIN
//        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT


    }
}
