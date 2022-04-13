package strings;

import java.util.Scanner;

public class PrintTheLongestWord {
    public static void main(String[] args) {
        //DO NOT CHANGE
        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();
        //WRITE YOUR CODE HERE
        if (word1.length()>word2.length()){
            System.out.println(word1);
        }else {
            System.out.println(word2);
        }

        scan.close();
    }
}

/*
Write a program that will print out the longest word.
Note: Assume the length of the two given Strings will be different

input:
bill
check

output: check
 */