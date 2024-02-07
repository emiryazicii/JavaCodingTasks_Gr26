package week02.task1;

public class SwapNumbers_Zack {
    /*
    ========== Numbers -- Swap Numbers =========
    Swap two variable values without using a third variable
    */
    public static void main(String[] args) {

        // Solution 1:============================
        int  a = 10;      int  b  = 20;

        a = a + b;
        b = a - b;
        a = a - b;

        /* Solution 2: ===========================
        int  a = 10;      int  b  = 20;
        a = a * b;
        b = a / b;
        a = a / b;
        */

        System.out.println("a : " + a);
        System.out.println("b : " + b);

    }
}
