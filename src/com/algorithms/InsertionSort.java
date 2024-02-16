package com.algorithms;

public class InsertionSort {
    public static void insertionSort(int[] a){
        for(int i=1; i<a.length; i++) {
            int temp = a[i];
            int j = i;
            while(j>0 && a[j-1] > temp) {
                a[j] = a[j-1];
                j--;
            }
            a[j] = temp;
        }

    }

    public void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i<n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
