package strings;

import java.util.Scanner;

public class VerifyContains {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        String sentence = scan.nextLine();
        //WRITE YOUR CODE HERE
        System.out.println(sentence.contains(word));
        scan.close();
    }
}
/*
Instructions

this file should contain student lesson instructions

students will see these instructions in a read-only workspace tab

Steps
 Use Markdown to format your instructions.

For example, here is a code block in java10

public class Main {
  public static void main(String[] args) {
    System.out.println("hello world");
  }
}

Include an image by placing it in the assets folder.

For example, here is the Replit logo:
 */