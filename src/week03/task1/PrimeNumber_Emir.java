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

    public static boolean isPrime(int number){

        // Prime numbers starts from 2.And there is no negative prime numbers.
        if(number<2){
            return false;
        }

        //Checking if the giving number divisible by any numbers other than itself and 1
        for (int i = 2; i < number/2 ; i++) {

            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
}
/*
Write a method that can check if a number is prime or not
 */