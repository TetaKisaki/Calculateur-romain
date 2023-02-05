package org.training.calculatorroman.converter;


import org.jetbrains.annotations.NotNull;
import org.training.calculatorroman.exceptions.NumberAboveRomanNumberLimitException;
import org.training.calculatorroman.numbers.specialnumbers.*;
import org.training.calculatorroman.numbers.validnumbers.*;
import org.training.calculatorroman.romaninterface.ConverterIntegerToRomanNumber;

import java.util.TreeMap;

public class ConvertIntegerToRomanNumber implements ConverterIntegerToRomanNumber {

    private static final int ROMAN_NUMBER_LIMIT = 3999;

    private final TreeMap<Integer, String> romanNumberTreeMap;

    public ConvertIntegerToRomanNumber() {
        romanNumberTreeMap = new TreeMap<>();
        romanNumberTreeMap.put(RomanNumberI.ROMAN_NUMBER, RomanNumberI.ROMAN_LETTER);
        romanNumberTreeMap.put(RomanNumberIV.romanNumber, RomanNumberIV.romanLetter);
        romanNumberTreeMap.put(RomanNumberV.ROMAN_NUMBER, RomanNumberV.ROMAN_LETTER);
        romanNumberTreeMap.put(RomanNumberIX.romanNumber, RomanNumberIX.romanLetter);
        romanNumberTreeMap.put(RomanNumberX.romanNumber, RomanNumberX.romanLetter);
        romanNumberTreeMap.put(RomanNumberXL.romanNumber, RomanNumberXL.romanLetter);
        romanNumberTreeMap.put(RomanNumberL.romanNumber, RomanNumberL.romanLetter);
        romanNumberTreeMap.put(RomanNumberXC.romanNumber, RomanNumberXC.romanLetter);
        romanNumberTreeMap.put(RomanNumberC.romanNumber, RomanNumberC.romanLetter);
        romanNumberTreeMap.put(RomanNumberCD.romanNumber, RomanNumberCD.romanLetter);
        romanNumberTreeMap.put(RomanNumberD.romanNumber, RomanNumberD.romanLetter);
        romanNumberTreeMap.put(RomanNumberCM.romanNumber, RomanNumberCM.romanLetter);
        romanNumberTreeMap.put(RomanNumberM.romanNumber, RomanNumberM.romanLetter);
}
    @Override
    public String convertToRomanNumbers(int numberToFind) {

        if (isNumberToFindAboveLimit(numberToFind)) {

            return findNumberInRoman(numberToFind);
        }
        else throw new NumberAboveRomanNumberLimitException ();
    }

    private static boolean isNumberToFindAboveLimit(int numberToFind) {
        return numberToFind <= ROMAN_NUMBER_LIMIT;
    }

    private String findNumberInRoman(int numberToFind) {
        int numberInRoman = romanNumberTreeMap.floorKey (numberToFind);

        if (verifyIfNumberToFindIsEqualToNumberInRoman(numberToFind, numberInRoman))
            return romanNumberTreeMap.get(numberToFind);
        return numberToFindLessNumberInRoman(numberToFind, numberInRoman);
    }

    @NotNull
    private String numberToFindLessNumberInRoman(int numberToFind, int numberInRoman) {
        return romanNumberTreeMap.get(numberInRoman) + convertToRomanNumbers(numberToFind - numberInRoman);
    }

    private boolean verifyIfNumberToFindIsEqualToNumberInRoman(int numberToFind, int numberInRoman) {
        return numberInRoman == numberToFind;
    }
}
