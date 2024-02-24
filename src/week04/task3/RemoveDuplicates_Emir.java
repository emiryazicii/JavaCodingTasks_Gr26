package week04.task3;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates_Emir {

    public static void main(String[] args) {
        // Test the removeDuplicates methods
        String str = "aabbbcccc";
        System.out.println("Original string: " + str);
        System.out.println("After removing duplicates using method 1: " + removeDuplicates(str)); // Output: abc
        System.out.println("After removing duplicates using method 2: " + removeDuplicates2(str)); // Output: abc
        System.out.println("After removing duplicates using method 3: " + removeDuplicates3(str)); // Output: abc
    }

    /**
     * Removes duplicated characters from a string.
     *
     * @param str The input string.
     * @return A string without duplicated characters.
     */
    public static String removeDuplicates(String str) {
        String result = ""; // Initialize an empty string to store the result

        for (int i = 0; i < str.length(); i++) { // Loop through each character of the input string
            char currentChar = str.charAt(i); // Get the current character

            // Check if the current character is not already present in the result string
            if (!result.contains(""+currentChar)) {
                result += currentChar; // If not present, add it to the result string
            }
        }

        return result; // Return the result string without duplicated characters
    }

    /**
     * Removes duplicated characters from a string.
     *
     * @param str The input string.
     * @return A string without duplicated characters.
     */
    public static String removeDuplicates2(String str) {
        String result = ""; // Initialize an empty string to store the result

        for (int i = 0; i < str.length(); i++) { // Loop through each character of the input string
            char currentChar = str.charAt(i); // Get the current character

            // Check if the current character is present in the result string
            if (result.contains(""+currentChar)) {
                continue; // If present, skip the iteration
            }
            result += str.charAt(i);// If not present, add it to the result string
        }

        return result; // Return the result string without duplicated characters
    }

    /**
     * Removes duplicated characters from a string using a HashSet.
     *
     * @param str The input string.
     * @return A string without duplicated characters.
     */
    public static String removeDuplicates3(String str) {
        Set<Character> uniqueChars = new HashSet<>(); // Create a HashSet to store unique characters
        StringBuilder result = new StringBuilder(); // Initialize a StringBuilder to store the result

        for (int i = 0; i < str.length(); i++) { // Loop through each character of the input string
            char currentChar = str.charAt(i); // Get the current character

            // If the character is not already in the set, add it to the set and append it to the result
            if (uniqueChars.add(currentChar)) {
                result.append(currentChar);
            }
        }

        return result.toString(); // Return the result string without duplicated characters
    }
}
/*
Write a return method that can remove the duplicated values from the String
  Ex: removeDup("AAABBBCCC") ==> ABC
 */