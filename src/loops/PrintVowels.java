package loops;

import java.util.Scanner;

public class PrintVowels {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        String word = inp.nextLine();
        //write your code below
        String vowels = "";
        for (int i = 0; i < word.length(); i++) {
            if ((word.charAt(i)=='a')||(word.charAt(i)=='e')||(word.charAt(i)=='u')||(word.charAt(i)=='i')
            ||(word.charAt(i)=='o')){
                vowels+=word.charAt(i);

            }
        }
        System.out.println(vowels);
inp.close();

        /*
        Scanner inp = new Scanner(System.in);
        String word = inp.nextLine();
        //write your code below
        char isVowel;

        for(int i=0;i<word.length();i++)
        {
            isVowel=word.charAt(i);
            if(isVowel=='a'||isVowel=='e'||isVowel=='i'||isVowel=='u'||isVowel=='o')
            {
                System.out.print(isVowel);
            }
        }
         */
    }
}
/*
Create a program that will take the given String In and print out all the vowels from the String.

Example:

Input: howdyho

Output: oo

Input: huehuehuehue

Output: ueueueue
 */