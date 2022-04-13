package strings;

import java.util.Scanner;

public class PrintFirstAndLastLetter {
    public static void main(String[] args) {

        //DO NOT CHANGE
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE
        System.out.println(word.charAt(0)+""+word.charAt(word.length()-1));
scan.close();
    }
}

/*
Write a program that will print out first and last letters together.
Input: adobe
Output: ae
 */