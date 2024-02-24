package week04.task2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SameLetters_Emir {

    public static void main(String[] args) {
        // Test cases
        System.out.println("Testing isSame:");
        System.out.println(isSame("abc", "cab"));  // Output: true
        System.out.println(isSame("abc", "abb"));  // Output: false

        System.out.println("\nTesting isSame2:");
        System.out.println(isSame2("abc", "cab"));  // Output: true
        System.out.println(isSame2("abc", "abb"));  // Output: false

        System.out.println("\nTesting isSame3:");
        System.out.println(isSame3("abc", "cab"));  // Output: true
        System.out.println(isSame3("abc", "abb"));  // Output: false
    }

    /**
     * Checks if a string is built out of the same letters as another string.
     *
     * @param str1 The first string.
     * @param str2 The second string.
     * @return True if both strings contain the same letters (ignoring order), false otherwise.
     */
    public static boolean isSame(String str1, String str2) {
        // If lengths are different, they can't contain the same letters
        if (str1.length() != str2.length()) {
            return false;
        }

        // Create maps to store character frequencies for each string
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        // Populate map1 with character frequencies from str1
        for (char c : str1.toCharArray()) {
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }

        // Populate map2 with character frequencies from str2
        for (char c : str2.toCharArray()) {
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }

        // Check if both maps contain the same characters with the same frequencies
        return map1.equals(map2);
    }

    /**
     * Checks if a string is built out of the same letters as another string.
     *
     * @param str1 The first string.
     * @param str2 The second string.
     * @return True if both strings contain the same letters (ignoring order), false otherwise.
     */
    public static boolean isSame2(String str1, String str2) {
        // If lengths are different, they can't contain the same letters
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert strings to character arrays and sort them
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare sorted arrays
        return Arrays.equals(charArray1, charArray2);
    }

    /**
     * Checks if a string is built out of the same letters as another string.
     *
     * @param str1 The first string.
     * @param str2 The second string.
     * @return True if both strings contain the same letters (ignoring order), false otherwise.
     */
    public static boolean isSame3(String str1, String str2) {
        // If lengths are different, they can't contain the same letters
        if (str1.length() != str2.length()) {
            return false;
        }

        // Iterate through each character of str1
        for (char c : str1.toCharArray()) {
            // Count occurrences of character in both strings
            int countStr1 = 0;
            int countStr2 = 0;

            // Count occurrences of character in str1
            for (char ch : str1.toCharArray()) {
                if (ch == c) {
                    countStr1++;
                }
            }

            // Count occurrences of character in str2
            for (char ch : str2.toCharArray()) {
                if (ch == c) {
                    countStr2++;
                }
            }

            // If counts don't match, strings are not built from same letters
            if (countStr1 != countStr2) {
                return false;
            }
        }
        // If all characters match in occurrence, return true
        return true;
    }

}
/*
Write a return method that checks if a string is built out of the same letters as another string.
  Ex: same("abc", "cab"); ==> true
      same("abc", "abb"); ==> false
 */