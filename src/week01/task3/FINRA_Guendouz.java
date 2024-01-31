package week01.task3;

import java.util.Scanner;


public class FINRA_Guendouz {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = input.nextInt();



        if (number %5 == 0 & number % 3 == 0){
            System.out.println(" FINRA");
        }



        else if (number % 5 == 0){
            System.out.println(" RA");
        }
        else if (number % 3 == 0) {
                System.out.println(" FIN");
            }


        else { System.out.println(number);}
    }

}















