package week03.task1;

public class PrimeNumber_Abe {
        public static boolean isPrime(int number) {
            if (number <= 1) {
                return false; // Numbers less than or equal to 1 are not prime
            }
            // Iterate from 2 to the square root of the number
            for (int i = 2; i * i <= number; i++) {
                if (number % i == 0) {
                    return false; // If number is divisible by i, it's not prime
                }
            }
            return true; // If no divisors found, number is prime
        }

        public static void main(String[] args) {
            int num = 17;
            if (isPrime(num)) {
                System.out.println(num + " is a prime number");
            } else {
                System.out.println(num + " is not a prime number");
            }
        }
    }


