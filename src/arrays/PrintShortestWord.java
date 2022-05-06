package arrays;

import java.util.Scanner;

public class PrintShortestWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] str = {scan.next(), scan.next(), scan.next(),
                scan.next(), scan.next(), scan.next()};

        /* String shortest = "";
        int min = str[0].length();

        for (String each : str) {
            if (each.length()<=min){
                min=each.length();
                shortest=each;
            }
        }
        System.out.println(shortest);
         */

        String shortest=str[0];
        for (String each : str) {
            if (each.length()<=shortest.length()){
                shortest=each;
            }
        }
        System.out.println(shortest);
        scan.close();
    }
}
/*
Write a program that will print the shortest word in the given array str.

input: java, cable, red, vivid, remedy, grace

output: red
 */