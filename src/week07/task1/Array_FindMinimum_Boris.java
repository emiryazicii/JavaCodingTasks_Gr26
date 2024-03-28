package week07.task1;

public class Array_FindMinimum_Boris {

    public static void main(String[] args) {

        int [] numbers = {1,10,-8,15,0,-6,28,4,-3,9};
        System.out.println("minNum(numbers) = " + minNum(numbers));
    }

    /**
     * This method will take array of integers, and return minimum number as a integer
     * @param arr
     * @return int , minimum integer number
     */
    public static int minNum(int[] arr){
        int min = arr[0];
        for(int each : arr){
            if(each < min){
                min = each;
            }
        }
        return min;
    }
}
