package week02.task1;

public class SwapNumbers_Jika {
    public static void main(String[] args) {

        swapNumbers(5, 10);
    }
    public static void swapNumbers(int a, int b){

        a = b + a;
        b = a - b;
        a = a - b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);


    }
}
