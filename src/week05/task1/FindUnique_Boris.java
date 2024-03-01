package week05.task1;

public class FindUnique_Boris {

    public static void main(String[] args) {

        System.out.println(findUnique("abdlllkksscckbjkdljfeddflpkl"));

    }

    public static String findUnique(String string){
        String unique = "";

        for (int j = 0; j < string.length(); j++) {

            char ch = string.charAt(j);
            int frequency = 0;

            for (int i = 0; i < string.length(); i++) {
                if(string.charAt(i) == ch){
                    frequency++;
                }
            }

            if(frequency == 1){
                unique += ch;
            }
        }
        return unique;
    }
}
