package org.hometask9;

/**
 * @author Igors Popmans
 * @version 1.0
 */
public class WrongPasswordException extends Exception {
    public WrongPasswordException(String message) {
        super(message);
    }
    public WrongPasswordException() {
    }
}
