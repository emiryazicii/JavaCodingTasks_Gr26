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