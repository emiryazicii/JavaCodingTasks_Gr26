package week06.task2;

import java.util.Arrays;

public class FindMaximum_Emir {

    //The main method to test the displayMaxNumber method.
    public static void main(String[] args) {
        // Test the displayMaxNumber method and print the result
        System.out.println("Max number is " + displayMaxNumber(new int[]{3, 5, 1,10, -1, 5}));
        System.out.println("Max number is " + findMaxAfterSorting(new int[]{3, 5, 1,10, -1, 5}));
        System.out.println("Max number is " + displayMaxNumber(new int[]{99, 12, 23, 32, 44, 57, 6}));
        System.out.println("Max number is " + findMaxAfterSorting(new int[]{99, 12, 23, 32, 44, 57, 6}));
    }

    /**
     * Finds and returns the maximum number in the array.
     * @param arr The integer array to find the maximum number from.
     * @return The maximum number found in the array.
     */
    public static int displayMaxNumber(int[] arr) {

        // Check if the input array is empty or null
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be empty or null");
        }

        // Assume the first element in the array as the maximum number
        int maxNumber = arr[0];

        // Iterate through each element in the array
        for (int each : arr) {
            // If the current element is greater than the current maxNumber, update maxNumber
            if(each > maxNumber){
                maxNumber = each;
            }
        }
        // Return the maximum number found
        return maxNumber;
    }

    /**
     * Finds the maximum number in an integer array after sorting.
     *
     * @param arr The input integer array.
     * @return The maximum number in the array.
     * @throws IllegalArgumentException if the input array is empty or null.
     */
    public static int findMaxAfterSorting(int[] arr) {

        // Check if the input array is empty or null
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be empty or null");
        }

        // Sort the array in ascending order
        Arrays.sort(arr);

        // The maximum number will be the last element after sorting
        return arr[arr.length - 1];
    }
}
/*
Write a method that can find the maximum number from an int Array
Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 99
 */