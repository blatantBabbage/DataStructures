package com.datastructures.array.interviewquestions.exercises;

import java.util.Arrays;

public class DuplicateNumber {
    public static int[] removeDuplicates(int[] array) {

        int n = array.length;
        int[] uniqueArray = new int[n];
        int index = 0;

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int j = i + 1; j < n; j++) {
                if (array[i] == array[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                uniqueArray[index++] = array[i];
            }
        }
        return Arrays.copyOf(uniqueArray, index);
    }

    public static void main(String[] args) {
        removeDuplicates(new int[]{1, 1, 2, 2, 3, 4, 5});
    }
}
