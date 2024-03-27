package week07.task3;

import java.util.Arrays;

public class Array_SortDescending_Emir {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(sortDescending(new int[]{3, 4, 1, 3, 8, 6, -1, 5, 1, 2, 6})));
        System.out.println(Arrays.toString(sortDescending(new int[]{10, 20, 7, 8, 90})));
    }

    /**
     * Sorts the given array in descending order (largest to smallest).
     *
     * @param arr The integer array to sort.
     * @return The sorted array.
     */
    public static int[] sortDescending(int[] arr) {
        // Iterate through the array using nested loops for bubble sort
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                // If the current element is smaller than the next element, swap them
                if (arr[j] < arr[j + 1]) {
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
Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
Ex: int[] arr = {10,20,7, 8, 90};
arr = sortDescending(arr); ==> {90, 20, 10, 8, 7};
 */