package week04.task3;

public class RemoveDublicates_Farhad {
    public static void main(String[] args) {

        System.out.println(removeDup("AAABBBCCC"));
    }
//    Write a return method that can remove the duplicated values from the String
//  Ex: removeDup("AAABBBCCC") ==> ABC

    public static String removeDup(String str){

        String result="";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if(ch == str.charAt(j)){
                    count++;
                }
                if(!result.contains("" + ch)){
                    result+= "" + ch;
                }

            }
        }
        return result;
    }
}
