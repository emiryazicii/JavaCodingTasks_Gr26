package week01.task1;
/*
  **Numbers -- odd & even**
Write a method that can identify  a given number is even or odd.
EX:
       identify(5) --> "Odd"
       identify(6) --> "Even"

 */
public class OddOrEven_Abe {
    public static void oddOrEven(int a) {

        if (a % 2 == 0) {
            System.out.println(a + " is even number");
        } else {
            System.out.println(a + " is odd number");
        }
    }
}
