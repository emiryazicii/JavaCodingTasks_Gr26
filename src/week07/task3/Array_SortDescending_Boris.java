package week07.task3;

import java.util.Arrays;

public class Array_SortDescending_Boris {

    public static void main(String[] args) {

        int[] numbers = {3,8,-11,6,23,18,35,-24,14,16};
        System.out.println("Arrays.toString(sortDescending(numbers)) = " + Arrays.toString(sortDescending(numbers)));

    }



    /**
     * This method will sort the given array in descending order (largest to smallest).
     * @param arr
     * @return int[]
     */
    public static int[] sortDescending(int... arr){

        for(int i = 0; i < arr.length; i++){

            for(int j = 0; j < arr.length - 1; j++){
                if(arr[j] < arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}
