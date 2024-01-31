package week01.task3;

public class FINRA_Farhad {

    public static void main(String[] args) {
        finra(30);
    }

    public static void finra(int n){

        for (int i = 1; i <= n; i++) {
            if(i%3==0 && i%5==0){
                System.out.println(i + " - finra");
            }else if(i%3==0){
                System.out.println(i + " - fin");
            } else if (i%5==0) {
                System.out.println(i + " - ra");
            }else System.out.println(i);
        }
    }


}

/*
**Numbers -- FINRA**
Write a method that prints out the numbers from 1 to 30 but;
for numbers which are multiple of 3 print "FIN" instead of the number,
for numbers which are multiple of 5, print "RA" instead of the number,
and for numbers which are multiple of both 3 and 5, print "FINRA" instead of the number.
 */