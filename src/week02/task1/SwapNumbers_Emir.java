package week02.task1;

public class SwapNumbers_Emir {

    public static void main(String[] args) {

        swapNumbers(15,10);
        System.out.println("---------");
        swapNumbers(5,10);

    }

    /**
     * Swaps the values of two numbers without using a temporary variable.
     *
     * @param a The first number.
     * @param b The second number.
     */
    public static void swapNumbers(int a, int b) {
        // Step 1: Calculate the difference between a and b and assign it to a
        a = a - b; // Now a holds the difference between the original values of a and b

        // Step 2: Add the original value of b to a and assign it to b
        b = a + b; // b now holds the original value of a

        // Step 3: Subtract the new value of a (which is the original value of b) from b and assign it to a
        a = b - a; // a now holds the original value of b

        // Print the swapped values
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

}
/*
Swap two variable values without using a third variable
 */