package week01.task1;

public class OddOrEven_Emir {

    public static void main(String[] args) {

        identify(-4); // even
        identify(-3); // odd
        identify(2); // even
        identify(1); // odd
        identify(0); // even

        System.out.println("----------------------");

        System.out.println(oddOrEven(-5)); // odd
        System.out.println(oddOrEven(-6)); // even
        System.out.println(oddOrEven(7)); // odd
        System.out.println(oddOrEven(8)); // even
        System.out.println(oddOrEven(9)); // odd

    }

    public static void identify(int number ){

        if (number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }

    public static String oddOrEven(int number){

        if (number % 2 == 0) {
             return "Even";
        }else {
            return "Odd";
        }
    }
}
/*
Write a method that can identify a given number is even or odd.
EX:
       identify(5) --> "Odd"
       identify(6) --> "Even"
 */