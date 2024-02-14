package week03.task2;

public class ReverseNegativeNumber_Emir {

    public static void main(String[] args) {

        System.out.println(reverseNegativeNumber(-542));
        System.out.println(reverseNegativeNumber(-62));
        System.out.println(reverseNegativeNumber(-4589));
        System.out.println(reverseNegativeNumber(241));
        System.out.println(reverseNegativeNumber(0));

    }

    public static int reverseNegativeNumber(int number){

        //Checking is the given number is negative.
        if (number>=0){
            throw new IllegalArgumentException("Number must be negative.");
        }

        //Storing the reversed version of the negative number.
        int reversed = 0;

        while (number < 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }

        //After reverse the negative number, not it's time put the (-)sign back
         return reversed;
    }
}
/*
Write a return method that can reverse digits of a negative number and return it as int
input: -35  output: -53
 */