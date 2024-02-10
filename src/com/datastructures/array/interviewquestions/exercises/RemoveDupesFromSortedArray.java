package com.datastructures.array.interviewquestions.exercises;

import java.util.Arrays;

public class RemoveDupesFromSortedArray {
    // Given a sorted array nums, remove the duplicates in-place such that each element appears only once and
    // returns the new length.
    // Do not allocate extra space for another array;
    // you must do this by modifying the input array in-place with O(1) extra memory.
    //    Example:
    //        Input: nums = [1, 1, 2]
    //        Output: 2

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0; // Edge case: empty array

        int index = 1; // Pointer to position where non-duplicate elements should be placed

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[index++] = nums[i]; // Place non-duplicate element at the next available position
            }
        }
        System.out.println(Arrays.toString(nums));

        return index; // Length of the array after removing duplicates
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3, 4, 4, 5, 5};
        int newLength = removeDuplicates(nums);
        System.out.println("New length: " + newLength);
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
