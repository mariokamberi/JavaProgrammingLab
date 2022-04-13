package Arrays;

import java.util.Scanner;

public class _2DArrayLargestNumber {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int rows = inp.nextInt(), cols = inp.nextInt();
        int[][] arr = new int[rows][cols];
        for(int i=0 ;i<=rows-1;i++)
        {
            for(int j=0 ;j<=cols-1;j++)
            {
                arr[i][j]=inp.nextInt();
            }//end for cols
        }//end for rows

        //TODO write your code below
        int bigNumber = 0;
        for (int[] eachArray : arr) {
            for (int element : eachArray) {
                if(element > bigNumber){
                    bigNumber = element;
                }
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = bigNumber;
            }
        }






        inp.close();
    }
}
/*
Given a 2d array of ints, find the biggest number(int) in the array and print it.
 */