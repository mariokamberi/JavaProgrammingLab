package statements;

import java.util.Scanner;

public class ApartmentLeasing1 {
    public static void main(String[] args) {

        //DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
        // Variables are already declared and given
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Cybertek Apartments!");
        System.out.println("Number of bedrooms you are interested:");

        int numberOfBedrooms = scan.nextInt();
        int startingPrice = 0;

        //WRITE YOUR CODE HERE:

        if (numberOfBedrooms == 1){
            System.out.println("One Bedroom Selected\n" +
                    "Starting Price: 1100");
        }else if (numberOfBedrooms == 2){
            System.out.println("Two Bedroom Selected\n" +
                    "Starting Price: 1850");
        }else if (numberOfBedrooms == 3){
            System.out.println("Three Bedroom Selected\n" +
                    "Starting Price: 2550");
        }else if (numberOfBedrooms>=4){
            System.out.println("No such Bedrooms available");
        }else {
            System.out.println("No such Bedrooms available");
        }

    }
}

/*
Write program for Leasing office.

numberOfBedrooms variable already declared and assigned value using Scanner:

startingPrice is set to 0.

    prices 1 bedroom - 1100 2 bedroom - 1850 3 bedroom - 2550

Example Flow:

Welcome to Cybertek Apartments!
Number of bedrooms you are interested:
1
One Bedroom Selected
Starting Price: 1100
Welcome to Cybertek Apartments!
Number of bedrooms you are interested:
1
One Bedroom Selected
Starting Price: 1100

Welcome to Cybertek Apartments!
Number of bedrooms you are interested:
3
Three Bedroom Selected
Starting Price: 2550
Welcome to Cybertek Apartments!
Number of bedrooms you are interested:
3
Three Bedroom Selected
Starting Price: 2550

Welcome to Cybertek Apartments!
Number of bedrooms you are interested:
5
No such Bedrooms available
Welcome to Cybertek Apartments!
Number of bedrooms you are interested:
5
No such Bedrooms available

Note: If an invalid bedroom number is given no price is displayed
 */