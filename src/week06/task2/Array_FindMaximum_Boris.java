package week06.task2;

public class Array_FindMaximum_Boris {

    public static void main(String[] args) {
        int [] arr = {3, 5, 1, 10, -1, 5};
        System.out.println(maxNum(arr));
    }

    /**
     * This method compare numbers in an array and returns maximum int nummber
     * @param  arr
     * @return int
     */

    public static int maxNum(int[] arr){
        int max = arr[0];

        for(int each : arr){
            if(each > max){
                max = each;
            }
        }
        return max;
    }
}
