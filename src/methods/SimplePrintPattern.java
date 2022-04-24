package methods;

public class SimplePrintPattern {
    public static void printHollowRect(){
        // write your codes here


        int n=5, m=5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (i == 1 || i == n ||
                        j == 1 || j == m)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
            }
        }





    public static void main(String[] args) {
        printHollowRect();
    }
}
/*
Create a method printHollowRect that prints a 5 by 5 hollow rectangle:

*****
*   *
*   *
*   *
*****

hint: you will need to use two nested for loops,
and check if its the last or first iteration of the loop
(so you will know whet to print "*" or " ")
 */