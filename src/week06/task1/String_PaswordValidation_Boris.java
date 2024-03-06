package week06.task1;

public class String_PaswordValidation_Boris {

    public static void main(String[] args) {

        passwordValidation("Str123!");
    }


    /**
     * This method is checking, does provided password is valid or not, with our conditions: no white space,has at least one digit,one spec character,one uppercase and one lowercase letter.
      * @param password
     */

    public static void passwordValidation (String password){

        if(password.contains(" ")){
            System.out.println("Invalid password!");
            return;
        }

        boolean hasAtLeast6Chars = password.length() >= 6;
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;

        for(int i = 0; i < password.length(); i++){
            char ch = password.charAt(i);
            if(Character.isUpperCase(ch)){
                hasUpperCase = true;
            }else if(Character.isLowerCase(ch)){
                hasLowerCase = true;
            }else if(Character.isDigit(ch)){
                hasDigit = true;
            }else {
                hasSpecialChar = true;
            }
        }

        boolean isStrongPassword = hasAtLeast6Chars && hasUpperCase && hasLowerCase && hasDigit && hasSpecialChar;

        if(isStrongPassword){
            System.out.println(password + " is a valid password");
        }else {
            System.out.println(password + " is not a valid password");
        }
    }


}
