package loops;

import java.util.Scanner;

public class CatsAndDogs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int countOfCats = 0;
        int countOfDogs = 0;
        String word = scan.next();
        word=word.replace("cat","0").replace("dog","1");
        for (int i=0; i<word.length(); i++){
            char ch=word.charAt(i);
            if (ch=='0'){countOfCats++;}
            else if (ch=='1'){countOfDogs++;}}
        boolean result=countOfCats==countOfDogs;
        System.out.println(result);
    }
}



/*
        countOfCats = countElement(word, "cat");
        countOfDogs = countElement(word, "dog");
        System.out.println(countOfCats == countOfDogs);
    }


    private static int countElement(String word, String elmnt) {
        int counter = 0;
        int fromIndex =0;
        while (word.indexOf(elmnt, fromIndex) != -1 ) {

            fromIndex = word.indexOf(elmnt, fromIndex);
            counter++;
            fromIndex++;
        }
        return counter;



    }

}

      */

/*
       //for cats
        lastIndex=0;
        while(lastIndex != -1)
        {
            lastIndex = word.indexOf("cat",lastIndex);

            if(lastIndex != -1)
            {
                countOfCats ++;
                lastIndex += "cat".length();
            }
        }

        //for dogs
        lastIndex=0;
        while(lastIndex != -1)
        {
            lastIndex = word.indexOf("dog",lastIndex);

            if(lastIndex != -1)
            {
                countOfDogs ++;
                lastIndex += "dog".length();
            }
        }

        if(countOfCats==countOfDogs)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }

 */







/*
Print true if the string "cat" and "dog" appear the same number of times in the given string word.

Example:

input: catdog
output: true

Example:

input: catcat
output: false

Example:

input: cat-cheetah-dog-cat
output: false
 */