package week03.task1;

public class PrimeNumber_Emir {

    public static void main(String[] args) {

        System.out.println(isPrime(-23));
        System.out.println(isPrime(0));
        System.out.println(isPrime(1));
        System.out.println(isPrime(50));
        System.out.println(isPrime(23));
        System.out.println(isPrime(7));
        System.out.println(isPrime(2));
    }

    /**
     * Checks if a number is a prime number.
     *
     * @param number The number to be checked.
     * @return True if the number is prime, false otherwise.
     */
    public static boolean isPrime(int number) {
        // Prime numbers start from 2, and there is no negative prime number.
        if (number < 2) {
            return false;
        }

        // Checking if the given number is divisible by any numbers other than itself and 1.
        // We only need to check up to the square root of the number for efficiency.
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // If the number is divisible by any other number, it's not prime
            }
        }
        return true; // If no divisors other than 1 and the number itself, it's prime
    }

}
/*
Write a method that can check if a number is prime or not
 */