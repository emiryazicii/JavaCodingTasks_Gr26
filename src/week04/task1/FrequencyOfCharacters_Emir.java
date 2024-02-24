package week04.task1;

import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharacters_Emir {

    public static void main(String[] args) {
        String inputString = "aabcccd";

        // Test frequencyOfChars1
        System.out.println("Using frequencyOfChars1:");
        String result1 = frequencyOfChars1(inputString);
        System.out.println("Character frequencies: " + result1);

        // Test frequencyOfChars2
        System.out.println("Using frequencyOfChars2:");
        String result2 = frequencyOfChars2(inputString);
        System.out.println("Character frequencies: " + result2);

        // Test frequencyOfChars3
        System.out.println("Using frequencyOfChars3:");
        String result3 = frequencyOfChars3(inputString);
        System.out.println("Character frequencies: " + result3);

        // Test frequencyOfChars4
        System.out.println("Using frequencyOfChars4:");
        String result4 = frequencyOfChars4(inputString);
        System.out.println("Character frequencies: " + result4);

        // Test frequencyOfChars5
        System.out.println("Using frequencyOfChars5:");
        String result5 = frequencyOfChars5(inputString);
        System.out.println("Character frequencies: " + result5);
    }

    /**
     * Calculates the frequency of each character in a given string.
     *
     * @param str The input string whose character frequencies are to be determined.
     * @return A string representing the character frequencies in the format "char1count1char2count2..."
     */
    public static String frequencyOfChars1(String str) {
        String temp = "";

        // Iterate through the string until it's empty
        while (!str.isEmpty()) {
            // Get the first character in the string
            char c = str.charAt(0);
            // Count the occurrences of the current character in the string
            int count = str.length() - str.replace("" + c, "").length();

            // Append the character and its frequency to the temporary string
            temp += "" + c + count;
            // Remove all occurrences of the current character from the string
            str = str.replace("" + c, "");
        }
        // Return the string containing character frequencies
        return temp;
    }

    /**
     * Calculates the frequency of each character in a given string.
     *
     * @param str The input string whose character frequencies are to be determined.
     * @return A string representing the character frequencies in the format "char1count1char2count2..."
     */
    public static String frequencyOfChars2(String str) {
        String temp = "";

        // Iterate through each character in the input string
        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);
            int count = 0;

            // Count the occurrences of the current character in the string
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ch) {
                    count++;
                }
            }

            // If the character is already in the temp string, skip
            if (temp.contains("" + ch)) {
                continue;
            }

            // Append the character and its frequency to the temporary string
            temp += ch + "" + count;
        }
        // Return the string containing character frequencies
        return temp;
    }

    /**
     * Calculates the frequency of each character in a given string.
     * Uses LinkedHashMap to maintain insertion order of characters.
     *
     * @param str The input string whose character frequencies are to be determined.
     * @return A string representing the character frequencies in the format "char1count1char2count2..."
     */
    public static String frequencyOfChars3(String str) {
        // Create a LinkedHashMap to store characters and their frequencies
        Map<Character, Integer> map = new LinkedHashMap<>();

        // Iterate through each character in the input string
        for (char eachChar : str.toCharArray()) {
            // If the character is not present in the map, add it with frequency 0
            if (!map.containsKey(eachChar)) {
                map.put(eachChar, 0);
            }
            // Increment the frequency of the character
            map.put(eachChar, map.get(eachChar) + 1);
        }
        // Return the string representation of character frequencies
        return map.toString();
    }

    /**
     * Calculates the frequency of each character in a given string.
     * Uses LinkedHashMap to maintain insertion order of characters.
     *
     * @param str The input string whose character frequencies are to be determined.
     * @return A string representing the character frequencies in the format "char1count1char2count2..."
     */
    public static String frequencyOfChars4(String str) {
        // Create a LinkedHashMap to store characters and their frequencies
        Map<Character, Integer> charFrequency = new LinkedHashMap<>();

        // Iterate through each character in the input string
        for (char eachChar : str.toCharArray()) {
            // Increment the frequency of the character
            charFrequency.put(eachChar, charFrequency.getOrDefault(eachChar, 0) + 1);
        }
        // Return the string representation of character frequencies
        return charFrequency.toString();
    }

    /**
     * Calculates the frequency of each character in a given string.
     * Uses LinkedHashMap to maintain insertion order of characters.
     *
     * @param str The input string whose character frequencies are to be determined.
     * @return A string representing the character frequencies in the format "char1count1char2count2..."
     */
    public static String frequencyOfChars5(String str) {
        // Create a LinkedHashMap to store characters and their frequencies
        Map<Character, Integer> map = new LinkedHashMap<>();

        // Iterate through each character in the input string
        for (int i = 0; i < str.length(); i++) {
            char eachChar = str.charAt(i);

            // If the character is not present in the map, add it with frequency 0
            if (!map.containsKey(eachChar)) {
                map.put(eachChar, 0);
            }
            // Increment the frequency of the character
            map.put(eachChar, map.get(eachChar) + 1);
        }
        // Return the string representation of character frequencies
        return map.toString();
    }
}


/*
Write a return method that can find the frequency of characters
  Ex: frequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */