package methods;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        plus();
    }

    public static void plus(){

        //your code here

        Scanner inp = new Scanner(System.in);
        System.out.println("enter first number:");
        int num1 = inp.nextInt();
        System.out.println("enter second number:");
        int num2 = inp.nextInt();
        System.out.println("result: "+ (num1+num2));




    }
}
