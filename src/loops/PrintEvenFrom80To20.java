package loops;

public class PrintEvenFrom80To20 {
    public static void main(String[] args) {

        String even ="";
        int start = 80;
        int end = 20;
        for (int i = start; i >=end ; i--) {
            if (i%2==0){
                even+=i+" ";
            }
        }
        System.out.println(even.substring(0,even.length()-1));
    }
}
/*
Write a for loop that prints all even integers from 80 through and including 20.
Separate each number with a space
 */