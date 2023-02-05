package org.training.calculatorroman.exceptions;

public class UnknownLetterException extends RuntimeException {

    public UnknownLetterException() {
        super("Lettre Inconnue");
    }
}
