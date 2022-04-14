package arrays;

import java.util.Scanner;

public class Find_Non_Duplicate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        //TODO: write your code below
        int nonDuplicate=0;

        for(int i=0;i<nums.length;i++) {
            nonDuplicate=0;

            for(int j=0;j<nums.length;j++) {
                if(i!=j && nums[i]==nums[j])
                {
                    nonDuplicate++;
                }
            }

            if(nonDuplicate==0) {
                System.out.println(nums[i]);
                break;
            }

        }


        input.close();
    }
}
/*
Given an array nums with 7 integers every element is repeated twice - except one.
Find that element and print it to console.

Example:
nums -> [1, 1, 2, 3, 4, 3, 4] -> 2

 */