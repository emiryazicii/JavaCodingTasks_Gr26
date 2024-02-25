package week04.task1;

public class FrequencyOfChars_Jika {

    /*
    Write a return method that can find the frequency of characters
            Ex: frequencyOfChars("AAABBCDD") ==> A3B2C1D2
     */
    public static void main(String[] args) {

        System.out.println(frequencyOfChars("AAABBCDDD"));

    }
    public static String frequencyOfChars(String str){
        String result = "";

        // Iterate through each character in the input string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;

            // Count the occurrences of the current character in the string
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == ch) {
                    count++;
                }
            }

            // If the character is already in the result, skip it
            if (!result.contains("" + ch)) {
                // Add the char and its frequency to the result
                result += "" + ch + count;
            }

        }

        return result;
    }
}
