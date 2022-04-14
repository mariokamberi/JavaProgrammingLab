package arrays;

import java.util.Scanner;

public class Has55 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        boolean result = false;
        int num = nums[0];
        for (int i = 0; i < nums.length - 1; i++) {

            if (nums[i] == 5 && nums[i + 1] == 5)
                result = true;

        }
        System.out.println(result);


        input.close();
    }
}
/*
Given an array nums, print true if the array contains a 5 next to a 5 anywhere in the array.
If no consecutive 5s or no 5s are detected in your code then print false.

 */