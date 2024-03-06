package week06.task2;

public class ArrayFindMax_Jika {
    /*
    Write a method that can find the maximum number from an int Array
Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 99
     */
    public static void main(String[] args) {

        int[] array = {100, 20, 500, 40, -10, 30};

        int max = array[0];                // assume that 1st element is the max number

        for (int i = 1; i < array.length; i++) {   // i: 1, 2, 3, 4, 5
            if (array[i] > max) {          // compares the element of the array with current max num
                max = array[i];            // replace the current max number 100  => 500 max
            }
        }

        System.out.println("max = " + max);  // 500

    }

}
