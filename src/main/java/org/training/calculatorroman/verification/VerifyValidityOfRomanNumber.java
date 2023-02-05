package org.training.calculatorroman.verification;

import org.jetbrains.annotations.NotNull;
import org.training.calculatorroman.numbers.validnumbers.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VerifyValidityOfRomanNumber {


    private final Map<String, Integer> romanMap;

    public VerifyValidityOfRomanNumber() {
        romanMap = new HashMap<>();
        romanMap.put(RomanNumberM.romanLetter, RomanNumberM.romanNumber);
        romanMap.put(RomanNumberD.romanLetter, RomanNumberD.romanNumber);
        romanMap.put(RomanNumberC.romanLetter, RomanNumberC.romanNumber);
        romanMap.put(RomanNumberL.romanLetter, RomanNumberL.romanNumber);
        romanMap.put(RomanNumberX.romanLetter, RomanNumberX.romanNumber);
        romanMap.put(RomanNumberV.ROMAN_LETTER, RomanNumberV.ROMAN_NUMBER);
        romanMap.put(RomanNumberI.ROMAN_LETTER, RomanNumberI.ROMAN_NUMBER);
    }

    private int verifyIfRomanNumberIsValid(@NotNull List<String> romanNumbers, int variableTest, String romanNumber) {
        for (int j = 0; j < romanNumber.length (); j++) {
            variableTest = romanNumberIsInvalid(variableTest, romanNumber, j);
            variableTest = romanNumberIsValid(romanNumbers, variableTest, romanNumber);
        }
        return variableTest;
    }

    private int romanNumberIsValid(@NotNull List<String> romanNumbers, int variableTest, String romanNumber) {
        if (variableTest == romanNumber.length()) {
            variableTest = romanNumbers.size();
        }
        return variableTest;
    }

    private int romanNumberIsInvalid(int variableTest, String romanNumber, int j) {
        if (romanMap.containsKey (String.valueOf (romanNumber.charAt (j)))) {
            variableTest += 1;
        }
        return variableTest;
    }

    public int acceptValidRomanNumber(@NotNull List<String> romanNumbers, int variableTest) {

        for (String romanNumber : romanNumbers) {
            variableTest += verifyIfRomanNumberIsValid(romanNumbers, variableTest, romanNumber);
        }
        return variableTest;
    }

    //GETTER

    public Map<String, Integer> romanMap() {
        return romanMap;
    }
}
