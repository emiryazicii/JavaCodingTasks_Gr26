package week01.task2;
/*

 -- Divide without / operator**
Write a method that can divide two numbers without using division operator.


 */
public class DivideWithoutDivisionOperator_Abe {

    public static int division(int a, int b){   //lets assume result is (b / a)
        if( a==0 ) {  //Division by 0
            throw new ArithmeticException("can not divide any number with 0");
        }
        int result = 0;  //counter which in result gona give us amount of iterations of how many times a fits b
        int temp = b; // reassign value of b to temporary int, so when reassign inside loop, original b will remain same
        while (Math.abs(temp) >= Math.abs(a)){ //checking condition with module to include negative numbers
            temp = Math.abs(temp) - Math.abs(a); // temp has a value of b, but if b negative, module will make it positive, thats why i need temp to become positive
            result++;
        }
        if ((a < 0 && b < 0) || (a > 0 && b > 0)) {  //Condition when to show positive and when to show negative answer
            return result;
        } else {
            return -result;
        }

    }

    public static void main(String[] args) {
        int a1 = 1, b1 = -16;
        System.out.println(division(a1,b1));
    }
}


