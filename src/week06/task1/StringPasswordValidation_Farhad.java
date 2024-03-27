package week06.task1;

public class StringPasswordValidation_Farhad {

    public static void main(String[] args) {

       String[] passwords = {

               "Dr$1234",
               "1299@Mk123123",

               "Dr$12",
               "Dr $123",

               "dr$1234",
               "DR$1234",
               "Dr$farH",
               "Drdr1234"
       };

        for (String eachPassword : passwords) {

            boolean isValid = isValidPassword(eachPassword);
            System.out.println("Password " + eachPassword + " isValid? " + isValid);

        }

    }

//   1. Write a return method that can verify if a password is valid or not.
//            -Requirements:

    public static boolean isValidPassword(String password){
        //1. Password MUST be at least have 6 characters and should not contain space
        if(password.length()<6 || password.contains(" ")){
            return false;
        }

        Boolean hasUpperCase = false;
        Boolean hasLowerCase = false;
        Boolean hasDigit = false;
        Boolean hasSpecialChar = false;

        for (char each : password.toCharArray()) {

            //2. PassWord should at least contain one upper-case letter
            if (Character.isUpperCase(each)){
                hasUpperCase = true;
            }
            //3. PassWord should at least contain one lowercase letter
            if(Character.isLowerCase(each)){
                hasLowerCase = true;
            }

            //5. Password should at least contain a digit
            if(Character.isDigit(each)){
                hasDigit = true;
            }

            //4. Password should at least contain one special character
            if(!Character.isLetterOrDigit(each)){
                hasSpecialChar = true;
            }

        }
        //-if all requirements above are met, the method returns true, otherwise returns  false
        return hasUpperCase && hasLowerCase && hasDigit && hasSpecialChar;
    }


}
