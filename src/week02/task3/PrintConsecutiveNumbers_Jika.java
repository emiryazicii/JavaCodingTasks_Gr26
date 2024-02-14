package week02.task3;

public class PrintConsecutiveNumbers_Jika {
    public static void main(String[] args) {

        displayConsecutiveNumbers(17);
    }
    public static void displayConsecutiveNumbers(int n) {

        if (n > 0) {

            for (int i = 1; i <= n; i++) {
                String result = "";

                if (i % 2 == 0) {
                    result = "Codility";
                } else if (i % 3 == 0) {
                    result = "Test";
                } else if (i % 5 == 0) {
                    result = "Coders";
                }
                if (result.isEmpty()) {
                    System.out.println(i);
                } else {
                    System.out.println(result);
                }
            }
        }
    }
}
