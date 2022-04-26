package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class PrintShortestWord2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

       /* String[] arr = str.split(", ");
        int minNum = Integer.MAX_VALUE;
        int count= 0;
        for(String each : arr){
            if(each.length()<minNum){
                minNum=each.length();
                count =0;
            }
            if(each.length()==minNum){
                count++;
            }
        }
        String[] result = new String[count];
        int a = 0;
        for(String each : arr){
            if(each.length()==minNum){
                result[a++]=each;
            }
        }
        Arrays.sort(result);
        System.out.println(Arrays.toString(result));

        */

        String shortest = str;
        String[] words = str.split(", ");
        int i = 0;
        for (String each : words) {
            if (each.length() < shortest.length()) {
                shortest = each;
            }
        }
        for (String word : words) {
            if(shortest.length() == word.length()){
                i++;
            }
        }
        String[] newWords = new String[i];
        int j = 0;
        for (String word : words) {
            if (word.length() == shortest.length()) {
                newWords[j] = word;
                j++;
            }
        }
        Arrays.sort(newWords);
        System.out.println(Arrays.toString(newWords));


    }
}
/*
Write a program that will find out the shortest words in the given string str.
If there are few words that are evenly short, print them all.
Use split method in order to split str string variable and create an array of strings.
Print array with Arrays.toString() method. Sort array before printing.

Hint: Split values by comma: split(", ");

input: olive, fish, pursuit, old, warning, python, java, coffee, cat, ray

output: [cat, old, ray]
 */