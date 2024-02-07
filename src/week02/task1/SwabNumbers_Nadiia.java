package week02.task1;

public class SwabNumbers_Nadiia {
    public static void main(String[] args) {
        /*
        **Numbers -- Swap Numbers**__
Swap two variable values without using a third variable

         */

        swapNumbers1(1,10);

    }


    public static void swapNumbers1(int a, int b){
        a=b+a;
        b=a-b;
        a=a-b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}
