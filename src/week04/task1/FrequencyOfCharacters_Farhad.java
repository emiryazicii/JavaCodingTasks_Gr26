package week04.task1;

public class FrequencyOfCharacters_Farhad {

    public static void main(String[] args) {

        System.out.println(frequencyOfChart("AAABBCDD"));
    }

    //    Write a return method that can find the frequency of characters
//  Ex: frequencyOfChars("AAABBCDD") ==> A3B2C1D2

    public static String frequencyOfChart(String str){

        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == ch) {
                    count++;
                }
            }

            if (!result.contains("" + ch)) {
                result += "" + ch + count;
            }

        }

        return result;
    }
}
