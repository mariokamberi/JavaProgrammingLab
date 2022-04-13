package statements;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Split:");
        String yesOrNo = scan.next().toLowerCase();

        System.out.println("Number of people:");
        int numOfPeople = scan.nextInt();

        String people = "&";
        people = people.repeat(numOfPeople);

        System.out.println("Check amount:");
        double amount = scan.nextDouble();

        System.out.println("Service Quality:");
        String service = scan.next().toLowerCase();

        double tipRate = (service.equals("excellent"))?0.25:(service.equals("great"))?0.2
                :(service.equals("good"))?0.15:(service.equals("fair"))?0.1:0.05;

        double totalTip = amount*tipRate;

        System.out.println("Number of people entered: "+people);
        System.out.println("Total to pay: "+ (amount+totalTip));
        System.out.println("Total tip: "+ totalTip);

        if (yesOrNo.equals("yes")){
            System.out.println("Total per person: "+(amount+totalTip)/numOfPeople);
            System.out.println("Tip per person: "+totalTip/numOfPeople);
        }

        scan.close();
    }
}

/*
Write a program for a tip calculator.
There will be different service quality benchmarks that will determine the tip given.
There will also the ability to calculate based on the number of people in the party
and if there is a split of the bill or not.

    Poor = 5% Fair = 10% Good = 15% Great = 20% Excellent = 25%

The program should display the following information based on the user input:

Split or No split (Yes or No)
Number of people entered: (number) (each person = & in output)
Check amount: (number) Service Quality: (String)
Total to pay: Total tip: Total per person: Tip per person:
Example

Input:
Yes
4
476.0
Excellent

Output:
Number of people entered: &&&&
Total to pay: 595.0
Total tip: 119.0
Total per person: 148.75
Tip per person: 29.75
 */