package week07.task1;

public class Array_FindMinimum_Farhad {
    public static void main(String[] args) {

        int[] arr = {99, 12, 23, 32, 44, 57, 6};

        System.out.println("findMinimum(arr) = " + findMinimum(arr));

    }
//    Write a method that can find the minimum number from an int Array
//Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 6

    public static int findMinimum(int[] arr){

        int minNum = arr[0];

        for (int each : arr) {

            if(each<minNum){
                minNum = each;
            }

        }
        return minNum;
    }


}
