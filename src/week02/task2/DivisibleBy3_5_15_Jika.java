package week02.task2;

public class DivisibleBy3_5_15_Jika {

    public static void main(String[] args) {

        divisibleBy3_5_15(55);

    }

    public static void divisibleBy3_5_15(int num){

    String divisibleBy3 = "";
    String divisibleBy5 = "";
    String divisibleBy15 = "";

    for(int i = 1;i <=num; i++){

        if (i % 15 == 0) {
            divisibleBy15 += i + " ";
        } else if (i % 5 == 0) {
            divisibleBy5 += i + " ";
        } else if (i % 3 == 0) {
            divisibleBy3 += i + " ";
        }
    }
    System.out.println("divisibleBy15 = " + divisibleBy15.trim());
    System.out.println("divisibleBy5 = " + divisibleBy5.trim());
    System.out.println("divisibleBy3 = " + divisibleBy3.trim());
    }
}



