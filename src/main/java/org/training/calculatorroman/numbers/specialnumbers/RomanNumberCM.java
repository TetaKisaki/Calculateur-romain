package org.training.calculatorroman.numbers.specialnumbers;

import org.training.calculatorroman.numbers.RomanNumber;

public class RomanNumberCM implements RomanNumber {
    public static final String romanLetter = "CM";
    public static final int romanNumber = 900;

    @Override
    public String valueRoman() {
        return romanLetter;
    }

    @Override
    public Integer valueNumber() {
        return romanNumber;
    }
}
