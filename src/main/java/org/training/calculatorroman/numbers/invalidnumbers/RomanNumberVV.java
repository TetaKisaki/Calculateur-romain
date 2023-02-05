package org.training.calculatorroman.numbers.invalidnumbers;

import org.training.calculatorroman.numbers.RomanNumber;

public class RomanNumberVV implements RomanNumber {
    public static final String ROMAN_LETTER = "VV";

    @Override
    public String valueRoman() {
        return ROMAN_LETTER;
    }

    @Override
    public Integer valueNumber() {
        return null;
    }
}
