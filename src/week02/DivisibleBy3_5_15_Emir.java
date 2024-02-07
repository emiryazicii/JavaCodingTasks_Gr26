package week02;

public class DivisibleBy3_5_15_Emir {

    public static void main(String[] args) {

        divisibleBy3_5_15(100);
    }

    public static void divisibleBy3_5_15(int n){

        String divisibleBy15 ="", divisibleBy5 = "", divisibleBy3 = "";

        for (int i = 1; i <= n ; i++) {
            if(i % 15 == 0){
                divisibleBy15 += i + " ";
            }else if (i % 5 == 0){
                divisibleBy5 += i + " ";
            }else if (i % 3 == 0){
                divisibleBy3 += i + " ";
            }
        }

        System.out.println("divisibleBy15 = " + divisibleBy15.trim());
        System.out.println("divisibleBy5 = " + divisibleBy5.trim());
        System.out.println("divisibleBy3 = " + divisibleBy3.trim());
    }
}
