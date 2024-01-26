package week01.task1;

public class OddOrEven_Farhad {

    public static void main(String[] args) {
        OddOrEven(5);
        OddOrEven(6);
    }

    public static void OddOrEven(int n) {

        if(n%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
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