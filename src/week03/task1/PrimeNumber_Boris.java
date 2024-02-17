package week03.task1;

import java.util.Scanner;

public class PrimeNumber_Boris {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an positive integer number");
        int n = input.nextInt();

        if(n < 2){
            System.err.println("Please, use integer number bigger then 2");
            System.exit(1);
        }

        for(int i = 2; i < n; i++){

            if(n % i == 0){
                System.out.println("Number is not a Prime number");;
                break;
            }else {
                System.out.println("Number is a Prime number");
                break;
            }

        }


    }

}
/*
Write a method that can check if a number is prime or not
 */