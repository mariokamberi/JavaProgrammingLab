package arrays;

import java.util.Scanner;

public class _2DArrays_DiagonalDifference {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[][] matrix = new int[][]{ {scan.nextInt(), scan.nextInt(), scan.nextInt()},{scan.nextInt(), scan.nextInt(), scan.nextInt()},
                {scan.nextInt(), scan.nextInt(), scan.nextInt()}};
        int result1 = 0;
        int result2 = 0;

        for (int i = 0; i < matrix.length; i++) {
            result1 += matrix[i][i];
            result2 += matrix[i][matrix.length-i-1];
        }


        // FINAL PRINT
        System.out.println(Math.abs(result1-result2));
    }
}

/*
Given a square matrix,
calculate the absolute difference between the sums of its diagonals.

For example, the square matrix is shown below:

1 2 3
4 5 6
9 8 9

The left-to-right diagonal = 1+5+9 = 15.
The right to left diagonal = 3+5+9 = 17.
Their absolute difference is |15-17| = 2
 */