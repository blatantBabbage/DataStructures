package com.datastructures.array.interviewquestions.exercises;

public class MissingNumberInArray {
    // This is an alternative approach to already done exercise

    // Question: Write Java function called findMissingNumberInArray that takes an integer array containing
    // n-1 unique elements from a range of 1 to n, with one missing number, and returns the missing number.
    public static int findMissingNumberInArray(int[] arr) {
        // total numbers in Array
        // We are adding +1 as one of the element is expected to be missing and we need total sum if it was present
        // hence, we need to count the missing number as well when getting total numbers so that sum can be calculated
        int n = arr.length+1;
        int mathematicalSumOfNelements = (n*(n+1))/2;
        int sumOfArray = 0;
        for (int number : arr) {
            sumOfArray += number;
        }
        int missingNumber = mathematicalSumOfNelements - sumOfArray;
        System.out.println("The missing number is " + missingNumber);
        return missingNumber;
    }

    public static void main(String[] args) {
        int[] myArray = {1,2,3,4,6};
        findMissingNumberInArray(myArray);

    }
}
