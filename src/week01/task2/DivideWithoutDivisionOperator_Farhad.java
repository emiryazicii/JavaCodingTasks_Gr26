package week01.task2;

public class DivideWithoutDivisionOperator_Farhad {

    public static void main(String[] args) {

        divideWithoutDivisionOperator(5,1);

    }

    public static void divideWithoutDivisionOperator(int n1, int n2){


        if(n2==0){
            System.out.println("Cannot divide");
        }

        int count = 0;
        String result = n1 + " / " + n2;


        while (n1>=n2){
            count++;
            n1-= n2;

        }

        System.out.println(result  + " is "+ count + " with reminder " + n1);



    }




}
/*

 -- Divide without / operator**
Write a method that can divide two numbers without using division operator.


 */