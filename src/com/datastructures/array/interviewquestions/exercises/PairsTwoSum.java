package com.datastructures.array.interviewquestions.exercises;

import java.util.Arrays;

public class PairsTwoSum {
    private static int[] twoSum(int[] nums, int target) {
        // Size is 2 since we know it's a two sum problem
        int[] pairs = new int[2];
        for(int i=0; i<nums.length; i++) {
            // let's suppose 1st num in the pair of two sum is 'x'
            int x = nums[i];
            /* here 'n' can also start from 'i+1' as we'd have already looped through values smaller than i, but 'n = 0'
            will be helpful in case if we want to do circular checks i.e. for below given array solution can be both
            [0,2] and [2, 0], in our implementation we are making sure we don't do that by returning values of pairs asap
            we find them. This makes our solution less efficient as out time complexity is O(n^2) and if we use 'j=i+1'
            then it'll be O(m*n)
             */
            for(int n=0; n<nums.length; n++) {
                if(x == nums[n]) {
                    continue;
                }
                if((x + nums[n]) == target) {
                    pairs[0] = i;
                    pairs[1] = n;
                    return pairs;
                }
            }
        }
        throw new IllegalArgumentException("No solution is found");
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 4};
        // print pairs forming two sum
        System.out.println(Arrays.toString(twoSum(nums, 7)));
    }
}
