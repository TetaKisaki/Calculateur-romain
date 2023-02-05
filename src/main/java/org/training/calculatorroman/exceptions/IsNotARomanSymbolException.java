package org.training.calculatorroman.exceptions;

public class IsNotARomanSymbolException extends RuntimeException {

    IsNotARomanSymbolException() {
        super("Votre symbole n'est pas un symbole romain");
    }
}
