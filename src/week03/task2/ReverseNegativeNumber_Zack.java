package week03.task2;

public class ReverseNegativeNumber_Zack {
    /*
    ========== Numbers -- Reverse Negative Number ==========
    Write a return method that can reverse digits of a negative number and return it as int
    input: -35  output: -53
     */

    public static void main(String[] args) {
        System.out.println(reverseNegativeNum(-56));
    }

    /**
     * reverses digits of a negative number and return it as int
     * @param num
     * @return
     */
    public static int reverseNegativeNum(int num) {

        if(num >= 0){
            System.err.println("Invalid value. Please enter a negative number.");
            System.exit(0);
        }
        // convert it to String object in order to use reverse() from StringBuilder class
        String str = new StringBuilder(""+num).reverse().toString(); // -35 => 53-

        // -  +  53-  => -53-
        str = "-"+str.substring(0, str.length()-1); // removes - sign from the end of the string

        // -53 but it still is a String object
        return Integer.valueOf(str); // returns it as int value as -53
    }


}
