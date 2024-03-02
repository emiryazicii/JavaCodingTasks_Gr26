package week05.task1;

public class FindUnique_Nadiia {
    public static void main(String[] args) {

    }


    /**
     * method finding the unique letters in the string
     * @param str
     * @return String with unique letter
     */
    public static String uniqueCharacters(String str) {

        String unique ="";
        for (int i = 0; i < str.length(); i++) {

            int counti =0;
            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(i)==str.charAt(j)) {
                    counti ++;
                }

            }
            if (counti==1){
                unique+=""+str.charAt(i);
            }
        }
        return unique;
    }
}
