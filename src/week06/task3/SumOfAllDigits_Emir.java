package week06.task3;

public class SumOfAllDigits_Emir {

    // Main method to test the sumOfDigits function.
    public static void main(String[] args) {

        // Test the sumOfDigits method with different inputs
        String input1 = "12 java 5 apple 3";
        int sum1 = sumOfDigits(input1);
        System.out.println("Sum of digits in \"" + input1 + "\": " + sum1);

        String input2 = "Hello 123 World";
        int sum2 = sumOfDigits(input2);
        System.out.println("Sum of digits in \"" + input2 + "\": " + sum2);

        String input3 = "abc";
        int sum3 = sumOfDigits(input3);
        System.out.println("Sum of digits in \"" + input3 + "\": " + sum3);
    }

    /**
     * Returns the sum of the digits present in the input string.
     *
     * @param str The input string containing digits.
     * @return The sum of the digits present in the input string.
     */
    public static int sumOfDigits(String str) {
        // Initialize sum to 0
        int sum = 0;

        // Iterate through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // Check if the character is a digit
            if (Character.isDigit(ch)) {
                // Convert the character to its integer value and add it to the sum
                sum += Integer.parseInt(String.valueOf(ch));
            }
        }

        return sum;
    }
}
/*
Write a method that can return the sum of the digits in a String
Ex:  "12 java 5 apple 3"  ==>  20
 */