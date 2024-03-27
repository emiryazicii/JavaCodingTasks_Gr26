package week07.task1;

public class ArrayFindMinimum_Abe {
    public static int findMinimum(int[] arr) {
        // Check if the array is empty
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be empty");
        }

        // Initialize min with the first element of the array
        int min = arr[0];

        // Iterate through the array to find the minimum element
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }

    public static void main(String[] args) {
        int[] arr = {99, 12, 23, 32, 44, 57, 6};
        int min = findMinimum(arr);
        System.out.println("Minimum number: " + min);
    }
}
