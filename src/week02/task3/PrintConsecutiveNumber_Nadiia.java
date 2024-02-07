package week02.task3;

public class PrintConsecutiveNumber_Nadiia {
    public static void main(String[] args) {


        replaceNumbersWithWords(17);
    }

    public static void replaceNumbersWithWords(int number){
        if (number>0){
            String result="";
            for (int i = 1; i <=number; i++) {
                if(i%2==0&&i%3==0&&i%5==0){
                    result+="CodilityTestCoders \n";
                }
                else if(i%2==0&&i%3==0){
                    result+="CodilityTest \n";
                }
                else if(i%3==0&&i%5==0){
                    result+="TestCoders \n";
                }
                else if(i%2==0&&i%5==0){
                    result+="CodivityCoders \n";
                }
                else if(i%2==0){
                    result+="Codivity \n";
                }
                else if(i%3==0){
                    result+="Test \n";
                }
                else if(i%5==0){
                    result+="Coders \n";
                }
                else {
                    result+=i+"\n";
                }
            }
            System.out.println(result);
        }


    }

}
