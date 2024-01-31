package week01.task2;

public class DivideWithoutDivisionOperator_Emir {

    public static void main(String[] args) {

        try {

            divideWithoutDivision(80,9);
            divideWithoutDivision(40,12);
            divideWithoutDivision(70,21);
            divideWithoutDivision(3,5);
            divideWithoutDivision(4,2);
            //divideWithoutDivision(10,0);

            System.out.println("--------------------------------------------------");

            division(-23,5);
            division(5,6);
            division(30,-6);
            division(-25,-5);
            division(140,21);
            division(45,-13);
            //division(14,0);

            System.out.println("-----------------------------------------------------");

            int result2 = division2(-30, -6);
            System.out.println("Result = " + result2);

            int result3 = division2(12, -6);
            System.out.println("Result = " + result3);

            int result4 = division2(45, 9);
            System.out.println("Result = " + result4);

            // int result1 = divideWithoutDivision2(300, 0);
            // System.out.println("Result = " + result1);

            int result6 = divideWithoutDivision2(15,3);
            System.out.println("Result = " + result6);

            int result7 = divideWithoutDivision2(60,12);
            System.out.println("Result = " + result7);

            int result8 = divideWithoutDivision2(20,7);
            System.out.println("Result = " + result8);

            //int result5 = divideWithoutDivision2(15,0);
            //System.out.println("Result = " + result5);

        } catch (ArithmeticException e) {
            e.printStackTrace();
        }

    }

    public static void divideWithoutDivision(int a, int b){ // only works with positive integers

        if(a < 0 && b < 0){
            throw new IllegalArgumentException("Both a and b must be positive");
        }

        if(b == 0){
            throw new ArithmeticException(a + " cannot divide by " + b);
        }else{
            int count = 0;

            while(a >= b ){
                count++;
                a -= b ;
            }
            System.out.println("Result = "+count);
        }
    }

    public static void division(int a , int b){ // works with both positive and negative integers

        if (b == 0) {
            throw new ArithmeticException(a + " cannot divide by " + b);
        } else {

            int sign = (a < 0) ^ (b < 0) ? -1 : 1; // Determine the sign of the result

            a = Math.abs(a);
            b = Math.abs(b);

            int count = 0;

            while (a >= b) {
                count++;
                a -= b;
            }
            System.out.println("Result = "+sign*count);
        }
    }

    public static int divideWithoutDivision2(int a, int b)  { // only works with positive integers

        if(a < 0 && b < 0){
            throw new IllegalArgumentException("Both a and b must be positive");
        }

        if (b == 0) {
            throw new ArithmeticException(a + " cannot divide by " + b);
        }

        int count = 0;

        while (a >= b) {
            count++;
            a -= b;
        }

        return count;
    }

    public static int division2(int a, int b)  { // works with both positive and negative integers

        if (b == 0) {
            throw new ArithmeticException(a + " cannot divide by " + b);
        }

        int sign = (a < 0) ^ (b < 0) ? -1 : 1; // Determine the sign of the result

        a = Math.abs(a);
        b = Math.abs(b);

        int count = 0;

        while (a >= b) {
            count++;
            a -= b;
        }

        return sign * count;
    }
}
/*
Write a method that can divide two numbers without using division operator.
 */