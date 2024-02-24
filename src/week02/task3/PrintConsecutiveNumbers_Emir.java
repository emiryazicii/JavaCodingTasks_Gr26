package week02.task3;

public class PrintConsecutiveNumbers_Emir {

    public static void main(String[] args) {

        displayConsecutiveNumbers(17);
    }

    /**
     * Prints numbers from 1 to n, replacing certain numbers with strings based on divisibility.
     *
     * @param n The upper limit of the range.
     */
    public static void displayConsecutiveNumbers(int n) {
        for (int i = 1; i <= n; i++) {
            String result = ""; // Initialize an empty string to store the result for the current number

            // Check if the number is divisible by 2
            if (i % 2 == 0) {
                result = "Codility"; // Replace the result with "Codility" if divisible by 2
            }

            // Check if the number is divisible by 3
            if (i % 3 == 0) {
                result = "Test"; // Replace the result with "Test" if divisible by 3
            }

            // Check if the number is divisible by 5
            if (i % 5 == 0) {
                result += "Coders"; // Append "Coders" to the result if divisible by 5
            }

            // If the result is still empty, print the number; otherwise, print the result
            if (result.isEmpty()) {
                System.out.println(i);
            } else {
                System.out.println(result);
            }
        }
    }

}
/*
Write a function that, given a positive integer N, prints the consecutive numbers from 1 to N, each on a separate line. However, any number divisible by 2, 3 or 5 should be replaced by the word Codility, Test or Coders respectively. If a number is divisible by more than one of the numbers: 2,3 or 5, it should be replaced by a concatenation of the respective words Codility, Test and Coders in this given order. For example, numbers divisible by both 2 and 3 should be replaced by CodilityTest and numbers divisible by all three numbers: 2,3 and 5, should be replaced by CodilityTestCoders.

For example, here is the output for N = 17:
1
Codility
Test
Codility
Coders
CodilityTest
7
Codility
Test
CodilityCoders
11
CodilityTest
13
Codility
TestCoders
Codility
 */