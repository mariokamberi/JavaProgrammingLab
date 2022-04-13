package strings;

import java.util.Scanner;

public class GetSandwich {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        int firstIndex = str.indexOf("bread") + "bread".length();
        int lastIndex = str.lastIndexOf("bread");

        if (firstIndex != -1 && lastIndex != -1 && str.length() > 10) {
            System.out.println(str.substring(firstIndex, lastIndex));
        } else {
            System.out.println("nothing");
        }

scan.close();
    }
}

/*
A sandwich is two pieces of bread with something in between.
Print the string that is between the first and last appearance of "bread" in the given string,
or return string "nothing" if there are not two pieces of bread.

Example:

input: breadjambread

output: jam

input: xxbreadjambreadyy

output: jam

input: xxbreadapple

output: nothing

input: breadbutterbread

output: butter
 */