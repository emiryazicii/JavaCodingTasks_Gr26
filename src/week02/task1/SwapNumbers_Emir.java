package week02.task1;

public class SwapNumbers_Emir {

    public static void main(String[] args) {

        swapNumbers(15,10);
        System.out.println("---------");
        swapNumbers(5,10);

    }

    public static void swapNumbers(int a , int b){

        a = a - b;
        b = a + b ;
        a = b - a ;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
/*
Swap two variable values without using a third variable
 */