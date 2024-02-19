package week04.task2;

import java.util.Arrays;

/*
Write a return method that checks if a string is built out of the same letters as another string.
  Ex: same("abc", "cab"); ==> true
      same("abc", "abb"); ==> false
 */
public class SameLetter_Abe {
    public static boolean same(String str1, String str2) {
        // Check if the lengths of both strings are different
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert strings to character arrays and sort them
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare sorted character arrays
        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        // Test the method with different input strings
        System.out.println(same("abc", "cab")); // true
        System.out.println(same("abc", "abb")); // false
    }
}
