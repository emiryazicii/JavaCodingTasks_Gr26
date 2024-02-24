package week04.task3;

public class RemoveDuplicates_Boris {

    public static void main(String[] args) {

        String str = "AAABBBCCC";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            String ch = str.charAt(i) + "";

            if(result.contains(ch)){
                continue;
            }
            result += ch;
        }

        System.out.println(result);





    }


}
/*
Write a return method that can remove the duplicated values from the String
  Ex: removeDup("AAABBBCCC") ==> ABC
 */