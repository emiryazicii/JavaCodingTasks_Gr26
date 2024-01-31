package week01.task3;

public class FINRA_Jika {
    public static void main(String[] args) {

        displayFinra(30);

    }
     public static void displayFinra(int n){

         for (int i = 1; i <= n; i++) {
             if (i % 15 == 0){
                 System.out.println("FINRA");
             } else if (i % 3 == 0 ) {
                 System.out.println("FIN");
             }else if (i % 5 == 0){
                 System.out.println("RA");
             }else {
                 System.out.println(i);
             }

         }
     }
}
