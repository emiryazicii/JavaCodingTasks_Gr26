package week01.task2;

public class DivideWithoutDivisionOperator_Zack {

     /*
     Numbers - Divide without / operator:
     Write a method that can divide two numbers without using division operator
     */

    public static void main(String[] args) {
        divideWithNoOperator(24,0);
    }

    /**
     * divides the number1 by num2 without using division operator (short description of the method function)
     * @param num1
     * @param num2
     */
    public static void divideWithNoOperator(int divided, int divider) {
        if(divider==0) {
            throw new ArithmeticException("can not divide any number with 0");
        }
        System.out.print(divided +" divided by "+ divider +" is: ");

        int count =0;

        while(divided >= divider) {
            divided -= divider;
            count++;
        }

        System.out.println(count+" and remainder is "+ divided);
    }


}


