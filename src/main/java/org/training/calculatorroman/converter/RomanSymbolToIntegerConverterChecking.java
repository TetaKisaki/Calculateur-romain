package org.training.calculatorroman.converter;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class RomanSymbolToIntegerConverterChecking {


    MethodForRomanSymbolToIntegerConverterChecking methodForRomanSymbolToIntegerConverterChecking;

    public RomanSymbolToIntegerConverterChecking() {
        methodForRomanSymbolToIntegerConverterChecking = new MethodForRomanSymbolToIntegerConverterChecking();
    }

    public int romanSymbolValueInNumber(@NotNull List<String> romanNumbers, int romanSymbolValueInNumber) {
        for (String romanNumber : romanNumbers) {
            int romanListLength = romanNumber.length();

            romanSymbolValueInNumber = methodForRomanSymbolToIntegerConverterChecking.getValueOfRomanSymbolList(romanNumbers,romanNumber, romanListLength);
        }
        return romanSymbolValueInNumber;
    }
}
