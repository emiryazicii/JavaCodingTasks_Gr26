package week04.task2;

import java.util.Arrays;

public class SameLetters_Farhad {
//    Write a return method that checks if a string is built out of the same letters as another string.
//  Ex: same("abc", "cab"); ==> true
//      same("abc", "abb"); ==> false

    public static void main(String[] args) {

        System.out.println(sameLetter("abc", "cab"));
        System.out.println(sameLetter("abc", "abb"));

    }

//    public static boolean sameLetter(String str1, String str2){
//
//        boolean isSameLetter;
//
//        for (int i = 0; i < str1.length(); i++) {
//
//            for (int j = 0; j < str2.length(); j++) {
//                if(str1.charAt(i) != str2.charAt(j)){
//                    return false;
//
//            }
//
//            }
//
//        }
//        return true;
//
//    }


    public static boolean sameLetter(String str1, String str2) {

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return Arrays.equals(ch1, ch2);
    }
}
