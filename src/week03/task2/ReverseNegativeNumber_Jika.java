package week03.task2;

public class ReverseNegativeNumber_Jika {
    public static void main(String[] args) {

        System.out.println(reverseNegativeNumber(-150));    // 51
        System.out.println(reverseNegativeNumber(-45));     // 54
        System.out.println(reverseNegativeNumber(0));
    }
/*
Write a return method that can reverse digits of a negative number and return it as int
input: -35  output: -53
 */
    public static int reverseNegativeNumber(int number) {

        if (number >= 0) {
            System.out.println("Number should be negative!");
        }

        // Temporary value to store the reversed version of the number

        int reversed = 0;

        while (number < 0) {
            int lastDigit = number % 10;            // Get the last digit
            reversed = reversed * 10 + lastDigit;   // Add to the reversed
            number /= 10;     // Move to the next digit by dividing the number by 10
        }
        return reversed;                            // Return reversed number

    }
    }

//TODO
