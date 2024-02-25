package week04.task3;

public class RemoveDuplicates_Jika {
    /*
  Write a return method that can remove the duplicated values from the String
  Ex: removeDup("AAABBBCCC") ==> ABC
 */
    public static void main(String[] args) {
        System.out.println(removeDuplicates("AAAABBBDSHHCCC"));

    }
    public static String removeDuplicates(String str){
        // Storing the result in an empty string
        String result = "";

        for (int i = 0; i < str.length(); i++) { // Loop through each character of the input string
            char ch = str.charAt(i);             // Get the current character

            // Check if the character is not already presented in the result
            if (!result.contains(""+ ch)) {
                result += ch;    // If it doesn't present, add it to the result
            }
        }
        return result;      // Return the result without duplicated characters
    }
}
