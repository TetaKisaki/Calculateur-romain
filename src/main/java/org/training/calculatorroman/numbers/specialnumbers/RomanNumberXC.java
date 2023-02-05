package org.training.calculatorroman.numbers.specialnumbers;

import org.training.calculatorroman.numbers.RomanNumber;

public class RomanNumberXC implements RomanNumber {
    public static final String romanLetter = "XC";
    public static final int romanNumber = 90;

    @Override
    public String valueRoman() {
        return romanLetter;
    }

    @Override
    public Integer valueNumber() {
        return romanNumber;
    }
}
