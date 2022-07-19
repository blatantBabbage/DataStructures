package com.datastructures.array.interviewquestions.exercises;

public class IsUniqueArray {
    public static boolean isUnique(int[] intArray) {
        for(int i=0; i<intArray.length; i++) {
            for(int j=i+1; j<intArray.length; j++) {
                if(intArray[i] == intArray[j]) {
                    System.out.println("Array is not unique");
                    return false;
                }
            }
        }
        System.out.println("Array is unique");
        return true;
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 6, 6, 7};
        isUnique(array);
    }
}
