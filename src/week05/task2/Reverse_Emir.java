package week05.task2;

/**
 * This class provides a method to reverse a given string.
 */
public class Reverse_Emir {

    public static void main(String[] args) {

        // Test the reverse method
        String original = "Hello";
        String reversed = reverse(original);
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);

        // Reversing using StringBuffer
        String reversedBuffer = reverseWithBuffer(original);
        // Print the reversed string obtained using StringBuffer
        System.out.println("Reversed with StringBuffer: " + reversedBuffer);

        // Reversing using StringBuilder
        String reversedBuilder = reverseWithBuilder(original);
        // Print the reversed string obtained using StringBuilder
        System.out.println("Reversed with StringBuilder: " + reversedBuilder);
    }

    /**
     * Reverses a string using StringBuffer.
     * @param input The string to be reversed.
     * @return The reversed string.
     */
    public static String reverseWithBuffer(String input) {
        // Create a StringBuffer object with the input string
        StringBuffer stringBuffer = new StringBuffer(input);
        // Reverse the StringBuffer and convert it to a string
        return stringBuffer.reverse().toString();
    }

    /**
     * Reverses a string using StringBuilder.
     * @param input The string to be reversed.
     * @return The reversed string.
     */
    public static String reverseWithBuilder(String input) {
        // Create a StringBuilder object with the input string
        StringBuilder stringBuilder = new StringBuilder(input);
        // Reverse the StringBuilder and convert it to a string
        return stringBuilder.reverse().toString();
    }

    /**
     * Reverses the characters in the given string.
     *
     * @param str The input string to be reversed.
     * @return A string containing the characters of the input string in reverse order.
     */
    public static String reverse(String str) {
        // Initialize an empty string to store the reversed characters
        String reverse = "";

        // Traverse the input string in reverse order and append each character to the 'reverse' string
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        // Return the reversed string
        return reverse;
    }
}
/*
Write a function that can reverse a String
 Ex: Reverse("ABCD"); ==> DCBA
 */