package org.training.calculatorroman.numbers.specialnumbers;

import org.training.calculatorroman.numbers.RomanNumber;

public class RomanNumberIV implements RomanNumber {
    public static final String romanLetter = "IV";
    public static final int romanNumber = 4;

    @Override
    public String valueRoman() {
        return romanLetter;
    }

    @Override
    public Integer valueNumber() {
        return romanNumber;
    }
}
