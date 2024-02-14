package week01.task3;
/*
**Numbers -- FINRA**
Write a method that prints out the numbers from 1 to 30 but;
for numbers which are multiple of 3 print "FIN" instead of the number,
for numbers which are multiple of 5, print "RA" instead of the number,
and for numbers which are multiple of both 3 and 5, print "FINRA" instead of the number.
 */
public class FINRA_Abe {
   public static void finra(int num){
    int a = 1;
        while (a <= num) {

        if(a % 15 ==0){
            System.out.print(" FINRA ");
        }else if ( a % 5 == 0){
            System.out.print(" RA ");
        }else if (a % 3 == 0){
            System.out.print(" FIN ");
        }else {
            System.out.print(" " + a + " ");
        }
        a++;
    }
}


    public static void main(String[] args) {
       finra(30);
    }
}

