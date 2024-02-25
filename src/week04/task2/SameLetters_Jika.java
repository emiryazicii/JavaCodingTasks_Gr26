package week04.task2;

import java.util.Arrays;

public class SameLetters_Jika {
    /*
Write a return method that checks if a string is built out of the same letters as another string.
  Ex: same("abc", "cab"); ==> true
      same("abc", "abb"); ==> false
 */
    public static void main(String[] args) {

        String str1 = "abc";
        String str2 = "cab";

        // Converting strings to character arrays and sorting them
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Comparing sorted arrays
        if(Arrays.equals(arr1,arr2)){
            System.out.println("True");
        }else {
            System.out.println("False");
        }


    }

}
