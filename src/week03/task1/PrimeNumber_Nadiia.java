package week03.task1;

public class PrimeNumber_Nadiia {
    public static void main(String[] args) {

        System.out.println(primeNumber(71));
    }
    public static String primeNumber(int n) {

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return n + " is not prime";
            }
        }
        return n + " is prime";


    }
}
