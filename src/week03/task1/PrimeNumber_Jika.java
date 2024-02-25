package week03.task1;

public class PrimeNumber_Jika {
    public static void main(String[] args) {

        System.out.println(isPrime(17));
        System.out.println(isPrime(0));

    }
    public static boolean isPrime(int number){

        if (number < 2){
            return false;
        }
        for (int i = 2; i < number; i++) {
            if(number % i == 0){
                return false;
            }

        }
        return true;
    }
}
