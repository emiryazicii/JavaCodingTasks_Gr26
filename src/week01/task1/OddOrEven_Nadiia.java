package week01.task1;

public class OddOrEven_Nadiia {
    public static void main(String[] args) {
       /*
       Write a method that can identify  a given number is even or odd.
EX:
       identify(5) --> "Odd"
       identify(6) --> "Even"
        */
        System.out.println(oddOrEven(8));
    }

    public static String oddOrEven(int number){
        String result= number+" is odd";
                if(number%2==0){
            result=number+" is even";
        }
                return result;
    }
}
