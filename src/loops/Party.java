package loops;

import java.util.Scanner;

public class Party {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        // your code
        // ------------------------------------------

        String result = "";

        while (true){
            System.out.println("Please enter guest name:");
            String guest = input.next();
            result+=guest+", ";
            System.out.println("Do you want to enter new guest name:");
            String answer = input.next();

            if (answer.equalsIgnoreCase("no")){
                System.out.println("Guest's list: "+result.substring(0,result.length()-2));
                break;
            }

        }
        /*
         Scanner input = new Scanner(System.in);
        String guest="";
        String guests="";
        String reply;


        do
        {
            System.out.println("Please enter guest name:");
            guest = input.nextLine();
            guests = guests + guest + ", ";

            System.out.println("Do you want to enter new guest name:");
            reply=input.nextLine();
        }
        while(reply.equals("yes"));

        System.out.println("Guest's list: " + guests.substring(0,guests.length()-2));
         */
input.close();
    }
}
/*
Imagine you have a party and need to form the list of the guests. (Assume you have at least one guest)

Ask for the first guest name.

Then ask does user want to enter one more guests.

If yes - take the next guest input

If not - finish the program and print list of the guests.

Example:

Please enter guest name:
Nick
Do you want to enter new guest name:
yes
Please enter guest name:
Linda
Do you want to enter new guest name:
no
Guest's list: Nick, Linda
 */