package loops;

import java.util.Scanner;

public class EqualsJavaPython {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
        int countOfJava=0;
        int countOfPython=0;
        String toLowerCase = sentence.toLowerCase();


        toLowerCase=toLowerCase.replace("java","0").replace("python","1");

        for (int i = 0; i < toLowerCase.length(); i++) {
            char ch = toLowerCase.charAt(i);
            if (ch == '0'){
                countOfJava++;
            }else if (ch=='1'){
                countOfPython++;
            }
        }

        boolean result = countOfJava==countOfPython;
        System.out.println(result);

    }
}
/*
Given a string, print out true if the number of appearances of "java" anywhere in the string is equal to the number of appearances of "python" anywhere in the string (case sensitive).

Example:

input: We study java not python

output: true

Example:

input: What's the difference between java, javascript and python?

output: false
 */