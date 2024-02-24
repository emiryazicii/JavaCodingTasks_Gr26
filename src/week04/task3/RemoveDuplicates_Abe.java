package week04.task3;
/*
Write a return method that can remove the duplicated values from the String
  Ex: removeDup("AAABBBCCC") ==> ABC
 */

public class RemoveDuplicates_Abe {
    public static String removeDuplicates(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            // Check if the character is not already present in the result string
            if (result.indexOf(String.valueOf(currentChar)) == -1) {
                // Append the character to the result string
                result.append(currentChar);
            }
        }

        return result.toString();

    }

    public static void main(String[] args) {
        // Test the method with the example input
        System.out.println(removeDuplicates("AAABBBCCC")); // Output: ABC
    }
}


