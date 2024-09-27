public class PasswordValidator
{
    public static void main(String[] args) 
    
    {
        String password = "P@ssw0rd";  // Example password
        
        if (isValidPassword(password)) 
        {
            System.out.println("The password is valid.");
        }
         
        else
        {
            System.out.println("The password is invalid.");
        }
    }

    public static boolean isValidPassword(String password) 
    {
        if (password.length() < 8)
        {
            return false;
        }
        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;

        String specialChars = "!@#$%^&*()_+[]{}|;:',.<>?";
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUppercase = true;
            } else if (Character.isLowerCase(c)) {
                hasLowercase = true;
            } else if (Character.isDigit(c)) {
                hasDigit = true;

            } else if (specialChars.contains(Character.toString(c))) {
                hasSpecialChar = true;
            }
        }
        return hasUppercase && hasLowercase && hasDigit && hasSpecialChar;
    }
}
