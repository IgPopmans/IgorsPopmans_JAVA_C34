package org.hometask9;

/**
 * @author Igors Popmans
 * @version 1.0
 */
public class Validator {

    public static boolean validate(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {
        if (login.length() >= 20 || login.contains(" ")) {
            throw new WrongLoginException("Login must be less than 20 characters and not contain spaces");
        }
        if (password.length() >= 20 || password.contains(" ") || !password.matches(".*\\d.*")) {
            throw new WrongPasswordException("The password must be less than 20 characters, contain no spaces, and include at least one number");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Password and password confirmation do not match");
        }
        return true;
    }
}
