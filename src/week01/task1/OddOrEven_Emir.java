package week01.task1;

public class OddOrEven_Emir {

    public static void main(String[] args) {

        identify(-4); // even
        identify(-3); // odd
        identify(2); // even
        identify(1); // odd
        identify(0); // even

        System.out.println("----------------------");

        System.out.println(oddOrEven(-5)); // odd
        System.out.println(oddOrEven(-6)); // even
        System.out.println(oddOrEven(7)); // odd
        System.out.println(oddOrEven(8)); // even
        System.out.println(oddOrEven(9)); // odd

    }

    /**
     * Prints whether the given number is odd or even.
     *
     * @param number The number to identify.
     */
    public static void identify(int number) {
        // Check if the number is even
        if (number % 2 == 0) {
            System.out.println("Even");
        } else { // If not even, it's odd
            System.out.println("Odd");
        }
    }

    /**
     * Determines whether the given number is odd or even and returns the result as a string.
     *
     * @param number The number to identify.
     * @return "Even" if the number is even, "Odd" if the number is odd.
     */
    public static String oddOrEven(int number) {
        // Check if the number is even
        if (number % 2 == 0) {
            return "Even"; // Return "Even" if the number is even
        } else {
            return "Odd"; // Return "Odd" if the number is odd
        }
    }

}
/*
Write a method that can identify a given number is even or odd.
EX:
       identify(5) --> "Odd"
       identify(6) --> "Even"
 */