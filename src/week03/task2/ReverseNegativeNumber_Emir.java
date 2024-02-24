package week03.task2;

public class ReverseNegativeNumber_Emir {

    public static void main(String[] args) {

        System.out.println(reverseNegativeNumber(-542));
        System.out.println(reverseNegativeNumber(-62));
        System.out.println(reverseNegativeNumber(-4589));
        System.out.println(reverseNegativeNumber(241));
        System.out.println(reverseNegativeNumber(0));

    }

    /**
     * Reverses a negative number.
     *
     * @param number The negative number to be reversed.
     * @return The reversed negative number.
     * @throws IllegalArgumentException If the input number is not negative.
     */
    public static int reverseNegativeNumber(int number) {
        // Checking if the given number is negative.
        if (number >= 0) {
            throw new IllegalArgumentException("Number must be negative.");
        }

        // Storing the reversed version of the negative number.
        int reversed = 0;

        while (number < 0) {
            int digit = number % 10; // Extract the last digit
            reversed = reversed * 10 + digit; // Append the digit to the reversed number
            number /= 10; // Move to the next digit by dividing the number by 10
        }

        return reversed; // Return the reversed negative number
    }

}
/*
Write a return method that can reverse digits of a negative number and return it as int
input: -35  output: -53
 */