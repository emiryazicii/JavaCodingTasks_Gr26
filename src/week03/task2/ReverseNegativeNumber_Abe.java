package week03.task2;

/*
2️⃣ Numbers -- Reverse Negative Number
Write a return method that can reverse digits of a negative number and return it as int
input: -35  output: -53
 */

public class ReverseNegativeNumber_Abe {
    public static int reverseNegative(int number) {
        // Convert the number to a string
        String numberStr = Integer.toString(number);

        // Remove the negative sign if it exists
        boolean isNegative = false;
        if (number < 0) {
            isNegative = true;
            numberStr = numberStr.substring(1);
        }

        // Reverse the digits by reversing the string
        StringBuilder reversedStr = new StringBuilder(numberStr).reverse();

        // Add back the negative sign if the original number was negative
        if (isNegative) {
            reversedStr.insert(0, '-');
        }

        // Convert the reversed string back to an integer
        return Integer.parseInt(reversedStr.toString());
    }

    public static void main(String[] args) {
        int input = -35;
        int reversed = reverseNegative(input);
        System.out.println("Input: " + input + ", Reversed: " + reversed);
    }
}
