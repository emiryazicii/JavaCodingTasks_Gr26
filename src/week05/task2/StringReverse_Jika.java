package week05.task2;

public class StringReverse_Jika {
    public static void main(String[] args) {

        // reverse a word

        String str = "Java";

        String reversed = "";                          // to store into the str

        for (int i = str.length() - 1; i >= 0; i--) { // length()-1 revers from last
            reversed += str.charAt(i);                 // +1 everytime
        }
        System.out.println(reversed);


        System.out.println("------------------");

        String name = "Selenium is easier";

        String result = reverseString(name);
        System.out.println(result);

    }
    public static String reverseString(String str) {

        String reversed = "";    // to store all the char of the given string in reverse order

        for (int i = str.length() - 1; i >= 0; i--) { // length()-1 revers from last index to index O

            reversed += str.charAt(i); // charAt used to get each char of the str from last index to 0
        }                              // and concatenate it to the variable reverse
        return reversed;
    }

}
/*
Write a function that can reverse a String
 Ex: Reverse("ABCD"); ==> DCBA
 */