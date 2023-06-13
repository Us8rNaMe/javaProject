package practiceOOP.practise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.regex.Pattern;

public class User {
    /*
    Attributes: userID, username, password, email, phoneNumber
    Methods: register, login, updateProfile, viewEvents, bookTicket
     */

    private String userID;
    private String username;
    private String password;
    private String email;
    private String phoneNumber;

    private Map<String, String> usernames = new HashMap<>();
    private Map<String, String> userIDs = new HashMap<>();

    public void register(String username, String password, String email, String phoneNumber) {
        if (setUsername(username) && setPassword(password) && setEmail(email) && setPhoneNumber(phoneNumber)) {
            System.out.println("INFO: successfully registered new user: " + generateUserID(username, email));
        }
    }


    public void login(String username, String password){
        if (usernames.containsKey(username)){
            if(usernames.get(username).equals(password)){
                System.out.println("INFO: successfully logged in");
            }
        }
        System.out.println("ERROR: failed to login");

    }

    public void updateProfile(){
        System.out.println("updated profile of "+username);
    }
    public void viewEvents(){
        System.out.println("here are the events of: "+username);
    }
    public void bookTicket(){

    }




    public String getUserID() {
        return userID;
    }

    /*
    userID must be 9 chars length
    first 3 chars = first 3 chars of username
    second 3 chars = random numbers
    last 3 chars = last 3 chars of phone number
    and must be unique (do not exist in userIDs)
     */
    public String generateUserID(String username, String phoneNumber) {
        String newUseID = "";
        while (userIDs.containsKey(userID)) {
            if (userID.length() == 9) {
                newUseID = username.substring(0, 4) + "" + generate3DigitNumber()
                        + phoneNumber.substring(phoneNumber.length() - 4);
            }
        }
        userIDs.put(username, userID);
        this.userID = newUseID;
        return newUseID;
    }


    public int generate3DigitNumber() {
        return new Random().nextInt(900) + 100;
    }


    public String getUsername() {
        return username;
    }

    /*
         1) length from 6 to 128 chars
         2) username must not contain following special char
          ; & % ? : ( )
         3) username must be unique
    */
    public boolean setUsername(String username) {

        if (username.length() < 6 || username.length() > 128) {
            System.out.println("Username must be at least 6 characters ");
            return false;
        }
        if (username.contains(";") || username.contains("&") || username.contains("%") ||
                username.contains("?") || username.contains(":") || username.contains("(") ||
                username.contains(")")) {
            System.out.println("Username can not contain ; & % ? : ()");
            return false;
        }
        if (usernames.containsKey(username)) {
            System.out.println("The username is already exist, try another");
            return false;
        }

        System.out.println("Successfully set up the username: " + username);
        this.username = username;
        usernames.put(username, password);
        return true;
    }

    public String getPassword() {
        return password;
    }

    /*
    length should be at least 8 and at most 128
    one uppercase, one lowercase, one digit, one spec char
     */
    public boolean setPassword(String password) {
        // Password length requirement
        int minLength = 8;
        int maxLength = 128;

        // Regular expressions for password requirements
        String upperCasePattern = ".*[A-Z].*";
        String lowerCasePattern = ".*[a-z].*";
        String digitPattern = ".*\\d.*";
        String specialCharPattern = ".*[!@#$%^&*()\\-_=+\\[{\\]};:'\",<.>/?].*";

        if (password.length() < minLength || password.length() > maxLength) {
            System.out.println("ERROR: Password must be at least " + minLength + " characters long.");
            return false;
        }

        if (!Pattern.matches(upperCasePattern, password)) {
            System.out.println("ERROR: Password must contain at least one uppercase letter.");
            return false;
        }

        if (!Pattern.matches(lowerCasePattern, password)) {
            System.out.println("ERROR: Password must contain at least one lowercase letter.");
            return false;
        }

        if (!Pattern.matches(digitPattern, password)) {
            System.out.println("ERROR: Password must contain at least one digit.");
            return false;
        }

        if (!Pattern.matches(specialCharPattern, password)) {
            System.out.println("ERROR: Password must contain at least one special character.");
            return false;
        }

        // If the password meets all requirements, it is successfully set
        System.out.println("INFO: Password successfully set.");
        this.password = password;
        usernames.put(username, password);
        return true;
    }

    public String getEmail() {

        return email;
    }

    /*
    must contain @ .
    length < 256
     */
    public boolean setEmail(String email) {
        if (email.contains("@") && email.contains(".") && email.length() <= 256) {
            this.email = email;
            return true;
        }
        return false;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    /*
    contains only digits
    length must be 10
     */
    public boolean setPhoneNumber(String phoneNumber) {
        /*
        1. check the length != 10, return false
        2. loop through phoneNumber
        Character.isDigit(char)

         */
        if (phoneNumber.length() != 10) {
            System.out.println("ERROR: The length of phone number must be 10!");
            return false;
        }
        for (int i = 0; i < phoneNumber.length(); i++) {
            if (!Character.isDigit(phoneNumber.charAt(i))) {
                System.out.println("ERROR: the phone number must contain only digits!");
                return false;
            }
        }

        System.out.println("INFO: Successfully added phone number");
        this.phoneNumber = phoneNumber;
        return true;
    }


}