package org.training.calculatorroman.numbers.invalidnumbers;

import org.training.calculatorroman.numbers.RomanNumber;

public class RomanNumberCCCC implements RomanNumber {
    public static final String ROMAN_LETTER = "CCCC";

    @Override
    public String valueRoman() {
        return ROMAN_LETTER;
    }

    @Override
    public Integer valueNumber() {
        return null;
    }
}
