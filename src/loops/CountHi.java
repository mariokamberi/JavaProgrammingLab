package loops;

import java.util.Scanner;

public class CountHi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int countOfHi=0;

        str = str.replace("hi","0");
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch=='0'){
                countOfHi++;
            }
        }
        System.out.println(countOfHi);

        /*
          int countOfHi = 0;
        int lastIndex=0;

        while(lastIndex != -1)
        {
            lastIndex = str.indexOf("hi",lastIndex);

            if(lastIndex != -1)
            {
                countOfHi++;
                lastIndex += "hi".length();
            }
        }

        System.out.println(countOfHi);
         */

    }
}
/*
Print out the number of times that the string "hi" appears anywhere in the given string.
Only lowercase "hi" should be counted.

Example:

input: abc hi how hi

output: 2

Example:

input: hi code java please

output: 1
 */