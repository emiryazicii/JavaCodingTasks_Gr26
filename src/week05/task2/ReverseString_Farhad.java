package week05.task2;

public class ReverseString_Farhad {
//    Write a function that can reverse a String
// Ex: Reverse("ABCD"); ==> DCBA

    public static void main(String[] args) {

        System.out.println(reverseString("ABCD"));

    }

    public static String reverseString(String str){

        String reverse = "";

        for (int i = str.length()-1; i >=0 ; i--) {

            reverse += str.charAt(i);

        }
        return reverse;
    }
}
