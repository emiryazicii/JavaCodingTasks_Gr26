package week07.task2;

import java.util.Arrays;

public class Array_SortAscending_Emir {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(sortAscending(new int[]{3, 4, 1, 3, 8, 6, -1, 5, 1, 2, 6})));
        System.out.println(Arrays.toString(sortAscending(new int[]{10, 9, 8, 7})));
    }

    /**
     * Sorts the given array in ascending order (smallest to largest).
     * @param arr The integer array to sort.
     * @return The sorted array.
     */
    public static int[] sortAscending(int[] arr) {
        // Iterate through the array using nested loops for bubble sort
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                // If the current element is greater than the next element, swap them
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        // Return the sorted array
        return arr;
    }
}
/*
Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
Ex: int[] arr = {10, 9, 8, 7};
arr = sortAscending(arr); ==>{ 7, 8, 9, 10};
 */