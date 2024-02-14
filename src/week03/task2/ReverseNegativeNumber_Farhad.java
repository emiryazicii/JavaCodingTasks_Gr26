package week03.task2;

public class ReverseNegativeNumber_Farhad {

    public static void main(String[] args) {

        System.out.println(reverseNegativeNumber(-1234));
        System.out.println(reverseNegativeNumber(-54321));
    }

    public static int reverseNegativeNumber(int number){ // 1

        int rev = 0; // 4321

        while(number < 0){
            int lastDigit = number % 10;
            rev = rev * 10 + lastDigit;
            number /= 10;
        }
        return rev;
    }
}
