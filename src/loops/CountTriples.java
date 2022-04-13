package loops;

import java.util.Scanner;

public class CountTriples {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int count = 0 ;
        //WRITE YOUR CODE HERE

        char ch1;
        char ch2;
        char ch3;

        for (int i = 0; i < str.length(); i++) {
            if (i+2<str.length()){

                ch1=str.charAt(i);
                ch2=str.charAt(i+1);
                ch3=str.charAt(i+2);

                if (ch1==ch2 && ch2==ch3){
                    count++;
                }

            }
        }

        System.out.println(count);


        scan.close();

    }
}

/*
We'll say that a "triple" in a string is a char appearing three times in a row.
Print out the number of triples in the given string. The triples may overlap.

Example:

input: abcXXXabc

output: 1

Example:

input: xxxabyyyycd

output: 3

Example:

input: java

output: 0
 */