package week01.task2;

public class DivideWithoutDivisionOperator_Emir {

    public static void main(String[] args) {

        divideWithoutDivision(80, 9);
        divideWithoutDivision(40, 12);
        divideWithoutDivision(70, 21);
        divideWithoutDivision(3, 5);
        divideWithoutDivision(4, 2);
        //divideWithoutDivision(10,0);

        System.out.println("--------------------------------------------------");

        division(-23, 5);
        division(5, 6);
        division(30, -6);
        division(-25, -5);
        division(140, 21);
        division(45, -13);
        //division(14,0);

        System.out.println("-----------------------------------------------------");

        int result2 = division2(-30, -6);
        System.out.println("Result = " + result2);

        int result3 = division2(12, -6);
        System.out.println("Result = " + result3);

        int result4 = division2(45, 9);
        System.out.println("Result = " + result4);

        // int result1 = divideWithoutDivision2(300, 0);
        // System.out.println("Result = " + result1);

        int result6 = divideWithoutDivision2(15, 3);
        System.out.println("Result = " + result6);

        int result7 = divideWithoutDivision2(60, 12);
        System.out.println("Result = " + result7);

        int result8 = divideWithoutDivision2(20, 7);
        System.out.println("Result = " + result8);

        //int result5 = divideWithoutDivision2(15,0);
        //System.out.println("Result = " + result5);


    }

    /**
     * Performs division without using the division operator (/). Only works with positive integers.
     * Throws IllegalArgumentException if either a or b is negative.
     * Throws ArithmeticException if b is zero.
     *
     * @param a The dividend.
     * @param b The divisor.
     */
    public static void divideWithoutDivision(int a, int b) {
        // Check if a or b is negative
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("a or b can't be negative.");
        }
        // Check if the divisor is zero
        if (b == 0) {
            throw new ArithmeticException(a + " cannot be divided by " + b);
        } else {
            int count = 0; // Initialize a count variable to store the quotient
            // Subtract the divisor from the dividend until the dividend is less than the divisor
            while (a >= b) {
                count++; // Increment the count
                a -= b; // Subtract the divisor from the dividend
            }
            System.out.println("Result = " + count); // Print the quotient
        }
    }

    /**
     * Performs division allowing both positive and negative integers.
     * Throws ArithmeticException if b is zero.
     *
     * @param a The dividend.
     * @param b The divisor.
     */
    public static void division(int a, int b) {
        // Check if the divisor is zero
        if (b == 0) {
            throw new ArithmeticException(a + " cannot be divided by " + b);
        } else {
            // Determine the sign of the result
            int sign = (a < 0) ^ (b < 0) ? -1 : 1;
            a = Math.abs(a); // Take the absolute value of the dividend
            b = Math.abs(b); // Take the absolute value of the divisor
            int count = 0; // Initialize a count variable to store the quotient
            // Subtract the divisor from the absolute value of the dividend until it's less than the divisor
            while (a >= b) {
                count++; // Increment the count
                a -= b; // Subtract the divisor from the absolute value of the dividend
            }
            System.out.println("Result = " + (sign * count)); // Print the quotient with the correct sign
        }
    }

    /**
     * Performs division without using the division operator (/). Only works with positive integers.
     * Throws IllegalArgumentException if either a or b is negative.
     * Throws ArithmeticException if b is zero.
     *
     * @param a The dividend.
     * @param b The divisor.
     * @return The quotient.
     */
    public static int divideWithoutDivision2(int a, int b) {
        // Check if a or b is negative
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("a or b can't be negative.");
        }
        // Check if the divisor is zero
        if (b == 0) {
            throw new ArithmeticException(a + " cannot be divided by " + b);
        }
        int count = 0; // Initialize a count variable to store the quotient
        // Subtract the divisor from the dividend until the dividend is less than the divisor
        while (a >= b) {
            count++; // Increment the count
            a -= b; // Subtract the divisor from the dividend
        }
        return count; // Return the quotient
    }

    /**
     * Performs division allowing both positive and negative integers.
     * Throws ArithmeticException if b is zero.
     *
     * @param a The dividend.
     * @param b The divisor.
     * @return The quotient.
     */
    public static int division2(int a, int b) {
        // Check if the divisor is zero
        if (b == 0) {
            throw new ArithmeticException(a + " cannot be divided by " + b);
        }
        // Determine the sign of the result
        int sign = (a < 0) ^ (b < 0) ? -1 : 1;
        a = Math.abs(a); // Take the absolute value of the dividend
        b = Math.abs(b); // Take the absolute value of the divisor
        int count = 0; // Initialize a count variable to store the quotient
        // Subtract the divisor from the absolute value of the dividend until it's less than the divisor
        while (a >= b) {
            count++; // Increment the count
            a -= b; // Subtract the divisor from the absolute value of the dividend
        }
        return sign * count; // Return the quotient with the correct sign
    }

}

/*
Write a method that can divide two numbers without using division operator.
 */