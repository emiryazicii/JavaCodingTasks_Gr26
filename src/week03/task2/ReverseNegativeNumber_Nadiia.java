package week03.task2;

public class ReverseNegativeNumber_Nadiia {
    public static void main(String[] args) {
       int number=-53;
        String num=""+number;
        String reverseNum="";
        for (int i = num.length()-1; i >0 ; i--) {
            reverseNum+=num.charAt(i);
        }
        number=Integer.parseInt(reverseNum)*(-1);
        //System.out.println("number = " + number);

        int n = -53;
        String nStrint = (""+n).replace("-","");
        StringBuilder reverse= new StringBuilder(nStrint).reverse();

        System.out.println("-"+reverse);




        System.out.println(reverseNegativeNumber(-12222256));
    }

    /**
     * method to reverse int number
     * @param num
     * @return in
     */
    public static int reverseNegativeNumber(int num){
        if (num>0) throw new IllegalArgumentException("not a negative number");

        int reverse = 0;
        while (num < 0) {
            int each= num%10;
            reverse =reverse * 10+each;
            num /= 10;
        }
        return reverse;


    }
}
