package week06.task2;

import java.util.Arrays;

public class ArrayFindMax_Farhad {

    public static void main(String[] args) {

        int[] arr = {99, 12, 23, 32, 44, 57, 6};

     System.out.println("maxNum(arr) = " + maxNum(arr));


//        Arrays.sort(arr);
//        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
//
//        int maxNumArray = arr[arr.length-1];
//        System.out.println("maxNumArray = " + maxNumArray);

    }
    /*
    Write a method that can find the maximum number from an int Array
Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 99
     */

    public static int maxNum(int[] arr){

        int maxNum = arr[0];

        for (int each : arr) {
            if(each>maxNum){
                  maxNum = each;
            }

        }

        return maxNum;

    }




}
