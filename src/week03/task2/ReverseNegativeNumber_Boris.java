package week03.task2;

public class ReverseNegativeNumber_Boris {

    public static void main(String[] args) {

        System.out.println(reverseNegativeNumber(-53));
    }


    public static int reverseNegativeNumber(int a){

        a = a * (-1);
        int reversed = 0;

     while (a > 0){
         int lastDigit = a % 10;
         reversed = reversed * 10 + lastDigit;
         a /= 10;
     }
        return reversed * (-1);
    }
}
/*
Write a return method that can reverse digits of a negative number and return it as int
input: -35  output: -53
 */