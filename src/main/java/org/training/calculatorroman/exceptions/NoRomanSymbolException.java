package org.training.calculatorroman.exceptions;

public class NoRomanSymbolException extends RuntimeException {

    public NoRomanSymbolException() {
            super("Aucun symbole romain saisi");
    }
}
