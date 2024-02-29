package week05.task2;

public class ReverseString_Boris {

    public static void main(String[] args) {

        System.out.println(reverseString("ABCD"));
    }

    public static String reverseString(String str) {
        String reversed = "";
        for (int i = str.length()-1; i >=0; i--) {
            char ch = str.charAt(i);
            reversed += ch;
        }
        return reversed;
    }

}

