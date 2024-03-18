package week07.task2;

import java.util.Arrays;

public class Array_SortAscending_Boris {

    public static void main(String[] args) {

        int [] numbers = {5,-2,64,51,-6,57,35,21,-8,19};
        System.out.println("Arrays.toString(sortAscending(numbers)) = " + Arrays.toString(sortAscending(numbers)));
    }



    /**
     * This method will sort the given array in ascending order (smallest to largest).
     * @param arr
     * @return int []
     */
    public static int[] sortAscending(int... arr){

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length - 1; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        return arr;
    }
}
