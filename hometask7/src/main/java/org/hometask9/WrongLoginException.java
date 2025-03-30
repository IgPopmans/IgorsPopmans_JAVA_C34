package org.hometask9;

/**
 * @author Igors Popmans
 * @version 1.0
 */
public class WrongLoginException extends Exception {
    public WrongLoginException(String message) {
        super(message);
    }
    public WrongLoginException() {
    }
}

