package com.algorithms;

import java.util.ArrayList;
import java.util.Collections;

public class BucketSort {
    int[] arr;
    public BucketSort(int[] arr) {
        this.arr = arr;
    }

    public void printArray() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    // helper to print buckets
    public void printBucket(ArrayList<Integer>[] buckets) {
        for(int i=0; i<buckets.length; i++) {
            System.out.println("\nBucket#" + i + ":");
            for(int j=0; j<buckets[i].size(); j++) {
                System.out.print(buckets[i].get(j)+ " ");
            }
        }
    }

    // BucketSorting
    public void bucketSort() {
        // find number of buckets to be used for sorting
        int numberOfBuckets = (int) Math.ceil(Math.sqrt(arr.length));

        // find max value in the arr that will be used in bucket assignment formula for a given element
        int maxValue = Integer.MIN_VALUE;
        for(int value: arr) {
            if(value > maxValue) {
                maxValue = value;
            }
        }

        // initialize buckets
        ArrayList<Integer>[] buckets = new ArrayList[numberOfBuckets];
        for(int i=0; i<buckets.length; i++) {
            buckets[i] = new ArrayList<Integer>();
        }

       // put arr elements in bucket
       for(int value : arr) {
           int bucketnumber = (int) Math.ceil(((float)value*numberOfBuckets)/(float) maxValue);
           buckets[bucketnumber-1].add(value);
       }

        System.out.println("\n\nPrinting buckets before sorting...");
        printBucket(buckets);

        for(ArrayList<Integer> bucket : buckets) {
            Collections.sort(bucket);
        }

        System.out.println("\n\nPrinting buckets before sorting...");
        printBucket(buckets);

        int index=0;
        for(ArrayList<Integer> bucket : buckets) {
            for (int value : bucket) {
                arr[index] = value;
                index++;
            }
        }
    }
}
