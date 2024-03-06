package week06.task3;

public class String_SumOfAllDigits_Boris {

    public static void main(String[] args) {

        System.out.println("sumOfAllDigits(\"A1B4C7D8e6\") = " + sumOfAllDigits("A1B4C7D8e6"));
    }

    public static int sumOfAllDigits(String string){

        int sumofDigits = 0;

        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if(Character.isDigit(ch)){
                sumofDigits += Integer.parseInt("" + ch);
            }
        }
        return sumofDigits;
    }
}
