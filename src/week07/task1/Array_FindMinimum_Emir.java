package week07.task1;

public class Array_FindMinimum_Emir {

    public static void main(String[] args) {

        System.out.println("Min number is :" + displayMinNumber(new int[]{3, -4, 1, 5, -1, -20}));
        System.out.println("Min number is :" + displayMinNumber(new int[]{99, 12, 23, 32, 44, 57, 6}));
    }

    /**
     * Finds and returns the minimum number in the array.
     *
     * @param arr The integer array to find the minimum number from.
     * @return The minimum number found in the array.
     */
    public static int displayMinNumber(int[] arr) {
        // Assume the first element in the array as the minimum number
        int minNumber = arr[0];

        // Iterate through each element in the array
        for (int each : arr) {
            // If the current element is smaller than the current minNumber, update minNumber
            if (each < minNumber) {
                minNumber = each;
            }
        }
        // Return the minimum number found
        return minNumber;
    }
}
/*
Write a method that can find the minimum number from an int Array
Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 6
 */