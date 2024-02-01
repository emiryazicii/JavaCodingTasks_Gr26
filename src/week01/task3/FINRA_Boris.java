package week01.task3;

public class FINRA_Boris {

    public static void finra(int num) {
        int a = 1;
        while (a <= num) {

            if(a % 15 ==0){
                System.out.println("FINRA");
            }else if ( a % 5 == 0){
                System.out.println("RA");
            }else if (a % 3 == 0){
                System.out.println("FIN");
            }else {
                System.out.println(a);
            }
            a++;
        }
    }
}
