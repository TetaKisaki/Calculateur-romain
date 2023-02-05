package org.training.calculatorroman.exceptions;

public class NumberAboveRomanNumberLimitException extends RuntimeException {

    public NumberAboveRomanNumberLimitException() {
            super("Nombre inexistant en chiffre romain");
    }
}
