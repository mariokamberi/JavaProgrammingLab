package statements;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        System.out.println("Enter cents:");
        Scanner scan =new Scanner(System.in);
        int cents = scan.nextInt();
        int quarters, dimes, nickels, pennies;

        if (0<cents && cents<100){
            quarters= cents/25;
            cents = cents - quarters*25;

            dimes = cents/10;
            cents = cents - dimes*10;

            nickels = cents/5;
            cents = cents- nickels*5;

            pennies = cents;
            System.out.println("Your change is "+ quarters+ " quarters, " + dimes
                    +" dimes, "+ nickels + " nickels, "+ "and " +pennies + " pennies");

        }else {
            System.out.println("Invalid cents amount");
        }
scan.close();
        }
    }


/*
Write a program that will determine the change given from the vending machine.
The program will accept the cents amount and output the change in quarters,
dimes, nickels, and pennies.

1. The given cents value should be more than 0 and less than 100.
If the given cents is not in the range print "Invalid cents amount"
and there should be no other output after

In valid cases print the change in this format:
Your change is x quarters, x dimes, x nickels, and x pennies

Enter cents:
95
Your change is 3 quarters, 2 dimes, 0 nickels, and 0 pennies
 */