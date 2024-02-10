package com.datastructures.array.interviewquestions.exercises;

public class AltTwoSum {
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] + nums[j] == target) {
                        return new int[] { i, j };
                    }
                }
            }
            throw new IllegalArgumentException("No two sum solution found");
        }

    public static void main(String[] args) {
        twoSum((new int[]{15,7,11,4,2}), 13);
    }
}
