package week04.task1;

import java.util.Arrays;

/*
Write a return method that can find the frequency of characters
  Ex: frequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */
public class FrequencyOfChars_Abe {

    public static String frequencyOfChars(String chars) {
        // Convert the string to a char array for sorting
        char[] charArray = chars.toCharArray();

        // Sort the characters
        Arrays.sort(charArray);

        // Initialize variables
        StringBuilder result = new StringBuilder();
        char currentChar = charArray[0];
        int count = 0;

        // Iterate through the sorted characters and count occurrences
        for (int i = 1; i < charArray.length; i++) {
            if (charArray[i] == currentChar) {
                count++;
            } else {
                // Append the character and its count to the result string
                result.append(currentChar).append(count+1);

                // Reset count and update currentChar
                count = 0;
                currentChar = charArray[i];
            }
        }

        // Append the last character and its count to the result string
        result.append(currentChar).append(count);

        return result.toString();
    }


    public static void main(String[] args) {
        System.out.println(frequencyOfChars("AAABBCDD"));
    }
}
