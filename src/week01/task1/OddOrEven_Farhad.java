package week01.task1;

public class OddOrEven_Farhad {

    public static void main(String[] args) {
        oddOrEven(5);
        oddOrEven(6);
    }

    public static void oddOrEven(int n) {

        if (n % 2 == 0) {
            System.out.println(n + " - Even");
        } else {
            System.out.println(n + " - Odd");
        }
    }


}

/*
  **Numbers -- odd & even**
Write a method that can identify  a given number is even or odd.
EX:
       identify(5) --> "Odd"
       identify(6) --> "Even"

 */