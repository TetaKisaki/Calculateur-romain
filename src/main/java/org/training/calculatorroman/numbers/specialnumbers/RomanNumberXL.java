package org.training.calculatorroman.numbers.specialnumbers;

import org.training.calculatorroman.numbers.RomanNumber;

public class RomanNumberXL implements RomanNumber {
    public static final String romanLetter = "XL";
    public static final int romanNumber = 40;

    @Override
    public String valueRoman() {
        return romanLetter;
    }

    @Override
    public Integer valueNumber() {
        return romanNumber;
    }
}
