package week01.task1;

public class OddOrEven_Jika {
    public static void main(String[] args) {

        oddOrEven(52);

    }
    public static void oddOrEven(int num) {
        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

    }
}
