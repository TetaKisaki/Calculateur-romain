package org.training.calculatorroman.converter;

import org.training.calculatorroman.romaninterface.ConverterRomanNumberToInteger;
import org.training.calculatorroman.verification.InvalidRomanNumbers;
import org.training.calculatorroman.verification.RomanNumbersErrors;

import java.util.List;
public class ConvertRomanSymbolToInteger implements ConverterRomanNumberToInteger {

    private final RomanNumbersErrors romanNumbersErrors;
    private final InvalidRomanNumbers invalidRomanNumbers;
    private final RomanSymbolToIntegerConverterChecking romanSymbolToIntegerConverterChecking;


    public ConvertRomanSymbolToInteger() {
        romanNumbersErrors = new RomanNumbersErrors();
        invalidRomanNumbers = new InvalidRomanNumbers();
        romanSymbolToIntegerConverterChecking = new RomanSymbolToIntegerConverterChecking();
    }

    @Override
    public int convert(List<String> romanNumbers) {

        int romanSymbolValueInNumber = 0;

        romanNumbersErrors.emptyStringVerification(romanNumbers.isEmpty());

        romanNumbersErrors.invalidNumberverification(invalidRomanNumbers.isRomanSymbolInvalid(romanNumbers));
        romanSymbolValueInNumber = romanSymbolToIntegerConverterChecking.romanSymbolValueInNumber (romanNumbers, romanSymbolValueInNumber);
        return romanSymbolValueInNumber;
    }
}

