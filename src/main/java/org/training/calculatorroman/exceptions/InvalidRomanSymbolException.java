package org.training.calculatorroman.exceptions;

public class InvalidRomanSymbolException extends RuntimeException {
    public InvalidRomanSymbolException() {
        super("Symbole invalide");
    }
}
