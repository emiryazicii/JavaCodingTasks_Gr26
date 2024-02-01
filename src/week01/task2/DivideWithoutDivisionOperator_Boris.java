package week01.task2;

public class DivideWithoutDivisionOperator_Boris {

    public static void divisionWithoutDivider(int a1, int a2){
        if(a2 == 0){
            System.err.println("Number can not be devided by 0");
        }

        int count = 0;

        for (int i = 1; i < a2; i++) {
            if(a1 >= a2){
                count++;
                a1-= a2;
            }
        }
        System.out.println("Result is : " + count + " reminder " + a1);
    }
}
