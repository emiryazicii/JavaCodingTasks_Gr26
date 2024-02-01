package week01.task3;

public class FINRA_Emir {

    public static void main(String[] args) {

        displayFinra(30);
        displayFinra2(30);

    }

    public static void displayFinra(int n) {

        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                System.out.println("FINRA");
            } else if (i % 5 == 0) {
                System.out.println("RA");
            } else if (i % 3 == 0) {
                System.out.println("FIN");
            } else {
                System.out.println(i);
            }
        }
    }

    public static void displayFinra2(int n) {

        for (int i = 1; i <=n ; i++) {
            String result = "";

            if(i % 3 == 0){
                result += "FIN";
            }
            if (i % 5 == 0){
                result += "RA";
            }
            if (result.isEmpty()){
                System.out.println(i); //  System.out.println(result.isEmpty() ? i : result);
            }else {
                System.out.println(result);
            }
        }
    }
}
/*
Write a method that prints out the numbers from 1 to 30 but;
for numbers which are multiple of 3 print "FIN" instead of the number,
for numbers which are multiple of 5, print "RA" instead of the number,
and for numbers which are multiple of both 3 and 5, print "FINRA" instead of the number.
 */