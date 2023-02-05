package org.training.calculatorroman.numbers.specialnumbers;

import org.training.calculatorroman.numbers.RomanNumber;

public class RomanNumberCD implements RomanNumber {
    public static final String romanLetter = "CD";
    public static final int romanNumber = 400;

    @Override
    public String valueRoman() {
        return romanLetter;
    }

    @Override
    public Integer valueNumber() {
        return romanNumber;
    }
}
