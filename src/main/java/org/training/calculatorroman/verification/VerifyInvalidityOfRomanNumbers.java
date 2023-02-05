package org.training.calculatorroman.verification;

import org.jetbrains.annotations.NotNull;
import org.training.calculatorroman.numbers.invalidnumbers.*;

import java.util.ArrayList;
import java.util.List;

public class VerifyInvalidityOfRomanNumbers {


    public final List<String> romanInvalidNumbersList;

    public VerifyInvalidityOfRomanNumbers() {
                romanInvalidNumbersList = new ArrayList<>();
                romanInvalidNumbersList.add(RomanNumberMMMM.ROMAN_LETTER);
                romanInvalidNumbersList.add(RomanNumberDD.ROMAN_LETTER);
                romanInvalidNumbersList.add(RomanNumberCCCC.ROMAN_LETTER);
                romanInvalidNumbersList.add(RomanNumberLL.ROMAN_LETTER);
                romanInvalidNumbersList.add(RomanNumberXXXX.ROMAN_LETTER);
                romanInvalidNumbersList.add(RomanNumberVV.ROMAN_LETTER);
                romanInvalidNumbersList.add(RomanNumberIIII.ROMAN_LETTER);
            }

    public boolean aRomanSymbolIsInvalid(@NotNull List<String> romanNumbers) {
        return romanNumbers.stream().anyMatch(this::anyMatch);
    }

    public boolean anyMatch(String romanNumber) {
        return romanInvalidNumbersList.stream().anyMatch(romanNumber::contains);
    }
}
