package week03.task1;

public class PrimeNumber_Farhad {
    public static void main(String[] args) {

        System.out.println(isPrime(7));
        System.out.println(isPrime(8));

    }


    public static boolean isPrime(int number){

        if(number<2){
            return false;
        }

        for (int i = 2; i < number ; i++) {
            if(number%i==0){
                return false;
            }

        }
        return true;
    }


}
