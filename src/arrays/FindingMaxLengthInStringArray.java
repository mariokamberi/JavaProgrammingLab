package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FindingMaxLengthInStringArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = new String[5];
        for(int i = 0; i < 5;  i++) {
            words[i] = input.nextLine();

        }
        //write your code below
        String max="";
        for (String each : words) {
            if (each.length()>max.length()){
                max=each;
            }
        }
        System.out.println(max);

    }
}
/*
Given the array words find and print the word with the largest length.
Assume that there are no 2 words with the longest length

Example:
words -> ["aaa", "bbbbb", "whasstupppp", "longg" , "jaaaaavvaaaaaaaaaa"]

Outputs: jaaaaavvaaaaaaaaaa

 */