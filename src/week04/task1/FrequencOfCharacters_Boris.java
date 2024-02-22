package week04.task1;

public class FrequencOfCharacters_Boris {

    public static void main(String[] args) {

        String s = "AAABBCDD";
        String result = "";

        for (int j = 0; j < s.length(); j++) {

            int count = 0;
            char ch = s.charAt(j);

            for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == ch){
                    count++;
                }
            }
            if(result.contains(ch + "")){
                continue;
            }
            result += ch + "" + count;
        }

        System.out.println(result);
    }
}
/*
Write a return method that can find the frequency of characters
  Ex: frequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */