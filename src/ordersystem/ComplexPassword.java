
import static java.lang.Character.isDigit;
import static java.lang.Character.isLowerCase;
import static java.lang.Character.isSpaceChar;
import static java.lang.Character.isUpperCase;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Shuk Ha Kwan
 * 2/16/2022:
 * Created a class and some functions to verify the password when created an account
 */
public class ComplexPassword {

  

    public  String password;
    /**
     * Default Constructor
     */
    ComplexPassword(){
         password = "";
    }
    /**
     * Constructor taking one argument
     * @param password 
     */
    ComplexPassword(String password){
        this.password = password;
    }
    
    /**
     * Setter function to set password
     * @param password 
     */
    public void setPassword(String password){
        this.password = password;               
    }
    
    /**
     * getter function to get password
     * @return password as string
     */
    public final String getPassword() {
        return password;
    }

    /**
     * validation password
     * @return a boolean value
     * If password match requirement:
     * return true
     * else: 
     * sent out the error message and return false     * 
     */
    public Boolean validPassWord() {
         final int SIZE = password.length();
          boolean size = false;
     int countDigi = 0;
     int countUpper = 0;
     int countLower = 0;
     int countSpace = 0;
     int countSpecial = 0;
        
        if (SIZE >= 8 && SIZE <= 10) {
            for (int i = 0; i < SIZE; i++) {
                if (isDigit(password.charAt(i))) {
                    countDigi++;
                } else if (isUpperCase(password.charAt(i))) {
                    countUpper++;
                } else if (isLowerCase(password.charAt(i))){
                    countLower++;
                }else  if (isSpaceChar(password.charAt(i))) {
                    countSpace++;
                } else if(!isDigit(password.charAt(i)) &&!isUpperCase(password.charAt(i)) 
                        &&!isLowerCase(password.charAt(i)) && !isSpaceChar(password.charAt(i))){
                    countSpecial++;
                }
            }
            size = true;
        } else {

            throw new IndexOutOfBoundsException("Password must be between 8 to 10 characters");
        }

        if (countDigi == 0) {
            throw new IllegalArgumentException("Password must have at least one number");
        } else if (countUpper == 0) {
            throw new IllegalArgumentException("Password must have at least one capital letter");
        } else if (countLower == 0){
            throw new IllegalArgumentException("Password must have at least one small letter");
        } else if (countSpace != 0) {
            throw new IllegalArgumentException("Password can not have spaces");
        } else if (countSpecial == 0) {
            throw new IllegalArgumentException("Password must have at least one special character (@#$%)");
        }

        if (size == true && countDigi != 0 && countUpper != 0 && 
                countLower != 0 && countSpace == 0 && countSpecial != 0) {
            return true;
        } else {
            return false;
        }

    }

    /**
     * errorMeeage function when error happen can display this function
     * @return a string of error message
     */
    public String errorMessage() {
        return ("Wrong password!\n"
                + "Password must have:\n"
                + "- at least 8 characters\n"
                + "- one Number\n"
                + "- one Capital letter\n"
                + "- one Small letter\n"
                + "- one Special character\n"
                + "- No spaces");
    }

}
