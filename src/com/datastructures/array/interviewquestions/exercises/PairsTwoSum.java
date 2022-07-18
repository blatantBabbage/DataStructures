package com.datastructures.array.interviewquestions.exercises;

import java.util.Arrays;

public class PairsTwoSum {
    private static int[] twoSum(int[] nums, int target) {
        int[] pairs = new int[2];
        for(int i=0; i<nums.length; i++) {
            // let's suppose 1st num in the pair of two sum is 'x'
            int x = nums[i];
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
        // when the pair is not found for two sum
        return null;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 4};
        // print pairs forming two sum
        System.out.println(Arrays.toString(twoSum(nums, 7)));
    }
}
