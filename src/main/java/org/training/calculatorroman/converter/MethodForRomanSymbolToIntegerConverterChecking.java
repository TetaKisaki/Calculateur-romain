package org.training.calculatorroman.converter;

import org.jetbrains.annotations.NotNull;
import org.training.calculatorroman.exceptions.UnknownLetterException;
import org.training.calculatorroman.verification.RomanNumbersErrors;
import org.training.calculatorroman.verification.VerifyValidityOfRomanNumber;

import java.util.List;

public class MethodForRomanSymbolToIntegerConverterChecking {

    RomanNumbersErrors romanNumbersErrors;
    VerifyValidityOfRomanNumber verifyValidityOfRomanNumber;

    private int romanSymbolValueInNumber;
    private int indexOfRomanNumbersList;

    public MethodForRomanSymbolToIntegerConverterChecking() {
        verifyValidityOfRomanNumber = new VerifyValidityOfRomanNumber();
        romanNumbersErrors = new RomanNumbersErrors();
    }

    public int getValueOfRomanSymbolList(@NotNull List<String> romanNumbers, String romanNumber, int romanListLength) {
        for (indexOfRomanNumbersList = 0; indexOfRomanNumbersList < romanListLength; indexOfRomanNumbersList++) {

            romanSymbolValueInNumber = assignValueIfIsARomanSymbol(romanNumbers, romanNumber, romanListLength);
        }
        return romanSymbolValueInNumber;
    }

    private int assignValueIfIsARomanSymbol(@NotNull List<String> romanNumbers, String romanNumber, int romanListLength) {
        String currentRomanSymbol = String.valueOf (romanNumber.charAt (indexOfRomanNumbersList));

        romanSymbolValueInNumber = verifyIfIsARomanSymbol(romanNumbers, romanNumber, romanListLength, currentRomanSymbol);
        return romanSymbolValueInNumber;
    }

    private int verifyIfIsARomanSymbol(@NotNull List<String> romanNumbers, String romanNumber, int romanListLength, String currentRomanSymbol) {
        if (!romanNumbersErrors.isARomanSymbol(romanNumbers)) {
            romanSymbolValueInNumber = verifyAndAssignCorrectValueOfRomanSymbol(romanNumber, romanListLength, currentRomanSymbol);
        }else {
            throw new UnknownLetterException();
        }
        return romanSymbolValueInNumber;
    }

    private int verifyAndAssignCorrectValueOfRomanSymbol(String romanNumber, int romanListLength, String currentRomanSymbol) {

        int limitSizeForlastRomanNumber = romanListLength - 1;

        if (isindexOfRomanNumbersListAtlimitSizeForlastRomanNumber(limitSizeForlastRomanNumber)) {
            romanSymbolValueInNumber = assignValueOfRomanSymbol(romanNumber, romanListLength, currentRomanSymbol);
        }
        else romanSymbolValueInNumber += verifyValidityOfRomanNumber.romanMap().get(currentRomanSymbol);
        return romanSymbolValueInNumber;
    }

    private boolean isindexOfRomanNumbersListAtlimitSizeForlastRomanNumber(int limitSizeForlastRomanNumber) {
        return indexOfRomanNumbersList != limitSizeForlastRomanNumber;
    }

    private int assignValueOfRomanSymbol(String romanNumber, int romanListLength, String currentRomanSymbol) {
        String nextRomanSymbol = String.valueOf (romanNumber.charAt (indexOfRomanNumbersList + 1));
        romanSymbolValueInNumber = verifyIfCurrentRomanSymbolIsBiggerThanNextRomanSymbol(romanListLength, currentRomanSymbol, nextRomanSymbol);
        return romanSymbolValueInNumber;
    }

    private int verifyIfCurrentRomanSymbolIsBiggerThanNextRomanSymbol( int romanListLength, String currentRomanSymbol, String nextRomanSymbol) {
        if (verifyValidityOfRomanNumber.romanMap().get (currentRomanSymbol) < verifyValidityOfRomanNumber.romanMap().get (nextRomanSymbol)) {
            romanSymbolValueInNumber = assignResultOfSubtractionOfNextRomanSymbolFromCurrentRomanSymbol( romanListLength, currentRomanSymbol, nextRomanSymbol);
        }
        else romanSymbolValueInNumber += verifyValidityOfRomanNumber.romanMap().get(currentRomanSymbol);
        return romanSymbolValueInNumber;
    }

    private int assignResultOfSubtractionOfNextRomanSymbolFromCurrentRomanSymbol(int romanListLength, String currentRomanSymbol, String nextRomanSymbol) {
        romanSymbolValueInNumber = loopOfCurrentRomanSymbolIsBiggerThanNextRomanSymbol(romanListLength, currentRomanSymbol, nextRomanSymbol);
        return romanSymbolValueInNumber;
    }

    private int loopOfCurrentRomanSymbolIsBiggerThanNextRomanSymbol(int romanListLength, String currentRomanSymbol, String nextRomanSymbol) {
        loopForAssignResultOfsubstractNextRomanSymbolFromCurrentRomanSymbolInList(romanListLength, currentRomanSymbol, nextRomanSymbol);
        return romanSymbolValueInNumber;
    }

    private void loopForAssignResultOfsubstractNextRomanSymbolFromCurrentRomanSymbolInList(int romanListLength, String currentRomanSymbol, String nextRomanSymbol) {
        for (int j = indexOfRomanNumbersList; j < romanListLength; j += indexOfRomanNumbersList +2) {
            romanSymbolValueInNumber = substractNextRomanSymbolFromCurrentRomanSymbol(currentRomanSymbol, nextRomanSymbol);
        }
    }

    private int substractNextRomanSymbolFromCurrentRomanSymbol(String currentRomanSymbol, String nextRomanSymbol) {
        romanSymbolValueInNumber += verifyValidityOfRomanNumber.romanMap().get (nextRomanSymbol) - verifyValidityOfRomanNumber.romanMap().get (currentRomanSymbol);
        return romanSymbolValueInNumber;
    }
}
