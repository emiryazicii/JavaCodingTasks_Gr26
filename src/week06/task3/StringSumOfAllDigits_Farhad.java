package week06.task3;

public class StringSumOfAllDigits_Farhad {


    public static void main(String[] args) {

        System.out.println("sumOfAllDigits(\"12 java 5 apple 3\") = " + sumOfAllDigits("12 java 5 apple 3"));


    }
/*
Write a method that can return the sum of the digits in a String
Ex:  "12 java 5 apple 3"  ==>  20
 */

    public static int sumOfAllDigits(String str){

       int sum = 0;
       String num="";

       str.replaceAll(" ", "");

        for (int i = 0; i < str.length(); i++) {

            if(Character.isDigit(str.charAt(i))) {
                num += str.charAt(i);
            }    else {
                if(!num.equals("")){
                    sum = sum + Integer.parseInt(num);
                    num="";
                }
            }


        }


        return sum;
    }

}
