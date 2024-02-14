package week03.task2;

public class ReverseNegativeNumber_Emir {

    public static void main(String[] args) {

        System.out.println(reverseNumber(-542));
        System.out.println(reverseNumber(-62));
        System.out.println(reverseNumber(-4589));
        //System.out.println(reverseNumber(241));
        //System.out.println(reverseNumber(0));

    }

    public static int reverseNumber(int number){

        //Checking is the given number is negative.
        if (number>=0){
            throw new IllegalArgumentException("Number must be negative.");
        }

        //If the number is negative, storing that negative (-)sign in variable sign.
        int sign = -1;

        //Storing the reversed version of the negative number.
        int reversed = 0;

        //Need to get absolute value of negative number.
        number = Math.abs(number);

        while (number > 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }

        //After reverse the negative number, not it's time put the (-)sign back
         return sign*reversed;
    }
}
/*
Write a return method that can reverse digits of a negative number and return it as int
input: -35  output: -53
 */