package com.datastructures.array.interviewquestions.exercises;

import java.util.Scanner;

public class FindNumberInArray {
    private static int searchInArray(int[] intArray, int valueToSearch) {
        for(int i=0; i<intArray.length; i++) {
            if(intArray[i] == valueToSearch) {
                return i;
            }
        }
        throw new IllegalArgumentException("value not found in the given array");
    }
    public static void main(String[] args) {
        try {
            int[] intArray = {2, 3, 6, 9, 10};
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the value you're searching for : ");
            int valueToSearch = scanner.nextInt();
            System.out.println("Value is found at index : " + searchInArray(intArray, valueToSearch));
        }
        /* we're not throwing IllegalArgumentException again here as we're already throwing that inside method call
        here we're trying to catch any other exception that might occur apart from the IllegalArgumentException, for e.g.
        InputMismatchException if user provides string (for e.g. 'a') as input
         */
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
