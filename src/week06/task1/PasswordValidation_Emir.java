package week06.task1;

/**
 * A class that provides a method to validate passwords based on certain criteria.
 */
public class PasswordValidation_Emir {


    //A simple main method to test the isValidPassword method.
    public static void main(String[] args) {
        // Test cases
        String[] passwords = {
                "Tr0ub4dor&3",  // Valid password
                "Password123!", // Valid password
                "weak",         // Invalid - too short
                "Password",     // Invalid - missing digit and special character
                "password123", // Invalid - missing uppercase and special character
                "PASSWORD123", // Invalid - missing lowercase and special character
                "Password!",    // Invalid - missing digit
                "12345678",     // Invalid - missing letters
                "!@#$%^&*()",   // Invalid - missing letters and digits
                "P@ss word",             // Invalid password - contains space
        };

        // Test each password and print the result
        for (String password : passwords) {
            boolean isValid = isValidPassword(password);
            System.out.println("Password: " + password + " is valid? " + isValid);
        }
    }

    /**
     * Validates the given password against the specified criteria.
     *
     * @param password The password to be validated.
     * @return true if the password meets all the criteria, false otherwise.
     */
    public static boolean isValidPassword(String password) {
        // Check if the password length is less than 6 characters or contains space
        if (password.length() < 6 || password.contains(" ")) {
            return false; // Password does not meet criteria
        }

        // Initialize variables to track if the password contains required components
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasSpecialChar = false;
        boolean hasDigit = false;

        // Iterate through each character of the password
        for (char c : password.toCharArray()) {
            // Check if the character is uppercase
            if (Character.isUpperCase(c)) {
                hasUpperCase = true;
            }
            // Check if the character is lowercase
            else if (Character.isLowerCase(c)) {
                hasLowerCase = true;
            }
            // Check if the character is a digit
            else if (Character.isDigit(c)) {
                hasDigit = true;
            }
            // Check if the character is a special character (neither letter nor digit)
            else if (!Character.isLetterOrDigit(c)) {
                hasSpecialChar = true;
            }
        }

        // Return true if all criteria are met, otherwise false
        return hasUpperCase && hasLowerCase && hasSpecialChar && hasDigit;
    }
}

/*
. Write a return method that can verify if a password is valid or not.
-Requirements:
1. Password MUST be at least have 6 characters and should not contain space
2. PassWord should at least contain one upper-case letter
3. PassWord should at least contain one lowercase letter
4. Password should at least contain one special character
5. Password should at least contain a digit
-if all requirements above are met, the method returns true, otherwise returns  false
 */