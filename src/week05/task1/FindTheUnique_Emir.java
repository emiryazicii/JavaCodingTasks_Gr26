package week05.task1;

/**
 * This class provides a method to display unique characters from a given string.
 */
public class FindTheUnique_Emir {

    public static void main(String[] args) {

        // Test the displayUniqueCharacters method
        String input = "AAABBBCCCDEF";
        String uniqueCharacters = displayUniqueCharacters(input);
        System.out.println("Original string: " + input);
        System.out.println("Unique characters: " + uniqueCharacters);
    }

    /**
     * Finds and displays the unique characters from the given string.
     *
     * @param str The input string from which unique characters are to be found.
     * @return A string containing the unique characters found in the input string.
     */
    public static String displayUniqueCharacters(String str) {
        // Initialize an empty string to store the unique characters
        String unique = "";

        // Loop through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            // Check if the character is unique by comparing its first and last occurrence indices
            if (str.indexOf(c) == str.lastIndexOf(c)) {
                // If the character is unique, append it to the 'unique' string
                unique += c;
            }
        }

        // Return the string containing unique characters
        return unique;
    }
}
/*
Write a return method that can find the unique characters from the String
 Ex: unique("AAABBBCCCDEF") ==> "DEF";
 */