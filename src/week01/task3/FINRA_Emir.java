package week01.task3;

public class FINRA_Emir {

    public static void main(String[] args) {

        displayFinra(30);
        displayFinra2(30);

    }

    /**
     * Displays numbers from 1 to n, replacing multiples of 3 with "FIN", multiples of 5 with "RA",
     * and multiples of both 3 and 5 with "FINRA".
     *
     * @param n The upper limit of numbers to display.
     */
    public static void displayFinra(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) { // Check if i is a multiple of both 3 and 5
                System.out.println("FINRA");
            } else if (i % 5 == 0) { // Check if i is a multiple of 5
                System.out.println("RA");
            } else if (i % 3 == 0) { // Check if i is a multiple of 3
                System.out.println("FIN");
            } else {
                System.out.println(i); // Print the number i if it's not a multiple of 3 or 5
            }
        }
    }

    /**
     * Displays numbers from 1 to n, replacing multiples of 3 with "FIN", multiples of 5 with "RA",
     * and multiples of both 3 and 5 with "FINRA".
     *
     * @param n The upper limit of numbers to display.
     */
    public static void displayFinra2(int n) {
        for (int i = 1; i <= n; i++) {
            String result = ""; // Initialize an empty string to store the result

            if (i % 3 == 0) { // Check if i is a multiple of 3
                result += "FIN";
            }
            if (i % 5 == 0) { // Check if i is a multiple of 5
                result += "RA";
            }
            if (result.isEmpty()) { // If the result string is empty, i is neither a multiple of 3 nor 5
                System.out.println(i); // Print the number i
            } else {
                System.out.println(result); // Print the result string
            }
        }
    }

}
/*
Write a method that prints out the numbers from 1 to 30 but;
for numbers which are multiple of 3 print "FIN" instead of the number,
for numbers which are multiple of 5, print "RA" instead of the number,
and for numbers which are multiple of both 3 and 5, print "FINRA" instead of the number.
 */