package week05.task2;

public class ReverseString_Nadiia {
    public static void main(String[] args) {
        /*String str="I love java";

        String reverse=" ";
        String [] arr=str.split(" ");
        for (int i = arr.length-1; i >=0; i--) {
            reverse+=arr[i]+" ";

        }
        System.out.println(reverse.trim());
*/
        String str1= "java";
        String reverseStr="";
        for (int i = str1.length()-1; i >=0; i--) {
            reverseStr+=str1.charAt(i);
        }
        System.out.println(reverseStr);

    }

    /**
     * method to reverse a String
     * @param str
     */
    public static void reverse(String str){

        StringBuilder strBuilder= new StringBuilder(str);
        System.out.println(strBuilder.reverse());


    }
}
