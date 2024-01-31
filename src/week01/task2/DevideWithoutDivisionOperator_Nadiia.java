package week01.task2;

public class DevideWithoutDivisionOperator_Nadiia {
    public static void main(String[] args) {
      /*
      Write a method that can divide two numbers without using division operator.
       */
        System.out.println(divideWithoutDivision(10,2));
    }

public static int divideWithoutDivision(int a,int b){
        int result=a;
        int count=0;

        while(result>=b){
            result=result-b;
            count++;

        }

        return count;
}
}
