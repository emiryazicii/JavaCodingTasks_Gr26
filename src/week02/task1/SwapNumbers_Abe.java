package week02.task1;
/*
--Swap two numbers without third variable--
 */
public class SwapNumbers_Abe {
    public static void main(String[] args) {
        int a = 2, b = 3;
        System.out.println("first number is - " + a + "; second number is - " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("first number is - " + a + "; second number is - " + b);

    }
}
