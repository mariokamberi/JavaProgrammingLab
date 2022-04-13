package statements;

import java.util.Scanner;

public class VideoGameCoupons {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter numbers of coupons:");

        int num = scan.nextInt();
        int candyBar = num/10;
        int gumball = num%10/3;

        if (num>=3) {
            System.out.println("Number of Candies: "
                    +candyBar+"\nNumber of Gumballs: "+gumball);

            } else {
                System.out.println("Not enough coupons");
            }


        }
    }


/*
The video games machines at your local arcade outputs coupons according to how well
you play the game.

You can redeem 10 coupons for a candy bar or you can redeem 3 for a gumball

Write a program that displays how many candy bars and gumballs you can get.
You prefer candy bars.

if your coupons are not enough for any redeem, display message:

"Not enough coupons"

Example:

Input:
Enter number of coupons:
13
​
Output: Number of Candies: 1
Output: Number of Gumballs: 1
Input:
Enter number of coupons:
13

Output: Number of Candies: 1
Output: Number of Gumballs: 1

Input:
Enter number of coupons:
23
​
Output: Number of Candies: 2
Output: Number of Gumballs: 1
Input:
Enter number of coupons:
23

Output: Number of Candies: 2
Output: Number of Gumballs: 1

Input:
Enter number of coupons:
2
​
Output: Not enough coupons
 */