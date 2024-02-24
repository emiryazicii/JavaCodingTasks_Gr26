package week02.task2;

public class DivisibleBy3_5_15_Emir {

    public static void main(String[] args) {

        divisibleBy3_5_15(100);
    }

    /**
     * Prints numbers divisible by 3, 5, and 15 separately up to a given number.
     *
     * @param n The upper limit of the range.
     */
    public static void divisibleBy3_5_15(int n) {
        // Initialize strings to store numbers divisible by 15, 5, and 3
        String divisibleBy15 = "", divisibleBy5 = "", divisibleBy3 = "";

        // Iterate through numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            // Check if the number is divisible by 15
            if (i % 15 == 0) {
                divisibleBy15 += i + " "; // Append the number to the divisibleBy15 string
            } else if (i % 5 == 0) { // Check if the number is divisible by 5
                divisibleBy5 += i + " "; // Append the number to the divisibleBy5 string
            } else if (i % 3 == 0) { // Check if the number is divisible by 3
                divisibleBy3 += i + " "; // Append the number to the divisibleBy3 string
            }
        }

        // Print the numbers divisible by 15, 5, and 3
        System.out.println("Numbers divisible by 15: " + divisibleBy15.trim());
        System.out.println("Numbers divisible by 5: " + divisibleBy5.trim());
        System.out.println("Numbers divisible by 3: " + divisibleBy3.trim());
    }

}
/*
Write a program that can print the numbers between 1 ~ 100 that can be divisible by 3, 5, and 15.
-if the number can be divisible by 3, 5 and 15, then it should only be displayed in DivisibelBy15 section
-if the number can be divisible by 3 but cannot be divisible by 15, then it should only be displayed in DivisibelBy3 section
-if the number can be divisible by 5 but cannot be divisible by 15, then it should only be displayed in DivisibelBy5 section
ex:
OutPut:
Divisible By 15 15 30 45 60 75 90
Divisible By 5 5 10 20 25 35 40 50 55 65 70 80 85 95 100
Divisible By 3 3 6 9 12 18 21 24 27 33 36 39 42 48 51 54 57 63 66 69 72 78 81 84 87 93 96 99
 */