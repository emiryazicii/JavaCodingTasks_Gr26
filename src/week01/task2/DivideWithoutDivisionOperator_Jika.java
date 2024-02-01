package week01.task2;

public class DivideWithoutDivisionOperator_Jika {
    public static void main(String[] args) {
        divideWithoutDivisionOperator(25, 4);
    }
    public static void divideWithoutDivisionOperator(int num1, int num2){
        if (num1 == 0){
            System.out.println("Can not divide any number with 0");
        }
        System.out.print(num1 +" divided by "+ num2 +" is: ");

        int count =0;

        while(num1 >= num2) {
            num1 -= num2;
            count++;
        }

        System.out.println(count+" and remainder is "+ num1);


    }
}
