package week01.task1;

public class OddOrEven_Zack {

    /*
     Numbers - Odd or even:
     Write  a method which can identify given number is even or odd
     Output ex:
     identify(5); ->"Odd"
     identify(6); ->"Even"
     */

    public static void main(String[] args) {
        identifyOddEven(5); // ->  "Odd"
        identifyOddEven(6); // ->  "Even"
    }

    /**
     * returns whether the number given is Odd or Even
     * @param number
     * @return
     */
    public  static  String  identifyOddEven(int number) {
        return  number%2==0 ? "Even" : "odd" ;
    }

}
